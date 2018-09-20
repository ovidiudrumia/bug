package com.axp.bug;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class BugExampleTest {

    @Test
    public void givenHours_whenConstructor_thenReturnHours() {
        BugExample bugExample = new BugExample(1, 0, 0);

        assertThat(bugExample.getTime()).isEqualTo("1:0:0");
    }
}
