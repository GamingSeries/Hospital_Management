public class Patient implements Comparable<Patient>{
	private String patientID;
	private Date date;
	private String problem;
	private int priority;
	
	
	/**
	 * @param patientID
	 * @param date
	 * @param problem
	 * @param priority
	 */
	Patient(String patientID, Date date,String problem,int priority){
		this.patientID=patientID;
		this.date=date;
		this.problem=problem;
		this.priority=priority;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return patientID+" "+date+" "+problem+" "+priority;
	}

	/**
	 * @return
	 */
	public String getPatientID() {
		return patientID;
	}

	/**
	 * @return
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @return
	 */
	public String getProblem() {
		return problem;
	}

	/**
	 * @return
	 */
	public int getPriority() {
		return priority;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
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
