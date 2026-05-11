// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

class Kucing extends Anabul {
    protected double bobot; //buatbwhn kilogram

    public Kucing(String panggilan, double bobot) {
        super(panggilan);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void gerak() {
        System.out.println(panggilan + " melata");
    }

    public void suara() {
        System.out.println(panggilan + " meong");
    }
}