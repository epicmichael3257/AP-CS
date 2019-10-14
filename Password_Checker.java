
import java.util.Scanner;
public class Password_Checker
{
    public static void main(String[] args){
        String username = "lolxd";
        String password = "waterbottle";
        Scanner s = new Scanner(System.in);
        String name = "bob";
        String pass = "bobby";
        while(!name.equals(username)|| !(pass.equals(password))){
        System.out.println("Enter your username");
         name = s.nextLine();
        System.out.println("Enter your password");
         pass = s.nextLine();
    }
        
         System.out.println("Welcome back chosen one");
    }
}
