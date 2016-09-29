import java.util.HashSet;
import java.util.Set;

public class Circuit {
	private Set<Node> nodes;
	private Set<Element> elements;
	private int current = 0;
	private int resistance = 0;
	private int voltage = 0;
	
	public Circuit(){
		this.nodes = new HashSet<Node>();
		this.elements = new HashSet<Element>();
	}
	

}
