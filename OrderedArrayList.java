// Team NYAH: Ameer Alnasser + Turtleboi, Hugo Jenkins + Boary, Anthony Sun + Corn, Nakib Abedin + Joker
// APCS pd06
// Lab02
// 2021-12-13

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/


import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList() {
      OrderedArrayList(23);
  }
// overloaded constructor which helps to initialize instance variable
  public OrderedArrayList(int length) {
      _data = new ArrayList<Integer>(length);
  }
// creates String version of ArrayList
  public String toString()
  {
    if (size() ==0) return "{}";

    String out = "";
    for (int e : _data) {
      out += ","+e;
    }
    return "{" + out.substring(1) + "}";
  }
// calls remove function from ArrayList
  public Integer remove( int i )
  {
    Integer x = _data.get(i);
    _data.remove(i);
    return x;
  }
// calls size function from ArrayList

  public int size()
  {
    return _data.size();
  }
// calls get function from ArrayList

  public Integer get( int i )
  {
    return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    if (size() == 0) {
        _data.add(0, newVal);
        return;
    }

    for (int i = 0; i < _data.size(); i++) {
        if(get(i) > newVal) {
            _data.add(i, newVal);
            return;
        }
    }
    _data.add(size(), newVal);

  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
    if (size() == 0) {
        _data.add(0, newVal);
        return;
    }

    _data.add(binarySearch(_data, 0, size()-1, newVal), newVal);

    /*
    for (int i = 0; i < _data.size(); i++) {
        if(get(i) > newVal) {
            add(i, newVal);
            return;
        }
    }
    add(size(), newElement);
    */
  }
//helper method which searches
  public int binarySearch(ArrayList<Integer> arr,int startIndex, int lastIndex, int target)
  {
  if (arr.size() == 1) return arr.get(startIndex);

  int mid = (startIndex + lastIndex) / 2;
  if (target < arr.get(mid)){
    return binarySearch(arr, startIndex, mid-1, target);
  }else{
    return binarySearch(arr, mid, lastIndex, target);
  }

  }
  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    /*-----v-------move-me-down-----------------v--------

      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
