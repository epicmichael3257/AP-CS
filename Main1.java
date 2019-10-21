
import java.util.Scanner;
public class Main1
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int length = 0;
        boolean inArray1 = false;
        boolean inArray2 = false;
        int position=0;
        int array1 = 0;
        int array2 =0;
        while(length<10){
            System.out.println("Enter an array length (must be 10 or greater):");
            length = s.nextInt();       
        }
        
        int list[] = new int[length];
        int list2[] = new int[length];
        System.out.print("First array: ");
        for(int i = 0; i<length;i++){
            list[i] = (int)(Math.random()*100)+1; //0.99*100 = 99+1 = 100
            System.out.print(list[i]+" ");
            
        }
        System.out.print("\nSecond array: ");
        for(int k = 0; k<length;k++){
            list2[k] = (int)(Math.random()*100)+1; //0.99*100 = 99+1 = 100
            System.out.print(list2[k]+" ");
            
        }
        int list3[] =new int[2*length];
        
        System.out.print("\nMerged Array: ");
        for(int j=0; j<length*2 && array2<length && array1<length;j++){ //looping 40 times if length of 20
                for(int z=0;z<position;z++){  //loop to current position in list, see if list[array] is in merged or not
                        if(list3[z]==list[array1]){
                            inArray1 = true;
                            array1++;
                        } 
                }
                if(!inArray1){ //if not in merged, add to array
                    list3[position]=list[array1];
                    position++;
                    array1++;  
                    
                }
                for(int r=0;r<position;r++){ //loop to current position in list, see if list2[array] is in merged or not
                    if(list3[r]==list2[array2]){ 
                         inArray2 = true;
                         array2++;
                         
                    }
                }
                if(!inArray1){ //if not in merged, add to array
                    list3[position]=list2[array2];
                    position++; 
                    array2++;
                
                }  
        }
       
       for(int q=0;q<length*2;q++){
            if(list3[q]>0){
               System.out.print(list3[q]+" ");
            }
        }
            System.out.println("\n"+array1+" "+array2);
       
            
          
        
    }
}
