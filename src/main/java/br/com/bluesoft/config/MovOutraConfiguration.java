package br.com.bluesoft.config;

import br.com.bluesoft.beans.MovimentacaoFinalizadora;
import br.com.bluesoft.beans.NfcSat;
import br.com.bluesoft.beans.RegistroItemVendido;
import br.com.bluesoft.beans.ResumoCupomFiscal;
import br.com.bluesoft.config.ParseFileConfiguration;

import java.util.HashMap;
import java.util.Map;

public class MovOutraConfiguration implements ParseFileConfiguration {

    final static Map<String, Class<?>> mappedClasses =  new HashMap<String, Class<?>>();

    static{
        mappedClasses.put("01", ResumoCupomFiscal.class);//thiago
//        mappedClasses.put("02", MovimentacaoFinalizadora.class);//william
        mappedClasses.put("03", RegistroItemVendido.class);//eric
        mappedClasses.put("95", NfcSat.class);//william
    }

    public Class<?> getClassMapped(int idLinePosition, int lengthLinePosition, String line){
        String id = line.substring(idLinePosition, idLinePosition + lengthLinePosition);
        return mappedClasses.get(id);
    }


    public static void main(String[] args) {
        System.out.println( new MovOutraConfiguration().getClassMapped(0, 2, "01000000"));
    }

}
