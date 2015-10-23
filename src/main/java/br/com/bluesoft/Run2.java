package br.com.bluesoft;

import br.com.bluesoft.beans.antigos.RegistroItemVendido;
import br.com.bluesoft.config.MovOutraConfiguration;
import br.com.bluesoft.util.FFPojoParserConfiguration;
import com.github.ffpojo.FFPojoHelper;
import com.github.ffpojo.exception.FFPojoException;

import java.io.*;


public class Run2 {

    public static void main(String[] args) throws IOException, FFPojoException {

        FFPojoHelper ffPojoHelper = FFPojoHelper.getInstance();
        String texto = "031210000020121000002111015061500000789607982851403004000000000000000000000000010000000000000990000000000000000000000000000172700000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000080000121";
//        RegistroItemVendido registro = ffPojoHelper.createFromText(RegistroItemVendido.class, texto);

        RegistroItemVendido registro =  new RegistroItemVendido();
        registro.setTipoDeRegistro("03");
        registro.setIdentificacaoDoRegistro("121000002");
        registro.setNumeroDoEquipamento("0121");
        registro.setNumeroSequencialDaOperacao("000002");
        registro.setNumeroDaFuncao("1110");
        registro.setDataDoMovimento("150615");
        String txt = ffPojoHelper.parseToText(registro);
        System.out.println(txt);


    }
}
