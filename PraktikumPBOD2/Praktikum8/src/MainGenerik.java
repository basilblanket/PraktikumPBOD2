// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

public class MainGenerik {
    public static void main(String[] args) {

        Datum<Anabul> d = new Datum<>();
        d.setIsi(new Anjing("Dogo"));
        System.out.println(d.getIsi().getNama());

        Integer[] a = {3, 6};
        OperatorGenerik.tukar(a);
        System.out.println(a[0] + " " + a[1]);

        String[] s = {"A", "B"};
        OperatorGenerik.tukar(s);
        System.out.println(s[0] + " " + s[1]);

        Anabul[] x = {
            new Anjing("Dog"),
            new Kucing("Cat", 4)
        };
        OperatorGenerik.tukar(x);
        System.out.println(x[0].getNama() + " " + x[1].getNama());

        Anggora k1 = new Anggora("Anggora", 3.5);
        Kembangtelon k2 = new Kembangtelon("Kembang", 4.5);
        System.out.println(OperatorGenerik.bobot2(k1, k2));

        Data<Anabul> data = new Data<>();
        data.setIsi(1, new Anjing("A"));
        data.setIsi(2, new Burung("B"));

        System.out.println(data.getIsi(1).getNama());
        System.out.println(data.getIsi(2).getNama());
        System.out.println(data.getSize());
    }
}

//generik membantu membuat program menjadi efisien