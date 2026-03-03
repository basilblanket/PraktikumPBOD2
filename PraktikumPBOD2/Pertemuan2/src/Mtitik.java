/*Nama File  : MTitik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : 
 * Tanggal   :
*/

public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
        
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T1 = new Titik();
        Titik T2 = new Titik(3,5);

        System.out.println("Jumlah Objek  Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek  Titik = " + T2.getCounterTitik());
    }
}
