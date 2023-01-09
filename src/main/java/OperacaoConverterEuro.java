public class OperacaoConverterEuro implements Operacao{

    private Float cotacao = 5.6f;
    public Float converter(Float valorReais){
        return valorReais / cotacao;
    }
}