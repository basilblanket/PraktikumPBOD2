// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

class Kucing extends Anabul {
    protected double bobot; //buatbwhn kilogram

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void gerak() {
        System.out.println(nama + " melata");
    }

    public void suara() {
        System.out.println(nama + " meong");
    }
}