package br.com.bluesoft.decorator;

import com.github.ffpojo.exception.FieldDecoratorException;
import com.github.ffpojo.metadata.FieldDecorator;

public class IntegerDecorator implements FieldDecorator<Integer> {

    public String toString(Integer valor) throws FieldDecoratorException {
        if (valor != null){
            return valor.toString();
        }
        return null;
    }

    public Integer fromString(String s) throws FieldDecoratorException {
        return Integer.valueOf(s);
    }
}
