// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void suara() {
        System.out.println(nama + " bersuara: meong.");
    }
}