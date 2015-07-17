package br.com.bluesoft.decorator;

import com.github.ffpojo.exception.FieldDecoratorException;
import com.github.ffpojo.metadata.FieldDecorator;

public class LongDecorator implements FieldDecorator<Long> {

    public String toString(Long valor) throws FieldDecoratorException {
        if (valor != null){
            return valor.toString();
        }
        return null;
    }

    public Long fromString(String s) throws FieldDecoratorException {
        return Long.valueOf(s);
    }
}
