package com.unittest.codecoverage.validators;

import com.unittest.codecoverage.models.Traffic;
import com.unittest.codecoverage.models.TrafficLigth;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TrafficTest {

    @Test
    public void testGetCurrentTrafficLight_shouldReturnDefaultValue() {
        Traffic traffic = new Traffic();

        TrafficLigth result = traffic.getCurrentTrafficLight();

        assertThat(result).isNull();
    }

    @Test
    public void testIntenseCarTraffic_shouldReturnDefaultValue() {
        Traffic traffic = new Traffic();

        boolean result = traffic.intenseCarTraffic();

        assertThat(result).isFalse();
    }

    @Test
    public void testSetIntenseCarTraffic_shouldSetCorrectValue() {
        Traffic traffic = new Traffic();

        traffic.setIntenseCarTraffic(true);

        assertThat(traffic.intenseCarTraffic()).isTrue();
    }

    @Test
    public void testGetMaxSpeedAllowed_shouldReturnDefaultValue() {
        Traffic traffic = new Traffic();

        short result = traffic.getMaxSpeedAllowed();

        assertThat(result).isZero();
    }

}
