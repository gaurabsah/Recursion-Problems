public class ReverseArray {
    public static void swap(int[] arr,int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static void reverseArray(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        swap(arr,start,end);
        reverseArray(arr,start+1,end-1);

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
       reverseArray(arr,0,n-1);
       for(int i=0;i<n;i++){
           System.out.println(arr[i]);
       }
    }
}
