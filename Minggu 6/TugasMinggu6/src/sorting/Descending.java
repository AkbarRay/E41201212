package sorting;

/**
 *
 * @author MUHAMMAD AKBAR RAYYAN AL FATH
 */
public class Descending {
  // show
    static void show(int[] arr) {
        System.out.print("Array sebelum diurutkan\t\t\t: ");
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
// descending
    static void BubbleSortDESC(int[] arr) {
        int temp = 0;
        boolean swap = false;
        int swap_count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    swap = true;
                    if (swap) {
                        swap_count++;
                    }
                }
            }
        }

        System.out.print("Array setelah diurutkan DESCENDING\t: ");
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        System.out.println("Jumlah perbandingan : " + swap_count);
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 8, 4, 7, 15, 19, 17, 16};
        show(number);
        BubbleSortDESC(number);
    
    }
}