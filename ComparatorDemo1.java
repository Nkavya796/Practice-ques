package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ComparatorDemo1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(22, "john");
		Employee e2 = new Employee(12, "robert");

		Employee e3 = new Employee(21, "marry");

		Employee e4 = new Employee(15, "bob");

		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		/*// sort by salary
		Collections.sort(list, new SalaryComparator());

		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("-----------sort by name---------");
		// sort by NAME
		Collections.sort(list, new NameComparator());

		it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());*/
Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("enter the choice");
	//System.in("choice");
	num=sc.nextInt();
	switch(num)
	{
	case 1:
		Collections.sort(list, new SalaryComparator());
		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		

		//System.out.println("salary");
		break;
	case 2:
		 Collections.sort(list, new NameComparator());
		Iterator it1 = list.iterator();
		while (it1.hasNext())
			System.out.println(it1.next());
		
	  
 
		//System.out.println("name");
		break;
		default:
			System.out.println("invalid");
			
	}
	
	
	}

}
