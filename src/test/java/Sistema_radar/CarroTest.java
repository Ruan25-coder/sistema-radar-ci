package Sistema_radar;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarroTest {

    @Test
    public void testeAcelerar() {
        Carro carro = new Carro("ABC1234", "Gol", 2020, 0);
        carro.acelerar();
        assertEquals(10, carro.getVelocidade().intValue());
    }

    @Test
    public void testeFalha() {
        assertEquals(1, 2); // erro proposital
    }
}