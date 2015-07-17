package br.com.bluesoft.beans;


import br.com.bluesoft.decorator.BigDecimalDecorator;
import br.com.bluesoft.decorator.DateDecorator;
import br.com.bluesoft.decorator.IntegerDecorator;
import br.com.bluesoft.decorator.TimeDecorator;
import com.github.ffpojo.metadata.positional.PaddingAlign;
import com.github.ffpojo.metadata.positional.annotation.PositionalField;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecord;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 1	Tipo de registro	1	2		Fixo - 95
 2	Identificação do registro	3	9		Numero do guiche + COO
 3	Número do equipamento	12	4		Numero do guiche
 4	Número seqüencial da operação (COO)	16	6		Numero do cupom de venda
 5	Número da função	22	4		1 - Autorizacao, 2 - Cancelamento, 3 - Inutilizacao
 6	Data do movimento (DDMMAA)	26	6
 8	Código do operador	32	9
 9	Horário da venda (HHMM)	41	4
 12	Cliente	45	16		CPF ou CNPJ do destinatario
 11	Valor Liquido	61	12	2	Valor do Documento
 13	Valor Desconto	73	12	2	Valor do Desconto (vDesc)
 14	Valor ICMS	85	12	2	Valor do ICMS (vICMS)
 15	Valor Acrescimo	97	12	2	Valor Acrescimo (vOutro)
 16	Valor PIS	109	12	2	vPIS
 17	Valor COFINS	121	12	2	vCOFINS
 18	Modelo (59 - SAT, 65 - NFC-e)	133	2		Modelo do documento
 19	Tipo de emissao	135	1		1 - Normal, 9 - Contingencia
 20	Tipo de ambiente	136	1		1 - Producao, 2 - Homologacao
 21	Serie NFC-e	137	3		Série NFC-e (SAT = 000)
 22	Chave NFC-e/SAT	140	44		Chave
 23	Numero da NFC-e/SAT	184	9		Numero do documento
 24	Numero de serie SAT	193	9		Numero de serie do equipamento SAT
 */

@PositionalRecord
public class NfcSat {

    private int codigoTipoRegistro;
    private String indentificacaoDoRegistro;
    private Integer numeroEquipamento;
    private Integer numeroSequencialOperacao;
    private Integer numeroFuncao;
    private Date dataMovimento;
    private Integer codigoDoOperador;
    private Date horarioVenda;
    private String cpfCnpjCliente;
    private BigDecimal valorLiquido;
    private BigDecimal valorDesconto;
    private BigDecimal valorIcms;
    private BigDecimal valorAcrescimo;
    private BigDecimal valorPis;
    private BigDecimal valorCofins;
    private Integer modeloDocumento;
    private Integer tipoEmissao;
    private Integer tipoAmbiente;
    private String serieNFCe;
    private String chaveNFCeSat;
    private String numeroDocumentoNFCeSat;
    private String numeroSerieEquipamentoSat;

    // 1	Tipo de registro	1	2		Fixo - 95
    @PositionalField(initialPosition = 1, finalPosition = 2)
    public int getCodigoTipoRegistro() {
        return codigoTipoRegistro;
    }
    //2	Identificação do registro	3	9		Numero do guiche + COO
    @PositionalField(initialPosition = 3, finalPosition = 11)
    public String getIndentificacaoDoRegistro() {
        return indentificacaoDoRegistro;
    }

    //3	Número do equipamento	12	4		Numero do guiche
    @PositionalField(initialPosition = 12, finalPosition = 15, decorator = IntegerDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public Integer getNumeroEquipamento() {
        return numeroEquipamento;
    }

    //4	Número seqüencial da operação (COO)	16	6		Numero do cupom de venda
    @PositionalField(initialPosition = 16, finalPosition = 21, decorator = IntegerDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public Integer getNumeroSequencialOperacao() {
        return numeroSequencialOperacao;
    }

    //5	Número da função	22	4		1 - Autorizacao, 2 - Cancelamento, 3 - Inutilizacao
    @PositionalField(initialPosition = 22, finalPosition = 25, decorator = IntegerDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public Integer getNumeroFuncao() {
        return numeroFuncao;
    }

//    6	Data do movimento (DDMMAA)	26	6
    @PositionalField(initialPosition = 26, finalPosition = 31, decorator = DateDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public Date getDataMovimento() {
        return dataMovimento;
    }

    //8	Código do operador	32	9
    @PositionalField(initialPosition = 32, finalPosition = 40, decorator = IntegerDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public Integer getCodigoDoOperador() {
        return codigoDoOperador;
    }

    //9	Horário da venda (HHMM)	41	4
    @PositionalField(initialPosition = 41, finalPosition = 44, decorator = TimeDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public Date getHorarioVenda() {
        return horarioVenda;
    }

    //12	Cliente	45	16		CPF ou CNPJ do destinatario
    @PositionalField(initialPosition = 45, finalPosition = 60, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public String getCpfCnpjCliente() {
        return cpfCnpjCliente;
    }

    //11	Valor Liquido	61	12	2	Valor do Documento
    @PositionalField(initialPosition = 61, finalPosition = 72, decorator = BigDecimalDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public BigDecimal getValorLiquido() {
        return valorLiquido;
    }

    //13	Valor Desconto	73	12	2	Valor do Desconto (vDesc)
    @PositionalField(initialPosition = 73, finalPosition = 84, decorator = BigDecimalDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    //14	Valor ICMS	85	12	2	Valor do ICMS (vICMS)
    @PositionalField(initialPosition = 85, finalPosition = 96, decorator = BigDecimalDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public BigDecimal getValorIcms() {
        return valorIcms;
    }

    //15	Valor Acrescimo	97	12	2	Valor Acrescimo (vOutro)
    @PositionalField(initialPosition = 97, finalPosition = 108, decorator = BigDecimalDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public BigDecimal getValorAcrescimo() {
        return valorAcrescimo;
    }

    //16	Valor PIS	109	12	2	vPIS
    @PositionalField(initialPosition = 109, finalPosition = 120, decorator = BigDecimalDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public BigDecimal getValorPis() {
        return valorPis;
    }

    //17	Valor COFINS	121	12	2	vCOFINS
    @PositionalField(initialPosition = 121, finalPosition = 132, decorator = BigDecimalDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public BigDecimal getValorCofins() {
        return valorCofins;
    }

    //18	Modelo (59 - SAT, 65 - NFC-e)	133	2		Modelo do documento
    @PositionalField(initialPosition = 133, finalPosition = 134, decorator = IntegerDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public Integer getModeloDocumento() {
        return modeloDocumento;
    }

    //19	Tipo de emissao	135	1		1 - Normal, 9 - Contingencia
    @PositionalField(initialPosition = 135, finalPosition = 135, decorator = IntegerDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public Integer getTipoEmissao() {
        return tipoEmissao;
    }
//20	Tipo de ambiente	136	1		1 - Producao, 2 - Homologacao
    @PositionalField(initialPosition = 136, finalPosition = 136, decorator = IntegerDecorator.class, paddingAlign = PaddingAlign.LEFT, paddingCharacter = '0')
    public Integer getTipoAmbiente() {
        return tipoAmbiente;
    }
//21	Serie NFC-e	137	3		Série NFC-e (SAT = 000)
    @PositionalField(initialPosition = 137, finalPosition = 139)
    public String getSerieNFCe() {
        return serieNFCe;
    }
//22	Chave NFC-e/SAT	140	44		Chave
    @PositionalField(initialPosition = 140, finalPosition = 183)
    public String getChaveNFCeSat() {
        return chaveNFCeSat;
    }
//23	Numero da NFC-e/SAT	184	9		Numero do documento
    @PositionalField(initialPosition = 184, finalPosition = 192)
    public String getNumeroDocumentoNFCeSat() {
        return numeroDocumentoNFCeSat;
    }

    //24	Numero de serie SAT	193	9		Numero de serie do equipamento SAT
    @PositionalField(initialPosition = 193, finalPosition = 201)
    public String getNumeroSerieEquipamentoSat() {
        return numeroSerieEquipamentoSat;
    }




    public void setCodigoTipoRegistro(String codigoTipoRegistro) {
        this.codigoTipoRegistro = Integer.valueOf(codigoTipoRegistro);
    }

    public void setCodigoTipoRegistro(Integer codigoTipoRegistro) {
        this.codigoTipoRegistro = codigoTipoRegistro;
    }

    public void setIndentificacaoDoRegistro(String indentificacaoDoRegistro) {
        this.indentificacaoDoRegistro = indentificacaoDoRegistro;
    }

    public void setNumeroEquipamento(Integer numeroEquipamento) {
        this.numeroEquipamento = numeroEquipamento;
    }

    public void setNumeroSequencialOperacao(Integer numeroSequencialOperacao) {
        this.numeroSequencialOperacao = numeroSequencialOperacao;
    }


    public void setNumeroFuncao(Integer numeroFuncao) {
        this.numeroFuncao = numeroFuncao;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public void setCodigoDoOperador(Integer codigoDoOperador) {
        this.codigoDoOperador = codigoDoOperador;
    }

    public void setHorarioVenda(Date horarioVenda) {
        this.horarioVenda = horarioVenda;
    }

    public void setCpfCnpjCliente(String cpfCnpjCliente) {
        this.cpfCnpjCliente = cpfCnpjCliente;
    }

    public void setValorLiquido(BigDecimal valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setValorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
    }

    public void setValorAcrescimo(BigDecimal valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public void setValorPis(BigDecimal valorPis) {
        this.valorPis = valorPis;
    }

    public void setValorCofins(BigDecimal valorCofins) {
        this.valorCofins = valorCofins;
    }

    public void setModeloDocumento(Integer modeloDocumento) {
        this.modeloDocumento = modeloDocumento;
    }

    public void setTipoEmissao(Integer tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
    }

    public void setTipoAmbiente(Integer tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }

    public void setSerieNFCe(String serieNFCe) {
        this.serieNFCe = serieNFCe;
    }

    public void setChaveNFCeSat(String chaveNFCeSat) {
        this.chaveNFCeSat = chaveNFCeSat;
    }

    public void setNumeroDocumentoNFCeSat(String numeroDocumentoNFCeSat) {
        this.numeroDocumentoNFCeSat = numeroDocumentoNFCeSat;
    }

    public void setNumeroSerieEquipamentoSat(String numeroSerieEquipamentoSat) {
        this.numeroSerieEquipamentoSat = numeroSerieEquipamentoSat;
    }

    @Override
    public String toString() {
        return "NfcSat{" +
                "codigoTipoRegistro=" + codigoTipoRegistro +
                ", indentificacaoDoRegistro='" + indentificacaoDoRegistro + '\'' +
                ", numeroEquipamento=" + numeroEquipamento +
                ", numeroSequencialOperacao=" + numeroSequencialOperacao +
                ", numeroFuncao=" + numeroFuncao +
                ", dataMovimento=" + dataMovimento +
                ", codigoDoOperador=" + codigoDoOperador +
                ", horarioVenda=" + horarioVenda +
                ", cpfCnpjCliente='" + cpfCnpjCliente + '\'' +
                ", valorLiquido=" + valorLiquido +
                ", valorDesconto=" + valorDesconto +
                ", valorIcms=" + valorIcms +
                ", valorAcrescimo=" + valorAcrescimo +
                ", valorPis=" + valorPis +
                ", valorCofins=" + valorCofins +
                ", modeloDocumento=" + modeloDocumento +
                ", tipoEmissao=" + tipoEmissao +
                ", tipoAmbiente=" + tipoAmbiente +
                ", serieNFCe='" + serieNFCe + '\'' +
                ", chaveNFCeSat='" + chaveNFCeSat + '\'' +
                ", numeroDocumentoNFCeSat='" + numeroDocumentoNFCeSat + '\'' +
                ", numeroSerieEquipamentoSat='" + numeroSerieEquipamentoSat + '\'' +
                '}';
    }
}
