// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();
        Kucing k1 = new Kucing("deep", 3.5);
        Anggora k2 = new Anggora("Mirana", 4.0);
        Kembangtelon k3 = new Kembangtelon("setanyahu", 4.5);
        Anjing a1 = new Anjing("iggy");
        Burung b1 = new Burung("Pet Shop");
        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);
        p.enqueueAnabul(k3);
        System.out.println("anabul ada : " + p.getNbelm());
        System.out.println("afakah deep merupakan member? " + p.isMember(k1));
        System.out.println("Anabul pertama: " + p.getAnabul().getNama());
        Anabul keluar = p.dequeueAnabul();
        System.out.println("Anabul keluar: " + keluar.getNama());
        System.out.println("setelah dequeue:");
        p.showAnabul();
        System.out.println("Jumlah keluarga kucing: " + p.countKucing());
        System.out.println("bobot kucing: " + p.bobotKucing());
    }
}
