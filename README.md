# Ordered ArrayList implementation
# Team NYAH: Ameer Alnasser + Turtleboi, Hugo Jenkins + Boary, Anthony Sun + Corn, Nakib Abedin + Joker

### ALTester:
We created an ArrayList of 23 random Integers and checked if it was in order. We then created an OrderedArrayList and added each element from the ArrayList to the OAL, which should keep the OAL in order.
- isSorted(ArrayList)
  - checks if List is sorted
- arrayToString(ArrayList)
  - creates a string representation of an array
### OrderedArrayList:
- OrderedArrayList()
  - Constructor method that creates a new ArrayList of 23 integers by calling OrderedArrayList(23), an overloaded constructor which takes in length as a parameter
- OrderedArrayList(int length)
  -creates a ArrayList of length integers
- add(int newElement)
  -calls addLinear, which adds an element through traversing
- addLinear(int newElement)
  -Traverses the array to find a value greater than newElement. When found, it is inserted to the index one below the value 
  - If the method is unable to insert, then the newElement is added to the end.
- addBinary(int newElement() (commented out)
  - calls BinarySearch in an attempt to split apart the list in half in order to find the value greater than newElement. If not found, it looks in the other half.
- BinarySearch(ArrayList arr, int start, int end, int target)
  - Recursively calls BinarySearch in order to find the target
- toString()
  - returns a string representation of the ArrayList
- remove(int x)
  - call ArrayList's remove function, should not change functionality
- size()
  - returns size method of ArrayList
- get(int x)
  - returns get method of ArrayList
