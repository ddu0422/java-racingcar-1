package stringcalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    Calculator cal;

    @BeforeEach
    void setUp() {
        cal = new Calculator();
    }

    @Test
    void 더하기() {
        int result = cal.plus(1, 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void 빼기() {
        int result = cal.minus(1, 2);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void 곱하기() {
        int result = cal.multiply(1, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void 나누기() {
        int result = cal.divide(4, 2);
        assertThat(result).isEqualTo(2);
    }
}