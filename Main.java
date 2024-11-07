import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // #1 PRINT EVERY ODD NUMBER 1 - 25
    for(int i = 0; i <= 25; i++) {
         if(i % 2 == 1 ) { // check if it's odd
          System.out.println(i);
       }
    }
    // #2 
    for(int i = 17; i <= 73; i++) {
        System.out.print(i + " "); // add a space
        if(i % 10 == 6) { // check if last digit is 6, every 10 numbers theend is 6.
          System.out.println(" ");
        }
    }
    // #3
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number 0 - 50");
    int x = input.nextInt();
    int counter = 0;
    if(x < 0 || x > 50) {
      System.out.println("erorr");
    } else {
      for(int i = x; i <= 50; i++) {
          System.out.print(i + " ");
          counter++;
          if(counter == 5) {
            System.out.println("");
            counter = 0;
          }
      }
    }
  }
}
