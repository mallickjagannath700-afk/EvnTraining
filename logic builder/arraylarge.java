public class arraylarge{
    public static void main(String[]args){
        int arr[]={6,2,3,4,5};
        int large=arr[0];
        int length=arr.length;
        System.out.println("traversal");
for(int i=1;i<length;i++){
    if (arr[i]>large){
        large=arr[i];
    }
}
System.out.println(large);
    }
}