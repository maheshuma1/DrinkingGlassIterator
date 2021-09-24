package drinkingglassiterator;
import java.util.*;
public class BeerGlass implements Glass{
	List<GlassItem> glassItems;

	
	public BeerGlass() {
		glassItems = new ArrayList<GlassItem>();
		addGlass("Stolze Wheat Beer Glass"," This glass is perfect for upscale restraunts, bars hotels and carterers looking to serve wheat bears in a memorable fashion",10);
		addGlass("Oberglas Imperial All Rounder"," A sturdy yet classy all-rounder which is highly popular with many restraunt owners and hoteliers. ",9.0);
		addGlass("Oktoberfest Beer Tankard"," This glass is made is Germany and is mainly used in Germany during one of its many Oktber ",2.0);
		addGlass("Creative top Earlstree Beer Mug "," Enjoy your evening drinks the sophisticated way, by sipping them from this glass tankard, by Earlstree & Co.",10.0);		
	}
	
	private void addGlass(String name, String description, double price ) {
		GlassItem glassItem = new GlassItem( name, description, price );
		glassItems.add(glassItem);
	}
	public List<GlassItem> getGlasses(){
		return glassItems;
	}
	public String toString() {
		return "Beer Glasses";
	}
	public Iterator createIterator() {
		return new BeerGlassIterator(glassItems);
	}

}
