package br.com.bluesoft.decorator;

import com.github.ffpojo.exception.FieldDecoratorException;
import com.github.ffpojo.metadata.FieldDecorator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDecorator implements FieldDecorator<Date>{

    private SimpleDateFormat dateFormat = new SimpleDateFormat("HHmm");

    public String toString(Date valor) throws FieldDecoratorException {
        if (valor != null){
            return dateFormat.format(valor);
        }
        return null;
    }

    public Date fromString(String s) throws FieldDecoratorException {
        try {
            return dateFormat.parse(s);
        } catch (ParseException e) {
            return null;
        }
    }
}
