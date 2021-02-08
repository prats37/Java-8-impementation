package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	public int id;
	public String name;
	public String address;
	public double sal;
	
	public Employee(int id,String name,String address,double sal){
		this.id=id;
		this.name=name;
		this.address=address;
		this.sal=sal;	
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(100,"Abhishek","Bangalore",25000);
		Employee e2=new Employee(101,"Pratyush","Bangalore",30000);
		Employee e3=new Employee(102,"Saket","Pune",35000);
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(e1);empList.add(e2);empList.add(e3);
		
		empList.forEach((emp)->System.out.println(emp.id+" "+emp.name+" "+emp.address+" "+emp.sal));
	}
}
