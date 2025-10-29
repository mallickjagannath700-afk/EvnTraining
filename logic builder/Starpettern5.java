import java.util.*;
class Starpettern5{
    public static  void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the order of matrix");
int matrix=sc.nextInt();
for(int i=1;i<=matrix;i++)
{
    for(int j=1;j<=i;j++){
        System.out.print(" ");
    }
    for(int k=matrix;k>=i;k--){
        System.out.print("*");
    }
    System.out.println(" ");
}
}

}