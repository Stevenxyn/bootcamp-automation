package stringsMethods;

import java.util.Scanner;

public class substringMethod {

  public static void main(String[] args) {
    // .substring(start, end) = metodo para extraer una porcion de un string

    Scanner scanner = new Scanner(System.in);
    String email;

    System.out.print("Insert your email: ");
    email = scanner.nextLine();

    if (email.contains("@")) {
      //Con lo siguiente obtenemos el nombre del usuario hasta el @
      String username = email.substring(0, email.indexOf("@"));
      System.out.println("Your username is: " + username);

      //Con esto obtenemos el dominio del correo  iniciando a extraer desde el @
      String domain = email.substring(email.indexOf("@") + 1);
      System.out.println("Your domain is: " + domain);
    } else {
      System.out.println("Emails must contain @");
    }

    scanner.close();
  }
}
