// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2

public class Main {
    public static void main(String[] args) {

        Persegi p1 = new Persegi();
        p1.setSisi(5);
        p1.setWarna("Merah");
        p1.setBorder("Hitam");

        System.out.println("PERSEGI");
        System.out.println("Sisi      : " + p1.getSisi());
        System.out.println("Luas      : " + p1.getLuas());
        System.out.println("Keliling  : " + p1.getKeliling());
        System.out.println("Diagonal  : " + p1.getDiagonal());
        p1.printInfo();

        System.out.println();

        // objek Lingkaran
        Lingkaran l1 = new Lingkaran();
        l1.setJariJari(7);
        l1.setWarna("Biru");
        l1.setBorder("Putih");

        System.out.println("LINGKARAN");
        System.out.println("Jari-jari : " + l1.getJariJari());
        System.out.println("Luas      : " + l1.getLuas());
        System.out.println("Keliling  : " + l1.getKeliling());
        l1.printInfo();

        System.out.println();

        Persegi p2 = new Persegi(4, "Kuning", "Hitam");
        Lingkaran l2 = new Lingkaran(10, "Hijau", "Abu");

        System.out.println("PERSEGI 2");
        p2.printInfo();

        System.out.println();

        System.out.println("LINGKARAN 2");
        l2.printInfo();
    }
}