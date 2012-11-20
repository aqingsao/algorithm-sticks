package com.my;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SticksTest {

    private Sticks fist = new Sticks();

    @Test
    public void test_return_0_when_given_empty_height() {
        double v = fist.maxLength(new int[0]);
        assertThat(v, is(0d));
    }

    @Test
    public void test_return_0_when_given_height_3() {
        double v = fist.maxLength(new int[]{3});
        assertThat(v, is(0d));
    }

    @Test
    public void test_return_sqrt_10_when_given_height_3_3() {
        fist = new Sticks();
        double expected = Math.sqrt(3 * 3 + 1);

        double v = fist.maxLength(new int[]{3, 3});
        assertThat(v, is(expected));
    }

    @Test
    public void test_return_max_length_when_given_3_3_10_3() {
        Sticks fist = new Sticks();
        double expected = Math.sqrt(3 * 3 + 1) + Math.sqrt(10 * 10 + 1) + Math.sqrt(10 * 10 + 1);

        double v = fist.maxLength(new int[]{3, 3, 10, 3});
        assertThat(v, is(expected));
    }
}
