package Servicio;

public class Utilidades {
  

  // primera letra de cada palabra a mayúscula

  public static String convertirPrimeraLetraMayuscula(String frase) {
        // Dividir la frase en palabras
        String[] palabras = frase.split(" ");

        // Recorrer cada palabra y convertir la primera letra a mayúscula
        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty()) {
                palabras[i] = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
            }
        }

        return "a";
  }
        

}
