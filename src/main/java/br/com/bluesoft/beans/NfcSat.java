package br.com.bluesoft.beans;


import br.com.bluesoft.decorator.DateDecorator;
import br.com.bluesoft.decorator.IntegerDecorator;
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
    private Date horarioMovimentacao;
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
    @PositionalField(initialPosition = 12, finalPosition = 15)
    public Integer getNumeroEquipamento() {
        return numeroEquipamento;
    }

    //4	Número seqüencial da operação (COO)	16	6		Numero do cupom de venda
    @PositionalField(initialPosition = 16, finalPosition = 21, decorator = IntegerDecorator.class)
    public Integer getNumeroSequencialOperacao() {
        return numeroSequencialOperacao;
    }

    //5	Número da função	22	4		1 - Autorizacao, 2 - Cancelamento, 3 - Inutilizacao
    @PositionalField(initialPosition = 22, finalPosition = 25, decorator = IntegerDecorator.class)
    public Integer getNumeroFuncao() {
        return numeroFuncao;
    }

//    6	Data do movimento (DDMMAA)	26	6
    @PositionalField(initialPosition = 26, finalPosition = 31, decorator = DateDecorator.class)
    public Date getDataMovimento() {
        return dataMovimento;
    }

    public Integer getCodigoDoOperador() {
        return codigoDoOperador;
    }

    public Date getHorarioMovimentacao() {
        return horarioMovimentacao;
    }

    public Date getHorarioVenda() {
        return horarioVenda;
    }

    public String getCpfCnpjCliente() {
        return cpfCnpjCliente;
    }

    public BigDecimal getValorLiquido() {
        return valorLiquido;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public BigDecimal getValorIcms() {
        return valorIcms;
    }

    public BigDecimal getValorAcrescimo() {
        return valorAcrescimo;
    }

    public BigDecimal getValorPis() {
        return valorPis;
    }

    public BigDecimal getValorCofins() {
        return valorCofins;
    }

    public Integer getModeloDocumento() {
        return modeloDocumento;
    }

    public Integer getTipoEmissao() {
        return tipoEmissao;
    }

    public Integer getTipoAmbiente() {
        return tipoAmbiente;
    }

    public String getSerieNFCe() {
        return serieNFCe;
    }

    public String getChaveNFCeSat() {
        return chaveNFCeSat;
    }

    public String getNumeroDocumentoNFCeSat() {
        return numeroDocumentoNFCeSat;
    }

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
    public void setNumeroEquipamento(String numeroEquipamento) {
        this.numeroEquipamento = Integer.valueOf(numeroEquipamento);
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

    public void setHorarioMovimentacao(Date horarioMovimentacao) {
        this.horarioMovimentacao = horarioMovimentacao;
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
                ", horarioMovimentacao=" + horarioMovimentacao +
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
