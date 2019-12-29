
/**
 * Write a description of class GameStarter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class BattleshipGameStarter
{
    public static void main(String [] args){
        Ship ship = new Ship();//creates a ship which :
        GameHelper gameHelper = new GameHelper();//creates a helper (that will ask user for input and provide one at a time)
                        //  we use that because the Constructor idea not explained in the book yet
        ship.setCellLocation(gameHelper.generateRandomShipLocation());//setLocationCells() for the ship assigns an ArrayList 
                                                            //representation of the ship in the game (list of virtual cell Locations)
        int numOfGuesses = 0;                                                    
        //create a while loop - that will keep the game alive : boolean shipAlive
        while(!ship.cellLocations.isEmpty()){
            String userShot = gameHelper.getUserInput("pick a number from 0 to 7 to shoot");
            numOfGuesses++;
            ship.checkUserShot(userShot);            
        }
        // use the helper to ask user for input (a shot)
        //      increment the number of Shots
        System.out.println("You drowned the ship in " + numOfGuesses + " shots!");//for tests (Integer.toString((int) (Math.random() * 5)))
    }
}
