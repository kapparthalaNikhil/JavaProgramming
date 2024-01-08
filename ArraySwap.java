public class ArraySwap {
    public static void main(String[]args){
        int a[] = {5,2,3,1,6};
        int b = a.length-1;
        int i,j;
        int temp;
        System.out.println("Before swaping : ");
        for(int z:a){
            System.out.print(z + " ");
        }
        System.out.println();
        for(i = 0;i<b;i++){
            for(j=i+1;j<b;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("After Swaping : ");
        for(int k:a){
            System.out.print(k + " ");
        }
    }
}
