# Q74 Search a 2D Matrix
very similar to basic binary search but now we do it in 2 dimensions.
this problem can be very easy if we just treat it as one dimension and then we
can convert our mid value back to an x,y.

So we start off with left and right as usual. Left is 0 and right will be 
cols * rows or the entire length of the 2d array. our mid value is then 
(left - right) / 2. So far the same. When we want to use our mid value 
we will convert to X by getting the mod of cols and we convert to Y by
dividing by cols. And then we continue as usual. Keep checking as long as our
left pointer is less than our right. If our value at mid is greater than target
we will set left to mid + 1. otherwise set right to mid - 1. If our value at
mid is true then we can finish early and return true.
