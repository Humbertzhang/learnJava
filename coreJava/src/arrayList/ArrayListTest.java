package arrayList;

import inheritance.Emplyee;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args)
    {
        ArrayList<Emplyee> staff = new ArrayList<Emplyee>();
        staff.add(new Emplyee("A", 10000, 1, 1, 1));
        staff.add(new Emplyee("B", 20000, 1, 1, 1));
        staff.add(new Emplyee("C", 30000, 1, 1, 1));
        for(Emplyee e: staff){
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
        }
    }
}
