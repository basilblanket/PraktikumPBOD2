// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

class Seminar {
    private CivitasAkademika[] data = new CivitasAkademika[100];
    private int n = 0;

    public void registrasi(CivitasAkademika x) {
        if (n < 100) {
            data[n++] = x;
        }
    }

    public int countPeserta() {
        return n;
    }

    public int countMahasiswa() {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (data[i] instanceof MahasiswaSeminar) j++;
        }
        return j;
    }

    public void tampil() {
        for (int i = 0; i < n; i++) {
            System.out.println(data[i].getNomor() + " " + data[i].getNama());
        }
    }
}