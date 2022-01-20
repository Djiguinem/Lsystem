package system;

import java.util.ArrayList;

public class Parser{


	private String axiom;
	private ArrayList<Rule> rules;
	private int nbIteration;
	
	/** A constructor initialising the declared attributs 
	@Param1 base the set value of the axiom 
	@Param2 A list of applicable rules to the object
	Ensure:Initialized the attributs 
	*/
	public Parser(String base,ArrayList<Rule> rule){
		this.axiom=base;
		this.rules=rule;
		this.nbIteration=0;
	}
	
	public String getAxiom(){
		return this.axiom;
	}
	
	public ArrayList<Rule> getRules(){
		return this.rules;
	}
	
	public int nbIteration(){
		return this.nbIteration;
	}
	
	/**
	 A function taking three parametters and simulating a parser ;
	 @Param1 Axiom
	 @param2 List of Rules 
	 @param3 Number of Iteration 
	 Ensure: return a string containing the result of rules application according to the number of the iterations being given;
	 */
	public String generation(String axiome,ArrayList<Rule> rule,int nbIterate){
	
		for (int i=0 ;i<nbIterate ;i++){
			String production="";
			for(int j=0;j<axiome.length();++j){
				boolean hasBeenUpdated=false;
				for(Rule r:rules){
					if(r.compare(axiome.charAt(j))){
						hasBeenUpdated=true;
						production+=r.getItValues();
						break;
					}
				}
				if(!hasBeenUpdated){
					production+=axiome.charAt(j);
				}
			}
			axiome=production;
		}
		
	    return axiome;
		
	}




}
