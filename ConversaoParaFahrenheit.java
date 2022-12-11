import java.util.Scanner;
public class ConversaoParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EXERCÍCIO 10");
        System.out.println("Digite a leitura em graus Celsius:");
        double celsius = Double.parseDouble(scanner.next());
        double fahrenheit = (celsius*1.8)+32;
        System.out.println("A temperatura digitada em fahrenheit é igual a "+fahrenheit+".");
        System.out.println("=====================================");
        scanner.close();
    }
}
