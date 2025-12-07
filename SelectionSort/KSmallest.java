//if we shaqnge the if condition means we will get k Largest
import java.util.Arrays;

class Ksmallest {
    public int searchalgo(int[] arr, int k) {
        int min = -1;
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] <arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

        return arr[k - 1];
    }
}

public class KSmallest {
    public static void main(String[] args) {

        int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        Ksmallest s = new Ksmallest();
        System.out.println("Array before Sorting : " + Arrays.toString(arr));
        int ans = s.searchalgo(arr, 4);
        System.out.println("Array after Sorting : " + Arrays.toString(arr));
        System.out.println("Array after Sorting  the k smallest element: " + ans);
    }
}
