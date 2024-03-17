 abstract class Example {
    abstract void m1();
    abstract void m1(int a);
 }
 class Sample extends Example{
    @Override
    void m1(){
        System.out.println("Example from sample");
        m2();
    }
    @Override
    void m1(int a){
        System.out.println("OverLoading method" + a);
    }
    void m2(){
        System.out.println("m2");
    }

 }


 public class Abstraction {
    public static void main(String[] args){
        Example ex = new Sample();
        ex.m1();
        ex.m1(20);

    }
 }

