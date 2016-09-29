
public class Thev {
	private int volts;
	private int ohms;
	
	public Thev(int volts, int ohms){
		this.volts = volts;
		this.ohms = ohms;
	}
	
	public int get_voltage(){
		return this.volts;
	}
	
	public int get_resistance(){
		return this.ohms;
	}
}
