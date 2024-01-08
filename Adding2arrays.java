public class Adding2arrays {
    public static void main(String[]args){
    int a[]={1,2,3,4,5};
    int b[]={1,2,3,4,5};
    int c[] = new int[5];
    for(int i=0;i<a.length;i++){
        c[i]=a[i]+b[i];
        System.out.println("array at index " + i + " is " + c[i]);
    }
}
}
