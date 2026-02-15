package guru.qa;

import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int a=60;
        int b=15;
        double c= 5.5E00;

        //Задание 0

        out.println(a+b);
        out.println(a-b);
        out.println(a*b);
        out.println(a/b);

        //Задание 1
        out.println(a+c);
        out.println(a-c);
        out.println(b*c);
        out.println(a/c);

        //Задание 2
        out.println(a>c);
        out.println(c<b);
        out.println(c>=b);
        out.println(c<=a);



    }
}