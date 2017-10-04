import person.Person;
public class PersonTest
{
    public static void main(String[] args)
    {
        Person p = new Person();
        p.setAge(1000);
        p.setAge(20);
        p.setName("李刚");
        p.say();
    }
}