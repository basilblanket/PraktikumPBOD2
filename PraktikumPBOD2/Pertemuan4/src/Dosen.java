// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2
public class Dosen extends Pegawai{
    protected String fakultas;

// Dosen tetap atau dosen tamu bekerja pada fakultas tertentu. 

public Dosen (String nip, String nama, String tglLahir, String terhitungML, double gajiPokok, String fakultas) {
    super(nip, nama, tglLahir, terhitungML, gajiPokok);
    this.fakultas = fakultas;
    }
}