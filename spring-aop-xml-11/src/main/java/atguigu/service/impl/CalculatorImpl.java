package atguigu.service.impl;

import atguigu.service.Calculator;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int div(int i, int j) {
        return i / j;
    }
}
