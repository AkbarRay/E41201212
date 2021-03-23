package TugasMinggu3;

import java.util.Scanner;

public class dua {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai untuk array random Number : ");
        int v = s.nextInt();
        int[] randomNumber = new int[v];

        // input nilai
        for (int i = 0; i < v; i++) {
            System.out.print("nilai ke-" + i + " : ");
            randomNumber[i] = s.nextInt();
        }

        // output nilai
        System.out.print("Nilai array : ");
        System.out.print(" [ ");
        for (int i : randomNumber) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}