package imu.com;

public class Doctor {
	
	private int did;
	private String dname;
	private String dphone;
	private String speciality;
	private String gender;
	private String day;
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}






	private String time;

	public Doctor(int did, String dname,  String speciality,String gender, String day, String time,String dphone)
	{
		this.did=did;
		this.dname= dname;
		this.dphone = dphone;
		this.speciality = speciality;
		this.gender= gender;
		this.day= day;
		this.time= time;
		
	}
	
	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getDphone() {
		return dphone;
	}


	public void setDphone(String dphone) {
		this.dphone = dphone;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}



	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
