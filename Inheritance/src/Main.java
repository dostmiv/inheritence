public class Main {
	
	public static void main (String [] Args) {
		employee emp1 = new employee("Selman",3700,"Web development");
		employee emp2 = new employee("Mert",2800,"Mobil devolopment");
		Manager mana1 = new Manager("Rodger Federer",3800,"Amazon",2);
		
		mana1.Showinf();
		emp1.Showinf();
		emp2.Showinf();
		
		
		mana1.wageincrease(mana1, 1200);
		
		mana1.Showinf();
	}
}