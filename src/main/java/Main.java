import algorithm.Algorithm;
import io.input.InputManager;
import io.output.Printer;

public class Main {
    public static void main(String[] args) {
        Printer.print(Algorithm.proceed(InputManager.scan("f_libraries_of_the_world.txt")), "f_libraries_of_the_world.out");
    }
}
