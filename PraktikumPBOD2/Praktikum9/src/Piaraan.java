// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

import java.util.ArrayList;

public class Piaraan {
    private int nbelm;
    private ArrayList<Anabul> Lanabul;
    
    public Piaraan() {
        Lanabul = new ArrayList<>();
        nbelm = 0;
    }
    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        if (nbelm > 0) {
            return Lanabul.get(0);
        }
        return null;
    }

    public Anabul dequeueAnabul() {
        if (nbelm > 0) {
            nbelm--;
            return Lanabul.remove(0);
        }
        return null;
    }

    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    public int countKucing() {
        int jumlah = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public double bobotKucing() {
        double total = 0;

        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                Kucing k = (Kucing) a;
                total += k.getBobot();
            }
        }

        return total;
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama() +"-" + a.getClass().getSimpleName());
        }
    }
}
