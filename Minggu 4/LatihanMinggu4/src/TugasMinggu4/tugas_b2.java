package TugasMinggu4;

public class tugas_b2 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Bilangan [perkalian 2 (0 - 100)");
        System.out.println("==============================");
        int j = 0;
        do {
            if(j == 0) {
                j = 1;
            } else {
                System.out.print(j * 2 + " ");
            }
            j++;
        } while(j <= 100);
    }
}