package model;


public class Championship {
	public static int PILOTAMOUNT=15;
	
	private Pilot [] pilots;	
	
	// Atributes
	private int races;
	private int year;
	
	public Championship(int races, int year) {
		this.races  = races;
		this.year = year;
		pilots=new Pilot[PILOTAMOUNT];
	}
	//getters 
	public int getRaces() {
		return races;
	}
	public int getYear() {
		return year;
	}
	//____________________
	//and setters
	public void setRaces(int races) {
		this.races = races;
	}	
	public void setYear(int year) {
		this.year = year;
	}
	public void addPilot(String name, int age, int[] scores, String team ){
	int empty=0;
	boolean out=false;
	for(int i=0;i<PILOTAMOUNT && !out;i++){
		Pilot apilots=pilots[i];
		if (apilots==null){
			empty=i;
			out=true;
		}
	}
	Pilot nuevo=new Pilot(name,age,scores,team);
	pilots[empty]=nuevo;
		
	}
	public boolean findPilot(String name1){
		boolean finder=false;
		for(int i=0;i<PILOTAMOUNT && !finder;i++){
			if(pilots[i]!=null && pilots[i].getName().equals(name1))
				finder=true;
			
		}
		return finder;
	}
	public String showAverageTimes(){
        String pilotAverages = "";
        int hours=0;
        int minutes=0;
        int seconds=0;
        double average=0;
        for(int i=0; i<PILOTAMOUNT; i++){
			if(pilots[i]!=null){
                average=pilots[i].calculateAverage();
                hours=(int)average/3600;
                minutes=(int)(average%3600)/60;
                seconds=(int)(average%3600)%60;
                pilotAverages += "Piloto " + pilots[i].getName() + "\n" +
                            "El promedio es: " + hours + ", " + minutes + ", " + seconds + "\n";
            }
        }
        return pilotAverages;
    }
}
