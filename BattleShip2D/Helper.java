
/**
 * Write a description of class BattleShipGameHelper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class Helper
{
    int[] gridInt = {0,1,2,3,4,5,6};
    String[] gridString = {"a","b","c","d","e","f","g"};
    //rework this method to use a 2D platform : A2, A3, A4 ignore CaseSensitivity
    //need: generate vertically and horizontally placed ships  
    //try generate a0, b0, c0 ; 
    //try generate a0, a1, a2;
    //ship cells must NOT OVERLAP
    //public ArrayList<String> generate2DShipLocation();
    int randomNumTo4;// = (int)(Math.random() * 5);
    int randomNumTo6;// = (int)(Math.random() * 7); //
    int randomNumTo1;// even/odd algorythm for horizontal/vertical ship form decision
    //ArrayList<String> generatedCellCollection = new ArrayList<String>();
    public ArrayList<String> generate2DShipLocation(){
        ArrayList<String> returnList = new ArrayList<String>();
        
        randomNumTo1 = (int)(Math.random()*2); // generate randomly 0 or 1
        if(randomNumTo1 % 2 == 0){//if randNumTo1 is even generate horizontal ships
            randomNumTo6 = (int)(Math.random() * 7);
            randomNumTo4 = (int)(Math.random() * 5);
            String staticLetter = gridString[randomNumTo6];
            for(int i = 0; i<3; i++){
                returnList.add(staticLetter + (randomNumTo4 + i));
                //generatedCellCollection.add(staticLetter + (randomNumTo4 + i));
            }
            
            
        }else{//generate vertically positioned ships
            randomNumTo6 = (int)(Math.random() * 7);
            randomNumTo4 = (int)(Math.random() * 5);
            int staticNumber = randomNumTo6;
            for(int y = 0; y<3; y++){
                returnList.add(gridString[randomNumTo4 + y] + staticNumber);
                //generatedCellCollection.add(gridString[randomNumTo4 + y] + staticNumber);
            }
            
        } 
                
        return returnList;
    }
    
    public ArrayList<ArrayList<String>> generateXShips(int numOfShips){
        ArrayList<ArrayList<String>> returnList = new ArrayList<ArrayList<String>>();
        ArrayList<String> tempShip = new ArrayList<String>();
        while(returnList.size() < numOfShips){
            tempShip = generate2DShipLocation();
            int countRepeatables = 0;
            
            for(int i=0; i<returnList.size(); i++){
                for(int y=0; y < tempShip.size(); y++){
                    if(returnList.get(i).contains(tempShip.get(y))){
                        countRepeatables++;
                    }
                }
            }
            if(countRepeatables == 0){
                returnList.add(tempShip);
            }else{
                continue;
            }
        }
        
        return returnList;
    }
    
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + "  ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;           
        }catch(IOException e){
            System.out.println("IOException:" + e);
        }
        
        return inputLine.toLowerCase();
    }
    
    //this method will generate a random Distinctive ShipLocation 
    //ArrayList<ArrayList<String>> generatedShipLocations = new ArrayList<>();
   
    
    public void printTheGrid(){
        int[] gridNumbers = {0,1,2,3,4,5,6};
        String[] gridLetters = {"a","b","c","d","e","f","g"};
        String firstLetter;
        System.out.println(" ");
        for(int i=0; i < 7; i++){
            firstLetter = gridLetters[i];
            System.out.print(firstLetter + "|");
            for(int y = 0; y< 7; y++){
                System.out.print("_|");
            }
            System.out.println("");
        }
        System.out.print(" ");
        for(int z=0; z < gridNumbers.length; z++){
            System.out.print(" "+ gridNumbers[z]);
        }
        System.out.println(" ");
    }
}
/*ArrayList<String> testShipLocation = new ArrayList<String>();
        ArrayList<ArrayList<String>> testShipLocation3Ships = new ArrayList<ArrayList<String>>();
        while(testShipLocation3Ships.size() < 3){
            testShipLocation = helper.generate2DShipLocation();
            int overlapCounter = 0;
            for(String cell : testShipLocation){
                for(int c=testShipLocation3Ships.size(); c > 0; c--){
                
                
                for(String cell2 : testShipLocation3Ships){
                    if(cell2.equals(cell)){
                        overlapCounter++;
                    }
                }
                }
            }
            if(overlapCounter == 0){
                testShipLocation3Ships.add(testShipLocation);
            }
        }*/
