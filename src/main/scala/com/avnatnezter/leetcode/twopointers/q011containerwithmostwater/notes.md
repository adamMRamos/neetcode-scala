# q11 Container With Most Water
We can find the largest container of water by using 2 pointers. We just need to keep
incrementing our left and right pointers until we have searched the entire array
and return the largest area we can find. We terminate the loop when left and right
have crossed one another. One thing to keep in mind is that the height of the container 
is limited by the smallest "wall" which is represented by the values at our left and 
right pointers. For example if height(left) = 4 and height(right) = 5 the maximum 
height of our container is 4 at the left pointer. Width will simply be right - left.

The hard part for us is figuring our "when" to increment our pointers. At first, we
might want to increment both of them after every iteration. However, with the method
we will end up only checking opposite pairs on the array and miss a pair that has
the largest area. Instead, since height is the limiting factor her, we should only
increment one of our pointers if one is "smaller" than the other. For example, if 
height(left) = 4 and height(right) = 5, we will increment the left pointer since
it is smaller than the right and at every iteration we will check if our new area
is larger than our previous maximum area.

This solution runs in linear time since we will be checking every element at most
one time. Space complexity is constant time.
