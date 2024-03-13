public class LogisticaMarinha extends Logistica{
    @Override
    public Transporte criarTransporte(){
        return new Navio();
    }
}