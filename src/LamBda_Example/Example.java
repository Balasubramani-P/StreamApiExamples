package LamBda_Example;

public class Example {

public static void main(String[] a){
    System.out.println("hi bala....");

    FunctionalinTer id=(int x,int y)-> x+y;

   /* InterDemo id=(int x,int y)->{
        int z=x+y;
        return z+10;
    };*/

    int res=id.add(3,9);
    System.out.println(res);
}


}
