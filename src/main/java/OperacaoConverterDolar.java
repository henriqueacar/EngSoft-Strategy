public class OperacaoConverterDolar implements Operacao{

    private Float cotacao = 5.2f;
    public Float converter(Float valorReais){
        return valorReais / cotacao;
    }
}
