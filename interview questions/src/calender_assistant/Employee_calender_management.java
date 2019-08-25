package calender_assistant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

class Employee{
	public String name;
	public int rank;
	
	Employee(String name, String rank){
		this.name=name;
		if(rank.equals("CEO")){
			this.rank=1;
		}else{
			if(rank.equals("COO")){
				this.rank=2;
			}
			else{
				if(rank.equals("DIRECTOR")){
					this.rank=3;
				}
				else{
					if(rank.equals("MANAGER")){
						this.rank=4;
					}
				}
			}
		}
	} // END Constructor
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+rank ;
	}
		
} // END Employee class
	
class Emplyoyee_Calander extends Employee{

	Emplyoyee_Calander(String name, String rank) {
		super(name, rank);
		// TODO Auto-generated constructor stub
	}	
}

class Emp_Meeting implements Comparator<Employee>{
	String name_of_meeting;
	String start_time;
	String end_time;
	int no_of_attendees;
	String organizer;

	public Emp_Meeting(String name_of_meeting, String start_time, String end_time, int no_of_attendees,
			String organizer) {
		super();
		this.name_of_meeting = name_of_meeting;
		this.start_time = start_time;
		this.end_time = end_time;
		this.no_of_attendees = no_of_attendees;
		this.organizer = organizer;
	}

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		return 0;
	}	
	
}

public class Employee_calender_management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee("Nitish", "MANAGER"));
		al.add(new Employee("Amit", "DIRECTOR"));
		al.add(new Employee("Sachin", "DIRECTOR"));
		al.add(new Employee("Sushma", "MANAGER"));
		al.add(new Employee("John", "DIRECTOR"));
		al.add(new Employee("Kanhaiya", "COO"));
		al.add(new Employee("Girish", "DIRECTOR"));
		al.add(new Employee("kalyan", "CEO"));
		al.add(new Employee("Iravati", "MANAGER"));
		al.add(new Employee("Harish", "MANAGER"));
		
		for(Employee e:al){
			System.out.println(e);
		}
		
		// for each emplyoee Add the meeting details 
		HashMap<String , Emp_Meeting> emp_meeting = new HashMap<String,Emp_Meeting>();
		emp_meeting.put("Amit", new Emp_Meeting("Scrum","10:15AM","12:00PM",7,"NITISH"));
				
	}
}
