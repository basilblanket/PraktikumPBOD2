// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2


public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}