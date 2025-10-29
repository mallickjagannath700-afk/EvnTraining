public class array{
    public static void main(String[]args){
int[]arr={1,2,3,4,5};
int length=arr.length;
System.out.println("linear traversal:");
for(int i=length-1;i>=0;i--){
    System.out.println(arr[i]);
}
System.out.println("size of array is:"+length);
    }
}