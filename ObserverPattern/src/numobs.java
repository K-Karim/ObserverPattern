
public class numobs extends observer{
	private String name;

	public numobs(String name){
		this.name = name;
	}
	public void notify(int state){
		System.out.println(name + " " + state);
	}
}
