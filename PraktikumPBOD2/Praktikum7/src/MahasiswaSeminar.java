// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

class MahasiswaSeminar extends CivitasAkademika {
    private String nim;
    private Dosen wali;

    public MahasiswaSeminar(String nim, String nama, Dosen wali) {
        super(nama);
        this.nim = nim;
        this.wali = wali;
    }

    public String getNomor() {
        return nim;
    }

    public void setWali(Dosen wali) {
        this.wali = wali;
    }

    public void tampil() {
        System.out.println(nim + " " + nama + " " + wali.getNama());
    }
}