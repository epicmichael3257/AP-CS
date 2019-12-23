
public class Person
{
    private String firstName;
    private String lastName;
    
    public Person(){
        firstName = "None";
        lastName = "None";
        
    }
    public Person(String a, String b){
        firstName = a;
        lastName = b;
        
        
    }
    public String toString(){
        return lastName+", "+firstName;

    }
}
