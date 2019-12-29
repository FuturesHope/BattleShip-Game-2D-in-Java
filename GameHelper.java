
/**
 * Write a description of class GameHelper here.
 * returns one String user input at a time of run ("4" or null)
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.io.*;
public class GameHelper
{
    // instance variables - replace the example below with your own
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
        
        return inputLine;
    }
    //this method will generate and return a List with three consecutive Strings, starting from 0 to 4, so that ship is up to 7
    public ArrayList<String> generateRandomShipLocation(){
        int randomNum = (int)(Math.random() * 5);
        ArrayList<String> theList = new ArrayList<String>();
        for(int i=0; i<3; i++){
            int locator = randomNum + i;
            String location = Integer.toString(locator);
            theList.add(location);
        }
        return theList;
    }
    
    
}
