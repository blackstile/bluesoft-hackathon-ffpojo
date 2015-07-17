package br.com.bluesoft;

import java.io.IOException;

import br.com.bluesoft.beans.RegistroItemVendido;
import br.com.bluesoft.util.FFPojoParserConfiguration;

import com.github.ffpojo.exception.FFPojoException;


public class Run {

    public static void main(String[] args) throws IOException, FFPojoException {
        String line = "031210000020121000002111015061500000789607982851403004000000000000000000000000010000000000000990000000000000000000000000000172700000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000080000121";
           RegistroItemVendido registroItemVendido = FFPojoParserConfiguration.toEntity(RegistroItemVendido.class, line);
           System.out.println(registroItemVendido);
           System.out.println(FFPojoParserConfiguration.toText(RegistroItemVendido.class, registroItemVendido));
           System.out.println(line);

    }
}
