// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

abstract class CivitasAkademika {
    protected String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public abstract String getNomor();

    public String getNama() {
        return nama;
    }
}