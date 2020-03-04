import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double payment = scanner.nextDouble();
	scanner.close();

	NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
	String us = usFormat.format(payment);
	NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
	String india = inFormat.format(payment);
	NumberFormat chFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
	String china = chFormat.format(payment);
	NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	String france = frFormat.format(payment);

	System.out.println("US: " + us);
	System.out.println("India: " + india);
	System.out.println("China: " + china);
	System.out.println("France: " + france);
}