package fundamentals;

public class nestedIfStatements {

  public static void main(String[] args) {
    // nested if statements sentencias if anidadas

    boolean isStudent = false; // obtiene 20% descuento
    boolean isSenior = false; // obtiene 30% descuento

    double price = 9.99;

    if (isStudent) {
      if (isSenior) {
        System.out.println("Obtienes descuento de estudiante por el 20%");
        System.out.println("Obtienes descuento de Señor por el 30%");

        price = price * 0.50;
      } else {
        System.out.println("Obtienes descuento de estudiante por el 20%");
        price = price * 0.20;
      }
    } else {
      if (isSenior) {
        System.out.println("Obtienes descuento de Señor por el 30%");

        price = price * 0.30;
      }
      price = price * 1;
    }

    System.out.printf("El precio a pagar con los descuentos es de: $%.2f ", price);
  }
}
