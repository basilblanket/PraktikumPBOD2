// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2
public class DosenTetap extends Dosen {
    private String nidn;

    public DosenTetap (String nip, String nidn, String nama, String tglLahir, String terhitungML, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, terhitungML , gajiPokok, fakultas);
        this.nidn = nidn;
    }
    @Override
    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("TMT : " + terhitungML);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas  : " + fakultas);
        System.out.println("Gaji Pokok   : " + gajiPokok);
    }
}