can solve this one by finding the profit at current buy price
if current price is greater than our buy price then try to take a profit
otherwise if price is lower than our buy price then set our new buy price
to be the lower value

let's start by setting buy price to the first price
our profit can be 0
we can iterate over all the prices
if price is greater than our buy price then use max function to try and set our
new profit for selling today
if price is lower, then we can reset our buy price to be the new price,
and we keep going, and we may try and sell tomorrow
