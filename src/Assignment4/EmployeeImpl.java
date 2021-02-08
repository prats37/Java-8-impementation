package Assignment4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeImpl {
	
	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(100,"Abhishek","Pume",25000));
		empList.add(new Employee(101,"Sudhanshu","Bhubneshwar",15000));
		empList.add(new Employee(102,"Pratyush","Bangalore",35000));
		Collections.sort(empList,Employee::compareBySal);
		empList.forEach((emp)->System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getAddress()+" "+emp.getSal()));
		
	}

}
