package A2_Muneeb;
public class Patient implements Comparable<Patient>{
	private String patientID;
	private Date date;
	private String problem;
	private int priority;
	
	
	Patient(String patientID, Date date,String problem,int priority){
		this.patientID=patientID;
		this.date=date;
		this.problem=problem;
		this.priority=priority;
	}
	
	public String toString(){
		return patientID+" "+date+" "+problem+" "+priority;
	}

	public String getPatientID() {
		return patientID;
	}

	public Date getDate() {
		return date;
	}

	public String getProblem() {
		return problem;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public int compareTo(Patient o) {
	
		if(priority==o.priority){
			return 0;
		}
		else if(priority<o.priority){
			return 1;
		}
		else{
			return -1;
		}
	}

	
}
