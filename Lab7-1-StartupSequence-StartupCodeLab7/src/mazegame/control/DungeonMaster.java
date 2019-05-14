package mazegame.control;

import java.io.IOException;

import mazegame.SimpleConsoleClient;
import mazegame.boundary.IMazeClient;
import mazegame.boundary.IMazeData;
import mazegame.entity.Player;

public class DungeonMaster {
	private IMazeClient gameClient;
	private IMazeData gameData;
	private Player thePlayer;
	
	 public DungeonMaster(IMazeData gameData, IMazeClient gameClient)
     {
         this.gameData = gameData;
         this.gameClient = gameClient;
     }

     public void printWelcome()
     {
         gameClient.playerMessage(gameData.getWelcomeMessage());
     }

     public void setupPlayer()
     {
         String playerName = gameClient.getReply("What name do you choose to be known by?");
         thePlayer = new Player(playerName);
         gameClient.playerMessage("Welcome " + playerName + "\n\n");
         gameClient.playerMessage("You find yourself looking at ");
         gameClient.playerMessage(gameData.getStartingLocation().getDescription());

         gameClient.getReply("<<Hit Enter to exit>>");
     }

     public void runGame()
     {
         printWelcome();
         setupPlayer();
     }
}
