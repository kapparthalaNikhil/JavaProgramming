//write the java program to print address of the object
//12345 multiply each element by 2
//
public class Test3 {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        int l = arr.length;
        for(int i=0;i<l;i++){
            arr[i]=arr[i]*2;
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n-----------------------------------------------------------------------");
        int row = 3;
        int count = row;
        int col = 3;
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=0;k<count;k++){
                System.out.print("  ");
                count=count-1;
            }
            for(int e=0;e<col;e++){
                System.out.print("  ");
                col--;
            }
            for(int g=0;g<=i;g++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<row;i++){
            for(int j=row;j>i;j--){
                System.out.print("* ");
            }
            for(int k=0;k<i;k++){
                System.out.print("  ");
            }
            for(int e=0;e<i;e++){
                System.out.print("  ");
            }
            for(int g=row;g>i;g--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
