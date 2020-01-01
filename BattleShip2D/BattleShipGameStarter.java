
/**
 * Write a description of class BattleShipGameStarter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//import java.io.*;
import java.util.*;
public class BattleShipGameStarter
{
    public ArrayList<Ship> ships = new ArrayList<Ship>();
    int numOfGuesses = 0;
    Helper helper = new Helper();
    int killsCounter=0;
    int missCounter=0;
    
    public static void main(String[] args){
        
            BattleShipGameStarter game = new BattleShipGameStarter();
            
                game.setUpGame();
                game.startPlaying();
            
        
    }
    
    
    //;//generate 3 ships
    //ship1.locationCells.add("f");
    ArrayList<ArrayList<String>> shipLocs;
    public void setUpGame(){// & explain the rulles of the game + test
        System.out.println("Welcome to FuturesHope BattleShip2D game!\n" + 
                        "You will have to shoot ships that represent " + 
                        "3 vertical/horizontal cells on a 7 x 7 grid like this: \n");
        helper.printTheGrid();
        System.out.println("\n"+
                        "You will be asked to guess ship cells by introducing \"A2\"/\"a2\""+
                        " types of coordinates.\n"+
                        "If you need help, print \"show\" and ship locations will be revealed.\n" +
                        "Let\'s start! ");
        
        Ship ship1 = new Ship();//generate ship locations
        ship1.setName("Stinker");//generate ships & put them in ship List
        ships.add(ship1);
        Ship ship2 = new Ship();
        ship2.setName("Mournder");
        ships.add(ship2);
        Ship ship3 = new Ship();
        ship3.setName("Biasedabloid");
        ships.add(ship3);
        
        shipLocs = helper.generateXShips(3);//create random
                                                    //locations for X ships
        
        
        for(int i = 0; i < shipLocs.size(); i++){
            ships.get(i).setLocationCells(shipLocs.get(i));//assign every ship the coordinates
            
        }
        
    }
    
    public void startPlaying(){
        while(killsCounter < 3) {
            checkUserGuess();//  -ask for user input & check for "hit", "miss" or "kill" result
          
        }
        
        finishGame();
    }
    
    public void checkUserGuess(){
        numOfGuesses++;
        String result = "miss";// hit kill miss on basis of which game continues
        missCounter++;
        String userInput = helper.getUserInput("Make a shot: ");
        if(userInput.equals("show")){
                    showShipLocations();
                    checkUserGuess();
                    
                }
                
        for(Ship ship : ships){
            
                if(ship.getLocationCells().contains(userInput)){
                    
                    ship.getLocationCells().remove(userInput);
                    if(ship.getLocationCells().isEmpty()){
                        result = "You Killed ".concat(ship.getName());
                        killsCounter++;
                    }else{
                        result = "You Hit the ".concat(ship.getName());
                    }
                }
                
                
        }
                if(!result.equals("miss")){
                    missCounter--;
                }
                
        System.out.println(result);
        
    }
    
    public void showShipLocations(){
        for(int j = 0 ; j < shipLocs.size(); j++){//will show all generated ships locations
            System.out.println(shipLocs.get(j));
        }
    }
    
    public void finishGame(){
        //int totalPossibleGuesses = 49;
        //int totalPossibleHits = 9;
        
        //int missNum = totalPossibleGuesses - totalPossibleHits - totalPossibleMisses - numOfGuesses ;
        int performanceCalculated = 100 - (int)(missCounter * 2.5); 
        
        String performance = "Congratuilations with finishing the game! " + 
                               "\n Your performance is: " + performanceCalculated + 
                                "% out of 100%, play again to check your performance!" + 
                                 "\n FuturesHope you enjoyed this game.";
        System.out.println(performance);
        /*String userInput = helper.getUserInput("Play again: yes/no ?");
        if(userInput.equals("yes")){
            BattleShipGameStarter.main;
        }*/
        //System.out.println();
    }
    
    
}
