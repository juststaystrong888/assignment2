
public class Meal {

	private int starter;
	private int main;
	private int dessert;
	
	public Meal(int starter, int main, int dessert){ //constructor Meal with three integer parameters (starter, main, dessert) in calories
		this.starter = starter;
		this.main = main;
		this.dessert = dessert;
	}
	public int calculateCalories(){ // method calculateCalories that calculate total amount of calories in meal
		int total = starter+main+dessert;
		return total;
	}
}
