

public class Main {
    public static void main(String[] args) {

        // PRIMER CLIENTE
        Cliente cliente1 = new Cliente("Trayce", "González", "2-1111-2222", 'M', "Heredia");

        // Mascota del primer cliente
        Mascota mascota1 = new Mascota("Namiko", "Perro", "Akita Inu", 2, cliente1);

        // Cita de la mascota Namiko
        Cita cita1 = new Cita("04/10/2025", "Vacunación anual", "Dr. Ramírez");

        // Registrar cita
        mascota1.registrarCita(cita1);

        // Mostrar información
        cliente1.mostrarInfoCliente();
        mascota1.mostrarInfoMascota();


        // SEGUNDA MASCOTA
        Mascota mascota2 = new Mascota("Kuro", "Gato", "Bombay", 3, cliente1);
        Cita cita2 = new Cita("10/10/2025", "Desparasitación", "Dra. Valverde");
        mascota2.registrarCita(cita2);

        mascota2.mostrarInfoMascota();


        // EGUNDO CLIENTE =====

        Cliente cliente2 = new Cliente("Mariana", "Soto", "3-2222-3333", 'F', "San José");

        // Mascota del segundo cliente
        Mascota mascota3 = new Mascota("Michi", "Gato", "Siames", 4, cliente2);

        // Cita del gato Michi
        Cita cita3 = new Cita("05/10/2025", "Control general", "Dra. Morales");
        mascota3.registrarCita(cita3);

        // Mostrar información
        cliente2.mostrarInfoCliente();
        mascota3.mostrarInfoMascota();


        //  TERCER CLIENTE
        Cliente cliente3 = new Cliente("Rolando", "Méndez", "4-3333-4444", 'M', "Cartago");
        Mascota mascota4 = new Mascota("Piolín", "Periquito", "Periquito del amor", 1, cliente3);
        Cita cita4 = new Cita("11/10/2025", "Revisión de alas", "Dra. Molina");
        mascota4.registrarCita(cita4);
        cliente3.mostrarInfoCliente();
        mascota4.mostrarInfoMascota();


        //  CUARTO CLIENTE
        Cliente cliente4 = new Cliente("Lucía", "Ramírez", "5-4444-5555", 'F', "Alajuela");
        Mascota mascota5 = new Mascota("Tuga", "Tortuga", "Tortuga de orejas rojas", 5, cliente4);
        Cita cita5 = new Cita("12/10/2025", "Limpieza del caparazón", "Dr. Herrera");
        mascota5.registrarCita(cita5);
        cliente4.mostrarInfoCliente();
        mascota5.mostrarInfoMascota();


        //  QUINTO CLIENTE
        Cliente cliente5 = new Cliente("José", "Rojas", "6-5555-6666", 'M', "Puntarenas");
        Mascota mascota6 = new Mascota("Nibbles", "Hámster", "Hámster ruso", 1, cliente5);
        Cita cita6 = new Cita("13/10/2025", "Revisión dental", "Dra. Quesada");
        mascota6.registrarCita(cita6);
        cliente5.mostrarInfoCliente();
        mascota6.mostrarInfoMascota();


        //  SEXTO CLIENTE
        Cliente cliente6 = new Cliente("Carolina", "Solano", "7-6666-7777", 'F', "Liberia");
        Mascota mascota7 = new Mascota("Bunny", "Conejo", "Mini Lop", 2, cliente6);
        Cita cita7 = new Cita("14/10/2025", "Vacuna preventiva", "Dr. Alfaro");
        mascota7.registrarCita(cita7);
        cliente6.mostrarInfoCliente();
        mascota7.mostrarInfoMascota();


        System.out.println("Fin del registro de clientes y mascotas en PetCare");
    }
}
