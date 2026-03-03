/* 
 * Nama File  : Garis.java
 * Deskripsi  : Class Garis dengan atribut titik awal dan titik akhir
 * Pembuat    : Basil Ayman Hariadi
 * Tanggal    : 2026
 */

public class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // konstruktor default
    public Garis() {
        this(new Titik(0,0), new Titik(1,1));
    }

    // konstruktor parameter
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // getter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // setter
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // panjang garis
    public double getPanjang() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // gradien
    public double getGradien() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        return (y2 - y1) / (x2 - x1);
    }

    // titik tengah
    public Titik getTitikTengah() {
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;

        return new Titik(tengahX, tengahY);
    }

    // sejajar
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // tegak lurus
    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // print
    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // persamaan garis
    public String getPersamaan() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());

        return "y = " + m + "x + " + c;
    }
}