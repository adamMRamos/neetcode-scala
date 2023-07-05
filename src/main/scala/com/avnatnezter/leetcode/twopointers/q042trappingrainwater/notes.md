# q42 Trapping Rain Water
This is a hard problem that I first attempted to solve trying to scan right and find
the left and right walls of containers. If we went all the way to the right and didn't
find a matching wall for our left pointer then increment the left pointer. Keep doing
this until our left pointer reaches the end of the list. This solution would have
been n^2. Turns out there is an easier way to think about the problem.

Neetcode gives 2 solutions. One that is linear memory and the other is constant memory.
We really only need to care about how much water each space can hold. To determine
that we need to know what is the maximum height to the left of our current position
and what is the max height to the right. We take the minimum of those two and then 
subtract that by the height of our current position. We can create two new lists.
One will track what is our max left up to 'i' and one tracks what is our max right
up to 'i'. Start by comparing our previous max left to our previous element, and whichever
is higher, that one will be considered the max left for our current position. Do the
same when building our max right array except lets start from the back and compare
our previous max right to the previous element while scanning backwards. Once we have
both lists we can iterate over every element in our array, find the min of max left
and right at that position, subtract our current element from that, and add it to
our current volume. If we got a negative value then simply add 0 to our volume.

However, we can solve this using no extra memory at all. At any given point we only
need to know what the minimum height is to the left or right. For example, if we are
scanning left to right, and we know the height to our left is lower than to our right,
then we can calculate our volume based on the height of our left side. Same with
the right side. If we are scanning right, and we know the right is smaller than the 
left, then we can calculate our volume based on the height of our right side. If we
use 2 pointers, left and right, we can always know which side has the smallest height.
If our left side is smaller, then calculate volume using our left side and add it 
to our total, increment our left pointer, and if our new position is greater than 
our last known max left then update our max left. Do the same thing if our right side 
is smaller than our left. Keep doing this until our left and right pointers pass one
another. This is a linear solution with constant memory.
