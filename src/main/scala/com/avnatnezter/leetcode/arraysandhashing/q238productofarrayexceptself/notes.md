# q238 Product of Array Except Self
This one I was unable to figure out alone. I got halfway with calculating prefixes
but then didn't discover that the rest of the answer can be computed by calculated 
postfixes. That might be all the hint you need to complete the solution yourself.
If so then congrats.

Neetcode's solution goes as follows. We need to have a O(n) solution without using 
division. This can be accomplished with two passes over the array and outputting into
2 other arrays. One is our prefixes and the other is postfixes.
Let's start with the given example (1,2,3,4).</br>
On our first element we check the previous prefix and multiply with our current 
element. Our first prefix position however is -1, which doesn't exist in our array, 
so we default to 1. We multiply that by 1, and we get 1 for our first prefix. Next 
up we have 2. Our previous prefix is at position 0 which is 1, multiply that by our 
current element 2, and we have 2. Do the same for 3 and we get 6. and 4 we get 24.
Our prefixes should look like this now (1,2,6,24).</br>
Now we do the postfixes. Start with 4, choose the previous postfix position which 
is 4 and is outside the bounds of our postfix array, so we default to 1. This means 
postfix at position 4 with be 4. Next we move to 3. Multiply that by previous 4 and
that gives us 12. Go to 2 and multiply by 12 gives us 24. and Finally 1 times 24 
is 24. Our postfixes should look like (24,24,12,4).</br>
Finally we can compute the answer into a final array. Answer for position 0 is going
to be "prefix(0-1) * postfix(0+1)". Since "0-1" is out of bounds we default to 1, and 
the answer is "1 * 24 = 24". Next we do position 1 following the same formula 
"prefix(1-1) * postfix(1+1)". prefix(1-1) = 1 and postfix(1+1) = 12 so our answer
is 12. Do the same for position 2 and that gives us 8. For position 3, postfix(3+1) 
is out of bounds, so we default to 1, giving us "6 * 1 = 6". Our answer array should 
look like (24,12,8,6).</br>
This solution is O(n) runtime with O(n) space complexity since we are building 2 
arrays of size n which is 2n, but we can ignore the constant.

Neetcode gives us a further optimization that allows us to utilize the output array
to build the prefixes and then finally compute the answer as we traverse the "postfixes".
Using the output array does not increase space complexity since no matter what we
were always going to output an array of size n.</br>
The solution goes like the following. We'll continue to use (1,2,3,4) as our example.
Start by inputting the prefixes into our answer array as if we were building the 
prefixes array from the previous solution. However, we treat the current position 
in our answer as our previous prefix and our new prefix goes into the next box in 
our answer array. So starting with position 0, position 0 in the answer is empty, 
so we default with 1. "1 * 1 = 1" and we put that into position 1 of our answer. 
Next we move to position 1, which is 2, our previous prefix is 1, so "2 * 1 = 2" 
and we put that into position 2. Next 3. And finally 4, but we can't put our answer 
into position 4 of our answer since that is out of bounds, so we simply drop it. 
Our answer array should look like ( _ ,1,2,6).</br>
Now we calculate our final answers and keep track of previous postfixes in a separate
variable. Start with position 3, we don't have a previous postfix so default to 1,
and multiply our previous postfix by our current prefix which is 6. "6 * 1 = 6" so 
that is our answer for position 3. We are now at ( _ ,1,2,6). Multiply our previous 
postfix by our current element at position 3, "4 * 1 = 4", and that is now our new 
previous postfix. Move to position 2. Multiply our previous postfix of 4 with our
current prefix of 2 and that gives us 8. Now calculate our new previous postfix as
"4 * 3 = 12" where 4 was our old previous postfix and 3 is our current element from
our input. Moving to position 1 gives us 12 * 1 for our answer and 12 * 2 for our
next postfix. Finally, position 0 of our answer is empty, so we default with 1. 
1 * 24 is 24 and no need to calculate a previous postfix since we have found our 
answer: (24,12,8,6). This was still O(n) runtime but now space complexity is O(1).
