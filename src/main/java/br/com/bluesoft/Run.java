package br.com.bluesoft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.bluesoft.config.MovOutraConfiguration;
import br.com.bluesoft.util.FFPojoParserConfiguration;

import com.github.ffpojo.exception.FFPojoException;


public class Run {

    public static void main(String[] args) throws IOException, FFPojoException {
    	ClassLoader classLoader = Run.class.getClassLoader();
    	File file = new File(classLoader.getResource("movoutra.txt").getFile());
    	
        BufferedReader textFileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line =  null;
        long init  =  System.currentTimeMillis();
        while ( (line = textFileReader.readLine()) != null) {
            Class<?> clazz =  new MovOutraConfiguration().getClassMapped(0,2,line);
            if (clazz==null) continue;
            Object o  = FFPojoParserConfiguration.toEntity(clazz, line);
            System.out.println(o);
//            System.out.println(line);
//            System.out.println(FFPojoParserConfiguration.toText(o));
//            System.out.println();

        }
        textFileReader.close();
        System.out.println(System.currentTimeMillis() - init );
    }
}
