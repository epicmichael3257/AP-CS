
public class Coach extends Person
{
    private String role;
   public Coach(String a, String b, String c){
       super(a,b);
       role = c;
       
       
    }
   public String toString(){
       return super.toString()+"\n   Role: "+role;
       
       
    }
}
