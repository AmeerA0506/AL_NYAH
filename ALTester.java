import java.util.ArrayList;

public class ALTester {
  public static void main(String[] args) {
    ArrayList<Integer> data = new ArrayList<Integer>(23);
    for (int i = 0; i < data.size(); i++) {
      data.add((int)(Math.random()*100));
    }

  }
}
