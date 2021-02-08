package Assignment4;

public class Employee{
	private int id;
	private String name;
	private String address;
	private double sal;
	
	
	public Employee(int id, String name, String address, double sal) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.sal=sal;
	}
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return("EmpId="+id+" EmpName="+name+" EmpAddress="+address+" EmpSalary="+sal);
	}
	
	public static int compareBySal(Employee e1, Employee e2) {
		return e1.getSal().compareTo(e2.getSal());
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	
}
