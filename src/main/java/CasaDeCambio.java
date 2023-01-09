public class CasaDeCambio {
    private Float valorReais;
    public CasaDeCambio(Float valorReais){
        this.valorReais = valorReais;
    }

    public Float converter(Operacao operacao){
        return operacao.converter(valorReais);
    }
}
