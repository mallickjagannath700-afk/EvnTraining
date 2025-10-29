//take a number
//calculate digit
//claculate square of number
//variable=temp
//reasult=square%10
//if(n==reasult)
class automorphicnumber{
    public static void main(String[]args){
        int n=25;  
            for(int i=0;i<n;i++){
            while(m!=0){
                m=m/10;
                digit++;
            } 
            int square=n*n;
            int temp=(int)Math.pow(10,digit);
            int reasult=square%temp;
            if(i==reasult){
                System.out.println(i);
            }
        }
    }
}