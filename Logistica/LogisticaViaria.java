public class LogisticaViaria extends Logistica{
    @Override
    public Transporte criarTransporte(){
        return new Caminhao();
    }
    
}