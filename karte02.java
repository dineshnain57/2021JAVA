public class karte02 {
    public String name;
    public int id;
    public static int idcounter = 0;
    public static karte02 getKarte(String arg_name){
        karte02 karte = new karte02();
        karte.name = arg_name;
        karte.id = idcounter++;
        return karte;
    }
}