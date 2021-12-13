# Ordered ArrayList implementation
# Team NYAH: Ameer Alnasser + Turtleboi, Hugo Jenkins + Boary, Anthony Sun + Corn, Nakib Abedin + Joker

### ALTester:
We created an ArrayList of random Integers and checked if it was in order. We then created an OrderedArrayList and added each element from the ArrayList to the OAL, which inserts the element into an ArrayList such that the elements stay in order.

### OrderedArrayList:
- OrderedArrayList()
  - Constructor method that creates a new ArrayList of 23 integers by calling OrderedArrayList(23), an overloaded constructor which takes in length as a parameter
- add(int newElement)
  - If the ArrayList is empty, add newElement to the array.
  - Otherwise, traverse the array and insert newElement into the ArrayList such that elements before it are less than newElement and elements after it are greater than or equal to newElement
  - If the method is unable to insert, then the newElement is added to the end.
  - returns a boolean
- toString()
  - returns a string representation of the ArrayList
- remove(int x)
  - call ArrayList's remove function, should not change functionality
- add-at-index(int x, val)
  - disregards index, calls add(x)
- size()
  - returns size method of ArrayList
