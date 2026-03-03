/*
NAMA : BASIL AYMAN HARIADI
NIM : 24060124140160
D2
*/

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa() {
        this.nim = "0";
        this.nama = "0";
        this.prodi = "0";
        this.listMatkul = new ArrayList<>();
    }

    public void addMatkul(MataKuliah mk) {
        if (listMatkul.size() < 50) {
            listMatkul.add(mk);
        } else {
            System.out.println("Mata kuliah sudah mencapai batas maksimum!");
        }
    }

    public int getJumlahSKS() {
        int total = 0;
        for (MataKuliah mk : listMatkul) {
            total += mk.getSks();
        }
        return total;
    }

    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    public void setDosenWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void printMhs() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    public void printDetailMhs() {
        printMhs();

        System.out.println("\nDaftar Mata Kuliah:");
        for (MataKuliah mk : listMatkul) {
            System.out.println(mk.getNama() + " (" + mk.getSks() + " SKS)");
        }

        System.out.println("\nJumlah Matkul : " + getJumlahMatKul());
        System.out.println("Total SKS     : " + getJumlahSKS());

        if (dosenWali != null) {
            System.out.println();
            dosenWali.printDosen();
        }

        if (kendaraan != null) {
            kendaraan.printKendaraan();
        } else {
            System.out.println("Tidak memiliki kendaraan.");
        }
    }
}