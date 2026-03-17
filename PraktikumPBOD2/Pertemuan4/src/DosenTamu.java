// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2
public class DosenTamu extends Dosen {
    private String nidk;
    private String tglAkhirKontrak;

    public DosenTamu(String nip, String nidk, String nama, String tglLahir, String terhitungML, double gajiPokok, String fakultas, String tglAkhirKontrak) {
        super(nip, nama, tglLahir, terhitungML , gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglAkhirKontrak = tglAkhirKontrak;

    }
    @Override
    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("NIDK : " + nidk);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir: " + tglLahir);
        System.out.println("TMT  : " + terhitungML);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Tanggal Akhir Kontrak : " + tglAkhirKontrak);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}


