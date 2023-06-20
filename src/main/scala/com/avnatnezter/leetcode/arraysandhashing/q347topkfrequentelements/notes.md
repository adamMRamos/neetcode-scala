# q347 Top K Frequent Elements
We can solve this by keeping a map of the elements and their total count. We can
then sort the resulting values and pick the top k keys from the map.
This would be a O(n) with a nlogn operation at the end, so it would still be close 
to linear time. Probably in this case we count it as O(nlogn) since that is the
longer operation. Space complexity would be O(n).

Neetcode suggests a way to reduce this to O(n) runtime complexity. We can use a
modified bucket sort. We will still create a map of all the elements with their
totals. But then we do a linear pass over them where we add them to a bucket.
The indices of the bucket will be the totals of values that we see in the list.
The size of the bucket can be the total number of elements since at most one element
can show up N times. And the values of the bucket will be the elements we see.
We can then do another linear pass over the buckets and add them to a list of results.
As soon as we have K results we can return the answer.
This should be O(n) but after coding this in Scala Leetcode gave a pretty low score.
Could only run faster than about 5% of submissions. Meanwhile my solution above
beats at least 80% of submissions.