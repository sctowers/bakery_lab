import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    private Cupcake cupcake;

    @BeforeEach
    public void setUp(){
        String[] toppings = {"Chocolate", "Sprinkles"};
        cupcake = new Cupcake("Chocolate cupcake", toppings);
    }

    @Test
    public void testCalculatePrice(){
        double expectedPrice = 2.0 + (2 * 0.5);
        assertThat(cupcake.calculatePrice()).isEqualTo(3.0);
    }
}
