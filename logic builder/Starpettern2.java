import java.util.*;
class Starpettern2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order of matrix");
    int matrix=sc.nextInt();
    for(int i=1;i<=matrix;i++)
    {
        for(int j=matrix;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
    }
}

