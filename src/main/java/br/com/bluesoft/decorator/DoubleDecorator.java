package br.com.bluesoft.decorator;

import com.github.ffpojo.exception.FieldDecoratorException;
import com.github.ffpojo.metadata.FieldDecorator;

public class DoubleDecorator implements FieldDecorator<Double> {
    public String toString(Double aDouble) throws FieldDecoratorException {
        if (aDouble != null){
            return aDouble.toString();
        }
        return null;
    }

    public Double fromString(String s) throws FieldDecoratorException {
        return Double.valueOf(s) / 100;
    }
}
