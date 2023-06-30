# q20 Generate Parentheses
This one can seem daunting at first but the code is fairly similar. We want to be
able to generate all possible valid pairs of parentheses. That is every open parenthesis
has a matching close parenthesis afterwards. So ()() is valid but )() is not. If we
try to work out the solution on paper one thing we notice right away is that the strings
can never start with a closed parentheses. Another thing we notice is that at any
time we are adding either a close or open parentheses to some permutation of the string
so it might start to look like a binary tree. Some paths on the tree are immediately
invalid. For example if we try to add a close parentheses but there is no preceding
open parentheses to match it. Another thing is that once we have 3 open and 3 close
parentheses and as long as we never built an invalid string we know we have found
a valid permutation and we can add it to our answer.

Once we start to write this solution into code we realise we are going to want to
keep track of some state. For every permutation we will want to know how many open
close parentheses it already has. We can do this with a tuple or with a case class
that has 3 values. One for open, close, and the string we are building. We will then
create a stack of "states" where we will first pop off a state and potentially push
2 new states depending on if we could append an open or close parentheses to that state.
We will loop until the stack is empty. On every iteration we will be popping off one
state, if it is "finished" then we can add its string to our answer. If not then
we can ask 2 questions, if open < n push a new state with open count + 1 and an open 
parentheses appended to the string. If close < open, then append another state to
the stack with close + 1 and a closed parentheses appended to the string.
Once we are out of the loop we can return our list of strings.

Neetcode suggested using a recursive call to solve this problem and the code is also
very concise. This time we are pushing characters to a stack based on params in our
recursive method, open and close. Same as above, if open is < n then push '(' to the
stack and make a recursive call incrementing open. If close < n then push ')'
and make a recursive call incrementing close. In both ifs we will pop a character 
off of the stack. The base case for our recursive call is if close == open == n in
which case we add all the characters in our stack to our solution as a string and
break out of the recursive call.
