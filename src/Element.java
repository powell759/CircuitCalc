
public class Element {
	public enum Type {
		VOLTAGE_SOURCE, CURRENT_SOURCE, RESISTOR, LOAD
	}
	
	private Type type;
	private int val;
	private Node nodeOne;
	private Node nodeTwo;
	
	public Element(Type type, int val, Node one, Node two){
		this.type = type;
		this.val = val;
		this.nodeOne = one;
		this.nodeTwo = two;
	}
	
	public Type get_type(){
		return this.type;
	}
	
	public int get_value(){
		return this.val;
	}
	
	public Node getNodeOne(){
		return this.nodeOne;
	}
	
	public Node getNodeTwo(){
		return this.nodeTwo;
	}
}
