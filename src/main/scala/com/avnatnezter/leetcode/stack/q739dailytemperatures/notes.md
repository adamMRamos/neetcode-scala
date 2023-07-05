# q739 Daily Temperature
This one is fairly straight forward. We could brute force this with a n^2 solution
that compares every number with all following numbers and count how many places we
have to move to find a temperature that is higher. However, we can do this in linear
time if we use a stack. Our stack will contain the temperature and the index of the
item, and we will compare every number with items in the stack. If our current temperature
is higher than the top of the stack then lets pop it off, count how far away that
temperature is from our current one, and update our result array with that distance.
Keep doing that until either the stack is empty or our current temp is not higher.
Then at the end of every iteration we will push our current element onto the stack
with its index. Neetcode notes that the kind of stack we are using is a monotonic
decreasing stack to solve this problem.