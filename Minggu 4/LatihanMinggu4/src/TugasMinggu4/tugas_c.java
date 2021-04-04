package TugasMinggu4;

import java.util.Scanner;

public class tugas_c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukan panjang nilai : ");
        int panjang = s.nextInt();
        int[] angka = new int[panjang];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("masukan angka ke-"+ (i+1) + " : ");
            angka[i] = s.nextInt();
        }

        int max = angka[0];
        int min = angka[0];

        for (int i = 0; i < angka.length; i++) {
            if( max < angka[i] ) {
                max = angka[i];
            }
            if(min > angka[i]){
                min = angka[i];
            }
        }

        int avg = 0;
        int sum = 0;
        for (int i : angka) {
           sum += i;
        }

        avg = sum / angka.length;

        System.out.println("nilai minimum : " + min);
        System.out.println("nilai maximum : " + max);
        System.out.println("nilai rata - rata : " + avg);
    }

}