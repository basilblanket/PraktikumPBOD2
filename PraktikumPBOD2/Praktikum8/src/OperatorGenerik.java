// NIM: 24060124140160
// Nama: Basil Ayman Hariadi
// D2

class OperatorGenerik {

    public static <G> void tukar(G[] arr) {
        G temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static <G extends Kucing> double bobot2(G a, G b) {
        return a.getBobot() + b.getBobot();
    }
}