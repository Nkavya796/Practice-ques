package ComparatorDemo;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) {
		int flag=(e1.name).compareTo(e2.name);
		if(flag==0)
			   return 0;
			else if(flag<0)
				return -1;
			else
				return 1;
			}
	}

