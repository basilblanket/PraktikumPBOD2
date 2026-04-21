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
    }
}


// dengan polimorfisme method atau interface bisa digunakan untuk banyak jenis objek 
// tetapi tetap menghasilkan perilaku ssesuai