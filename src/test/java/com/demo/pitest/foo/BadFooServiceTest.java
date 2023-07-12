package com.demo.pitest.foo;

import com.demo.pitest.print.PrintService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static com.demo.pitest.constant.Constants.FAIL;
import static com.demo.pitest.constant.Constants.OK;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test covers 100% of the lines but misses a boundary condition for the value equal to the threshold value
 * It also doesn't evaluate the call to notOkBad method. So these tests are expected to have some PIT mutation test failures
 */
public class BadFooServiceTest {

    private BadFooService badFooService;
    private PrintService printService;

    @BeforeEach
    void setup() {
        printService = Mockito.mock(PrintService.class);
        badFooService = new BadFooService(printService);
    }

    @Test
    @DisplayName("Should return FAIL given 10")
    public void above_threshold_returns_FAIL() {
        String result = badFooService.foo(10);
        assertThat(result).isEqualTo(FAIL);
    }

    @Test
    @DisplayName("Should return OK given 1")
    public void below_threshold_returns_OK() {
        String result = badFooService.foo(1);
        assertThat(result).isEqualTo(OK);
    }


}
