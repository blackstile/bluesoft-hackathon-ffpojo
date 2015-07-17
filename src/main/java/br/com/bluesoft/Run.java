package br.com.bluesoft;

import br.com.bluesoft.config.MovOutraConfiguration;
import br.com.bluesoft.util.FFPojoParserConfiguration;
import com.github.ffpojo.FFPojoHelper;
import com.github.ffpojo.exception.FFPojoException;

import java.io.*;

public class Run {

    public static void main(String[] args) throws IOException, FFPojoException {
        BufferedReader textFileReader = new BufferedReader(new InputStreamReader(new FileInputStream("movoutra.txt")));
        String line;
        while ( (line = textFileReader.readLine()) != null) {
           Object myObject = FFPojoParserConfiguration.toEntity(new MovOutraConfiguration().getClassMapped(0,2,line), line);
            System.out.println(myObject);
        }
        textFileReader.close();
    }


}
