package TugasMinggu3;

import java.util.Scanner;

public class lima {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("                      INSOMNIA CAFE");
        System.out.println("--------------------------------------------------");
        System.out.println("                      SPECIAL MENU");
        System.out.println("1. Soft Drink");
        System.out.println("2. Es Boba");
        System.out.println("3. Nasi Goreng");
        System.out.println("4. Nasi Tempong");
        System.out.println("5. Beef Kebab");
        System.out.println("--------------------------------------------------");
        System.out.print("Silahkan masukan nama pembeli : ");
        String nama = s.nextLine();
        System.out.print("Silahkan masukan pilihan kamu: ");

        int op = s.nextInt();
        String pilihan = "";

        switch (op) {
            case 1:
                pilihan = "Soft Drink";
                break;
            case 2:
                pilihan = "Es Boba";
                break;
            case 3:
                pilihan = "Nasi Goreng";
                break;
            case 4:
                pilihan = "Nasi Tempong";
                break;
            case 5:
                pilihan = "Kari Ayam";
                break;
            default:
                System.out.println("pilihan anda tidak ada di menu");
                break;
        }

        System.out.println("Minuman yang anda pilih : " + pilihan);
        System.out.println("Pesanan anda akan segera diantar");
        System.out.println("Terima Kasih " + nama + " telah berkunjung ke INSOMNIA CAFE");

    }

}