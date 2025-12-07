import java.util.*;

class SelectionsortAlgo {
    public int[] searchalgo(int[] arr) {

        int minlocation = -1;
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            minlocation = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minlocation]) {
                    minlocation = j;
                }
            }
            temp = arr[minlocation];
            arr[minlocation] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

class BasicAlgo {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        SelectionsortAlgo s = new SelectionsortAlgo();
        System.out.println("Array before Sorting : " + Arrays.toString(arr));
        s.searchalgo(arr);
        System.out.println("Array after Sorting : " + Arrays.toString(arr));

    }
}
