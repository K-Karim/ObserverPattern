import java.util.ArrayList;
import java.util.List;

public class concsubject extends subject{
	
	private List<observer> observers = new ArrayList<observer>();
	private int state;
	
	public void registerObserver(observer obs){
		observers.add(obs);
	}
	public void deregisterObserver(observer obs){
		observers.remove(obs);
	}
	public int getState(){
		return state;
	}
	public void setState(int state)
	{
		this.state = state;
		notifyobs(state);
	}
	public void notifyobs(int state)
	{
		for(observer obs: observers){
			obs.notify(state);
		}
	}
	
	

}
