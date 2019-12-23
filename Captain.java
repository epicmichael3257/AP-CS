

public class Captain extends UltimatePlayer
{   
    private boolean type;
    public Captain(String a, String b, String c, boolean d){
        super(a,b,c);
        type = false;
        if(d!=false)
            type = d;
        
        
    }
    public String toString(){
        if(type==false){
            
            return super.toString()+"\n   Captain: defense";
        }
        return super.toString()+"\n   Captain: offense";
        
        
    }
}
