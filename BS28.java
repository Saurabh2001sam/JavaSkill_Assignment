import java.util.ArrayList;

public class BS28 {
    
    
    

        // Returns index of x if it is present in arr[],
        // else return -1
        public static int binarySearch(ArrayList<Integer> arr, int x) {
            int l = 0, r = arr.size() - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;

                // Check if x is present at mid
                if (arr.get(m) == x)
                    return m;

                // If x greater, ignore left half
                if (arr.get(m) < x)
                    l = m + 1;

                // If x is smaller, ignore right half
                else
                    r = m - 1;
            }

            // if we reach here, then element was
            // not present
            return -1;
        }

        public static void main(String args[]) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(10);
            arr.add(30);
            arr.add(28);
            arr.add(78);
            int x = 28;

            int result = binarySearch(arr, x);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at index " + result);
        }
    }

