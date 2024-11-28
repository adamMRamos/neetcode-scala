# q84 Largest Rectangle in Histogram
solution uses stacks and is marked hard in leetcode
consider the following example: 2,1,5,6,2,3
we know the largest rectangle is the 5 + 6 with an area of 10.

we need to look at the bars and as long as we can keep extending to
the right then we can keep the bar. Otherwise, we need to "pop" the bar
and take the area.
For example 1,2,3,4,2...
We can keep extending
but once we reach the 2 at the end our 3 and 4 can't go any further
so let's pop the 4, take that and compare its index with the current bar's index.
(4-3)=1 and 4*1 = 4 which becomes our max area
Then pop our 3 and do same thing.
(4-2)=2 and 3*2 = 6 which is bigger than four and is our new max area.
Then push our 2 onto the stack since it can still be extended to the right.
But we don't make the index for 2 be 4, instead we switch it to be the index
of the last thing popped off the stack which is 2.
continue until we've iterated through all the heights

lastly we need to calculate max area from the remaining bars on the stack.
We do this by computing max(height * (len(heights) - index), maxArea)
for all the elements left on the stack.
