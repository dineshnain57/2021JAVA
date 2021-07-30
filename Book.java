public class Book {
    String bTitle = "";
    int bPrice = 0;

    public void init(String title,int price){
        bTitle = title;
        bPrice = price;

        price = 0;
    }
    public void init(String title,int[] price){
        bTitle = title;
        bPrice = price[0];

        price[0] = 0;
    }
}
