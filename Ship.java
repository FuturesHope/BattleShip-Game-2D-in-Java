
/**
 * Write a description of class DotCom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Ship
{
    ArrayList<String> cellLocations = new ArrayList<String>();
    
    public void setCellLocation(ArrayList<String> locateCells){
        cellLocations = locateCells;
    }
    
    
    int hitCounter = 0;
    public void checkUserShot(String userShot){
        //int indexOfShot = cellLocation.indexOf(userShot); // will return -1 or >=0
        
        if(cellLocations.contains(userShot)){
            hitCounter++;
            if(hitCounter < 3){
                System.out.println("You Hit the Ship!");
            }else{
                System.out.println("Kill!");
            }       
            cellLocations.remove(userShot);
            
        }else{
            System.out.println("You Missed! ");
        }
    }
    
}
