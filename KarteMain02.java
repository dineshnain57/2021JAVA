public class KarteMain02 {
    public static void main(String[] args){
        int max = 2; int cnt=0;
        Karte02[] karteArray = new Karte02[max];
        karteArray[cnt++] = Karte02.getKarte("太郎");
        karteArray[cnt++] = Karte02.getKarte("次郎");
        for(Karte02 karte: karteArray){
            System.out.printf("患者番号 %d 患者名 %s/n",karte.id,karte.name);
        } 
    }
}