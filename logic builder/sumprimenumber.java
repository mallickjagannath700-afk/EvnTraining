class sumprimenumber{
    public static void main(String[]args){
        int i,j;
        int n=30;
        int sum=0;
        for( i=1;i<n;i++){
            int flag=0;
            for(j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
                sum=sum+1;
            }
        }
        System.out.println(sum);
    }
}