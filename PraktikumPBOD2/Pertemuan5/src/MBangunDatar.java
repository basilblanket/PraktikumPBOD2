// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Biru", "Putih");
        BangunDatar L1 = new Lingkaran(14, "Hijau", "Hitam");
        Lingkaran L2 = new Lingkaran(28, "Kuning", "Putih");
        P1.printInfo();
        System.out.println();
        P2.printInfo();
        System.out.println();
        L1.printInfo();
        System.out.println();
        L2.printInfo();
        System.out.println();

        System.out.println("Afakah luas P1 sama dengan P2? " + P1.isEqualLuas(P2));
        System.out.println("Afakah keliling L1 sama dengan L2? " + L1.isEqualKeliling(L2));

        System.out.println("Sebelum Resize");
        P1.printInfo();
        L1.printInfo();

        IResize p = (IResize) P1;
        IResize l = (IResize) L1;
        p.zoomIn();
        l.zoomIn();
        System.out.println("zoom in 10%");
        P1.printInfo();
        L1.printInfo();
        p.zoomOut();
        l.zoomOut();
        System.out.println("zoom out 10%");
        P1.printInfo();
        L1.printInfo();
        p.zoom(200);
        l.zoom(50);
        System.out.println("zoom");
        P1.printInfo();
        L1.printInfo();
    }
}