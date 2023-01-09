import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp(){
        pessoa = new Pessoa();
    }

    @Test
    void deveConverterParaDolar(){
        pessoa.converterDolar(100f);
        assertEquals(19.23077f, pessoa.getValorConvertido());
    }

    @Test
    void deveConverterParaEuro(){
        pessoa.converterEuro(100f);
        assertEquals(17.857143f, pessoa.getValorConvertido());
    }

    @Test
    void deveConverterParaLibra(){
        pessoa.converterLibra(100f);
        assertEquals(15.625f, pessoa.getValorConvertido());
    }

}