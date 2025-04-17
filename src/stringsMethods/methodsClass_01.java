package stringsMethods;

public class methodsClass_01 {

  public static void main(String[] args) {
    String name = "Spencer maria rey segundo.";

    //Nos retorna la cantidad de caracteres teniendo en cuenta los espacios
    int length = name.length();

    //Retorna el caracter identificado en index que le enviemos, inicia contando en 0
    char letter = name.charAt(length - 10);

    //Retorna la posicion del primer elemento que le enviemos
    int index = name.indexOf(".");

    //Retorna la posicion del ultimo elemento que le enviemos
    int lastIndex = name.lastIndexOf(".");

    //Convierte a mayusculas el texto
    String text1 = "stay hard";
    text1 = text1.toUpperCase();

    //Convierte a minusculas el texto
    name = name.toLowerCase();

    //Removes whitespace from both ends of a string
    String text2 = "      My name is       ";
    text2 = text2.trim();
    
    //Cambia los caracteres por el que le asignemos
    text1 = text1.toLowerCase().replace("a", "o"); //stoy hord
    
    //Validaremos si un string esta vacio
    String text3 = "";
    
    
    
    
    
    System.out.println("Numero de caracteres: " + length);
    System.out.println("Caracter del index dado: " + letter);
    System.out.println("Retorna el index primer elemento " + index);
    System.out.println("Retorna el index ultimo elemento " + lastIndex);
    System.out.println("Convierte a mayusculas: " + text1);
    System.out.println("Convierte a minusculas: " + name);
    System.out.println("Eliminando espacios en blanco laterales: " + text2);
    System.out.println("Los caracteres fueron cambiados: " + text1);
    System.out.println("¿El string esta vacio?: " + name.isEmpty() );
  }
}
