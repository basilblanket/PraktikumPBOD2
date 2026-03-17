// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2
public class Tendik extends Pegawai {
    private String bidang;

    public Tendik (String bidang, String nip, String nama, String tglLahir, String terhitungML, double gajiPokok) {
        super(nip, nama, tglLahir, terhitungML, gajiPokok);
        this.bidang = bidang;
    }
    @Override
    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("TMT : " + terhitungML);
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}
