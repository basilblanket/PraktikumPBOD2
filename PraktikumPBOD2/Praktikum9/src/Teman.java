// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2

import java.util.ArrayList;

class Teman {
    private int nbelm;
    private ArrayList<String> lnama;

    public Teman() {
        lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return lnama.get(indeks);
        }
        return null;
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) { //dari nol..nbelm
            lnama.set(indeks, nama);
        }
    }

    public void addNama(String nama) {
        lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (lnama.remove(nama)) {
            nbelm--;
        }
    }

    public boolean isMember(String nama) {
        return lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru) {
        int indeks = lnama.indexOf(nama);

        if (indeks != -1) {
            lnama.set(indeks, namaBaru);
        }
    }

    public int countNama(String nama) {
        int jumlah = 0;

        for (String n : lnama) {
            if (n.equals(nama)) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public void showTeman() {
        for (String n : lnama) {
            System.out.println(n);
        }
    }
}