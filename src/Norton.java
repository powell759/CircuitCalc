
public class Norton {
	private int amps;
	private int ohms;
	
	public Norton(int amps, int ohms){
		this.amps = amps;
		this.ohms = ohms;
	}
	
	public int get_amperage(){
		return this.amps;
	}
	
	public int get_resistance(){
		return this.ohms;
	}
}
