# q155 MinStack
This is a great and not overly challenging datastructures design question. We want
to implement a stack, Last In First Out, that can also always return us the minimum
element in our stack. The stack itself is easy. We can implement our own singly 
linked list where every element is appended to the front and points to the previously
pushed element. For the sake of speed we can just use the already implemented stack.
Deciding how to track the minimum element is trickier.

The easiest way is to iterate over all the elements until we find the minimum. This
would run in linear time. However, we can do this in constant time if we somehow keep 
track of the smallest element that was added to the stack. One way might be to use
a variable that we update every time we add a new element. This sounds fine until
we start popping elements off the stack. For example let's say we pushed -1, 0, -2
onto the stack in that order. The minimum is -2, but if wwe pop the minimum should
now be -1. How do we update our minimum on a pop? 

One answer could be if we tracked the smallest element at the time of pushing an element
onto the stack. Neetcode does this with 2 stacks, but we can do it in one. Our stack
will now hold 2 tuples where the first element is our new element and the second is
our last known minimum. So our previous example becomes (-1,-1), (0,-1), (-2,-2).
And now we have a way to track our minimum in constant time.
