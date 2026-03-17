// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2


public class Lingkaran extends BangunDatar implements IResize {
    private double JariJari;

    public Lingkaran () {
        JariJari = 0;
    }
    public Lingkaran(double diameter, String warna, String border) {
        super();
        setWarna(warna);
        setBorder(border);
        JariJari = diameter / 2;
        
    }
    public double getJariJari() {
        return JariJari;
    }
    public void setJariJari(double JariJari) {
        this.JariJari = JariJari;
    }
    public double getLuas() {
        return Math.PI * JariJari * JariJari;
    }
    public double getKeliling() {
        return 2 * Math.PI * JariJari;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari : " + JariJari);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
    @Override
    public void zoomIn() {
        JariJari = JariJari * 1.1;
    }
    @Override
    public void zoomOut() {
        JariJari = JariJari * 0.9;
    }
    @Override
    public void zoom(int percent) {
        JariJari = JariJari * percent / 100;
    }
}
