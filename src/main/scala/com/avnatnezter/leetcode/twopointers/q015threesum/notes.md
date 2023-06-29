# q15 3 Sum
This problem is tough without solving 2 sum and 2 sum II. For 3 sum we need to figure
out what 3 numbers summed together give us 0. The brute force approach would be a
n^3 solution of checking all possible 3 combinations. We can make this a n^2 solution
if for every element in our array we try to solve for 2 sum where the sum of the 2 
elements needs to equal the current element. From 2 sum II we know that if the array
is sorted we can do that without tracking extra memory.

For example, lets iterate over all the elements of the sorted array, and then loop
over all the elements after 'i' using left and right pointers. We'll say 'i' = A,
and Left and Right will be B and C respectively. If A, B, C are greater than 0, since the 
array is sorted we know we can increment our left pointer. If they are less than then
we know we decrement our right pointer.

There is another issue though. The problem also wants us to ignore duplicate triplets.
If we have an input array like (-2,-2,0,0,2,2) this could be an issue. We need to
do two more things. If A equals the previous element then we need to skip to the next
one. We also need to worry that B and C also don't match any previous elements. For
this we will increment our left pointer as long as B matches a previous element. We 
don't need to increment our right pointer because eventually left will surpass right, 
or it will reach an element that together with the right pointer won't sum to 0 with
A.

This solution is n^2 since we need to loop twice over our input array. There is the
sorting which is nlogn but the speed generalizes to n^2. Space complexity is probably 
linear for Scala since the sorting does generate a new collection. 
