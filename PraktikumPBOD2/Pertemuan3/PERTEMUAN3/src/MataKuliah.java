/*
NAMA : BASIL AYMAN HARIADI
NIM : 24060124140160
D2
*/
public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }
    MataKuliah() {
        idMatkul = "0";
        nama = "0";
        sks = 0;
    }
    public String getidMatkul() {
        return idMatkul;
    }
    public String getNama() {
        return nama;
    }
    public int getSks() {
        return sks;
    }
}
