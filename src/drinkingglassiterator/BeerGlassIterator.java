package drinkingglassiterator;

import java.util.List;

public class BeerGlassIterator implements Iterator {
	List<GlassItem> glassItems;
	int position = 0 ;
	public BeerGlassIterator( List<GlassItem> glassItems) {
		
		this.glassItems = glassItems;
	}
	public GlassItem next() {
		GlassItem glassItem = glassItems.get(position);
		position = position + 1;
		return glassItem;
		
	}
	public boolean hasNext() {
		
		if(position >= glassItems.size()) {
			return false;
		}
		else {
			return true;
		}
	}
}
