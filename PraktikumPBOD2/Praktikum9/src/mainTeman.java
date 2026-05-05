// NAMA : BASIL AYMAN HARIADI
// NIM : 24060124140160
// D2

public class mainTeman {
    public static void main(String[] args) {
        Teman teman = new Teman();
        System.out.println("=========DeathNote=========");
        teman.addNama("Basil");
        teman.addNama("jo");
        teman.addNama("atta");
        teman.addNama("DIO");
        teman.addNama("kakakasprak");
        teman.addNama("putripuspiteng");
        teman.addNama("Feri");
        teman.addNama("Azka");
        teman.addNama("Basil");
        teman.addNama("Caesarpei");
        teman.addNama("Bayu");
        teman.addNama("dedepano");
        teman.addNama("dinda");
        teman.addNama("elza");
        teman.addNama("ferdy");
        teman.addNama("opan");
        teman.addNama("hanif");
        teman.addNama("hasta");
        teman.addNama("izzat");
        teman.addNama("marchella");
        teman.addNama("menza");
        teman.addNama("rama");
        teman.addNama("lutpi");
        teman.addNama("dwi");
        teman.addNama("atta");
        teman.addNama("novel");

        System.out.println("Jumlah teman: " + teman.getNbelm());
        System.out.println(teman.getNama(5));
        teman.setNama(5, "Putra");
        teman.showTeman();
        System.out.println("afakah Raka member? " + teman.isMember("Raka"));
        System.out.println("jumlah nama Bassil : " + teman.countNama("Basil"));

        teman.delNama("Basil");
        System.out.println("=========DeathNote=========");
        teman.showTeman();

    }
}