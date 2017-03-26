
public class obsDemo {
	public static void main(String[] args)
	{
		//Create Concrete Subject
		subject sub = new concsubject();
		
		//Observer Creation
		observer obs1= new numobs("Obs1");
		observer obs2= new numobs("Obs2");
		observer obs3= new numobs("Obs3");
		
		//register Observers
		sub.registerObserver(obs1);
		sub.registerObserver(obs2);
		sub.registerObserver(obs3);
		System.out.println("First Change: Number = 15");
		sub.setState(15);
		System.out.println("Second Change: Number = 6");
		sub.setState(6);

	}
}
