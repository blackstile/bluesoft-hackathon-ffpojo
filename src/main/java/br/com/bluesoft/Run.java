package br.com.bluesoft;

import br.com.bluesoft.beans.NfcSat;
import br.com.bluesoft.config.MovOutraConfiguration;
import br.com.bluesoft.util.FFPojoParserConfiguration;
import com.github.ffpojo.exception.FFPojoException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class Run {

    public static void main(String[] args) throws IOException, FFPojoException {
//        BufferedReader textFileReader = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/william/Documents/workspace/springbatch/zanthus-parser/src/main/resources/movoutra.txt")));
        String line =  "951210000020121000002000115061500000007017270000000000000000000000000548000000000000000000000000000000000000000000000009000000000042591100035150603205493000194590000006880000010017791000000001000000688";
//        while ( (line = textFileReader.readLine()) != null) {
            NfcSat nfcSat = FFPojoParserConfiguration.toEntity(NfcSat.class, line);
            System.out.println(nfcSat);
        System.out.println(new SimpleDateFormat("ddMMyy").format(nfcSat.getDataMovimento()));

//        }
//        textFileReader.close();
    }


}
