import java.util.Scanner;
public class Guessing_Game
{
   public static void main(String [] args){
       Scanner s = new Scanner(System.in);
       int count = 0;
       int guess = 0;
       int a = (int)(Math.random()*10+1); //includes 1 to 10, 0.9999*10 = 9.99 = 10.99 = 10
       System.out.println("Try to guess the number!");
       while(guess!=a){
           guess = s.nextInt();
           if(guess>a){
           System.out.println("Lower");
            }
            if(guess<a){
                    System.out.println("Higher");
            }
           count++;
        }
       System.out.println("You took "+count+" times to guess the number");
       
       
       
    }
}
