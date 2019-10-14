import java.util.Scanner;
public class Mini_Calculator
{
    public static void main(String [] args){
        int op = 1;
        Scanner s = new Scanner(System.in);
        while(op!=0){
            System.out.println("What type of operation do you wish to perform?\n1.add\n2.substract\n3.multiply\n4.divide\n0.exit"); 
            op = s. nextInt();
            if(op==1){
            System.out.println("What is the first value?");
            double first = s.nextDouble();
            System.out.println("What is the second value");
            double second = s.nextDouble();
            double sum = first+second;
            System.out.println(first+"+"+second+"= "+sum);
        }
        if(op==2){
            System.out.println("What is the first value?");
            double first = s.nextDouble();
            System.out.println("What is the second value");
            double second = s.nextDouble();
            double difference = first-second;
            System.out.println(first+"-"+second+"= "+difference);
        }
        if(op==3){
            System.out.println("What is the first value?");
            double first = s.nextDouble();
            System.out.println("What is the second value");
            double second = s.nextDouble();
            double product = first*second;
            System.out.println(first+"*"+second+"= "+product);
        }
        if(op==4){
            System.out.println("What is the first value?");
            double first = s.nextDouble();
            System.out.println("What is the second value");
            double second = s.nextDouble();
            double quotient = first/second;
            System.out.println(first+"/"+second+"= "+quotient);
        }
    }
          System.exit(0);
    }
}
