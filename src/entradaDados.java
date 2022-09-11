import java.util.Locale;
import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// String x;
		// x = sc.next();
		// System.out.println("Você digitou: " + x);
		
		// int x;
		// System.out.println("Digite um número inteiro: ");
		// x = sc.nextInt();
		// System.out.println("Você digitou: " + x);

		// double x;
		// System.out.println("Digite um número real: ");
		// x = sc.nextDouble();
		// System.out.println("Você digitou: " + x);  // imprime conforme US com . e não ,
		// System.out.printf("Você digitou: %.2f%n", x); // imprime conforme BR com , e não .

		// char x;
		// System.out.println("Digite um caractere: ");
		// x = sc.next().charAt(0);
		// System.out.println("Você digitou: " + x);

		// String x;
		// int y;
		// double z;
		// x = sc.next();
		// y = sc.nextInt();
		// z = sc.nextDouble();
		// System.out.println("Você digitou: ");
		// System.out.println(x);
		// System.out.println(y);
		// System.out.println(z);
		
		// String s1, s2, s3;  // declaração de variáveis quebra linha inteira
		// System.out.println("Digite três palavras: ");
		// s1 = sc.nextLine();
		// s2 = sc.nextLine();
		// s3 = sc.nextLine();
		// System.out.println("DADOS DIGITADOS:");
		// System.out.println(s1);
		// System.out.println(s2);
		// System.out.println(s3);

		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();  // consome a quebra de linha
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


		

		sc.close();

	}

}
