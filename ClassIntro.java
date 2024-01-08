class Classes {
    int a =10,b = 20, c;
    void play(){
        c = a + b;
        System.out.println("hello");
    }
    void display(){
        System.out.println("c = " + c);
    }
    public class ClassIntro{
        public static void main(String[]args){
            Classes obj = new Classes();
            obj.play();
            obj.display();
        }
    }
}
