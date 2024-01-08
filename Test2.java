
public class Test2 {
    public static void main(String[] args) {
        int count=3;
        for(int i=0;i<4;i++){
            for(int j=4-1;j>i;j--){
                System.out.print("3 ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(count+" ");
            }
            count--;
            System.out.println();
        }
        System.out.println();
        for(int x=0;x<4;x++){
            for(int y=x;y<4;y++){
                System.out.print(" ");
            }
            for(int z=0;z<=x;z++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int a=0;a<4;a++){
            for(int b=0;b<=a+1;b++){
                System.out.print(" ");
            }
            for(int c=3;c>a;c--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
