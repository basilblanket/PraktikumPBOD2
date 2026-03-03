public class MGaris {

    public static void main(String[] args) {

        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);

        Garis g1 = new Garis(t1, t2);

        g1.printGaris();

        System.out.println("Panjang: " + g1.getPanjang());
        System.out.println("Gradien: " + g1.getGradien());

        Titik tengah = g1.getTitikTengah();
        System.out.print("Titik Tengah: ");
        tengah.printTitik();

        System.out.println("Persamaan: " + g1.getPersamaan());

        System.out.println("Jumlah garis: " + Garis.getCounterGaris());
    }
}