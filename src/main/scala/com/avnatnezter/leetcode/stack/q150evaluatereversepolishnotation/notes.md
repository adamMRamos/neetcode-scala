# q150 Evaluate Reverse Polish Notation
For this problem we are going to want to use a stack. It allows us to track our previous
computed expressions, so we can perform the next operation on them. Every time we
see a number, put it onto the stack, and every time we see an expression, perform an
operation on the last value and the last computed value. At first, I thought I would 
need to store the last computed value in a separate variable but this created an issue. 
The first time we see an expression we need to pop 2 values off the stack and the next
time we see an expression we need to pop 1 value and compute it with our last computed
expression. For example 1,2,+,3,+. When we get to '+' we pop 1 and 2 and add them 
but when we get to the next + we add 3 with 3 (1+2). So using a separate variable
is not so helpful. Instead, we will store the last computed value on our stack. So
1,2,+,3,+ becomes 3,3,+ which is then 3+3 which is 6, and finally we return the top
value of our stack as the answer.

This runs in linear time. It's really 2n since we are backtracking in our stack.
Space complexity is linear as well since we are using the stack.