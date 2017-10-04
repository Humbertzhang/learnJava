public class Array
{
    public static void main(String[] args)
    {
        //Way1
        int[] A;
        A = new int[]{5, 6, 7, 8};
        //Way2
        int[] A2 = {5, 6, 7, 8};
        //Way3 不手动初始化,
        int[] A3 = new int[4];
        //所有数组都有一个length属性
        System.out.println("Length:" + A.length);
        //默认初始化为0
        System.out.print("The element in A3:");
        for(int i = 0; i < A3.length; i++){
            System.out.print(A3[i] + " ");
        }
    }
}