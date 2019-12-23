import java.util.ArrayList;
public class UltimateTeam
{
    private ArrayList<UltimatePlayer>players;
    private ArrayList<Coach>coaches;
    private String cutters ="";
    private String handlers ="" ;
    private String coach_list ="";
    private String player_list = "";
    public UltimateTeam(ArrayList<UltimatePlayer> p, ArrayList<Coach> c){ 
        
        players = p;
        coaches = c;
        
        
    }
    public String getCutters(){
            
            for (UltimatePlayer a: players){
                if(a.getPosition().equals("cutter")){
                    cutters += a.toString()+"\n";
                    
                }
                
                
            }
            return cutters;
        
        
    }
    public String getHandlers(){
            
            for (UltimatePlayer a: players){
                if(a.getPosition().equals("handler"))
                    handlers += a.toString()+"\n";
                
                
            }
            return handlers;
        
        
    }
    public String toString(){
            for(Coach a: coaches){
                coach_list += a.toString()+"\n";
                
                
            }
            for(UltimatePlayer a: players){
                player_list += a.toString()+"\n";
                
                
            }
            return "COACHES\n"+coach_list+"\nPLAYERS\n"+player_list;
            
        
    }
        
        
        
    
        
        
        
  
    

}
