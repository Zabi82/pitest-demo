package com.demo.pitest.foo;

import com.demo.pitest.print.PrintService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static com.demo.pitest.constant.Constants.FAIL;
import static com.demo.pitest.constant.Constants.OK;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * This test covers 100% of the lines and asserts the expected output and covers all boundary conditions
 * It also asserts the call to okGood method, so these tests should pass the PIT mutation tests
 */
public class GoodFooServiceTest {

   private GoodFooService goodFooService;
   private PrintService printService;


    @BeforeEach
    void setup() {
        printService = Mockito.mock(PrintService.class);
        goodFooService = new GoodFooService(printService);

    }

    @Test
    @DisplayName("Should return OK given 10")
    public void above_threshold_returns_OK() {
        String result = goodFooService.foo(10);
        verify(printService, times(1)).okGood();
        assertThat(result).isEqualTo(OK);

    }

    @Test
    @DisplayName("Should return FAIL given 1")
    public void below_threshold_returns_FAIL() {
        String result = goodFooService.foo(1);
        verify(printService, times(0)).okGood();
        assertThat(result).isEqualTo(FAIL);
    }

    @Test
    @DisplayName("Should return OK given 5")
    public void equal_to_threshold_returns_OK() {
        String result = goodFooService.foo(5);
        verify(printService, times(1)).okGood();
        assertThat(result).isEqualTo(OK);
    }
}
