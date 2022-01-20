package system;

import java.lang.Character;

public class Rule{


	private String character;
	private String itValues;
	
	public Rule(String letter ,String val){
		
		this.character=letter;
		this.itValues=val;
	
	}
	
	public String getCharacter(){
	
		return this.character;
	}
	
	public String getItValues(){
	
		return this.itValues;
	}


	public boolean compare(Character c){
		return Character.toString(c).equals(this.character);
	}
}
