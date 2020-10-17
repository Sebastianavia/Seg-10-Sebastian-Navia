package model;


public class Pilot {

	
	

	// Atributes
	private String name;
	private int age;
	private int [] scores; 
	private Team team;
	

	public Pilot(String name, int age, int[] scores,String team) {
		this.name=name;
		this.age=age;
		this.team=Team.valueOf(team);
		this.scores = scores;
	}
	
	//getters 
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Team getTeam() {
		return team;
	}
	public int[] getScores() {
		return scores;
	}
	//_______________________________
	//and setters
	public void setName(String name) {
		this.name = name;
	}	
	public void setAge(int age) {
		this.age = age;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public void setScores(int[] team) {
		this.scores = scores;
	}
	
	public double calculateAverage(){
		double scoreAddition=0;
		double averageScores=0;
		for(int i=0;i<scores.length;i++){
			scoreAddition=scoreAddition+scores[i];
		}
		averageScores=scoreAddition/scores.length;
		return averageScores;
	}
}