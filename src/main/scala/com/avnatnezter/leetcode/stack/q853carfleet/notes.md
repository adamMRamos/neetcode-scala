# q853 Car Fleet
We can solve this with a linear operation using a stack, but also we need to sort
the input meaning our runtime will ultimately be nlogn. We can look at our two input
arrays as pairs of values that allow us to calculate when a car reaches the target
destination. If a pair is behind another and is moving faster we can assume they
will intersect before or by the time they reach their destination, and we will consider
them a single fleet. Since they both move at the slower speed, any other pair behind
our new fleet that is faster will also intersect and combine with the fleet. As long
as we are always checking for cars that are behind us, we can keep doing this until
we have run out of cars to check.

The solution code will work like this. First we will combine our positions and speed
into an array of pairs, and then we have to sort them by position in descending order.
This ensures we are always looking at the car closest to our destination. We will
start off by putting our first car onto the stack. Then we iterate over the rest of
the cars, remember they are sorted by position, if our current car is slower than our
previous car we push it onto the stack, otherwise keep going. Finally, we will return 
the size of our stack as the answer.

As well as being O(nlogn) time complexity this solution also requires N space since
we use the stack, and we create a new input array out of our speeds and positions 
arrays.