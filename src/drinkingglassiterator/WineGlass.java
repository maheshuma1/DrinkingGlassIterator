package drinkingglassiterator;

public class WineGlass implements Glass{
	static final int MAX_GLASSES = 6;
	GlassItem[] glassItems;
	int position = 0;
	
	public WineGlass() {
		glassItems = new GlassItem[MAX_GLASSES];
		
		addGlass("Bar Craft Acrylic Ornate Glass"," Made from shatter proof acrylic plastic this is the best glassware to show at a party ",2.0);
		addGlass("Katie Alice Etched Wine Glasses"," This glass is made from crystal construction thereby making the glass durable ",2.0);
		addGlass("Mikasa Haley Luxury Glass"," Each glass from Haley collection is encircled with a fine and wide platinum band, giving them a striklingly modern yet elegant touch ",2.0);
		
		
	}
	private void addGlass( String name , String description , double price ) {
		GlassItem glassItem = new GlassItem( name , description, price );
		glassItems[position] = glassItem;
		position = position + 1;
	}
	public Iterator createIterator() {
		return new WineGlassIterator(glassItems);
	}
	public GlassItem[] getGlasses() {
		return glassItems;
	}
	public String toString() {
		return "Wine Glasses " ;
	}
	
}
