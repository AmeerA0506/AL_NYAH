import java.util.ArrayList;

public class OrderedArrayList extends ArrayList {
    ArrayList<Integer> data;
    public OrderedArrayList(int length) {
        data = new ArrayList<Integer>(length);
        
    }

    // overridden add()
    public boolean add(int newElement) {
        if (data.size() == 0) {
            data.add(0, newElement);
            return true;
        }

        for (int i = 0; i < data.size(); i++) {
            if(data.get(i) > newElement) {
                data.add(i, newElement);
                return true;
            }
        }
        data.add(data.size(), newElement);
        return true;
        
    }

    public String toString() {
        if (data.size() ==0) return "{}";

        String out = "";
        for (int e : data) {
          out += ","+e;
        }
        return "{" + out.substring(1) + "}";
      }
}
