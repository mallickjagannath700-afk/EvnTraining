import java.util.*;
class Starpettern3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order of matrix");
        int matrix=sc.nextInt();
        for(int i=0;i<=matrix;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=1;i<=matrix;i++)
    {
        for(int j=matrix-1;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
    }
}