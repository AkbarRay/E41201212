package TugasMinggu3;

public class tiga {
    public static void main(String[] args) {
        int[][] angka = {
            {5, 6, 1, 7},
            {8, 1, 2, 9},
            {5, 4, 7, 1},
            {8, 3, 7, 5}
        };
        
        for (int[] angka1 : angka) {
            System.out.print("[ ");
            for (int j = 0; j < 4; j++) {
                System.out.print(angka1[j] + " ");
            }
            System.out.println("]");
        }
    }
}