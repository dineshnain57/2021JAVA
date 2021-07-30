public class ReturnString{
    public static void main(String[] args){
        String msg = returnString();
        System.out.printf("戻り値は「%s」です/n",msg);
    }
    public static String returnString(){
        return "this is return value!!";
        
    }
}