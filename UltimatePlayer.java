
public class UltimatePlayer extends Person
{
    private int jerseyNumber;
    private static int num;
    private String position;
    public UltimatePlayer(String a, String b, String c){
            
        super(a,b);
        position = "handler";
        if(c.equals("cutter")){
        position = c;
       }
       num++;
       jerseyNumber = num;
        
        
    }
    public String getPosition(){
        
        return position;
        
    }
    public String toString(){
        
        return super.toString()+"\n   Jersey #:"+jerseyNumber+"\n   Position: "+position;
        
        
    }
}
