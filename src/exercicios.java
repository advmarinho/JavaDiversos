import java.util.Locale;
import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		System.out.println("Digite três valores: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;

		System.out.printf("TRIANGULO: (a área do triângulo retângulo que tem A por base e C por altura) %.3f%n", triangulo);
		System.out.printf("CIRCULO:   (a área do círculo de raio C. (pi = 3.14159)) %.3f%n", circulo);
		System.out.printf("TRAPEZIO:  (a área do trapézio que tem A e B por bases e C por altura. ) %.3f%n", trapezio);
		System.out.printf("QUADRADO:  (a área do quadrado que tem lado B. ) %.3f%n", quadrado);
		System.out.printf("RETANGULO: (a área do retângulo que tem lados A e B.) %.3f%n", retangulo);

		sc.close();

	}

}
