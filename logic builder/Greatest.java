public class Greatest{
    public static void main(String[]args){
        int a=4;
        int b=5;
        int c=6;
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}