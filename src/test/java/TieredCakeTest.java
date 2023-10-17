import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {

    private TieredCake tieredCake;

    @BeforeEach
    public void setUp() {
        tieredCake = new TieredCake("Birthday Cake", 3);
    }

    @Test
    public void testCalculatePrice() {
        double expectedPrice = 10.0 + (3 * 5.0);

        assertThat(tieredCake.calculatePrice()).isEqualTo(expectedPrice);
    }

    @Test
    public void testCelebrate(){
        String celebrationMessage = tieredCake.celebrate(10);
        assertThat(celebrationMessage).isEqualTo("Birthday cake is needed for 10");
    }
}


