import java.util.Arrays;

public class proArrays
{
    public static void main(String[] args)
    {
        int[] a = new int[]{3, 4, 5, 6};
        int[] a2 = new int[]{3, 4, 5, 6};
        System.out.println("a与a2是否相等:" + Arrays.equals(a, a2));
        //大于a的length则后面会补充0
        int[] b = Arrays.copyOf(a, 6);
        System.out.println("a与b是否相等:" + Arrays.equals(a, b));

        System.out.println("3在a中出现的位置:" + Arrays.binarySearch(a, 3));
        
        int[] c = new int[5];
        Arrays.fill(c, 9);
        System.out.println("Test Fill:");
        for(int item:c){
            System.out.print(item + " ");
        }
        System.out.print("\n");

        int[] d = new int[]{9, 3, 6, 4, 10};
        Arrays.sort(d);
        System.out.print("Test sort:");
        for(int item : d){
            System.out.print(item + ",");
        }
        System.out.print("\n");
    }
}