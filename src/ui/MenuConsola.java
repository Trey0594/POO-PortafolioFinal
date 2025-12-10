package ui;

import bl.GestorVeterinaria;
import tl.Cita;
import tl.Cliente;
import tl.Mascota;
import tl.Veterinario;
import utils.Validaciones;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuConsola {

    private final GestorVeterinaria gestor;
    private final Scanner sc;

    public MenuConsola() {
        this.gestor = new GestorVeterinaria();
        this.sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n--- Sistema de Veterinaria PetCare ---");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Registrar mascota");
            System.out.println("3. Registrar veterinario");
            System.out.println("4. Registrar cita");
            System.out.println("5. Listar clientes");
            System.out.println("6. Listar mascotas");
            System.out.println("7. Listar veterinarios");
            System.out.println("8. Listar citas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            String linea = sc.nextLine();
            try {
                opcion = Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    registrarMascota();
                    break;
                case 3:
                    registrarVeterinario();
                    break;
                case 4:
                    registrarCita();
                    break;
                case 5:
                    listarClientes();
                    break;
                case 6:
                    listarMascotas();
                    break;
                case 7:
                    listarVeterinarios();
                    break;
                case 8:
                    listarCitas();
                    break;
                case 0:
                    System.out.println("¡Gracias por usar PetCare!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 0);
    }

    // --- Opciones de menú ---

    private void registrarCliente() {
        System.out.println("\n--- Registrar Cliente ---");
        String nombre = Validaciones.leerTextoNoVacio("Nombre: ");
        String apellidos = Validaciones.leerTextoNoVacio("Apellidos: ");
        String cedula = Validaciones.leerTextoNoVacio("Cédula: ");
        char sexo = Validaciones.leerSexo("Sexo (M/F): ");
        String ubicacion = Validaciones.leerTextoNoVacio("Ubicación: ");

        gestor.registrarCliente(nombre, apellidos, cedula, sexo, ubicacion);
    }

    private void registrarMascota() {
        System.out.println("\n--- Registrar Mascota ---");
        String nombre = Validaciones.leerTextoNoVacio("Nombre de la mascota: ");
        String especie = Validaciones.leerTextoNoVacio("Especie: ");
        String raza = Validaciones.leerTextoNoVacio("Raza: ");
        int edad = Validaciones.leerEntero("Edad (en años): ");
        int idCliente = Validaciones.leerEntero("ID del cliente dueño de la mascota: ");

        gestor.registrarMascota(nombre, especie, raza, edad, idCliente);
    }

    private void registrarVeterinario() {
        System.out.println("\n--- Registrar Veterinario ---");
        String nombre = Validaciones.leerTextoNoVacio("Nombre: ");
        String apellidos = Validaciones.leerTextoNoVacio("Apellidos: ");
        String cedula = Validaciones.leerTextoNoVacio("Cédula: ");
        char sexo = Validaciones.leerSexo("Sexo (M/F): ");
        String especialidad = Validaciones.leerTextoNoVacio("Especialidad: ");

        gestor.registrarVeterinario(nombre, apellidos, cedula, sexo, especialidad);
    }

    private void registrarCita() {
        System.out.println("\n--- Registrar Cita ---");
        int idMascota = Validaciones.leerEntero("ID de la mascota: ");
        int idVeterinario = Validaciones.leerEntero("ID del veterinario: ");

        System.out.print("Fecha de la cita (YYYY-MM-DD): ");
        String fechaStr = sc.nextLine();
        LocalDate fecha = LocalDate.parse(fechaStr);

        String motivo = Validaciones.leerTextoNoVacio("Motivo de la cita: ");

        gestor.registrarCita(fecha, motivo, idMascota, idVeterinario);
    }

    private void listarClientes() {
        System.out.println("\n--- Lista de Clientes ---");
        List<Cliente> clientes = gestor.listarClientes();
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            clientes.forEach(Cliente::mostrarInfo);
        }
    }

    private void listarMascotas() {
        System.out.println("\n--- Lista de Mascotas ---");
        List<Mascota> mascotas = gestor.listarMascotas();
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
        } else {
            for (Mascota m : mascotas) {
                m.mostrarInfoMascota();
            }
        }
    }

    private void listarVeterinarios() {
        System.out.println("\n--- Lista de Veterinarios ---");
        List<Veterinario> vets = gestor.listarVeterinarios();
        if (vets.isEmpty()) {
            System.out.println("No hay veterinarios registrados.");
        } else {
            for (Veterinario v : vets) {
                v.mostrarInfo();
            }
        }
    }

    private void listarCitas() {
        System.out.println("\n--- Lista de Citas ---");
        List<Cita> citas = gestor.listarCitas();
        if (citas.isEmpty()) {
            System.out.println("No hay citas registradas.");
        } else {
            for (Cita c : citas) {
                System.out.println(c);
            }
        }
    }
}
