package drinkingglassiterator;

public class DrinkingGlassIterator {

	public static void main(String[] args) {
		Glass wineGlass = new WineGlass();
		Glass beerGlass = new BeerGlass();
		
		BarTender bartender = new BarTender(wineGlass, beerGlass);
		
		bartender.printGlasses();

	}

}
