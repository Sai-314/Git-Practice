class Demo {
    static int a = 30;
    static void display(){
        System.out.println("Static method");
    }
}
class StaticDemo1{
    public static void main(String[] args) {
        System.out.println(Demo.a);
        Demo.display();
    }
}
