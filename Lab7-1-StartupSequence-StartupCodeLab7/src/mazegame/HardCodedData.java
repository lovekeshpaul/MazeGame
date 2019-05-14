package mazegame;

import mazegame.boundary.IMazeData;
import mazegame.entity.Exit;
import mazegame.entity.Location;

public class HardCodedData implements IMazeData {
	private Location startUp;
	
	public HardCodedData()
	{
		createLocations();
	}
	
	public Location getStartingLocation()
	{
		return startUp;
	}
	
	public String getWelcomeMessage()
	{
		return "Welcome to the Mount Helanous";
	}
	
	private void createLocations () 
	{
		startUp = new Location ("a mystery place", "Gloomy Peak");
		Location mountain = new Location ("a place where no one belongs to", "Dark Mountain");
		Location equator = new Location ("a place where sun never rises", "Dusky Equator");
		Location island = new Location ("a place where filthy creatures are always in a search of fresh meat", "Evil Island");
		Location river = new Location ("literally black river, where there is black water all the time","Black River");
		Location blacksmith = new Location ("a place to buy weapons", "Blacksmith");
		Location armourer = new Location ("a place to buy armor", "Armourer");
		
		// Connect Locations
		startUp.addExit("south",  new Exit ("you see an open space to the south", lounge));
		lounge.addExit("north", new Exit("you see a mound of paper to the north", startUp));

        startUp.addExit("west", new Exit("you see a terrifying office to the west", gregsOffice));
        gregsOffice.addExit("east", new Exit("you see a mound of paper to the east", startUp));

        t127.addExit("south", new Exit("you see a mound of paper to the south", startUp));
        startUp.addExit("north", new Exit("you see a bleak place to the north", t127));

        lounge.addExit("northwest", new Exit("you see a terrifying office to the northwest", gregsOffice));
        gregsOffice.addExit("southeast", new Exit("you see an open space to the southeast", lounge));
			
	}
}
