import java.util.ArrayList;

public class ALTester {
  public static void main(String[] args) {
    int length = 23;
    ArrayList<Integer> data = new ArrayList<Integer>(length);
    for (int i = 0; i < length; i++) {
      data.add((int)(Math.random()*100));
    }
    System.out.println("Array is sorted: " + isSorted(data));
    
    System.out.println(arrayToString(data));

    OrderedArrayList ordered = new OrderedArrayList(length);

    for (int e : data) {
      ordered.add(e);
    }

    System.out.println(ordered);
  }

  public static boolean isSorted(ArrayList<Integer> data) {
    int max = data.get(0);
    for (int e : data) {
      if(e >= max) {
        max=e;
      } else return false;
    }
    return true;
    
  }

  public static String arrayToString(ArrayList<Integer> a) {
    String out = "";
    for (int e : a) {
      out += ","+e;
    }
    return "{" + out.substring(1) + "}";
  }
}
