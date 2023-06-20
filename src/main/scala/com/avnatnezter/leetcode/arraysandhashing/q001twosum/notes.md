# q1 Two Sum
We could solve this in O(n^2). We start with element 1 and check if any other
element in the list, when summed together, adds up to the target value.

We can make this faster by using a HashMap to store the elements and their indices.
Once we have that map we can iterate over the list again and see if its partner
exists in the map. If it does then we can return the indices for both values.
There is one scenario we need to look out for and that is if "duplicates". In this
case the values should really be a list of indices that share that value. If our
partner is itself and the value in the map is greater than 1 then return that array.
This would give us a speed of O(n).

Neetcode has a solution that only requires one pass through the array. This involves
building the hashmap as we go. This works since one of the constraints is that there
is exactly one correct answer, and it is guaranteed to be there. So we can check if 
the partner has been added to the map yet. If it has then return the two indices.
If not then add our current value with its index and we know later on we will find
the partner. Another reason why this is nice is because we don't have to worry about
partners that are identical.