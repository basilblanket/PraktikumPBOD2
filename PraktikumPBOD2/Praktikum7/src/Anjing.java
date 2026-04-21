// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: guk-guk.");
    }
}