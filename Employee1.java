package Employee;
import java.util.*;
public class Employee1 {
	String name;
	int id;
	String email;
	public Employee1(String name,int id,String email)
	{
		this.name=name;
		this.id=id;
		this.email=email;
	}
	
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", id=" + id + ", email=" + email + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 e1=new Employee1("nidhi",45,"nff@gmail.com");
Employee1 e2=new Employee1("vidya",45,"n334ff@gmail.com");
ArrayList<Employee1> list = new ArrayList<>();
list.add(e1);
list.add(e2);
Iterator it=list.iterator();
while(it.hasNext())
	System.out.println(it.next());

	}

}
