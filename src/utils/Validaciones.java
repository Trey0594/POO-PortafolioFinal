package utils;

import java.util.Scanner;

public class Validaciones {

    private static final Scanner SC = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                String linea = SC.nextLine();
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número entero válido.");
            }
        }
    }

    public static String leerTextoNoVacio(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = SC.nextLine();
            if (texto != null && !texto.trim().isEmpty()) {
                return texto.trim();
            }
            System.out.println("El texto no puede estar vacío.");
        }
    }

    public static char leerSexo(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = SC.nextLine().trim().toUpperCase();
            if (linea.length() == 1 && (linea.charAt(0) == 'M' || linea.charAt(0) == 'F')) {
                return linea.charAt(0);
            }
            System.out.println("Debe ingresar M o F.");
        }
    }
}
