/*
NAMA : BASIL AYMAN HARIADI
NIM : 24060124140160
D2
*/

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    Dosen() {
        nip = "0";
        nama = "0";
        prodi = "0";
    }
    public void printDosen() {
        System.out.println("Dosen Wali:");
        System.out.println("NIP   : " + nip);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}