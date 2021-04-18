package sorting;

/**
 *
 * @author MUHAMMAD AKBAR RAYYAN AL FATH
 */
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - i; i++)
        {
            int index = 1;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }        
    }

    public static void main(String a[]){
        int[] arr1 = {8,13,4,3,42,12,59,23};
        System.out.println("Sebelum Selection Sort");
        for(int i:arr1){
           System.out.print(i+" ");
        }
        System.out.println();
        
        selectionSort(arr1);//sorting array using selection sort
        
        System.out.println("Setelah Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}