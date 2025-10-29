public class arrayadd{
    public static void main(String[]args){
        int []arr={1,2,3,4,5};
        int length=arr.length;
        int sum=0;
        System.out.println("traversal");
for(int i=0;i<length;i++){
    System.out.println(arr[i]);
    sum=sum+arr[i];
}
System.out.println(sum);
System.out.println("size of array is:"+length);
    }
}