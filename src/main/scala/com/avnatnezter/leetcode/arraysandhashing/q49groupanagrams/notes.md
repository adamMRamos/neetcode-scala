# q49 Group Anagrams
This is interesting because we need to check if a string is an anagram with every
other string in the array... checking if two strings are anagrams are already O(n)
Doing that N times would make this an O(n^n).

I think we can obtain speedup by using a single hashmap to build up the final results.
Scala makes this easy since we can use a group by where the keys will be the sorted
versions of the strings. This is similar to the final suggestion of neetcode in
q242 valid anagram. The runtime complexity of solution would be O(n * nlogn) where
nlogn is the speed of the sorting algorithm. This is because we are iterating all
the strings in our input and sorting each one before fitting it into our result.
Space complexity is perhaps O(n)? since we need to build up the result as we go?

Without group by we can still get the same runtime and space complexity. We do this
with a single loop and a hashmap. We iterate over each element and sort the element.
If the sorted version doesn't exist in the map then add it to the map and value
will be singleton list with the unsorted version of the string. If the key does 
exist then simply update the list with this new element.
