// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2
public class Pegawai {
    protected String nip;
    protected String nama;
    protected String tglLahir;
    protected String terhitungML;
    protected double gajiPokok;


    public Pegawai (String nip, String nama, String tglLahir, String terhitungML, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.terhitungML = terhitungML;
        this.gajiPokok = gajiPokok;
    }
    public void printInfo() {
    System.out.println("NIP : " + nip);
    System.out.println("Nama : " + nama);
    System.out.println("Tanggal Lahir : " + tglLahir);
    System.out.println("TMT : " + terhitungML);
    System.out.println("Gaji Pokok : " + gajiPokok);
    }
}

