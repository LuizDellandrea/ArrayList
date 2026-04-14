import java.util.ArrayList;
import java.util.Collections;

public class Segundo {
    public static void main(String[] args) {

        ArrayList<Integer> primeiro = new ArrayList<>();

        primeiro.add(1);
        primeiro.add(2);
        primeiro.add(3);
        primeiro.add(4);
        primeiro.add(5);

        Collections.reverse(primeiro);

        System.out.println(primeiro);
    }
}