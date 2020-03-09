package Lamport;

import java.util.Scanner;
import java.lang.Thread;

public class Lamport {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        System.out.println("\n\033[33mEste equipo es un poco obsoleto y solo cuenta con 3 procesos activos...");
        Proceso procesoUno = new Proceso(1, 0);
        Proceso procesoDos = new Proceso(2, 0);
        Proceso procesoTres = new Proceso(3, 0);
        do {
            System.out.println(
                    "\033[32mPorfavor ingrese con el teclado una opcion: \n \033[34m 1. Usar proceso #1\n \033[34m 2. Usar proceso #2\n \033[34m 3. Usar proceso #3\n \033[31m 4. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\033[37m [Proceso #1]        [Proceso #2]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #1]\033[33m-       \033[37m[Proceso #2]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #1]\033[33m--      \033[37m[Proceso #2]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #1]\033[33m---     \033[37m[Proceso #2]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #1]\033[33m----    \033[37m[Proceso #2]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #1]\033[33m-----   \033[37m[Proceso #2]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #1]\033[33m------  \033[37m[Proceso #2]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #1]\033[33m------- \033[37m[Proceso #2]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #1]\033[33m------->\033[37m[Proceso #2]");
                    Thread.sleep(500);
                    Enviar(procesoUno, procesoDos);
                    System.out.println(Enviar(procesoUno, procesoDos));
                    break;
                case 2:
                    System.out.println("\033[37m [Proceso #2]        [Proceso #3]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #2]\033[36m-       \033[37m[Proceso #3]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #2]\033[36m--      \033[37m[Proceso #3]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #2]\033[36m---     \033[37m[Proceso #3]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #2]\033[36m----    \033[37m[Proceso #3]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #2]\033[36m-----   \033[37m[Proceso #3]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #2]\033[36m------  \033[37m[Proceso #3]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #2]\033[36m------- \033[37m[Proceso #3]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #2]\033[36m------->\033[37m[Proceso #3]");
                    Thread.sleep(500);
                    Enviar(procesoDos, procesoTres);
                    System.out.println(Enviar(procesoDos, procesoTres));
                    break;
                case 3:
                    System.out.println("\033[37m [Proceso #3]        [Proceso #1]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #3]\033[35m-       \033[37m[Proceso #1]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #3]\033[35m--      \033[37m[Proceso #1]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #3]\033[35m---     \033[37m[Proceso #1]");
                    Thread.sleep(500);
                    System.out.println("\033[37m [Proceso #3]\033[35m----    \033[37m[Proceso #1]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #3]\033[35m-----   \033[37m[Proceso #1]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #3]\033[35m------  \033[37m[Proceso #1]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #3]\033[35m------- \033[37m[Proceso #1]");
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\033[37m [Proceso #3]\033[35m------->\033[37m[Proceso #1]");
                    Thread.sleep(500);
                    Enviar(procesoTres, procesoUno);
                    System.out.println(Enviar(procesoTres, procesoUno));
                    break;
                default:
                    System.out.println("\033[31m Porfavor introdusca un numero del 1 al 4\nGracias.");
                    break;
            }
        } while (opcion != 4);
        teclado.close();
    }

    public static String Enviar(Proceso procesoEnvia, Proceso procesoRecibe) {
        int mensaje = procesoRecibe.NumProceso;
        String LoggEnviar = procesoEnvia.enviarMenaje(procesoRecibe, mensaje);
        return LoggEnviar;
    }

}