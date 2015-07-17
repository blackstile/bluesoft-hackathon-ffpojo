package br.com.bluesoft;

import java.io.IOException;

import br.com.bluesoft.beans.RegistroItemVendido;
import br.com.bluesoft.util.FFPojoParserConfiguration;

import com.github.ffpojo.exception.FFPojoException;


public class Run {

    public static void main(String[] args) throws IOException, FFPojoException {
        BufferedReader textFileReader = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/william/Documents/workspace/springbatch/zanthus-parser/src/main/resources/movoutra.txt")));
        String line =  "951210000020121000002000115061500000007017270000000000000000000000000548000000000000000000000000000000000000000000000009000000000042591100035150603205493000194590000006880000010017791000000001000000688";
        while ( (line = textFileReader.readLine()) != null) {
            Class<?> clazz =  new MovOutraConfiguration().getClassMapped(0,2,line);
            if (clazz==null) continue;
            Object o  = FFPojoParserConfiguration.toEntity(clazz, line);
            System.out.println(o);
            System.out.println(line);
            System.out.println(FFPojoParserConfiguration.toText(o));

        }
        textFileReader.close();
    }
}
