package com.demo.pitest.foo;

import com.demo.pitest.print.PrintService;

import static com.demo.pitest.constant.Constants.*;

public class BadFooService {

    private final PrintService printService;

    public BadFooService(PrintService printService) {
        this.printService = printService;
    }

    public String foo(int value) {
        if ( value >= THRESHOLD ) {
            printService.notOkBad();
            return FAIL;
        }

        return OK;
    }


}
