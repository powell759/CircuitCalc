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
	
	public void addNode(Node node){
		this.nodes.add(node);
	}
	
	private void removeNode(Node node){
		this.nodes.remove(node);
	}
	
	public void addElement(Element element){
		this.elements.add(element);
	}
	
	private void removeElement(Element element){
		this.elements.remove(element);
	}
	
	private void mergeSeries(Element one, Element two){
		Node nodeOne = one.getNodeOne();
		Node nodeTwo = two.getNodeTwo();
		this.removeElement(one);
		this.removeElement(two);
		this.removeNode(one.getNodeTwo());
		int sum = one.get_value() + two.get_value();
		Element rEq = new Element(Element.Type.RESISTOR, sum, nodeOne, nodeTwo);
		this.addElement(rEq);
		
	}
	
	private void mergeParallel(Element one, Element two){
		Node nodeOne = one.getNodeOne();
		Node nodeTwo = one.getNodeTwo();
		this.removeElement(one);
		this.removeElement(two);
		int oneVal = one.get_value();
		int twoVal = two.get_value();
		int sum = oneVal * twoVal / (oneVal + twoVal);
		Element rEq = new Element(Element.Type.RESISTOR, sum, nodeOne, nodeTwo);
		this.addElement(rEq);
		
	}
}
