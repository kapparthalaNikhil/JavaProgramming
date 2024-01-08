
public class Thread6 {
    public static void main(String[] args) {
        int n = 192;
        int x = n*1;
        int y = n*2;
        int z = n*3;
        int i=0,count=0;
        int arr[]=new int[10];
        String con=String.valueOf(x)+String.valueOf(y)+String.valueOf(z);
        int b = Integer.parseInt(con);
        System.out.println(b);
        do{
            arr[i]=b%10;
            b=b/10;
            i++;
        }while(b!=0);
        for(int j=0;j<9;j++){
            if((arr[j]>=1)&&(arr[j]<=9)){
                count++;
                //System.out.println("Devil number");
            }
        }
        if(count==9){
            System.out.println("Devil number");
        }else{
            System.out.println("Not a devil number");
        }
       
    }
}
