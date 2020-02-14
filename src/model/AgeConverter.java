package model;

public class AgeConverter {
	private int humanAge;
	private int animalAge;
	private String animal = "";
	
	public AgeConverter() {
		super();
	}

	public AgeConverter(int humanAge, String animal) {
		super();
		setHumanAge(humanAge);
		setAnimal(animal);
		
		setAnimalAge();
	}

	public int getHumanAge() {
		return humanAge;
	}

	public void setHumanAge(int humanAge) {
		this.humanAge = humanAge;
	}

	public int getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge() {
		final int DOG_MULTIPLIER = 7;
		final int CAT_MULTIPLIER = 5;
		final int PIG_MULTIPLIER = 3;
		final int MOUSE_MULTIPLIER = 10;
		final int ELEPHANT_MULTIPLIER = 2;
					
		switch(getAnimal()) {  
	        case "Dog":  
	            this.animalAge = Math.round(getHumanAge() / DOG_MULTIPLIER);  
	            break;  
	        case "Cat":  
	        	this.animalAge = Math.round(getHumanAge() / CAT_MULTIPLIER); 
	            break;  
	        case "Pig":  
	        	this.animalAge = Math.round(getHumanAge() / PIG_MULTIPLIER); 
	        	break;
	        case "Mouse":
	        	this.animalAge = Math.round(getHumanAge() / MOUSE_MULTIPLIER); 
	        	break;
	        case "Elephant":
	        	this.animalAge = Math.round(getHumanAge() / ELEPHANT_MULTIPLIER); 
	        	break;
	        default:
	        	// do nothing
	        	break;
        }		
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
}
