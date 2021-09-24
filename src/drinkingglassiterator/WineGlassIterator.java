package drinkingglassiterator;

public class WineGlassIterator implements Iterator{
	GlassItem[] glassItems;
	int position = 0;
	
	public WineGlassIterator( GlassItem[] glassItems) {
		this.glassItems = glassItems;
	}
	public GlassItem next() {
		GlassItem glassItem = glassItems[position];
		position = position + 1;
		return glassItem;
	
	}
	public boolean hasNext() {
		if(position >= glassItems.length || glassItems[position] == null ) {
			return false;
		}
		else {
			return true;
		}
	}
}
