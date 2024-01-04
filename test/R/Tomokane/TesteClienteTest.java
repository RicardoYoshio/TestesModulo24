package R.Tomokane;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Ricardo");
        cli.adicionarNome1("Ricardo");

        Assert.assertEquals("Ricardo", cli.getNome());
    }
}
