public class Position {
public int x;
public int y;

public void moveLeft(){
    x--;
}
public void moveUp(){
    y--;
}
public void moveRight(){
    x++;
}
public void moveDown(){
    y++;
}
public void display(){
    System.out.printf("x=%d y=%dn",x,y);
}
}
