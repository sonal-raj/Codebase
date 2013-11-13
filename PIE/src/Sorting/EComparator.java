package Sorting;
import java.util.*;
import java.util.Comparator;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 10/11/13
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */

class Employee {
    public String extension;
    public String givenname;
    public String surname;
}

public class EComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2)
    {
        //compare surnames
        int ret = e1.surname.compareToIgnoreCase(e2.surname);
        //compare givenname if surname aare same
        if(ret==0)
            ret = e1.givenname.compareToIgnoreCase(e2.givenname);

        return ret;
    }

    public static void sort(Employee[] employees)
    {
        Arrays.sort(employees, new EComparator());
    }

}
