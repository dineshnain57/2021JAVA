public class Karte02 {
    public String name;
    public int id;
    public static int idcounter = 0;

    public static Karte02 getKarte(String arg_name){
        Karte02 karte = new Karte02();
        karte.name = arg_name;
        karte.id = idcounter++;

        return karte;
    }
}