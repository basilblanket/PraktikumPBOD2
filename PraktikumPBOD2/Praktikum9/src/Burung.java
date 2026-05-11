// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

class Burung extends Anabul {
    public Burung(String panggilan) {
        super(panggilan);
    }

    public void gerak() {
        System.out.println(panggilan + " bergerak dengan terbang");
    }

    public void suara() {
        System.out.println(panggilan + " berbunyi cuit");
    }
}