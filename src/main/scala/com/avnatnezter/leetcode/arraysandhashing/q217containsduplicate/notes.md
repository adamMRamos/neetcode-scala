# Q217 Contains Duplicate
The brute force approach would require us to check every number against every other.
This would be O(n2) run time.

We can get this a little faster using groupBy in Scala. This would be a linear pass
over the array and the result would give us map of keys to the duplicates. We can do 
another linear pass to filter for values that are size greater than zero. Runtime is O(n).
Space complexity is also linear.

A map is probably not the most efficient data structure for this solution even 
though the syntax is very concise. We can write this with a hashset instead with 
a while loop. This way we have similar speed with a chance for an early result.
Runtime is still linear as well as space complexity.

