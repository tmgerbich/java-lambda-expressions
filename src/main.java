import java.util.function.Predicate;
import java.util.function.Function;

public class main {
    public static void main(String[] args) {

        SimpleFunction add = (a, b) -> a + b;
        SimpleFunction subtract = (a, b) -> a - b;
        SimpleFunction multiply = (a, b) -> a * b;
        SimpleFunction divide = (a, b) -> a / b;
        SimpleFunction modulo = (a, b) -> a % b;

        Greet english = s -> "Hello, " + s + "!";
        Greet french = s -> "Bonjour, " + s + "!";
        Greet spanish = s -> "Hola, " + s + "!";

        Predicate<Integer> isPositive = i -> i > 0;
        Function<Integer, Integer> addOne = i -> i + 1;



        System.out.println(add.performOperation(2,3));
        System.out.println(subtract.performOperation(2,3));
        System.out.println(multiply.performOperation(2,3));
        System.out.println(divide.performOperation(2,3));
        System.out.println(modulo.performOperation(2,3));
        System.out.println(english.sayHi("Alice"));
        System.out.println(french.sayHi("Alice"));
        System.out.println(spanish.sayHi("Alice"));
        System.out.println(isPositive.test(2));
        System.out.println(addOne.apply(3));


    }


}
