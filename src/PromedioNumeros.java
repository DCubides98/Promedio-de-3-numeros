import java.util.Scanner;

public class PromedioNumeros {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

System.out.println("Ingrese un numero: ");
double N1 = scanner.nextDouble();
System.out.println("Ingrese un numero: ");
double N2 = scanner.nextDouble();
System.out.println("Ingrese un numero: ");
double N3 = scanner.nextDouble();

double promedio = (N1 + N2 + N3) / 3;

System.out.println("El promedio es: " + promedio);

scanner.close ();

    }
}