// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    @Override
    public void suara() {
        System.out.println(nama + " bersuara cuit");
    }
}