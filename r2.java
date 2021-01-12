import java.util.*;
class r2{
  public static void main(String[] args){
    Scanner kbd = new Scanner(System.in);
    int r1 = kbd.nextInt();
    int s = kbd.nextInt();
    int st = 2 * s;
    int r2 = st - r1;
    System.out.println(r2);
  }
}