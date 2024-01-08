//coping the array elements from one array to another array
public class CopyArr2Arr {
    public static void main(String[]args){
        int arr1[]={1,2,3,4,5};
        int l;
        l=arr1.length;
        int arr2[]=new int[5],temp;
        for(int i=0;i<l;i++){
            temp=arr1[i];
            arr2[i]=temp;
            System.out.println("arr2["+i+"] element is "+arr2[i]);
            if(arr2[i]==arr2.length-1){
                System.out.println("last element of arr2[] is "+arr2[i]);
            }
        }
    }
}
