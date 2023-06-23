# q128 Longest Consecutive Sequence
This problem is hard on leetcode, and I was unable to solve on my own. I attempted
to solve this using a bucket sort by first iterating over the numbers and fitting
them into the index that matched their value. Already this is a problem since the
input can include negatives. In order to initialize the bucket I needed to find the
minimum and maximum, initialize the Array that would act as buckets to max + min,
and every time a new element is added to the list I need to increment it by the 
absolute value of the min. If that succeeds we can then iterate over the buckets
and count how many numbers are in sequence without gaps (null or any kind of signal).
This solution fails almost immediately when our maximum is sufficiently large.

Neetcode has a different solution. Instead, let's convert our numbers into a hashset.
We can then iterate over our numbers and every time we encounter the start of a sequence
we will start counting its size by incrementing and seeing if the bigger number is
also in the set. The start of a sequence is defined as a number that doesn't have 
a neighbor to the left of it in the set. Since we are using a hashset we can check 
this and for consecutive values at O(1) complexity. Now it might feel like we've 
created a double loop anyway which would nudge the runtime to O(n^2). For example
let's say all the numbers are in sequence (0-9). We will find 0, then increment all
the way to 9, mark the sequence size as 9, and continue to check all the other numbers.
However, we are at most checking all the numbers 2 times which is O(2n) which is
really just linear time.