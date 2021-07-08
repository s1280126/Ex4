import java.util.Scanner;

public class dice{
  public static void main(String[] args){
    int ALL_SIDES = 6;
    System.out.println("Rolling the dice...");
    int x = 1 + (int) (Math.random() * ALL_SIDES);
    System.out.println("dice 1 : " + x);
    int y = 1 + (int) (Math.random() * ALL_SIDES);
    System.out.println("dice 2 : " + y);
    int sum_num = x + y;
    System.out.println("Total value : " + sum_num);

  }
}
