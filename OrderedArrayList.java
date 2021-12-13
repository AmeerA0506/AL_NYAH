// Clyde "Thluffy" Sinclair
// APCS pd00
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
  public OrderedArrayList(int length) {
      _data = new ArrayList<Integer>(length);
  }

  public String toString()
  {
    if (size() ==0) return "{}";

    String out = "";
    for (int e : _data) {
      out += ","+e;
    }
    return "{" + out.substring(1) + "}";
  }

  public Integer remove( int i )
  {
    Integer x = _data[i];
    _data.remove(i);
    return x;
  }

  public int size()
  {
    return _data.size();
  }

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
        add(0, newElement);
        return true;
    }

    for (int i = 0; i < _data.size(); i++) {
        if(get(i) > newElement) {
            add(i, newElement);
            return true;
        }
    }
    add(size(), newElement);
    return true;

  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {

  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    /*-----v-------move-me-down-----------------v--------

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
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
