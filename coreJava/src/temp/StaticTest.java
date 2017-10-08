public class StaticTest {
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("A",10000);
        staff[1] = new Employee("B",20000);
        staff[2] = new Employee("C",30000);

        for(Employee e:staff)
        {
            e.setId();
            System.out.println("name->" + e.getName() + " id = " + e.getId() +
                               ",salary = " + e.getSalary());
        }
    }
}
