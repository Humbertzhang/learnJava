package inheritance;

public class Manager extends Emplyee{
    private double bonus;
    /**
     * @param name the employee's name
     * @param salay the salary
     * @param year hire year
     * @param month hire month
     * @param day hire day
     */
    public Manager(String name, double salay, int year, int month, int day)
    {
        //调用父类的构造方法
        super(name, salay, year, month, day);
        bonus = 0;
    }

    public double getSalay()
    {
        double baseSalay = super.getSalary();
        return baseSalay + bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }
}
