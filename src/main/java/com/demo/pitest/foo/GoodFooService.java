package com.demo.pitest.foo;

import com.demo.pitest.print.PrintService;

import static com.demo.pitest.constant.Constants.*;

public class GoodFooService {

    private final PrintService printService;

    public GoodFooService(PrintService printService) {
        this.printService = printService;
    }

    public String foo(int value) {
        if ( value >= THRESHOLD ) {
            printService.okGood();
            return OK;
        }

        return FAIL;
    }


}
