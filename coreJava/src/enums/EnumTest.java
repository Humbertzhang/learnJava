package enums;

import java.util.*;

public class EnumTest {
    public static void main(String... args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size(SMALL, MEDIUM, LARGE, EXTRA_LARGE):");
        String str = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, str);
        System.out.println("Size = " + size);
        System.out.println("Abbreviation=" + size.getAbbreviation());
        if(size == Size.EXTRA_LARGE){
            System.out.println("\n.\n");
        }
    }
}

enum Size
{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private Size(String a){
        this.a = a;
    }
    public String getAbbreviation(){
        return this.a;
    }
    private String a;
}