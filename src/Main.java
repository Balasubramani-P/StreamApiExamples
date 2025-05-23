import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] a={81,34,90,25,72,11,50};
        // System.out.println(Arrays.stream(a).count());
/*        //Sorting ---------------

        String[] s= {"Java", "Python", "Django", "SpringBoot", "JS"};
         Arrays.stream(s)
                 .sorted()
                 .forEach(n-> System.out.print(n+" "));*/



 /*       //------ Unique elements from the Array-------------------------
        int[] b={10,4,7,2,10,3,2,1,5,7,6,6,9,8,9,8};
        Arrays.stream(b)
                .distinct()
                .sorted()
                .forEach(k->System.out.print(k+","));*/

        /*

 // -------getting the average value of the array----
        System.out.println(Arrays.stream(a).average().getAsDouble());*/



//-------finding even numbers in Array-----
/*
        int[] even={10,4,2,33,21,43,56,18,8,6,46,10,8,6,4,2};
        Arrays.stream(even)
                .distinct()
                .sorted()
                .filter(n->n%2==0)
                .forEach(s->System.out.print(s+" "));
*/
        //-----Reverse sorting ----

        int[] c={1,4,2,61,74,2,5,9};
        Arrays.stream(c)
                .boxed()//converted to integer obj
                .distinct()
                .sorted(Comparator.reverseOrder())  //.sorted((m,n)->-1)---only for reverse
                .mapToInt(Integer::intValue) // integer to int
                .forEach(k->System.out.print(k+" "));

/*

        System.out.println();
        List<String> li=new ArrayList<String>();
        li.add("Java");
        li.add("Python");
        li.add("C++");
        li.add("Sql");
        li.add("SpringBoot");
        li.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(m->System.out.print(m+" "));
*/

        //-----only reverse order------
/*

        List<String> li=new ArrayList<String>();
        li.add("Java");
        li.add("Python");
        li.add("C++");
        li.add("Sql");
        li.add("SpringBoot");
        li.stream()
                .sorted((n,m)->-1)
                .forEach(m->System.out.print(m+" "));

*/


    }
}



