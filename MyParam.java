public class MyParam{
   public static void main(String[] args){
       String rt = myParam(5);
       System.out.println(rt);
   }

   public static String myParam(int num){
 String str = String.format("%dの10倍は%dです",num,(num*10));
 return str;
   }
}
