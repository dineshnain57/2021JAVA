public class Dog {
    public String name;
    public String kind;

    public Dog(){
        this.name = "ポチ";
        this.kind = "柴犬";
        System.out.println("dog() constructor !");
    }
    public Dog(String name){
        this.name = name;
        this.kind = "柴犬";
        System.out.println("Dog(String name) constructor !");
    }
    public Dog(String name,String kind){
        this.name = name;
        this.kind = kind;
        System.out.println("Dog(String name,String kind) constructor!");
    }
    public void disp(){
        System.out.println("名前:"+name);
        System.out.println("犬種:"+name);
    }
}
