package model;

public class MadLibGenerator {
	private String volume;
	private String person;
	private String place;
	private String thing;
	private String verb;
	private String adjective;
	private String madLib;	
	
	public MadLibGenerator() {
		super();
	}
	
	public MadLibGenerator(String volume, String person, String place, String thing, String verb, String adjective) {
		super();
		this.volume = volume;
		this.person = person;
		this.place = place;
		this.thing = thing;
		this.verb = verb;
		this.adjective = adjective;
		
		generateMadLib();
		adjustVolume();
	}

	public String getVolume() {
		return volume;
	}
	
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	public String getPerson() {
		return person;
	}
	
	public void setPerson(String person) {
		this.person = person;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getThing() {
		return thing;
	}
	
	public void setThing(String thing) {
		this.thing = thing;
	}
	
	public String getVerb() {
		return verb;
	}
	
	public void setVerb(String verb) {
		this.verb = verb;
	}
	
	public String getAdjective() {
		return adjective;
	}
	
	public void setAdjective(String adjective) {
		this.adjective = adjective;
	}
	
	public String getMadLib() {
		return madLib;
	}
	
	public void setMadLib(String madLib) {
		this.madLib = madLib;
	}
	
	public void generateMadLib() {
		this.madLib = "Once upon a time,<br />" + 
					  this.person + " " + this.verb + " a " + this.adjective + " " + this.thing + " in " + this.place + ".<br />" +
					  "The end.";
	}
	
	public void adjustVolume() {
		if(getVolume().equalsIgnoreCase("quiet")) {
			setMadLib(getMadLib().toLowerCase());
		} 
		else if(getVolume().equalsIgnoreCase("loud")) {
			setMadLib(getMadLib().toUpperCase());
		} 
		else {
			String normal = getMadLib().substring(0,1).toUpperCase() + getMadLib().substring(1);
			setMadLib(normal);
		}
	}
	
}
