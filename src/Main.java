import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        MyClass деген класс тузунуз
//        Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан
//        сабактарыныз(массив), жакшы коргон тамагыныз)
//        Параметри эки башка болгон эки конструктор тузунуз
//        MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
//        Эки объектке эки башка конструктор иштесин.
//        Объекттердин маанилерин консольго чыгарыныз.

        MyClass first = new MyClass();
        first.name = "Aibek";
        first.Surname = "Duiso uulu";
        first.age = 19;
        first.courses = new String[]{"variables","loop","if conditions ","methods"};
        first.meals = "manty";

        System.out.println(first.name + "\n" + first.Surname + "\n" +
                         first.age + "\n" + Arrays.toString(first.courses) + "\n" + first.meals);

        String[] array = new String[]{"Arrays","String methods","if else"};
        MyClass second = new MyClass("Mike","Tyson",30,array,"hot dog");

        System.out.println("-------------------------------------------------------------------");

        System.out.println(second.name + "\n" + second.Surname + "\n" +
                second.age + "\n" + Arrays.toString(second.courses) + "\n" + second.meals);
    

    }
}
