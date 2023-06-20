# q242 Valid Anagram
Brute force approach would be to check every letter in 's' to see if it is in 't'.
Start with letter at index 0 in 's', try and find it in 't', mark the index 
where we found it, so we don't check it again. If we can't find it then 
immediately return false. This would be O(n2) time complexity and O(n) space
complexity since we would also need to keep track of the indices.

Instead, we could use a hashmap to store all the letters in 's' and the number of 
times they appear. We could then make a hashmap of all the letters in 't' and then 
compare the letter counts in 's' and 't'.
This would be O(n) runtime and O(2n) space complexity.

We could possibly do this with a single map. We write a single loop for 's' where
we add the character to a map with a count of one, or we increment the count.
We simultaneously iterate over 't' where we decrement the value in the map.
We do a single pass over the map and check that all the values are at 0.

Neetcode suggests we can reduce the space complexity further by sorting the words
first. A good sorting algorithm should run at O(nlogn) speed and if we sort both
's' and 't' we should get the same string. Then all we need to do is compare them.
Neetcode also says that although on paper we haven't increased the space it's 
possible the sorting algorithm has in which case we haven't gained much.