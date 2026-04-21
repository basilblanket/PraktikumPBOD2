// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

public class Mahasiswa {
    private int nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        this.nim = -999;
        this.nama = "n/a";
        this.programStudi = "n/a";
    }
    public Mahasiswa(int nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }
    public Mahasiswa(Mahasiswa mahasiswaLain) {
        this.nim = mahasiswaLain.nim;
        this.nama = mahasiswaLain.nama;
        this.programStudi = mahasiswaLain.programStudi;
    }

    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }
    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }
    public void setProgramStudi(Mahasiswa mahasiswaLain) {
        this.programStudi = mahasiswaLain.programStudi;
    }

    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method tampil data
    public void tampilData() {
        System.out.println("NIM :" + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Program Studi : " + programStudi);
        System.out.println();
    }
}
