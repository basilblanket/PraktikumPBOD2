// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2
public class MainPegawai {
    public static void main(String[] args) {
        DosenTetap dt = new DosenTetap(
                "78647324",
                "9545647548",
                "Andi", 
                "5 Mei 1990",
                "1 Januari 2015",
                5000000,
                "Fakultas Sains dan Matematika"
        );
        DosenTamu dta = new DosenTamu(
                "12345678",
                "1122334455",
                "Budi",
                "10 Januari 1992",
                "1 Januari 2020",
                4500000,
                "Fakultas Ilmu Budaya",
                "1 Januari 2026"
        );

        // objek Tendik
        Tendik tk = new Tendik(
                "Kemahasiswaan",
                "6677889900",
                "Citra",
                "15 Maret 1995",  
                "1 Juli 2018",
                4000000 
        );

        System.out.println("===== DATA DOSEN TETAP =====");
        dt.printInfo();

        System.out.println();

        System.out.println("===== DATA DOSEN TAMU =====");
        dta.printInfo();

        System.out.println();

        System.out.println("===== DATA TENDIK =====");
        tk.printInfo();
    }
}