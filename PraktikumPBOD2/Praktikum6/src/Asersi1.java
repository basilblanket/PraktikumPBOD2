// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2


public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;

        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}