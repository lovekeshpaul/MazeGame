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
		startUp.addExit("south",  new Exit ("a place where filthy creatures are always in a search of fresh meat", island));
		startUp.addExit("north",  new Exit ("a place where no one belongs to", mountain));
		startUp.addExit("west",  new Exit ("a place where sun never rises", equator));
		startUp.addExit("east", new Exit("literally black river, where there is black water all the time", river));
		startUp.addExit("southwest", new Exit("a place to buy armor", armourer));
		startUp.addExit("southwest", new Exit("a place to buy weapons", blacksmith));

        mountain.addExit("east", new Exit("a place to buy weapons", blacksmith));
        mountain.addExit("south", new Exit("a mystery place", startUp));
        mountain.addExit("southwest", new Exit("a place where sun never rises", equator));

        blacksmith.addExit("west", new Exit("a place where no one belongs to", mountain));
        blacksmith.addExit("southwest", new Exit("a mystery place", startUp));
        blacksmith.addExit("south", new Exit("literally black river, where there is black water all the time", river));

        equator.addExit("northeast", new Exit("a place where no one belongs to", mountain));
        equator.addExit("east", new Exit("a mystery place", startUp));
        equator.addExit("southeast", new Exit("a place where filthy creatures are always in a search of fresh meat", island));
        equator.addExit("south", new Exit("a place to buy armor", armourer));
        
		river.addExit("north", new Exit("a place to buy weapons", blacksmith));
		river.addExit("northwest", new Exit("a place where no one belongs to", mountain));
		river.addExit("west", new Exit("a mystery place", startUp));
		river.addExit("southwest", new Exit("a place where filthy creatures are always in a search of fresh meat", island));
		
		armourer.addExit("north", new Exit("a place where sun never rises", equator));
		armourer.addExit("northeast", new Exit("a mystery place", startUp));
		armourer.addExit("east", new Exit("a place where filthy creatures are always in a search of fresh meat", island));

		island.addExit("west", new Exit("a place to buy armor", armourer));
		island.addExit("northwest", new Exit("a place where sun never rises", equator));
		island.addExit("north", new Exit("a mystery place", startUp));
		island.addExit("northeast", new Exit("literally black river, where there is black water all the time", river));
	}
}
