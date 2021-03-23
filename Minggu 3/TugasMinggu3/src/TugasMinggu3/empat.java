package TugasMinggu3;

import java.util.Scanner;

public class empat {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                                  POLOSKUY!");
        System.out.println("                              PROMO KEMERDEKAAN");
        System.out.println("                          Khusus Pembelian 5 Pertama");
        System.out.println("                     Khusus Pembelian Rp 10.000,00 Keatas");
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("MasukKan nama pembeli : ");
        String nama = s.nextLine();
        
        int[] barang = new int[5];
        int total = 0;
        for (int i = 0; i < barang.length; i++) {
            System.out.print("Masukkan harga barang ke-" + (i) + " : ");
            barang[i] = s.nextInt();
            total = total + barang[i];
        }

        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp. " + total);

        // cek promo
        boolean promo = false;
        for (int i = 0; i < barang.length; i++) {
            promo = barang[i] >= 10000;
        }

        if (promo == true) {
            System.out.println("Selamat...");
            System.out.println("Anda Mendapatkan Waistbag dari promo");
        } else {
            System.out.println("Maaf, anda tidak mendapatkan promo");
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                             Terima Kasih");
        System.out.println("                    Sudah Berbelanja di POLOSKUY!");

    }
}