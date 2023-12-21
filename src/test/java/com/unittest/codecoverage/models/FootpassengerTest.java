package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FootpassengerTest {

    @Test
    public void testCrossedTheCrosswalk_shouldReturnDefaultValue() {
        Footpassenger footpassenger = new Footpassenger();

        boolean result = footpassenger.crossedTheCrosswalk();

        assertThat(result).isFalse();
    }

    @Test
    public void testSetCrossedTheCrosswalk_shouldSetCorrectValue() {
        Footpassenger footpassenger = new Footpassenger();

        footpassenger.setCrossedTheCrosswalk(true);

        assertThat(footpassenger.crossedTheCrosswalk()).isTrue();
    }

    @Test
    public void testGetCrossedTrafficLigth_shouldReturnNullByDefault() {
        Footpassenger footpassenger = new Footpassenger();

        TrafficLigth result = footpassenger.getCrossedTrafficLigth();

        assertThat(result).isNull();
    }

    @Test
    public void testLookedToTheRight_shouldReturnDefaultValue() {
        Footpassenger footpassenger = new Footpassenger();

        boolean result = footpassenger.lookedToTheRight();

        assertThat(result).isFalse();
    }
}
