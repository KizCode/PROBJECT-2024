import java.util.ArrayList;

public class SelectionSortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(99);
        nums.add(-10);
        nums.add(100123);
        nums.add(18);
        nums.add(-978);

        System.out.print("Original array: ");
        printArray(nums);

        doSomething(nums);

        System.out.print("Final array: ");
        printArray(nums);
    }

    static void doSomething(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) < arr.get(min_idx)) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                arr.set(min_idx, arr.set(i, arr.get(min_idx)));
            }
        }
    }

    static void printArray(ArrayList<Integer> arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

