// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

public class coercionsatu {
    public static void main(String[] args) {
        int nilaiInteger = 65;
        char nilaiKarakter = (char) nilaiInteger;
        double nilaiReal = nilaiInteger;
        String nilaiString = Integer.toString(nilaiInteger);

        System.out.println("a. Konversi nilai 65");
        System.out.println("Integer" + nilaiInteger);
        System.out.println("Karakter : " + nilaiKarakter);
        System.out.println("Real : " + nilaiReal);
        System.out.println("String : " + nilaiString);

        int bilanganAwal = 65;
        double bilanganReal = bilanganAwal;
        int bilanganKembali = (int) bilanganReal;

        System.out.println("b. Integer -> Real -> Integer");
        System.out.println("Bilangan awal    : " + bilanganAwal);
        System.out.println("Bilangan real    : " + bilanganReal);
        System.out.println("Bilangan kembali : " + bilanganKembali);
        System.out.println();

        // c. String X dan Y
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("c. Operasi String Integer");
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("S = X + Y sebagai String  : " + S);
        System.out.println("Z = X + Y sebagai Integer : " + Z);
        System.out.println();

        // d. String P dan Q
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("d. Operasi String Double");
        System.out.println("P = " + P);
        System.out.println("Q = " + Q);
        System.out.println("R = P + Q sebagai String  : " + R);
        System.out.println("D = P + Q sebagai Double  : " + D);
        System.out.println();

        // e. Integer A hasil konversi nilai S
        int A = Integer.parseInt(S);
        System.out.println("e. Nilai A hasil konversi S ke Integer: " + A);

        // f. String T hasil konversi nilai A
        String T = Integer.toString(A);
        System.out.println("f. Nilai T hasil konversi A ke String : " + T);
    }
}
