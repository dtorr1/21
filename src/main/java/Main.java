// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a degree in Celsius: ");
    double celsius = input.nextDouble();
    double fahrenheit = (9.0/5) * celsius + 32;
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
  }
}