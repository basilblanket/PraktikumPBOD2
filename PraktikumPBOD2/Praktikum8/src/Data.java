// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

class Data<G> {
    private G[] ruang;
    private int banyak;

    public Data() {
        ruang = (G[]) new Object[100];
        banyak = 0;
    }

    public void setIsi(int idx, G value) {
        if (idx >= 1 && idx <= 100) {
            ruang[idx - 1] = value;
            if (idx > banyak) banyak = idx;
        }
    }

    public G getIsi(int idx) {
        if (idx >= 1 && idx <= banyak) {
            return ruang[idx - 1];
        }
        return null;
    }

    public int getSize() {
        return banyak;
    }
}