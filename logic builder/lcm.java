class lcm{
    public static void main(String[]args){
        int a=10,b=20,max,lcm;
        if(a>b){
            max=a;
        }
        else {
            max=b;
        }
        while(true){
            if(max%a==0 && max%b==0){
                lcm=max;
                break;
            }
            max++;
        }
        System.out.println(lcm);
         
    }
}