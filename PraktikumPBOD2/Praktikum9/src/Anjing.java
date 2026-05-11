// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

class Anjing extends Anabul {
    public Anjing(String panggilan) {
        super(panggilan);
    }

    public void gerak() {
        System.out.println(panggilan + " bergerak dengan melata");
    }

    public void suara() {
        System.out.println(panggilan + "guk guk");
    }
}