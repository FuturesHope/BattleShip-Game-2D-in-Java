
/**
 * Requirements: String name
 */
import java.util.*;
public class Ship
{
    private String name;
    private ArrayList<String> locationCells = new ArrayList<>();
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLocationCells(ArrayList<String> list){
        this.locationCells = list;
    }
    
    public ArrayList<String> getLocationCells(){
        return locationCells;
    }
    
    public String getName(){
        return this.name;
    }
    
    
    
}
