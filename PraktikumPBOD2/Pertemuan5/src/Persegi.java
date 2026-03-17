// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2

public class Persegi extends BangunDatar implements IResize {
    private double sisi;


    public Persegi() {
        setJmlSisi(4);

    }

    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double getLuas() {
        return sisi * sisi;

    }

    public double getKeliling() {
        return sisi * 4;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + sisi);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
        System.out.println("Diagonal : " + getDiagonal());
    }
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100.0;
    }

}