package com.axp.bug;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TimeKeeperTest {

    @Test
    public void givenHours_whenConstructor_thenReturnHours() {
        TimeKeeper timeKeeper = new TimeKeeper(1, 0, 0);

        assertThat(timeKeeper.getTime()).isEqualTo("1:0:0");
    }

    @Test
    public void givenSeconds_whenConstructor_thenReturnSeconds() {
        TimeKeeper timeKeeper = new TimeKeeper(0, 0, 1);

        assertThat(timeKeeper.getTime()).isEqualTo("0:0:1");
    }

    @Test
    public void givenMinutes_whenConstructor_thenReturnSeconds() {
        TimeKeeper timeKeeper = new TimeKeeper(0, 1, 0);

        assertThat(timeKeeper.getTime()).isEqualTo("0:1:0");
    }
}
