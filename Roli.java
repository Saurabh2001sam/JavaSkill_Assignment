import java.util.ArrayList;
public class Roli {
    public static void main(String[] args) {
        
    }
}


public class RotateArrayList {

    // Function to rotate the arraylist
    public static void rotate(ArrayList<Integer> arrList,
            int d) {
        // create a new arraylist
        ArrayList<Integer> arrList2 = new ArrayList<Integer>();

        // add elements to the new arraylist
        for (int i = 0; i < d; i++)
            arrList2.add(arrList.get(i));

        // shifting elements
        for (int i = 0; i < arrList.size() - d; i++)
            arrList.set(i, arrList.get(i + d));

        // adding elements to the original arraylist
        for (int i = arrList.size() - d; i < arrList.size(); i++)
            arrList.set(i, arrList2.get(i - arrList.size() + d));
    }

    // Driver Code
    public static void main(String args[]) {
        // define an arraylist
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        // add elements to the arraylist
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);

        // define a value for d
        int d = 2;

        // call rotate function
        rotate(arrList, d);

        // print the rotated arraylist
        System.out.println(arrList);
    }
}
