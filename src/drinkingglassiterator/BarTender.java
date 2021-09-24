package drinkingglassiterator;

public class BarTender {
	Glass wineGlass;
	Glass beerGlass;
	
	public BarTender( Glass wineGlass, Glass beerGlass ) {
		this.wineGlass = wineGlass;
		this.beerGlass = beerGlass;
	}
	
	public void printGlasses() {
		Iterator wineGlassIterator = wineGlass.createIterator();
		Iterator beerGlassIterator = beerGlass.createIterator();
		
		System.out.println("\n-------Beer Glasses-----------\n");
		printGlasses(beerGlassIterator);
		System.out.println("\n-------Wine Glasses-----------\n");
		printGlasses(wineGlassIterator);
	}
	public void printGlasses(Iterator iterator) {

		while(iterator.hasNext()) {
			GlassItem glassItem = iterator.next();
			System.out.print(glassItem.getName() + ", ");
			System.out.print(glassItem.getDescription() + " , ");
			System.out.println(glassItem.getPrice() );
		}
	}
}
