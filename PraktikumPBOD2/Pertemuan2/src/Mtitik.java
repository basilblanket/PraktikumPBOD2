/*Nama File  : Mtitik.java
 * Deskripsi : berisi atribut dan method dalam class titik
 * Pembuat   : 
 * Tanggal   :
*/

public class Mtitik {
    public static void main(String[] args) {
        titik T1 = new titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
        
        titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        titik T1 = new titik();
        titik T2 = new titik(3,5);

        System.out.println("Jumlah Objek  Titik = " + titik.getCounterTitik());
        System.out.println("Jumlah Objek  Titik = " + T2.getCounterTitik());
    }
}
