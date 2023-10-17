import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    private Bakery bakery;

    @BeforeEach
    public void setUp(){
        bakery = new Bakery();
    }

    @Test
    public void testCountCakesWithEmptyBakery() {
        assertThat(bakery.countCakes()).isEqualTo(0);
    }

}
