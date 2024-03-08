import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class VoitureTest {

    private Car voiture;

    @BeforeEach
    public void setUp() {
        voiture = new Car("Sedan", "Bleu");
    }

    @Test
    public void testAccelerer() {
        voiture.speedUp();
        assertThat(voiture.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testRalentir() {
        voiture.speedUp();
        voiture.slowDown();
        assertThat(voiture.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testAfficherDetails() {
        // How to assert the output using AssertJ for console output?
        // Note: Testing console output is often more complex and depends on additional libraries.
    }
}
