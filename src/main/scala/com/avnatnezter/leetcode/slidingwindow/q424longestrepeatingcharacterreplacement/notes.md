# q424 Longest Repeating Character Replacement
this is a sliding window problem
we want to try and grow our window to include as many characters as possible
without the window being invalid
if the window is invalid we will shrink the window until it is valid again

we can do this with a left and right pointer
at the beginning our left and right pointer will be the beginning of the string.
we will also use a hashmap of all of our character counts for the window.
this will be 26 upper case characters.
at first step we will add the first character of our string to the map
based on our right pointer.
then we can begin comparing our current window to our char map.
find the most common character in the map.
subtract the count by the size of our window (which is one).
the window is valid, so we will increment our right pointer.
we add the next character in our right pointer to the map.
if the window is now invalid then we decrement the character count 
from our map from the left pointer, and we increment the left pointer.
Keep going incrementing the right pointer every iteration until we've seen
every element.

This solution is O(26 * N) which is really just N
but there is a way to improve this without the constant 26 operation.
we can make that an 0(1 * N) operation.

## improved algorithm
We do this by keeping track of a max frequency count instead of always
searching the map for most frequent character count.
at every iteration we increment the right pointer and then update our map with
new character count for right pointer (this is similar to original alg).
we will then update max frequency with the current character count
by getting the char count for our right pointer from our map, an O(1) operation,
and comparing with our max freq. choose the max from both.
Then when we check if window is valid we will use max frequency instead of
searching our map.
