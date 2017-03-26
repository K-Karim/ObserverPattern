public abstract class subject {
	
	
	public abstract void registerObserver(observer obs);
	public abstract void deregisterObserver(observer obs);
	public abstract void notifyobs(int state);
	public abstract void setState(int state);
	public abstract int getState();

}
