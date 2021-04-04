package TugasMinggu4;

import java.util.Arrays;
import java.util.Scanner;

public class tugas_a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int panjang = 0;
        System.out.print("masukan panjang nilai : ");
        panjang = s.nextInt();
        int[] angka = new int[panjang];
    
        for (int i = 0; i < panjang; i++) {
            System.out.print("masukan nilai ke-" + i + " : ");
            angka[i] = s.nextInt();
        }

        System.out.print("Array semua\t\t\t: ");
        System.out.print("[ ");
        for (int i : angka) {
            System.out.print(i + " ");
        }
        System.out.println("]");

        System.out.print("Array Genap\t\t\t: ");
        System.out.print("[ ");
        for (int i : angka) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("]");

        Arrays.sort(angka);
        System.out.print("Array Urut [kecil - besar]\t: ");
        System.out.print("[ ");
        for (int i : angka) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}