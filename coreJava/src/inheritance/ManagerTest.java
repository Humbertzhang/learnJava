package inheritance;

public class ManagerTest
{
    public static void main(String[] args)
    {
        Manager boss = new Manager("Cracker", 80000, 1987, 1,1);
        //boss.setBonus()是可以的，但是staff[0].setBonus()是错的
        //因为boss是Manager,但是staff[0]是Employee，没有setBonus()函数
        boss.setBonus(10000);

        Emplyee[] staff = new Emplyee[3];
        staff[0] = boss;
        staff[1] = new Emplyee("Hacker", 70000, 1988,1,1);
        staff[2] = new Emplyee("Nerd", 60000, 1989,1,1);

        for(Emplyee e : staff){
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
        }
    }
}
