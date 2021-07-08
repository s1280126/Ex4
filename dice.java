import java.util.Scanner;

public class dice{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name?");
    String string = scanner.next();
    System.out.println("Hello," + string + "!");

    
    int ALL_SIDES = 6;
    System.out.println("Rolling the dice...");
    int x = 1 + (int) (Math.random() * ALL_SIDES);
    System.out.println("dice 1 : " + x);
    int y = 1 + (int) (Math.random() * ALL_SIDES);
    System.out.println("dice 2 : " + y);
    int sum_num = x + y;
    System.out.println("Total value : " + sum_num);
    
    else if(sum_num > 7){
    System.out.println(string + " won!");
  }else{
    System.out.println(string + " lost!");
    }

  }
}
