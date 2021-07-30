public class Main27 {
    public static void main(String[] args){

        Book workbook = new Book();
        String title1 = "JAVA問題集";
        int[] price1 = {2000};
        workbook.init(title1,price1);


        System.out.println(workbook.bTitle);
        System.out.println(workbook.bPrice);


        System.out.println(price1[0]);
    }
}