package br.com.bluesoft.util;

import br.com.bluesoft.config.ParseFileConfiguration;

import com.github.ffpojo.FFPojoHelper;
import com.github.ffpojo.exception.FFPojoException;

public class FFPojoParserConfiguration {


    public static <T> T toEntity(String text, ParseFileConfiguration configuration){
        final int idLinePosition = 1;
        final int lengthLinePosition = 2;
        Class<?> clazz = configuration.getClassMapped(idLinePosition, lengthLinePosition,text);
        return (T) toEntity(clazz, text);
    }
    public static <T> T toEntity(Class<T> clazz, String text){
        return FFPojoHelper.getInstance().createFromText(clazz, text);

    }

    public static <T> String toText(T entity){
        return FFPojoHelper.getInstance().parseToText(entity);
    }
}
