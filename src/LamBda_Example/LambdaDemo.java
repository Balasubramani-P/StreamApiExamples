package LamBda_Example;

public class LambdaDemo implements InterDemo {
    @Override
    public int add(int a,int b) {
        int c= a+b+10;
        return c;

    }

    @Override
    public int mul(int a, int b) {
        return a*b+1;
    }


}
