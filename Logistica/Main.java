public class Main{
    public static void main(String[] args){
        Logistica logistica = new LogisticaMarinha();
        Transporte transporte = logistica.criarTransporte();
        transporte.entregar();
    }
}