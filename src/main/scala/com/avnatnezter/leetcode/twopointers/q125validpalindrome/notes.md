# q125 Valid Palindrome
To detect if a string is a palindrome we need to confirm that all the characters
are the same when read normally or in reverse. For this problem only alphanumeric
characters are considered for testing for a palindrome, and we can ignore any other
character including whitespace.

In scala, we can use "isLetter" or is "isDigit" to filter out all non alphanumerics
from the string. Then we map all letters to their lowercase version, reverse the 
string, and return if they are the same. Time complexity is O(n) and space complexity
is also O(n) since we needed to generate a new string as well as reverse it.

If we use 2 pointers we can reduce space complexity to O(1). Start with a left and
right pointer. Initialize the left pointer to be 0 and the right pointer to be the
length of the string -1. We will then loop over the string and increment and decrement
our left and right pointer until both pointers cross one another. Also, within our 
while loop, we will increment/decrement our left and right pointers if either of 
them point to non-alphanumeric characters. If we exit our loop without finding non-matching 
characters then we can return true. This solution didn't require us to use any extra
memory.