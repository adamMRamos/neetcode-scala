# q20 Valid Parenthesis

We want to know whether every open "parenthesis" has a matching close parenthesis.
In this problem we consider parenthesis to be one of these 3 pairs of characters: "{}" "[]" "()".  
A stack is a good solution here since it allows us to keep track of the last open 
parenthesis we've encountered. The moment we encounter a close parenthesis we can 
check if the last pushed open parenthesis matches. If they match we can pop it off 
the stack. If not then we can terminate and return false. We continually push open
parenthesis characters onto the stack and at the end if the stack is not empty then
we know the string is not valid parenthesis.

This solution runs in linear time O(n) and requires O(n) memory since we are building
the stack as we go. If the string is all empty parenthesis then we could end up putting
all the characters onto the stack.