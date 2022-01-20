package system;
import java.util.ArrayList;
public class Demo{


	public static void main(String args []){
	
		Rule rule1=new Rule("A","AB+");
		Rule rule2=new Rule("B","A");
		ArrayList<Rule> list=new ArrayList<>();
		list.add(rule1);
		list.add(rule2);
		
		Parser parser=new Parser("A",list);
		System.out.println(parser.getRules());
		
		System.out.println(parser.generation(parser.getAxiom(),parser.getRules(),5));
	}



}
