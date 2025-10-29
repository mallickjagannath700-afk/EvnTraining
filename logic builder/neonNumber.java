public class  neonNumber{
    public static void main(String[]args){
        int n=9;
       int square=n*n;
       int sum=0;
        while(square>0){
            sum=sum+(square%10);
            square=square/10;
        }
        if(sum==n){
            System.out.println("neon");
        }
        else{
            System.out.println("not neon");
        }
    }
}