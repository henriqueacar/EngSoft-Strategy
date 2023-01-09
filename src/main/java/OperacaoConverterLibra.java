public class OperacaoConverterLibra implements Operacao{

    private Float cotacao = 6.4f;
    public Float converter(Float valorReais){
        return valorReais / cotacao;
    }
}
