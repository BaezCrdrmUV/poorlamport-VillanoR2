package Lamport;

public class Proceso{

    int NumProceso = 0;
    int RelojProceso = 0;

    public int getNumProceso() {
        return NumProceso;
    }

    public void setNumProceso(int numProceso) {
        NumProceso = numProceso;
    }

    public int getRelojProceso() {
        return RelojProceso;
    }

    public void setRelojProceso(int relojProceso) {
        RelojProceso = relojProceso;
    }

    public Proceso(int numProceso, int relojProceso){
        this.NumProceso = numProceso;
        this.RelojProceso = relojProceso;
    }
        
    public String enviarMenaje(Proceso proceso, int tiempoMensaje) {
        RelojProceso = RelojProceso + 1;
        tiempoMensaje = RelojProceso;
        String LoggEnviar = "El proceso " + this.NumProceso + " envio un mensaje y su reloj marca: " + RelojProceso +"\n"+ proceso.recibirMensaje(tiempoMensaje);
        return LoggEnviar;
    }
    
    public String recibirMensaje(int tiempoMensaje) {
        int[] relojes = new int[] {RelojProceso, tiempoMensaje};
        RelojProceso = ordenamientoReloj(relojes) + 1;
        String loggRecibi = "El proceso " + this.NumProceso + " recibio un mensaje y su reloj marca: " + RelojProceso;
        return loggRecibi;

    }

    private int ordenamientoReloj(int[] lista){
        int iNumeroMayor = lista[0];
        int x=0;
        int y=lista.length;
        if (lista[x] > iNumeroMayor) {
            iNumeroMayor = lista[x];
            if(lista[y] > iNumeroMayor){
                iNumeroMayor = lista[y];
            }else{
                y--;
            }
        }else{
            x++;
        }
        return iNumeroMayor;

    }

}