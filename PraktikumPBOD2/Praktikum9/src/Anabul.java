// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

abstract class Anabul {
    protected String nama;
    protected String panggilan;

    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    public String getNama() {
        return panggilan;
    }
    public void setNama(String panggilan) {
        this.panggilan = panggilan;
    }

    public abstract void gerak();
    public abstract void suara();
}