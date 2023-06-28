# q167 Two Sum II input array is sorted
We have a couple ways to solve this and one way to solve that depends on the fact
the array is sorted.

The first approach is brute force. We could test all the possible pairs of numbers
until we find the target. This would be O(n^2) to complete.

The next approach is linear time but requires linear memory. We use a map just like
in a previous 2 sum solution. The map will contain our values and their indices, and
we will build this map as we go. We will first check if our target - current element
exists in the map. If it does then we have found the answer. If not then add this
element and its index as a new entry in the map.

The final approach is linear time and also constant memory. We use two pointers.
We can use a left and right pointer where left pointer is the start and right is
the end. We will add the values at these positions. If this equals the target then
great we have found the answer. If not then we can check if their sum is greater
or less than our target. Since we know this array is sorted, if the sum is more than 
the target then we know we can reduce our right pointer. Reducing our right pointer 
will effectively reduce the sum. If the sum is less than the target then increasing
our left pointer will increase the sum. We keep doing this until we find the answer.

Keep in mind that for some reason the solution requires we 1 index our answers so
whenever we find the indices in any approach we have to increment them by 1.