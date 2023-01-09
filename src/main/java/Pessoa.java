public class Pessoa {

    private Float valorConvertido;

    public Float getValorConvertido() {
        return valorConvertido;
    }

    public void converterDolar(Float valorReais){
        CasaDeCambio casaDeCambio = new CasaDeCambio(valorReais);
        this.valorConvertido = casaDeCambio.converter(new OperacaoConverterDolar());
    }

    public void converterEuro(Float valorReais){
        CasaDeCambio casaDeCambio = new CasaDeCambio(valorReais);
        this.valorConvertido = casaDeCambio.converter(new OperacaoConverterEuro());
    }

    public void converterLibra(Float valorReais){
        CasaDeCambio casaDeCambio = new CasaDeCambio(valorReais);
        this.valorConvertido = casaDeCambio.converter(new OperacaoConverterLibra());
    }

}
