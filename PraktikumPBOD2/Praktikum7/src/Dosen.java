// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

class Dosen extends CivitasAkademika {
    private String nip;

    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }

    public String getNomor() {
        return nip;
    }
}