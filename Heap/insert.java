
import java.util.*;

public class insert {

    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            //add to last index
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }

        }
    }

    public static void main(String[] args) {
        /*
         *       1
         *      /  \
         *     4    2   arr = [1,4,2,10,5,9]
         *    / \  / 
         *  10   5 9
         */
        System.out.println("hello");
        Heap h = new Heap();
        h.add(10);
        h.add(5);
        h.add(9);
        h.add(4);
        h.add(1);
        h.add(2);
        System.out.println(h.arr);
    }
}
