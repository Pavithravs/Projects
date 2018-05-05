public class LargestSmallest {
    public static void main(String[] args){
        int arr[]={15,20,14,50,23,25};
        int smallest,largest;
        smallest=arr[0];
        largest=arr[1];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            else if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("largest element in array is " +largest);
        System.out.println("smallest element in array is "  +smallest);
    }
}
