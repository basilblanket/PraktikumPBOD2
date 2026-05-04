class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    public void suara() {
        System.out.println(nama + " berbunyi cuit");
    }
}