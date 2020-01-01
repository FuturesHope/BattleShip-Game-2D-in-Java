------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: BattleShip Game Development, FuturesHope production
PURPOSE OF PROJECT: Practice Java API usage while implementing a game.
VERSION or DATE: 29 December 2019
HOW TO START THIS PROJECT: Self
AUTHORS: FuturesHope (GitHub) , with refferences to HeadFirst Java O'Reily
USER INSTRUCTIONS: start the game, play it, enjoy it.


Some instructions to development: 

We have a 7 x 7 virtual 2Dimensional grid with letters: a,b,c,d,e,f,g by Y axis and numbers from 0 to 6 including
Example:
a|_|_|_|_|_|_|_|
b|*|_|_|_|*|*|*|
c|*|_|_|_|_|_|_|
d|*|_|_|_|_|_|_|
e|_|_|_|_|_|_|_|
f|_|_|*|*|*|_|_|
g|_|_|_|_|_|_|_|
  0 1 2 3 4 5 6

We have three consecutive virtual rows as a BattleShip represenation

-   create classes : 
        BattleShipGameStarter Class
        Initialize BattleShipGameStarter gameStarter object
        Initialize BattleShipGameHelper helper object
        
          main:
            
            -gameSetUp()
                -create a List container for BattleShip objects
                -initialize 3 BattleShip objects
                -use "helper.generateBattleshipLocation() 
                -assign BattleShips positions
                
            -startPlaying()
        BattleShipGameHelper 
        BattleShip
        
   - 3
