package br.com.bluesoft.decorator;

import com.github.ffpojo.exception.FieldDecoratorException;
import com.github.ffpojo.metadata.FieldDecorator;

import java.math.BigDecimal;

public class BigDecimalDecorator implements FieldDecorator<BigDecimal> {


    private static final java.math.BigDecimal CEM = BigDecimal.TEN.multiply(BigDecimal.TEN);

    public String toString(BigDecimal bigDecimal) throws FieldDecoratorException {
        if (bigDecimal == null){return null;}
        return bigDecimal.multiply(CEM).toString();
    }

    public BigDecimal fromString(String s) throws FieldDecoratorException {
        if (s == null){return null;}
        return BigDecimal.valueOf(Double.valueOf(s)).divide(CEM);
    }
}
