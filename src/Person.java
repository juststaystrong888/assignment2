
public class Person {

	private int totalCalories=0;
	private Meal meal;
	
	public Meal eat(Meal meal){ //method eat that allows Person to eat meal and returns it 
		this.meal=meal;
		return meal;
		}
	public int getTC(int tc){ // method getTC adds calories of meal to total person's calories and returns the number
		totalCalories+=tc;
		return totalCalories;
	}
	
	public int getCalories(){//this method for typing initial and the last value of consumed calories by person and to use it with walk method 
		return totalCalories;
	}
	
	public int walk(int t){//method walk makes Person walk and burn calories until person has only 2000 calories
		int time = t-2000;//it return time in minutes. because i calorie burns for one minute, no need to multiply on 1, it's just
		return time;         //to subtract 2000 from the total number of consumed calories by person 
	}
}
