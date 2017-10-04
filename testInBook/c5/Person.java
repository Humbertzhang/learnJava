//要使别的包可以用它必须要用javac 的-d来指明位置
//此时会生成package name的文件夹
//在这个文件夹上一级的目录就可以import person了
package person;
public class Person
{
    private String name;
    private int age;
    
    public void setName(String name)
    {
        if(name.length() > 10 )
        {
            System.out.println("不合法名字");
            return;
        }
        else
        {
            this.name = name;
        }
    }

    public String getName()
    {
        return this.name;
    }

    public void setAge(int age)
    {
        if(age < 0 || age > 120)
        {
            System.out.println("不合法年龄");
            return;
        }
        else
        {
            this.age = age;
        }
    }

    public int getAge()
    {
        return this.age;
    }

    public void say(){
        System.out.println("我是" + this.name + ",我" + this.age + "岁了" );
    }
}
