package br.com.bluesoft;

import br.com.bluesoft.beans.MovimentacaoFinalizadora;
import br.com.bluesoft.beans.NfcSat;
import br.com.bluesoft.beans.RegistroItemVendido;
import br.com.bluesoft.beans.ResumoCupomFiscal;
import br.com.bluesoft.config.MovOutraConfiguration;
import br.com.bluesoft.util.FFPojoParserConfiguration;
import com.github.ffpojo.FFPojoFlatFileReaderBuilder;
import com.github.ffpojo.dsl.ReadProcessor;
import com.github.ffpojo.exception.FFPojoException;

import java.io.*;
import java.util.Arrays;


public class RunNew {

    public static void main(String[] args) throws IOException, FFPojoException {
    	ClassLoader classLoader = RunNew.class.getClassLoader();
    	File file = new File(classLoader.getResource("movoutra.txt").getFile());
        long init  =  System.currentTimeMillis();

        new FFPojoFlatFileReaderBuilder()
                .withFile(file)
                .withRecordClasses(
                        Arrays.asList(
                                NfcSat.class,
                                RegistroItemVendido.class,
                                ResumoCupomFiscal.class,
                                MovimentacaoFinalizadora.class
                        ))
                .read(new ReadProcessor() {
                    public void process(Object item) {
                        System.out.println(item);
                    }
                });

    }
}
