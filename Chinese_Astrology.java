import java.util.Scanner;
public class Chinese_Astrology
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("What is the year of your birth?");
        int year = s.nextInt();
        int zodiac = 2019-year;
        
        if(zodiac%12==1)
            System.out.println("You were born in the year of the dog. People born in the year of dog are generally born with the zodiac dog characteristics. They are believed to be natural, simple, righteous, honest and friendly.");
        if(zodiac%12==11)
            System.out.println("You were born in the year of the rat. People born in the year of rat are generally born with the zodiac rat characteristics. They are believed to be very industrious and thrifty, diligent and positive.");
        if(zodiac%12==10)
            System.out.println("You were born in the year of the ox. People born in the year of ox are generally born with the zodiac ox characteristics. They are believed to be prudent, practical, patient, and aspirant.");
        if(zodiac%12==9)
            System.out.println("You were born in the year of the tiger. People born in the year of tiger are generally born with the zodiac tiger characteristics. They are believed to have great ambitions and confidence.");
        if(zodiac%12==8)
            System.out.println("You were born in the year of the rabbit. People born in the year of rabbit are generally born with the zodiac rabbit characteristics. They are believed to thoughtful, gentle and considerate.");
        if(zodiac%12==7)
            System.out.println("You were born in the year of the dragon. People born in the year of dragon are generally born with the zodiac dragon characteristics. They are believed to have a strong physique, full of energy and endless vitality. ");
        if(zodiac%12==6)
            System.out.println("You were born in the year of the snake. People born in the year of snake are generally born with the zodiac snake characteristics. They are believed to be graceful, calm, composure and expressive.");
        if(zodiac%12==5)
            System.out.println("You were born in the year of the horse. People born in the year of horse are generally born with the zodiac horse characteristics. They are believed to be outgoing, romantic and enthusiastic.");
        if(zodiac%12==4)
            System.out.println("You were born in the year of the sheep. People born in the year of sheep are generally born with the zodiac sheep characteristics. They are believed to be gentle and considerate.");
        if(zodiac%12==3)
            System.out.println("You were born in the year of the monkey. People born in the year of monkey are generally born with the zodiac monkey characteristics. They are believed to be lively and active, clever and quick-witted.");
        if(zodiac%12==2)
            System.out.println("You were born in the year of the rooster. People born in the year of rooster are generally born with the zodiac rooster characteristics. They are believed to have persistence and perseverance.");
        if(zodiac%12==0)
            System.out.println("You were born in the year of the pig. People born in the year of pig are generally born with the zodiac pig characteristics. They are believed to be innocent and romantic, frank and forthright. ");
            
    }
    
}
