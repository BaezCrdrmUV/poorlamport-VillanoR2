package Lamport;

import java.util.Scanner;

public class Lamport{
    public static void main(String[] args) {
        
    }

    public void Proceso(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba su mensaje...\n");
        String operacion = sc.nextLine();
        System.out.print("Ingrese el tiempo en números...");
        int reloj = sc.nextInt();
        System.out.print("Enviando mensaje al otro proceso...");
        enviarMenaje(operacion, reloj);
        sc.close();
    }
        
    public void enviarMenaje(String mensaje, int marca_tiempo) {
        marca_tiempo = marca_tiempo + 1;

    }
    

    public void recibirMensaje(String mensaje, int marca_tiempo) {
        
    }

}