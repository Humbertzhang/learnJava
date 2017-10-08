import java.util.Scanner;

public class Substr
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input A String:");
        String s = sc.nextLine();
        System.out.print("Input Start Index:");
        int start = sc.nextInt();
        if(start < 0){
            System.out.println("Error Start Index");
            return;
        }
        System.out.print("Input End Index:");
        int end = sc.nextInt();
        if(end > s.length()-1){
            System.out.println("Error End Index");
            return;
        }

        for(int i = 0 ; i < s.length(); i++){
            if(i == start){
                for(int j = start; j < end + 1; j++){
                    System.out.print(s.charAt(j));
                }
            }
        }
        System.out.print("\n");
    }
}