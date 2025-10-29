import java.util.*;
class DisariumNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int temp=num;
        int length=String.valueof(num).length();
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum +=Math.pow(digit,length);
            length--;
        }
        if(sum==num){
            System.out.println("is a disarium number");
        }else{
            System.out.println("is a not disarium number");
        }
    }
}