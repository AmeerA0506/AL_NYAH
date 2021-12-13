// Team NYAH: Ameer Alnasser + Turtleboi, Hugo Jenkins + Boary, Anthony Sun + Corn, Nakib Abedin + Joker
// APCS pd06
// Lab02
// 2021-12-13

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
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
      _data = new ArrayList<Integer>();
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
    // if (size() == 0) {
    //     _data.add(0, newVal);
    //     return;
    // }

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

    _data.add(binarySearch(_data, 0, size(), newVal), newVal);

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
  public int binarySearch(ArrayList<Integer> arr,int startIndex, int endIndex, int target)
  {
    // base case:
    if (endIndex-startIndex == 1) { //if one element left in array
      return startIndex; //return that index
    }

    int mid = (startIndex + endIndex) / 2;

    // System.out.println("Working array: {"+arr.get(startIndex)+"..."+arr.get(endIndex-1)+"}");
    // System.out.println("Range: ["+startIndex+","+endIndex+")");
    // System.out.println("mid:"+mid);


    if (arr.get(mid-1) < target) {
      // System.out.println("Target is greater than everything before it");
      return binarySearch(arr, mid, endIndex, target);
    } else if ( arr.get(mid-1) == target){
      return mid;
    }
    else {
      // System.out.println("target is less than or equal to everything after it");
      return binarySearch(arr, startIndex, mid, target);
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

    // ArrayList<Integer> _data = new ArrayList<Integer>(2);

    // _data.add(0);
    // _data.add(1);
    // _data.add(2);
    // _data.add(3);
    // _data.add(5);
    // System.out.println("b"+Franz.binarySearch(_data, 0, _data.size(), 1)+"..1");



    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ){
      Franz.addBinary( (int)( 50 * Math.random() ) );
    }

    //bandaid fix
    int last = Franz.get(Franz.size()-1);
    Franz.remove(Franz.size()-1);
    Franz.addBinary(last);


    System.out.println( Franz );
    /*-----v-------move-me-down-----------------v--------

      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
