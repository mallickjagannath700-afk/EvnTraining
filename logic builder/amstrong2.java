class amstrong2{
public static void main(String[]args){
    int range=1000;
    int m;
    for(int i=1;i<1000;i++){
        int num=i;
        int sum=0;
        int digit=0;
        int j=i;
        while(j!=0){
            m=m/10;
            digit++;

        }
         m=i;
        while(m!=0){
        int r=j%10;
         sum=sum+(int)Math.pow(r,digit);
        j=j/10;
        }
if (sum==i){
System.out.println(i);    
}
}
}
}