public class CalorieTracker {

	public static void main(String[] args) {
		
		Person Bill = new Person(); //created object Bill to call out methods as eat meal and calculateCalories
		System.out.println(Bill.getCalories()); //print current number of person's calories. it will be zero before consuming any meal
		
		Meal HalloumiLunch = new Meal(40,250,150); // creating object of one of the meal with the lowest number of calories, in constructor Meal we mention about starter, main and dessert callories
		
		Bill.eat(HalloumiLunch); // person Bill eats HalloumiLunch and just return this meal with given parameters
		
		System.out.println("the total calories in this meal: "+ Bill.eat(HalloumiLunch).calculateCalories()); // print the total number calories in Halloumi
		System.out.println("the new total calories of the person: "+ Bill.getTC(Bill.eat(HalloumiLunch).calculateCalories())); // print the current number of Bill's consumed calories 
		
		Meal PizzaDinner = new Meal(240,500,260); // Object PizzaDinner with parameters

		System.out.println("the total calories in this meal: "+ Bill.eat(PizzaDinner).calculateCalories()); //print meals total amount of calories
		System.out.println("the new total calories of the person: "+ Bill.getTC(Bill.eat(PizzaDinner).calculateCalories())); //print the total number of Bill's consumed calories 
		
		Meal ChowMeinDinner = new Meal(450,680,220); //object ChowMeinDinner with its parameters
		
		System.out.println("the total calories in this meal: "+ Bill.eat(ChowMeinDinner).calculateCalories()); //print meals total amount of calories
		System.out.println("the new total calories of the person: "+ Bill.getTC(Bill.eat(ChowMeinDinner).calculateCalories())); //print the total number of Bill's consumed calories
		
		System.out.println("time for walk: "+ Bill.walk(Bill.getCalories()) + " minuts"); //print time for walk to burn excess amount of calories and remain 2000 calories 
				
	}

}
