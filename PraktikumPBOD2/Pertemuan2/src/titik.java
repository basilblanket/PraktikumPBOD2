/*Nama File  : titik.java
 * Deskripsi : berisi atribut dan method dalam class titik
 * Pembuat   : 
 * Tanggal   :
*/

public class titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;

    }

    titik() {
        this (0,0);

    }

    static int getCounterTitik() {
        return counterTitik;
    }

    double getAbsis() {
        return absis;
    }


    double getOrdinat() {
            return ordinat;
    }


    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;

    }

    void printTitik() {
        System.out.println("Titik ("+ absis + "," + ordinat + ")");

    }

    int getKuadran() {
    if (absis > 0 && ordinat > 0) {
        return 1;
    } 
    else if (absis < 0 && ordinat > 0) {
        return 2;
    } 
    else if (absis < 0 && ordinat < 0) {
        return 3;
    } 
    else if (absis > 0 && ordinat < 0) {
        return 4;
    } 
    else {
        return 0;
    }
}
}