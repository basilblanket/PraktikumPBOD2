// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

public class main {
     public static void main(String[] args) {
        System.out.println("no1");
        coercionsatu.main(args);

        Mahasiswa m1 = new Mahasiswa();
        m1.tampilData();
        Mahasiswa m2 = new Mahasiswa(24140160, "Basil", "Ilmu Komputer");
        m2.tampilData();
        Mahasiswa m3 = new Mahasiswa(m2);
        m3.tampilData();
        m1.setProgramStudi();
        m1.tampilData();
        m1.setProgramStudi("Teknologi Informasi");
        m1.tampilData();
        m3.setProgramStudi("Sistem Informasi");
        m1.setProgramStudi(m3);
        m1.tampilData();
        Anabul[] a = {
            new Kucing("Milo"),
            new Anjing("Doggy"),
            new Burung("Ciko")
        };

        for (int i = 0; i < a.length; i++) {
            a[i].suara();
            a[i].gerak();
        }

        Dosen d1 = new Dosen("001", "Pak A");
        Dosen d2 = new Dosen("002", "Pak B");

        MahasiswaSeminar s1 = new MahasiswaSeminar("1", "Basil", d1);
        MahasiswaSeminar s2 = new MahasiswaSeminar("2", "A", d1);
        MahasiswaSeminar s3 = new MahasiswaSeminar("3", "B", d2);
        MahasiswaSeminar s4 = new MahasiswaSeminar("4", "C", d2);
        MahasiswaSeminar s5 = new MahasiswaSeminar("5", "D", d1);

        Seminar sem = new Seminar();

        sem.registrasi(d1);
        sem.registrasi(d2);
        sem.registrasi(s1);
        sem.registrasi(s2);
        sem.registrasi(s3);
        sem.registrasi(s4);
        sem.registrasi(s5);

        sem.tampil();
        System.out.println(sem.countPeserta());
        System.out.println(sem.countMahasiswa());

        s1.tampil();
        s1.setWali(d2);
        s1.tampil();
    }
}


// dengan polimorfisme method atau interface bisa digunakan untuk banyak jenis objek 
// tetapi tetap menghasilkan perilaku ssesuai