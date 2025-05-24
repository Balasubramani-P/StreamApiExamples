package LamBda_Example;

public interface InterDemo {
    public abstract int add(int a,int b);
    public abstract int mul(int a,int b);
    //default method
    default void mul(){
        System.out.println("In multiply default method: ");
    }
    //Static method
    static void test() {
        System.out.println("in static method test.... ");
    }
}
