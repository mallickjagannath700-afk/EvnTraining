class Fibonacci{
    public static void main(String[]args){
        int n=10;
        int a=0;
        int b=1;
        int temp;
        System.out.print(a+" "+b);
    while(true){
     temp=a+b;
    if(temp>n)
    break;
    a=b;
        b=temp;
        System.out.print(" "+temp);
    }
    }
}