public class karteMain02 {
        public static void main(String[] args){
            int max = 2; int cnt = 0;
            karte02[] KarteArray = new karte02[max];
            KarteArray[cnt++] = karte02.getKarte("太郎");
            KarteArray[cnt++] = karte02.getKarte("次郎");
            for(karte02 karte: KarteArray){
                System.out.printf("患者番号 %d 患者名 %s/n",karte.id,karte.name);
            }
        }
        
    }
    
    
}
