import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrInteger = new ArrayList<>(10);

        arrInteger.add(10);
        arrInteger.add(11);

        for(int a = 0; a < arrInteger.size(); a++){
            System.out.println("indek ke-" + (a) + ": " + arrInteger.get(a));
        }
      
    }
}
