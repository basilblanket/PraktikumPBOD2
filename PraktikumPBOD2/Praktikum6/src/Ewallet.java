public abstract class Ewallet {
    private String noId;
    private double saldo;
    private double point;

    protected Ewallet(String noId, int saldo, int point) {
        this.noId = noId;
        this.saldo = saldo;
        this.point = point;
    }
    public String getnoId() {
        return noId;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getPoint() {
        return point;
    }
    public void setnoId(String noId) {
        this.noId = noId;
    }
    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }
    public void setPoint (double point) {
        this.point = point;

    }
    public void topupSaldo(double saldo, double uang) {
        this.saldo = saldo + uang;
    }
}
