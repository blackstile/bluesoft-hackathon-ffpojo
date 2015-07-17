package br.com.bluesoft.beans;

import com.github.ffpojo.metadata.positional.annotation.PositionalField;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecord;

import java.sql.Date;

@PositionalRecord
public class ResumoCupomFiscal {

   /*M01AA*/ private Integer tipoRegistro;
   /*M01AB*/ private Integer IdentificacaoRegistro;
   /*M01AC*/ private Integer NumeroEquipamento;
   /*M01AD*/ private Integer numeroSequencialOperacao;
   /*M01AE*/ private Integer NumeroFuncao;
   /*M01AF*/ private Date DataMovimento;
   /*M01AG*/ private Integer TipoVenda;
   /*M01AH*/ private Integer codigoOperadorVenda;
   /*M01AI*/ private Date horarioVenda;
   /*M01AJ*/ private Integer quantidadeMercadoriasVendidas;
   /*M01AK*/ private double valorLiquidoVenda;
   /*M01AL*/ private Integer numeroDescontosEfetuados;
   /*M01AM*/ private double valorDescontosEfetuados;
   /*M01AN*/ private Integer numeroCancelamentosEfetuados;
   /*M01AO*/ private double quantidadeMercadoriasCanceladas;
   /*M01AP*/ private double valorMercadoriasCanceladas;
   /*M01AQ*/ private double quantidadeDescontosFuncionário;
   /*M01AR*/ private double valorDescontosFuncionario;
   /*M01AS*/ private Integer codigoFuncionárioRecebeuDesconto;
   /*M01AT*/ private Integer controleTipoDesconto;
   /*M01ATA*/ private Integer tipoDescontoSubtotal;
   /*M01ATB*/ private double valorDescontosItem;
   /*M01ATC01*/ private double quantidadeDescontosTipo1;
   /*M01ATC02*/ private double valorDescontosTipo1;
   /*M01ATD01*/ private double quantidadeDescontosTipo2;
   /*M01ATD02*/ private double valorDescontosTipo2;
   /*M01ATE01*/ private double quantidadeDescontosTipo3;
   /*M01ATE02*/ private double valorDescontosTipo3;
   /*M01ATF01*/ private double quantidadeDescontosTipo4;
   /*M01ATF02*/ private double valorDescontosTipo4;
   /*M01ATG01*/ private double quantidadeDescontosTipo5;
   /*M01ATG02*/ private double valorDescontosTipo5;
   /*M01ATH01*/ private double quantidadeDescontosTipo6;
   /*M01ATH02*/ private double valorDescontosTipo6;
   /*M01ATI01*/ private double quantidadeDescontosTipo7;
   /*M01ATI02*/ private double valorDescontosTipo7;
   /*M01ATJ01*/ private double quantidadeDescontosTipo8;
   /*M01ATJ02*/ private double valorDescontosTipo8;
   /*M01ATK01*/ private double quantidadeDescontosTipo9;
   /*M01ATK02*/ private double valorDescontosTipo9;
   /*M01ATL01*/ private double quantidadeDescontosTipo10;
   /*M01ATL02*/ private double valorDescontosTipo10;
   /*M01AU*/ private Date horarioTerminoVenda;
   /*M01AV*/ private Integer cdigoClienteEnvolvido;
   /*M01AW*/ private Integer codigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom;
   /*M01AX*/ private Integer NumeroCuponsPromocionaisQueClienteTeveDireito;
   /*M01AY*/ private double quantidadeCuponsAceitos;
   /*M01AZ*/ private double quantidadePontosComputados;
   /*M01BA*/ private double quantidadeCuponsGerados;
   /*M01BB*/ private Integer pontosConcedidosPeloValorVenda;
   /*M01BC*/ private Integer totalPontosConcedidosVenda;
   /*M01BD*/ private Integer segundosInicioVenda;
   /*M01BE*/ private Integer SegundosTerminoVenda;
   /*M01BF*/ private Integer numeroLoja;
   /*M01BG*/ private Integer CRO;
   /*M01BH*/ private Integer numeroGuiche;
   /*M01BI*/ private String tipoPrimeiroDocumentoGenerico21;
   /*M01BJ*/ private String conteudoPrimeiroDocumentoGenerico;
   /*M01BK*/ private String tipoSegundoDocumentoGenerico21;
   /*M01BL*/ private String conteudoSegundoDocumentoGenerico;
   /*M01BM*/ private String tipoTerceiroDocumentoGenerico21;
   /*M01BN*/ private String conteudoTerceiroDocumentoGenerico;
   /*M01BO*/ private String sequencialOperacaoRelacionada;
   /*M01BP*/ private String motivoCancelamentoCupom;
   /*M01BQ*/ private String codigoOperadorSubstituto;
   /*M01BR*/ private String somaGarantiasEstendidasVenda;
   /*M01BS*/ private String CRZ;
   /*M01BT*/ private String posicaoSubRegistro;
   /*M01BU*/ private String quantidadeTotalSubRegistros;
   /*M01BV*/ private String CpfCnpjConsumidor;
   /*M01BW*/ private String assinaturaMomentoEncerramentoCupom;
   /*M01BX*/ private String quantidadeAcrescimos;
   /*M01BY*/ private String valorAcrescimos;
   /*M01BZ*/ private String tipoConteudoCampo;
   /*M01CA*/ private String valorTotalAproximadoImpostos;
   /*M01CB*/ private String valorTotalAproximadoImpostosFederais;
   /*M01CC*/ private String valorTotalAproximadoImpostosEstaduais;
   /*M01CD*/ private String valorTotalAproximadoImpostosMunicipais;
   /*M01CE*/ private String identificacaooClienteParaEfeitoFidelizacao;

    @PositionalField(initialPosition = 1, finalPosition = 2)
    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @PositionalField(initialPosition = 3, finalPosition = 11)
    public Integer getIdentificacaoRegistro() {
        return IdentificacaoRegistro;
    }

    public void setIdentificacaoRegistro(Integer identificacaoRegistro) {
        IdentificacaoRegistro = identificacaoRegistro;
    }

    @PositionalField(initialPosition = 12, finalPosition = 15)
    public Integer getNumeroEquipamento() {
        return NumeroEquipamento;
    }

    public void setNumeroEquipamento(Integer numeroEquipamento) {
        NumeroEquipamento = numeroEquipamento;
    }

    @PositionalField(initialPosition = 16, finalPosition = 21)
    public Integer getNumeroSequencialOperacao() {
        return numeroSequencialOperacao;
    }

    public void setNumeroSequencialOperacao(Integer numeroSequencialOperacao) {
        this.numeroSequencialOperacao = numeroSequencialOperacao;
    }

    @PositionalField(initialPosition = 22, finalPosition = 25)
    public Integer getNumeroFuncao() {
        return NumeroFuncao;
    }

    public void setNumeroFuncao(Integer numeroFuncao) {
        NumeroFuncao = numeroFuncao;
    }

    @PositionalField(initialPosition = 26, finalPosition = 31)
    public Date getDataMovimento() {
        return DataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        DataMovimento = dataMovimento;
    }

    @PositionalField(initialPosition = 32, finalPosition = 32)
    public Integer getTipoVenda() {
        return TipoVenda;
    }

    public void setTipoVenda(Integer tipoVenda) {
        TipoVenda = tipoVenda;
    }

    @PositionalField(initialPosition = 33, finalPosition = 41)
    public Integer getCodigoOperadorVenda() {
        return codigoOperadorVenda;
    }

    public void setCodigoOperadorVenda(Integer codigoOperadorVenda) {
        this.codigoOperadorVenda = codigoOperadorVenda;
    }

    @PositionalField(initialPosition = 42, finalPosition = 45)
    public Date getHorarioVenda() {
        return horarioVenda;
    }

    public void setHorarioVenda(Date horarioVenda) {
        this.horarioVenda = horarioVenda;
    }

    @PositionalField(initialPosition = 46, finalPosition = 54)
    public Integer getQuantidadeMercadoriasVendidas() {
        return quantidadeMercadoriasVendidas;
    }

    public void setQuantidadeMercadoriasVendidas(Integer quantidadeMercadoriasVendidas) {
        this.quantidadeMercadoriasVendidas = quantidadeMercadoriasVendidas;
    }

    @PositionalField(initialPosition = 55, finalPosition = 66)
    public double getValorLiquidoVenda() {
        return valorLiquidoVenda;
    }

    public void setValorLiquidoVenda(double valorLiquidoVenda) {
        this.valorLiquidoVenda = valorLiquidoVenda;
    }

    @PositionalField(initialPosition = 67, finalPosition = 72)
    public Integer getNumeroDescontosEfetuados() {
        return numeroDescontosEfetuados;
    }

    public void setNumeroDescontosEfetuados(Integer numeroDescontosEfetuados) {
        this.numeroDescontosEfetuados = numeroDescontosEfetuados;
    }

    @PositionalField(initialPosition = 73, finalPosition = 84)
    public double getValorDescontosEfetuados() {
        return valorDescontosEfetuados;
    }

    public void setValorDescontosEfetuados(double valorDescontosEfetuados) {
        this.valorDescontosEfetuados = valorDescontosEfetuados;
    }

    @PositionalField(initialPosition = 85, finalPosition = 90)
    public Integer getNumeroCancelamentosEfetuados() {
        return numeroCancelamentosEfetuados;
    }

    public void setNumeroCancelamentosEfetuados(Integer numeroCancelamentosEfetuados) {
        this.numeroCancelamentosEfetuados = numeroCancelamentosEfetuados;
    }

    @PositionalField(initialPosition = 91, finalPosition = 99)
    public double getQuantidadeMercadoriasCanceladas() {
        return quantidadeMercadoriasCanceladas;
    }

    public void setQuantidadeMercadoriasCanceladas(double quantidadeMercadoriasCanceladas) {
        this.quantidadeMercadoriasCanceladas = quantidadeMercadoriasCanceladas;
    }

    @PositionalField(initialPosition = 100, finalPosition = 111)
    public double getValorMercadoriasCanceladas() {
        return valorMercadoriasCanceladas;
    }

    public void setValorMercadoriasCanceladas(double valorMercadoriasCanceladas) {
        this.valorMercadoriasCanceladas = valorMercadoriasCanceladas;
    }

    @PositionalField(initialPosition = 112, finalPosition = 117)
    public double getQuantidadeDescontosFuncionário() {
        return quantidadeDescontosFuncionário;
    }

    public void setQuantidadeDescontosFuncionário(double quantidadeDescontosFuncionário) {
        this.quantidadeDescontosFuncionário = quantidadeDescontosFuncionário;
    }

    @PositionalField(initialPosition = 118, finalPosition = 129)
    public double getValorDescontosFuncionario() {
        return valorDescontosFuncionario;
    }

    public void setValorDescontosFuncionario(double valorDescontosFuncionario) {
        this.valorDescontosFuncionario = valorDescontosFuncionario;
    }

    @PositionalField(initialPosition = 130, finalPosition = 138)
    public Integer getCodigoFuncionárioRecebeuDesconto() {
        return codigoFuncionárioRecebeuDesconto;
    }

    public void setCodigoFuncionárioRecebeuDesconto(Integer codigoFuncionárioRecebeuDesconto) {
        this.codigoFuncionárioRecebeuDesconto = codigoFuncionárioRecebeuDesconto;
    }

    @PositionalField(initialPosition = 139, finalPosition = 139)
    public Integer getTipoDescontoSubtotal() {
        return tipoDescontoSubtotal;
    }

    public void setTipoDescontoSubtotal(Integer tipoDescontoSubtotal) {
        this.tipoDescontoSubtotal = tipoDescontoSubtotal;
    }

    @PositionalField(initialPosition = 140, finalPosition = 151)
    public double getValorDescontosItem() {
        return valorDescontosItem;
    }

    public void setValorDescontosItem(double valorDescontosItem) {
        this.valorDescontosItem = valorDescontosItem;
    }

    @PositionalField(initialPosition = 152, finalPosition = 157)
    public double getQuantidadeDescontosTipo1() {
        return quantidadeDescontosTipo1;
    }

    public void setQuantidadeDescontosTipo1(double quantidadeDescontosTipo1) {
        this.quantidadeDescontosTipo1 = quantidadeDescontosTipo1;
    }

    @PositionalField(initialPosition = 158, finalPosition = 169)
    public double getValorDescontosTipo1() {
        return valorDescontosTipo1;
    }

    public void setValorDescontosTipo1(double valorDescontosTipo1) {
        this.valorDescontosTipo1 = valorDescontosTipo1;
    }

    @PositionalField(initialPosition = 170, finalPosition = 175)
    public double getQuantidadeDescontosTipo2() {
        return quantidadeDescontosTipo2;
    }

    public void setQuantidadeDescontosTipo2(double quantidadeDescontosTipo2) {
        this.quantidadeDescontosTipo2 = quantidadeDescontosTipo2;
    }

    @PositionalField(initialPosition = 176, finalPosition = 187)
    public double getValorDescontosTipo2() {
        return valorDescontosTipo2;
    }

    public void setValorDescontosTipo2(double valorDescontosTipo2) {
        this.valorDescontosTipo2 = valorDescontosTipo2;
    }

    @PositionalField(initialPosition = 188, finalPosition = 193)
    public double getQuantidadeDescontosTipo3() {
        return quantidadeDescontosTipo3;
    }

    public void setQuantidadeDescontosTipo3(double quantidadeDescontosTipo3) {
        this.quantidadeDescontosTipo3 = quantidadeDescontosTipo3;
    }

    @PositionalField(initialPosition = 194, finalPosition = 205)
    public double getValorDescontosTipo3() {
        return valorDescontosTipo3;
    }

    public void setValorDescontosTipo3(double valorDescontosTipo3) {
        this.valorDescontosTipo3 = valorDescontosTipo3;
    }

    @PositionalField(initialPosition = 206, finalPosition = 211)
    public double getQuantidadeDescontosTipo4() {
        return quantidadeDescontosTipo4;
    }

    public void setQuantidadeDescontosTipo4(double quantidadeDescontosTipo4) {
        this.quantidadeDescontosTipo4 = quantidadeDescontosTipo4;
    }

    @PositionalField(initialPosition = 212, finalPosition = 223)
    public double getValorDescontosTipo4() {
        return valorDescontosTipo4;
    }

    public void setValorDescontosTipo4(double valorDescontosTipo4) {
        this.valorDescontosTipo4 = valorDescontosTipo4;
    }

    @PositionalField(initialPosition = 224, finalPosition = 229)
    public double getQuantidadeDescontosTipo5() {
        return quantidadeDescontosTipo5;
    }

    public void setQuantidadeDescontosTipo5(double quantidadeDescontosTipo5) {
        this.quantidadeDescontosTipo5 = quantidadeDescontosTipo5;
    }

    @PositionalField(initialPosition = 230, finalPosition = 241)
    public double getValorDescontosTipo5() {
        return valorDescontosTipo5;
    }

    public void setValorDescontosTipo5(double valorDescontosTipo5) {
        this.valorDescontosTipo5 = valorDescontosTipo5;
    }

    @PositionalField(initialPosition = 242, finalPosition = 247)
    public double getQuantidadeDescontosTipo6() {
        return quantidadeDescontosTipo6;
    }

    public void setQuantidadeDescontosTipo6(double quantidadeDescontosTipo6) {
        this.quantidadeDescontosTipo6 = quantidadeDescontosTipo6;
    }

    @PositionalField(initialPosition = 248, finalPosition = 259)
    public double getValorDescontosTipo6() {
        return valorDescontosTipo6;
    }

    public void setValorDescontosTipo6(double valorDescontosTipo6) {
        this.valorDescontosTipo6 = valorDescontosTipo6;
    }

    @PositionalField(initialPosition = 260, finalPosition = 265)
    public double getQuantidadeDescontosTipo7() {
        return quantidadeDescontosTipo7;
    }

    public void setQuantidadeDescontosTipo7(double quantidadeDescontosTipo7) {
        this.quantidadeDescontosTipo7 = quantidadeDescontosTipo7;
    }

    @PositionalField(initialPosition = 266, finalPosition = 277)
    public double getValorDescontosTipo7() {
        return valorDescontosTipo7;
    }

    public void setValorDescontosTipo7(double valorDescontosTipo7) {
        this.valorDescontosTipo7 = valorDescontosTipo7;
    }

    @PositionalField(initialPosition = 278, finalPosition = 283)
    public double getQuantidadeDescontosTipo8() {
        return quantidadeDescontosTipo8;
    }

    public void setQuantidadeDescontosTipo8(double quantidadeDescontosTipo8) {
        this.quantidadeDescontosTipo8 = quantidadeDescontosTipo8;
    }

    @PositionalField(initialPosition = 284, finalPosition = 295)
    public double getValorDescontosTipo8() {
        return valorDescontosTipo8;
    }

    public void setValorDescontosTipo8(double valorDescontosTipo8) {
        this.valorDescontosTipo8 = valorDescontosTipo8;
    }

    @PositionalField(initialPosition = 296, finalPosition = 301)
    public double getQuantidadeDescontosTipo9() {
        return quantidadeDescontosTipo9;
    }

    public void setQuantidadeDescontosTipo9(double quantidadeDescontosTipo9) {
        this.quantidadeDescontosTipo9 = quantidadeDescontosTipo9;
    }

    @PositionalField(initialPosition = 302, finalPosition = 313)
    public double getValorDescontosTipo9() {
        return valorDescontosTipo9;
    }

    public void setValorDescontosTipo9(double valorDescontosTipo9) {
        this.valorDescontosTipo9 = valorDescontosTipo9;
    }

    @PositionalField(initialPosition = 314, finalPosition = 319)
    public double getQuantidadeDescontosTipo10() {
        return quantidadeDescontosTipo10;
    }

    public void setQuantidadeDescontosTipo10(double quantidadeDescontosTipo10) {
        this.quantidadeDescontosTipo10 = quantidadeDescontosTipo10;
    }

    @PositionalField(initialPosition = 320, finalPosition = 331)
    public double getValorDescontosTipo10() {
        return valorDescontosTipo10;
    }

    public void setValorDescontosTipo10(double valorDescontosTipo10) {
        this.valorDescontosTipo10 = valorDescontosTipo10;
    }

    @PositionalField(initialPosition = 332, finalPosition = 335)
    public Date getHorarioTerminoVenda() {
        return horarioTerminoVenda;
    }

    public void setHorarioTerminoVenda(Date horarioTerminoVenda) {
        this.horarioTerminoVenda = horarioTerminoVenda;
    }

    @PositionalField(initialPosition = 336, finalPosition = 351)
    public Integer getCdigoClienteEnvolvido() {
        return cdigoClienteEnvolvido;
    }

    public void setCdigoClienteEnvolvido(Integer cdigoClienteEnvolvido) {
        this.cdigoClienteEnvolvido = cdigoClienteEnvolvido;
    }

    @PositionalField(initialPosition = 352, finalPosition = 360)
    public Integer getCodigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom() {
        return codigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom;
    }

    public void setCodigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom(Integer codigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom) {
        this.codigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom = codigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom;
    }

    @PositionalField(initialPosition = 361, finalPosition = 366)
    public Integer getNumeroCuponsPromocionaisQueClienteTeveDireito() {
        return NumeroCuponsPromocionaisQueClienteTeveDireito;
    }

    public void setNumeroCuponsPromocionaisQueClienteTeveDireito(Integer numeroCuponsPromocionaisQueClienteTeveDireito) {
        NumeroCuponsPromocionaisQueClienteTeveDireito = numeroCuponsPromocionaisQueClienteTeveDireito;
    }

    @PositionalField(initialPosition = 367, finalPosition = 372)
    public double getQuantidadeCuponsAceitos() {
        return quantidadeCuponsAceitos;
    }

    public void setQuantidadeCuponsAceitos(double quantidadeCuponsAceitos) {
        this.quantidadeCuponsAceitos = quantidadeCuponsAceitos;
    }

    @PositionalField(initialPosition = 373, finalPosition = 378)
    public double getQuantidadePontosComputados() {
        return quantidadePontosComputados;
    }

    public void setQuantidadePontosComputados(double quantidadePontosComputados) {
        this.quantidadePontosComputados = quantidadePontosComputados;
    }

    @PositionalField(initialPosition = 379, finalPosition = 384)
    public double getQuantidadeCuponsGerados() {
        return quantidadeCuponsGerados;
    }

    public void setQuantidadeCuponsGerados(double quantidadeCuponsGerados) {
        this.quantidadeCuponsGerados = quantidadeCuponsGerados;
    }

    @PositionalField(initialPosition = 385, finalPosition = 393)
    public Integer getPontosConcedidosPeloValorVenda() {
        return pontosConcedidosPeloValorVenda;
    }

    public void setPontosConcedidosPeloValorVenda(Integer pontosConcedidosPeloValorVenda) {
        this.pontosConcedidosPeloValorVenda = pontosConcedidosPeloValorVenda;
    }

    @PositionalField(initialPosition = 394, finalPosition = 402)
    public Integer getTotalPontosConcedidosVenda() {
        return totalPontosConcedidosVenda;
    }

    public void setTotalPontosConcedidosVenda(Integer totalPontosConcedidosVenda) {
        this.totalPontosConcedidosVenda = totalPontosConcedidosVenda;
    }

    @PositionalField(initialPosition = 403, finalPosition = 404)
    public Integer getSegundosInicioVenda() {
        return segundosInicioVenda;
    }

    public void setSegundosInicioVenda(Integer segundosInicioVenda) {
        this.segundosInicioVenda = segundosInicioVenda;
    }

    @PositionalField(initialPosition = 405, finalPosition = 406)
    public Integer getSegundosTerminoVenda() {
        return SegundosTerminoVenda;
    }

    public void setSegundosTerminoVenda(Integer segundosTerminoVenda) {
        SegundosTerminoVenda = segundosTerminoVenda;
    }

    @PositionalField(initialPosition = 407, finalPosition = 410)
    public Integer getNumeroLoja() {
        return numeroLoja;
    }

    public void setNumeroLoja(Integer numeroLoja) {
        this.numeroLoja = numeroLoja;
    }

    @PositionalField(initialPosition = 411, finalPosition = 414)
    public Integer getCRO() {
        return CRO;
    }

    public void setCRO(Integer CRO) {
        this.CRO = CRO;
    }

    @PositionalField(initialPosition = 415, finalPosition = 417)
    public Integer getNumeroGuiche() {
        return numeroGuiche;
    }

    public void setNumeroGuiche(Integer numeroGuiche) {
        this.numeroGuiche = numeroGuiche;
    }

    @PositionalField(initialPosition = 418, finalPosition = 421)
    public String getTipoPrimeiroDocumentoGenerico21() {
        return tipoPrimeiroDocumentoGenerico21;
    }

    public void setTipoPrimeiroDocumentoGenerico21(String tipoPrimeiroDocumentoGenerico21) {
        this.tipoPrimeiroDocumentoGenerico21 = tipoPrimeiroDocumentoGenerico21;
    }

    @PositionalField(initialPosition = 422, finalPosition = 440)
    public String getConteudoPrimeiroDocumentoGenerico() {
        return conteudoPrimeiroDocumentoGenerico;
    }

    public void setConteudoPrimeiroDocumentoGenerico(String conteudoPrimeiroDocumentoGenerico) {
        this.conteudoPrimeiroDocumentoGenerico = conteudoPrimeiroDocumentoGenerico;
    }

    @PositionalField(initialPosition = 441, finalPosition = 444)
    public String getTipoSegundoDocumentoGenerico21() {
        return tipoSegundoDocumentoGenerico21;
    }

    public void setTipoSegundoDocumentoGenerico21(String tipoSegundoDocumentoGenerico21) {
        this.tipoSegundoDocumentoGenerico21 = tipoSegundoDocumentoGenerico21;
    }

    @PositionalField(initialPosition = 445, finalPosition = 463)
    public String getConteudoSegundoDocumentoGenerico() {
        return conteudoSegundoDocumentoGenerico;
    }

    public void setConteudoSegundoDocumentoGenerico(String conteudoSegundoDocumentoGenerico) {
        this.conteudoSegundoDocumentoGenerico = conteudoSegundoDocumentoGenerico;
    }

    @PositionalField(initialPosition = 464, finalPosition = 467)
    public String getTipoTerceiroDocumentoGenerico21() {
        return tipoTerceiroDocumentoGenerico21;
    }

    public void setTipoTerceiroDocumentoGenerico21(String tipoTerceiroDocumentoGenerico21) {
        this.tipoTerceiroDocumentoGenerico21 = tipoTerceiroDocumentoGenerico21;
    }

    @PositionalField(initialPosition = 468, finalPosition = 486)
    public String getConteudoTerceiroDocumentoGenerico() {
        return conteudoTerceiroDocumentoGenerico;
    }

    public void setConteudoTerceiroDocumentoGenerico(String conteudoTerceiroDocumentoGenerico) {
        this.conteudoTerceiroDocumentoGenerico = conteudoTerceiroDocumentoGenerico;
    }

    @PositionalField(initialPosition = 487, finalPosition = 492)
    public String getSequencialOperacaoRelacionada() {
        return sequencialOperacaoRelacionada;
    }

    public void setSequencialOperacaoRelacionada(String sequencialOperacaoRelacionada) {
        this.sequencialOperacaoRelacionada = sequencialOperacaoRelacionada;
    }

    @PositionalField(initialPosition = 493, finalPosition = 496)
    public String getMotivoCancelamentoCupom() {
        return motivoCancelamentoCupom;
    }

    public void setMotivoCancelamentoCupom(String motivoCancelamentoCupom) {
        this.motivoCancelamentoCupom = motivoCancelamentoCupom;
    }

    @PositionalField(initialPosition = 497, finalPosition = 505)
    public String getCodigoOperadorSubstituto() {
        return codigoOperadorSubstituto;
    }

    public void setCodigoOperadorSubstituto(String codigoOperadorSubstituto) {
        this.codigoOperadorSubstituto = codigoOperadorSubstituto;
    }

    @PositionalField(initialPosition = 506, finalPosition = 517)
    public String getSomaGarantiasEstendidasVenda() {
        return somaGarantiasEstendidasVenda;
    }

    public void setSomaGarantiasEstendidasVenda(String somaGarantiasEstendidasVenda) {
        this.somaGarantiasEstendidasVenda = somaGarantiasEstendidasVenda;
    }

    @PositionalField(initialPosition = 518, finalPosition = 522)
    public String getCRZ() {
        return CRZ;
    }

    public void setCRZ(String CRZ) {
        this.CRZ = CRZ;
    }

    @PositionalField(initialPosition = 523, finalPosition = 526)
    public String getPosicaoSubRegistro() {
        return posicaoSubRegistro;
    }

    public void setPosicaoSubRegistro(String posicaoSubRegistro) {
        this.posicaoSubRegistro = posicaoSubRegistro;
    }

    @PositionalField(initialPosition = 527, finalPosition = 530)
    public String getQuantidadeTotalSubRegistros() {
        return quantidadeTotalSubRegistros;
    }

    public void setQuantidadeTotalSubRegistros(String quantidadeTotalSubRegistros) {
        this.quantidadeTotalSubRegistros = quantidadeTotalSubRegistros;
    }

    @PositionalField(initialPosition = 531, finalPosition = 545)
    public String getCpfCnpjConsumidor() {
        return CpfCnpjConsumidor;
    }

    public void setCpfCnpjConsumidor(String cpfCnpjConsumidor) {
        CpfCnpjConsumidor = cpfCnpjConsumidor;
    }

    @PositionalField(initialPosition = 546, finalPosition = 550)
    public String getAssinaturaMomentoEncerramentoCupom() {
        return assinaturaMomentoEncerramentoCupom;
    }

    public void setAssinaturaMomentoEncerramentoCupom(String assinaturaMomentoEncerramentoCupom) {
        this.assinaturaMomentoEncerramentoCupom = assinaturaMomentoEncerramentoCupom;
    }

    @PositionalField(initialPosition = 551, finalPosition = 556)
    public String getQuantidadeAcrescimos() {
        return quantidadeAcrescimos;
    }

    public void setQuantidadeAcrescimos(String quantidadeAcrescimos) {
        this.quantidadeAcrescimos = quantidadeAcrescimos;
    }

    @PositionalField(initialPosition = 557, finalPosition = 568)
    public String getValorAcrescimos() {
        return valorAcrescimos;
    }

    public void setValorAcrescimos(String valorAcrescimos) {
        this.valorAcrescimos = valorAcrescimos;
    }

    @PositionalField(initialPosition = 569, finalPosition = 569)
    public String getTipoConteudoCampo() {
        return tipoConteudoCampo;
    }

    public void setTipoConteudoCampo(String tipoConteudoCampo) {
        this.tipoConteudoCampo = tipoConteudoCampo;
    }

    @PositionalField(initialPosition = 570, finalPosition = 581)
    public String getValorTotalAproximadoImpostos() {
        return valorTotalAproximadoImpostos;
    }

    public void setValorTotalAproximadoImpostos(String valorTotalAproximadoImpostos) {
        this.valorTotalAproximadoImpostos = valorTotalAproximadoImpostos;
    }

    @PositionalField(initialPosition = 582, finalPosition = 593)
    public String getValorTotalAproximadoImpostosFederais() {
        return valorTotalAproximadoImpostosFederais;
    }

    public void setValorTotalAproximadoImpostosFederais(String valorTotalAproximadoImpostosFederais) {
        this.valorTotalAproximadoImpostosFederais = valorTotalAproximadoImpostosFederais;
    }

    @PositionalField(initialPosition = 594, finalPosition = 605)
    public String getValorTotalAproximadoImpostosEstaduais() {
        return valorTotalAproximadoImpostosEstaduais;
    }

    public void setValorTotalAproximadoImpostosEstaduais(String valorTotalAproximadoImpostosEstaduais) {
        this.valorTotalAproximadoImpostosEstaduais = valorTotalAproximadoImpostosEstaduais;
    }

    @PositionalField(initialPosition = 606, finalPosition = 617)
    public String getValorTotalAproximadoImpostosMunicipais() {
        return valorTotalAproximadoImpostosMunicipais;
    }

    public void setValorTotalAproximadoImpostosMunicipais(String valorTotalAproximadoImpostosMunicipais) {
        this.valorTotalAproximadoImpostosMunicipais = valorTotalAproximadoImpostosMunicipais;
    }

    @PositionalField(initialPosition = 618, finalPosition = 636)
    public String getIdentificacaooClienteParaEfeitoFidelizacao() {
        return identificacaooClienteParaEfeitoFidelizacao;
    }

    public void setIdentificacaooClienteParaEfeitoFidelizacao(String identificacaooClienteParaEfeitoFidelizacao) {
        this.identificacaooClienteParaEfeitoFidelizacao = identificacaooClienteParaEfeitoFidelizacao;
    }
}
