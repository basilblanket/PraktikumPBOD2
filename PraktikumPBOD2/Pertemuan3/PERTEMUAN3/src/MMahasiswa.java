/*
NAMA : BASIL AYMAN HARIADI
NIM : 24060124140160
D2
*/


public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah pbo = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah mbd = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa m1 = new Mahasiswa("234", "Citra", "Informatika");
        Dosen d1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan k1 = new Kendaraan("H1234AB", "motor");
        m1.setDosenWali(d1);
        m1.setKendaraan(k1);
        m1.addMatkul(pbo);
        m1.addMatkul(mbd);
        System.out.println("Jumlah Mata Kuliah = " + m1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + m1.getJumlahSKS());
        m1.printDetailMhs();
    }
}