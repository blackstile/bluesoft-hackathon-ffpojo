package br.com.bluesoft.beans;


import br.com.bluesoft.decorator.DateDecorator;
import br.com.bluesoft.decorator.TimeDecorator;
import com.github.ffpojo.metadata.positional.PaddingAlign;
import com.github.ffpojo.metadata.positional.annotation.PositionalField;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecord;

import java.util.Date;

@PositionalRecord
public class ResumoCupomFiscal {

   /*M01AA*/ private String tipoRegistro;
   /*M01AB*/ private String IdentificacaoRegistro;
   /*M01AC*/ private String NumeroEquipamento;
   /*M01AD*/ private String numeroSequencialOperacao;
   /*M01AE*/ private String NumeroFuncao;
   /*M01AF*/ private Date DataMovimento;
   /*M01AG*/ private String TipoVenda;
   /*M01AH*/ private String codigoOperadorVenda;
   /*M01AI*/ private Date horarioVenda;
   /*M01AJ*/ private String quantidadeMercadoriasVendidas;
   /*M01AK*/ private String valorLiquidoVenda;
   /*M01AL*/ private String numeroDescontosEfetuados;
   /*M01AM*/ private String valorDescontosEfetuados;
   /*M01AN*/ private String numeroCancelamentosEfetuados;
   /*M01AO*/ private String quantidadeMercadoriasCanceladas;
   /*M01AP*/ private String valorMercadoriasCanceladas;
   /*M01AQ*/ private String quantidadeDescontosFuncionário;
   /*M01AR*/ private String valorDescontosFuncionario;
   /*M01AS*/ private String codigoFuncionárioRecebeuDesconto;
   /*M01AT*/ private String controleTipoDesconto;
   /*M01ATA*/ private String tipoDescontoSubtotal;
   /*M01ATB*/ private String valorDescontosItem;
   /*M01ATC01*/ private String quantidadeDescontosTipo1;
   /*M01ATC02*/ private String valorDescontosTipo1;
   /*M01ATD01*/ private String quantidadeDescontosTipo2;
   /*M01ATD02*/ private String valorDescontosTipo2;
   /*M01ATE01*/ private String quantidadeDescontosTipo3;
   /*M01ATE02*/ private String valorDescontosTipo3;
   /*M01ATF01*/ private String quantidadeDescontosTipo4;
   /*M01ATF02*/ private String valorDescontosTipo4;
   /*M01ATG01*/ private String quantidadeDescontosTipo5;
   /*M01ATG02*/ private String valorDescontosTipo5;
   /*M01ATH01*/ private String quantidadeDescontosTipo6;
   /*M01ATH02*/ private String valorDescontosTipo6;
   /*M01ATI01*/ private String quantidadeDescontosTipo7;
   /*M01ATI02*/ private String valorDescontosTipo7;
   /*M01ATJ01*/ private String quantidadeDescontosTipo8;
   /*M01ATJ02*/ private String valorDescontosTipo8;
   /*M01ATK01*/ private String quantidadeDescontosTipo9;
   /*M01ATK02*/ private String valorDescontosTipo9;
   /*M01ATL01*/ private String quantidadeDescontosTipo10;
   /*M01ATL02*/ private String valorDescontosTipo10;
   /*M01AU*/ private Date horarioTerminoVenda;
   /*M01AV*/ private String cdigoClienteEnvolvido;
   /*M01AW*/ private String codigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom;
   /*M01AX*/ private String NumeroCuponsPromocionaisQueClienteTeveDireito;
   /*M01AY*/ private String quantidadeCuponsAceitos;
   /*M01AZ*/ private String quantidadePontosComputados;
   /*M01BA*/ private String quantidadeCuponsGerados;
   /*M01BB*/ private String pontosConcedidosPeloValorVenda;
   /*M01BC*/ private String totalPontosConcedidosVenda;
   /*M01BD*/ private String segundosInicioVenda;
   /*M01BE*/ private String SegundosTerminoVenda;
   /*M01BF*/ private String numeroLoja;
   /*M01BG*/ private String CRO;
   /*M01BH*/ private String numeroGuiche;
   /*M01BI*/ private String tipoPrimeiroDocumentoGenerico21;
   /*M01BJ*/ private String conteudoPrimeiroDocumentoGenerico;
   /*M01BK*/ private String tipoSegundoDocumentoGenerico21;
   /*M01BL*/ private String conteudoSegundoDocumentoGenerico;
   /*M01BM*/ private String tipoTerceiroDocumentoGenerico21;
   /*M01BN*/ private String conteudoTerceiroDocumentoGenerico;
//   /*M01BO*/ private String sequencialOperacaoRelacionada;
//   /*M01BP*/ private String motivoCancelamentoCupom;
//   /*M01BQ*/ private String codigoOperadorSubstituto;
//   /*M01BR*/ private String somaGarantiasEstendidasVenda;
//   /*M01BS*/ private String CRZ;
//   /*M01BT*/ private String posicaoSubRegistro;
//   /*M01BU*/ private String quantidadeTotalSubRegistros;
//   /*M01BV*/ private String CpfCnpjConsumidor;
//   /*M01BW*/ private String assinaturaMomentoEncerramentoCupom;
//   /*M01BX*/ private String quantidadeAcrescimos;
//   /*M01BY*/ private String valorAcrescimos;
//   /*M01BZ*/ private String tipoConteudoCampo;
//   /*M01CA*/ private String valorTotalAproximadoImpostos;
//   /*M01CB*/ private String valorTotalAproximadoImpostosFederais;
//   /*M01CC*/ private String valorTotalAproximadoImpostosEstaduais;
//   /*M01CD*/ private String valorTotalAproximadoImpostosMunicipais;
//   /*M01CE*/ private String identificacaooClienteParaEfeitoFidelizacao;

    @PositionalField(initialPosition = 1, finalPosition = 2)
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @PositionalField(initialPosition = 3, finalPosition = 11)
    public String getIdentificacaoRegistro() {
        return IdentificacaoRegistro;
    }

    public void setIdentificacaoRegistro(String identificacaoRegistro) {
        IdentificacaoRegistro = identificacaoRegistro;
    }

    @PositionalField(initialPosition = 12, finalPosition = 15)
    public String getNumeroEquipamento() {
        return NumeroEquipamento;
    }

    public void setNumeroEquipamento(String numeroEquipamento) {
        NumeroEquipamento = numeroEquipamento;
    }

    @PositionalField(initialPosition = 16, finalPosition = 21)
    public String getNumeroSequencialOperacao() {
        return numeroSequencialOperacao;
    }

    public void setNumeroSequencialOperacao(String numeroSequencialOperacao) {
        this.numeroSequencialOperacao = numeroSequencialOperacao;
    }

    @PositionalField(initialPosition = 22, finalPosition = 25)
    public String getNumeroFuncao() {
        return NumeroFuncao;
    }

    public void setNumeroFuncao(String numeroFuncao) {
        NumeroFuncao = numeroFuncao;
    }

    @PositionalField(initialPosition = 26, finalPosition = 31, decorator = DateDecorator.class)
    public Date getDataMovimento() {
        return DataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        DataMovimento = dataMovimento;
    }

    @PositionalField(initialPosition = 32, finalPosition = 32)
    public String getTipoVenda() {
        return TipoVenda;
    }

    public void setTipoVenda(String tipoVenda) {
        TipoVenda = tipoVenda;
    }

    @PositionalField(initialPosition = 33, finalPosition = 41)
    public String getCodigoOperadorVenda() {
        return codigoOperadorVenda;
    }

    public void setCodigoOperadorVenda(String codigoOperadorVenda) {
        this.codigoOperadorVenda = codigoOperadorVenda;
    }

    @PositionalField(initialPosition = 42, finalPosition = 45, decorator =  TimeDecorator.class)
    public Date getHorarioVenda() {
        return horarioVenda;
    }

    public void setHorarioVenda(Date horarioVenda) {
        this.horarioVenda = horarioVenda;
    }

    @PositionalField(initialPosition = 46, finalPosition = 54)
    public String getQuantidadeMercadoriasVendidas() {
        return quantidadeMercadoriasVendidas;
    }

    public void setQuantidadeMercadoriasVendidas(String quantidadeMercadoriasVendidas) {
        this.quantidadeMercadoriasVendidas = quantidadeMercadoriasVendidas;
    }

    @PositionalField(initialPosition = 55, finalPosition = 66)
    public String getValorLiquidoVenda() {
        return valorLiquidoVenda;
    }

    public void setValorLiquidoVenda(String valorLiquidoVenda) {
        this.valorLiquidoVenda = valorLiquidoVenda;
    }

    @PositionalField(initialPosition = 67, finalPosition = 72)
    public String getNumeroDescontosEfetuados() {
        return numeroDescontosEfetuados;
    }

    public void setNumeroDescontosEfetuados(String numeroDescontosEfetuados) {
        this.numeroDescontosEfetuados = numeroDescontosEfetuados;
    }

    @PositionalField(initialPosition = 73, finalPosition = 84)
    public String getValorDescontosEfetuados() {
        return valorDescontosEfetuados;
    }

    public void setValorDescontosEfetuados(String valorDescontosEfetuados) {
        this.valorDescontosEfetuados = valorDescontosEfetuados;
    }

    @PositionalField(initialPosition = 85, finalPosition = 90)
    public String getNumeroCancelamentosEfetuados() {
        return numeroCancelamentosEfetuados;
    }

    public void setNumeroCancelamentosEfetuados(String numeroCancelamentosEfetuados) {
        this.numeroCancelamentosEfetuados = numeroCancelamentosEfetuados;
    }

    @PositionalField(initialPosition = 91, finalPosition = 99)
    public String getQuantidadeMercadoriasCanceladas() {
        return quantidadeMercadoriasCanceladas;
    }

    public void setQuantidadeMercadoriasCanceladas(String quantidadeMercadoriasCanceladas) {
        this.quantidadeMercadoriasCanceladas = quantidadeMercadoriasCanceladas;
    }

    @PositionalField(initialPosition = 100, finalPosition = 111)
    public String getValorMercadoriasCanceladas() {
        return valorMercadoriasCanceladas;
    }

    public void setValorMercadoriasCanceladas(String valorMercadoriasCanceladas) {
        this.valorMercadoriasCanceladas = valorMercadoriasCanceladas;
    }

    @PositionalField(initialPosition = 112, finalPosition = 117)
    public String getQuantidadeDescontosFuncionário() {
        return quantidadeDescontosFuncionário;
    }

    public void setQuantidadeDescontosFuncionário(String quantidadeDescontosFuncionário) {
        this.quantidadeDescontosFuncionário = quantidadeDescontosFuncionário;
    }

    @PositionalField(initialPosition = 118, finalPosition = 129)
    public String getValorDescontosFuncionario() {
        return valorDescontosFuncionario;
    }

    public void setValorDescontosFuncionario(String valorDescontosFuncionario) {
        this.valorDescontosFuncionario = valorDescontosFuncionario;
    }

    @PositionalField(initialPosition = 130, finalPosition = 138)
    public String getCodigoFuncionárioRecebeuDesconto() {
        return codigoFuncionárioRecebeuDesconto;
    }

    public void setCodigoFuncionárioRecebeuDesconto(String codigoFuncionárioRecebeuDesconto) {
        this.codigoFuncionárioRecebeuDesconto = codigoFuncionárioRecebeuDesconto;
    }

    @PositionalField(initialPosition = 139, finalPosition = 139)
    public String getTipoDescontoSubtotal() {
        return tipoDescontoSubtotal;
    }

    public void setTipoDescontoSubtotal(String tipoDescontoSubtotal) {
        this.tipoDescontoSubtotal = tipoDescontoSubtotal;
    }

    @PositionalField(initialPosition = 140, finalPosition = 151)
    public String getValorDescontosItem() {
        return valorDescontosItem;
    }

    public void setValorDescontosItem(String valorDescontosItem) {
        this.valorDescontosItem = valorDescontosItem;
    }

    @PositionalField(initialPosition = 152, finalPosition = 157)
    public String getQuantidadeDescontosTipo1() {
        return quantidadeDescontosTipo1;
    }

    public void setQuantidadeDescontosTipo1(String quantidadeDescontosTipo1) {
        this.quantidadeDescontosTipo1 = quantidadeDescontosTipo1;
    }

    @PositionalField(initialPosition = 158, finalPosition = 169)
    public String getValorDescontosTipo1() {
        return valorDescontosTipo1;
    }

    public void setValorDescontosTipo1(String valorDescontosTipo1) {
        this.valorDescontosTipo1 = valorDescontosTipo1;
    }

    @PositionalField(initialPosition = 170, finalPosition = 175)
    public String getQuantidadeDescontosTipo2() {
        return quantidadeDescontosTipo2;
    }

    public void setQuantidadeDescontosTipo2(String quantidadeDescontosTipo2) {
        this.quantidadeDescontosTipo2 = quantidadeDescontosTipo2;
    }

    @PositionalField(initialPosition = 176, finalPosition = 187)
    public String getValorDescontosTipo2() {
        return valorDescontosTipo2;
    }

    public void setValorDescontosTipo2(String valorDescontosTipo2) {
        this.valorDescontosTipo2 = valorDescontosTipo2;
    }

    @PositionalField(initialPosition = 188, finalPosition = 193)
    public String getQuantidadeDescontosTipo3() {
        return quantidadeDescontosTipo3;
    }

    public void setQuantidadeDescontosTipo3(String quantidadeDescontosTipo3) {
        this.quantidadeDescontosTipo3 = quantidadeDescontosTipo3;
    }

    @PositionalField(initialPosition = 194, finalPosition = 205)
    public String getValorDescontosTipo3() {
        return valorDescontosTipo3;
    }

    public void setValorDescontosTipo3(String valorDescontosTipo3) {
        this.valorDescontosTipo3 = valorDescontosTipo3;
    }

    @PositionalField(initialPosition = 206, finalPosition = 211)
    public String getQuantidadeDescontosTipo4() {
        return quantidadeDescontosTipo4;
    }

    public void setQuantidadeDescontosTipo4(String quantidadeDescontosTipo4) {
        this.quantidadeDescontosTipo4 = quantidadeDescontosTipo4;
    }

    @PositionalField(initialPosition = 212, finalPosition = 223)
    public String getValorDescontosTipo4() {
        return valorDescontosTipo4;
    }

    public void setValorDescontosTipo4(String valorDescontosTipo4) {
        this.valorDescontosTipo4 = valorDescontosTipo4;
    }

    @PositionalField(initialPosition = 224, finalPosition = 229)
    public String getQuantidadeDescontosTipo5() {
        return quantidadeDescontosTipo5;
    }

    public void setQuantidadeDescontosTipo5(String quantidadeDescontosTipo5) {
        this.quantidadeDescontosTipo5 = quantidadeDescontosTipo5;
    }

    @PositionalField(initialPosition = 230, finalPosition = 241)
    public String getValorDescontosTipo5() {
        return valorDescontosTipo5;
    }

    public void setValorDescontosTipo5(String valorDescontosTipo5) {
        this.valorDescontosTipo5 = valorDescontosTipo5;
    }

    @PositionalField(initialPosition = 242, finalPosition = 247)
    public String getQuantidadeDescontosTipo6() {
        return quantidadeDescontosTipo6;
    }

    public void setQuantidadeDescontosTipo6(String quantidadeDescontosTipo6) {
        this.quantidadeDescontosTipo6 = quantidadeDescontosTipo6;
    }

    @PositionalField(initialPosition = 248, finalPosition = 259)
    public String getValorDescontosTipo6() {
        return valorDescontosTipo6;
    }

    public void setValorDescontosTipo6(String valorDescontosTipo6) {
        this.valorDescontosTipo6 = valorDescontosTipo6;
    }

    @PositionalField(initialPosition = 260, finalPosition = 265)
    public String getQuantidadeDescontosTipo7() {
        return quantidadeDescontosTipo7;
    }

    public void setQuantidadeDescontosTipo7(String quantidadeDescontosTipo7) {
        this.quantidadeDescontosTipo7 = quantidadeDescontosTipo7;
    }

    @PositionalField(initialPosition = 266, finalPosition = 277)
    public String getValorDescontosTipo7() {
        return valorDescontosTipo7;
    }

    public void setValorDescontosTipo7(String valorDescontosTipo7) {
        this.valorDescontosTipo7 = valorDescontosTipo7;
    }

    @PositionalField(initialPosition = 278, finalPosition = 283)
    public String getQuantidadeDescontosTipo8() {
        return quantidadeDescontosTipo8;
    }

    public void setQuantidadeDescontosTipo8(String quantidadeDescontosTipo8) {
        this.quantidadeDescontosTipo8 = quantidadeDescontosTipo8;
    }

    @PositionalField(initialPosition = 284, finalPosition = 295)
    public String getValorDescontosTipo8() {
        return valorDescontosTipo8;
    }

    public void setValorDescontosTipo8(String valorDescontosTipo8) {
        this.valorDescontosTipo8 = valorDescontosTipo8;
    }

    @PositionalField(initialPosition = 296, finalPosition = 301)
    public String getQuantidadeDescontosTipo9() {
        return quantidadeDescontosTipo9;
    }

    public void setQuantidadeDescontosTipo9(String quantidadeDescontosTipo9) {
        this.quantidadeDescontosTipo9 = quantidadeDescontosTipo9;
    }

    @PositionalField(initialPosition = 302, finalPosition = 313)
    public String getValorDescontosTipo9() {
        return valorDescontosTipo9;
    }

    public void setValorDescontosTipo9(String valorDescontosTipo9) {
        this.valorDescontosTipo9 = valorDescontosTipo9;
    }

    @PositionalField(initialPosition = 314, finalPosition = 319)
    public String getQuantidadeDescontosTipo10() {
        return quantidadeDescontosTipo10;
    }

    public void setQuantidadeDescontosTipo10(String quantidadeDescontosTipo10) {
        this.quantidadeDescontosTipo10 = quantidadeDescontosTipo10;
    }

    @PositionalField(initialPosition = 320, finalPosition = 331)
    public String getValorDescontosTipo10() {
        return valorDescontosTipo10;
    }

    public void setValorDescontosTipo10(String valorDescontosTipo10) {
        this.valorDescontosTipo10 = valorDescontosTipo10;
    }

    @PositionalField(initialPosition = 332, finalPosition = 335, decorator = TimeDecorator.class)
    public Date getHorarioTerminoVenda() {
        return horarioTerminoVenda;
    }

    public void setHorarioTerminoVenda(Date horarioTerminoVenda) {
        this.horarioTerminoVenda = horarioTerminoVenda;
    }

    @PositionalField(initialPosition = 336, finalPosition = 351, paddingAlign = PaddingAlign.RIGHT)
    public String getCdigoClienteEnvolvido() {
        return cdigoClienteEnvolvido;
    }

    public void setCdigoClienteEnvolvido(String cdigoClienteEnvolvido) {
        this.cdigoClienteEnvolvido = cdigoClienteEnvolvido;
    }

    @PositionalField(initialPosition = 352, finalPosition = 360)
    public String getCodigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom() {
        return codigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom;
    }

    public void setCodigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom(String codigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom) {
        this.codigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom = codigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom;
    }

    @PositionalField(initialPosition = 361, finalPosition = 366)
    public String getNumeroCuponsPromocionaisQueClienteTeveDireito() {
        return NumeroCuponsPromocionaisQueClienteTeveDireito;
    }

    public void setNumeroCuponsPromocionaisQueClienteTeveDireito(String numeroCuponsPromocionaisQueClienteTeveDireito) {
        NumeroCuponsPromocionaisQueClienteTeveDireito = numeroCuponsPromocionaisQueClienteTeveDireito;
    }

    @PositionalField(initialPosition = 367, finalPosition = 372)
    public String getQuantidadeCuponsAceitos() {
        return quantidadeCuponsAceitos;
    }

    public void setQuantidadeCuponsAceitos(String quantidadeCuponsAceitos) {
        this.quantidadeCuponsAceitos = quantidadeCuponsAceitos;
    }

    @PositionalField(initialPosition = 373, finalPosition = 378)
    public String getQuantidadePontosComputados() {
        return quantidadePontosComputados;
    }

    public void setQuantidadePontosComputados(String quantidadePontosComputados) {
        this.quantidadePontosComputados = quantidadePontosComputados;
    }

    @PositionalField(initialPosition = 379, finalPosition = 384)
    public String getQuantidadeCuponsGerados() {
        return quantidadeCuponsGerados;
    }

    public void setQuantidadeCuponsGerados(String quantidadeCuponsGerados) {
        this.quantidadeCuponsGerados = quantidadeCuponsGerados;
    }

    @PositionalField(initialPosition = 385, finalPosition = 393)
    public String getPontosConcedidosPeloValorVenda() {
        return pontosConcedidosPeloValorVenda;
    }

    public void setPontosConcedidosPeloValorVenda(String pontosConcedidosPeloValorVenda) {
        this.pontosConcedidosPeloValorVenda = pontosConcedidosPeloValorVenda;
    }

    @PositionalField(initialPosition = 394, finalPosition = 402)
    public String getTotalPontosConcedidosVenda() {
        return totalPontosConcedidosVenda;
    }

    public void setTotalPontosConcedidosVenda(String totalPontosConcedidosVenda) {
        this.totalPontosConcedidosVenda = totalPontosConcedidosVenda;
    }

    @PositionalField(initialPosition = 403, finalPosition = 404)
    public String getSegundosInicioVenda() {
        return segundosInicioVenda;
    }

    public void setSegundosInicioVenda(String segundosInicioVenda) {
        this.segundosInicioVenda = segundosInicioVenda;
    }

    @PositionalField(initialPosition = 405, finalPosition = 406)
    public String getSegundosTerminoVenda() {
        return SegundosTerminoVenda;
    }

    public void setSegundosTerminoVenda(String segundosTerminoVenda) {
        SegundosTerminoVenda = segundosTerminoVenda;
    }

    @PositionalField(initialPosition = 407, finalPosition = 410)
    public String getNumeroLoja() {
        return numeroLoja;
    }

    public void setNumeroLoja(String numeroLoja) {
        this.numeroLoja = numeroLoja;
    }

    @PositionalField(initialPosition = 411, finalPosition = 414)
    public String getCRO() {
        return CRO;
    }

    public void setCRO(String CRO) {
        this.CRO = CRO;
    }

    @PositionalField(initialPosition = 415, finalPosition = 417)
    public String getNumeroGuiche() {
        return numeroGuiche;
    }

    public void setNumeroGuiche(String numeroGuiche) {
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

    @Override
    public String toString() {
        return "ResumoCupomFiscal{" +
                "tipoRegistro='" + tipoRegistro + '\'' +
                ", IdentificacaoRegistro='" + IdentificacaoRegistro + '\'' +
                ", NumeroEquipamento='" + NumeroEquipamento + '\'' +
                ", numeroSequencialOperacao='" + numeroSequencialOperacao + '\'' +
                ", NumeroFuncao='" + NumeroFuncao + '\'' +
                ", DataMovimento=" + DataMovimento +
                ", TipoVenda='" + TipoVenda + '\'' +
                ", codigoOperadorVenda='" + codigoOperadorVenda + '\'' +
                ", horarioVenda=" + horarioVenda +
                ", quantidadeMercadoriasVendidas='" + quantidadeMercadoriasVendidas + '\'' +
                ", valorLiquidoVenda='" + valorLiquidoVenda + '\'' +
                ", numeroDescontosEfetuados='" + numeroDescontosEfetuados + '\'' +
                ", valorDescontosEfetuados='" + valorDescontosEfetuados + '\'' +
                ", numeroCancelamentosEfetuados='" + numeroCancelamentosEfetuados + '\'' +
                ", quantidadeMercadoriasCanceladas='" + quantidadeMercadoriasCanceladas + '\'' +
                ", valorMercadoriasCanceladas='" + valorMercadoriasCanceladas + '\'' +
                ", quantidadeDescontosFuncionário='" + quantidadeDescontosFuncionário + '\'' +
                ", valorDescontosFuncionario='" + valorDescontosFuncionario + '\'' +
                ", codigoFuncionárioRecebeuDesconto='" + codigoFuncionárioRecebeuDesconto + '\'' +
                ", controleTipoDesconto='" + controleTipoDesconto + '\'' +
                ", tipoDescontoSubtotal='" + tipoDescontoSubtotal + '\'' +
                ", valorDescontosItem='" + valorDescontosItem + '\'' +
                ", quantidadeDescontosTipo1='" + quantidadeDescontosTipo1 + '\'' +
                ", valorDescontosTipo1='" + valorDescontosTipo1 + '\'' +
                ", quantidadeDescontosTipo2='" + quantidadeDescontosTipo2 + '\'' +
                ", valorDescontosTipo2='" + valorDescontosTipo2 + '\'' +
                ", quantidadeDescontosTipo3='" + quantidadeDescontosTipo3 + '\'' +
                ", valorDescontosTipo3='" + valorDescontosTipo3 + '\'' +
                ", quantidadeDescontosTipo4='" + quantidadeDescontosTipo4 + '\'' +
                ", valorDescontosTipo4='" + valorDescontosTipo4 + '\'' +
                ", quantidadeDescontosTipo5='" + quantidadeDescontosTipo5 + '\'' +
                ", valorDescontosTipo5='" + valorDescontosTipo5 + '\'' +
                ", quantidadeDescontosTipo6='" + quantidadeDescontosTipo6 + '\'' +
                ", valorDescontosTipo6='" + valorDescontosTipo6 + '\'' +
                ", quantidadeDescontosTipo7='" + quantidadeDescontosTipo7 + '\'' +
                ", valorDescontosTipo7='" + valorDescontosTipo7 + '\'' +
                ", quantidadeDescontosTipo8='" + quantidadeDescontosTipo8 + '\'' +
                ", valorDescontosTipo8='" + valorDescontosTipo8 + '\'' +
                ", quantidadeDescontosTipo9='" + quantidadeDescontosTipo9 + '\'' +
                ", valorDescontosTipo9='" + valorDescontosTipo9 + '\'' +
                ", quantidadeDescontosTipo10='" + quantidadeDescontosTipo10 + '\'' +
                ", valorDescontosTipo10='" + valorDescontosTipo10 + '\'' +
                ", horarioTerminoVenda=" + horarioTerminoVenda +
                ", cdigoClienteEnvolvido='" + cdigoClienteEnvolvido + '\'' +
                ", codigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom='" + codigoUltimoSupervisorQueAutorizouAlgumaOperacaoCupom + '\'' +
                ", NumeroCuponsPromocionaisQueClienteTeveDireito='" + NumeroCuponsPromocionaisQueClienteTeveDireito + '\'' +
                ", quantidadeCuponsAceitos='" + quantidadeCuponsAceitos + '\'' +
                ", quantidadePontosComputados='" + quantidadePontosComputados + '\'' +
                ", quantidadeCuponsGerados='" + quantidadeCuponsGerados + '\'' +
                ", pontosConcedidosPeloValorVenda='" + pontosConcedidosPeloValorVenda + '\'' +
                ", totalPontosConcedidosVenda='" + totalPontosConcedidosVenda + '\'' +
                ", segundosInicioVenda='" + segundosInicioVenda + '\'' +
                ", SegundosTerminoVenda='" + SegundosTerminoVenda + '\'' +
                ", numeroLoja='" + numeroLoja + '\'' +
                ", CRO='" + CRO + '\'' +
                ", numeroGuiche='" + numeroGuiche + '\'' +
                ", tipoPrimeiroDocumentoGenerico21='" + tipoPrimeiroDocumentoGenerico21 + '\'' +
                ", conteudoPrimeiroDocumentoGenerico='" + conteudoPrimeiroDocumentoGenerico + '\'' +
                ", tipoSegundoDocumentoGenerico21='" + tipoSegundoDocumentoGenerico21 + '\'' +
                ", conteudoSegundoDocumentoGenerico='" + conteudoSegundoDocumentoGenerico + '\'' +
                ", tipoTerceiroDocumentoGenerico21='" + tipoTerceiroDocumentoGenerico21 + '\'' +
                ", conteudoTerceiroDocumentoGenerico='" + conteudoTerceiroDocumentoGenerico + '\'' +
                '}';
    }

    //    @PositionalField(initialPosition = 487, finalPosition = 492, )
//    public String getSequencialOperacaoRelacionada() {
//        return sequencialOperacaoRelacionada;
//    }
//
//    public void setSequencialOperacaoRelacionada(String sequencialOperacaoRelacionada) {
//        this.sequencialOperacaoRelacionada = sequencialOperacaoRelacionada;
//    }
//
//    @PositionalField(initialPosition = 493, finalPosition = 496, paddingAlign = PaddingAlign.RIGHT,paddingCharacter = ' ' )
//    public String getMotivoCancelamentoCupom() {
//        return motivoCancelamentoCupom;
//    }
//
//    public void setMotivoCancelamentoCupom(String motivoCancelamentoCupom) {
//        this.motivoCancelamentoCupom = motivoCancelamentoCupom;
//    }
//
//    @PositionalField(initialPosition = 497, finalPosition = 505, paddingAlign = PaddingAlign.RIGHT,paddingCharacter = ' ' )
//    public String getCodigoOperadorSubstituto() {
//        return codigoOperadorSubstituto;
//    }
//
//    public void setCodigoOperadorSubstituto(String codigoOperadorSubstituto) {
//        this.codigoOperadorSubstituto = codigoOperadorSubstituto;
//    }
//
//    @PositionalField(initialPosition = 506, finalPosition = 517, paddingAlign = PaddingAlign.RIGHT,paddingCharacter = ' ' )
//    public String getSomaGarantiasEstendidasVenda() {
//        return somaGarantiasEstendidasVenda;
//    }
//
//    public void setSomaGarantiasEstendidasVenda(String somaGarantiasEstendidasVenda) {
//        this.somaGarantiasEstendidasVenda = somaGarantiasEstendidasVenda;
//    }
//
//    @PositionalField(initialPosition = 518, finalPosition = 522,paddingAlign = PaddingAlign.RIGHT,paddingCharacter = ' ' )
//    public String getCRZ() {
//        return CRZ;
//    }
//
//    public void setCRZ(String CRZ) {
//        this.CRZ = CRZ;
//    }
//
//    @PositionalField(initialPosition = 523, finalPosition = 526, paddingAlign = PaddingAlign.RIGHT,paddingCharacter = ' ' )
//    public String getPosicaoSubRegistro() {
//        return posicaoSubRegistro;
//    }
//
//    public void setPosicaoSubRegistro(String posicaoSubRegistro) {
//        this.posicaoSubRegistro = posicaoSubRegistro;
//    }
//
//    @PositionalField(initialPosition = 527, finalPosition = 530)
//    public String getQuantidadeTotalSubRegistros() {
//        return quantidadeTotalSubRegistros;
//    }
//
//    public void setQuantidadeTotalSubRegistros(String quantidadeTotalSubRegistros) {
//        this.quantidadeTotalSubRegistros = quantidadeTotalSubRegistros;
//    }
//
//    @PositionalField(initialPosition = 531, finalPosition = 545)
//    public String getCpfCnpjConsumidor() {
//        return CpfCnpjConsumidor;
//    }
//
//    public void setCpfCnpjConsumidor(String cpfCnpjConsumidor) {
//        CpfCnpjConsumidor = cpfCnpjConsumidor;
//    }
//
//    @PositionalField(initialPosition = 546, finalPosition = 550)
//    public String getAssinaturaMomentoEncerramentoCupom() {
//        return assinaturaMomentoEncerramentoCupom;
//    }
//
//    public void setAssinaturaMomentoEncerramentoCupom(String assinaturaMomentoEncerramentoCupom) {
//        this.assinaturaMomentoEncerramentoCupom = assinaturaMomentoEncerramentoCupom;
//    }
//
//    @PositionalField(initialPosition = 551, finalPosition = 556)
//    public String getQuantidadeAcrescimos() {
//        return quantidadeAcrescimos;
//    }
//
//    public void setQuantidadeAcrescimos(String quantidadeAcrescimos) {
//        this.quantidadeAcrescimos = quantidadeAcrescimos;
//    }
//
//    @PositionalField(initialPosition = 557, finalPosition = 568)
//    public String getValorAcrescimos() {
//        return valorAcrescimos;
//    }
//
//    public void setValorAcrescimos(String valorAcrescimos) {
//        this.valorAcrescimos = valorAcrescimos;
//    }
//
//    @PositionalField(initialPosition = 569, finalPosition = 569)
//    public String getTipoConteudoCampo() {
//        return tipoConteudoCampo;
//    }
//
//    public void setTipoConteudoCampo(String tipoConteudoCampo) {
//        this.tipoConteudoCampo = tipoConteudoCampo;
//    }
//
//    @PositionalField(initialPosition = 570, finalPosition = 581)
//    public String getValorTotalAproximadoImpostos() {
//        return valorTotalAproximadoImpostos;
//    }
//
//    public void setValorTotalAproximadoImpostos(String valorTotalAproximadoImpostos) {
//        this.valorTotalAproximadoImpostos = valorTotalAproximadoImpostos;
//    }
//
//    @PositionalField(initialPosition = 582, finalPosition = 593)
//    public String getValorTotalAproximadoImpostosFederais() {
//        return valorTotalAproximadoImpostosFederais;
//    }
//
//    public void setValorTotalAproximadoImpostosFederais(String valorTotalAproximadoImpostosFederais) {
//        this.valorTotalAproximadoImpostosFederais = valorTotalAproximadoImpostosFederais;
//    }
//
//    @PositionalField(initialPosition = 594, finalPosition = 605)
//    public String getValorTotalAproximadoImpostosEstaduais() {
//        return valorTotalAproximadoImpostosEstaduais;
//    }
//
//    public void setValorTotalAproximadoImpostosEstaduais(String valorTotalAproximadoImpostosEstaduais) {
//        this.valorTotalAproximadoImpostosEstaduais = valorTotalAproximadoImpostosEstaduais;
//    }
//
//    @PositionalField(initialPosition = 606, finalPosition = 617)
//    public String getValorTotalAproximadoImpostosMunicipais() {
//        return valorTotalAproximadoImpostosMunicipais;
//    }
//
//    public void setValorTotalAproximadoImpostosMunicipais(String valorTotalAproximadoImpostosMunicipais) {
//        this.valorTotalAproximadoImpostosMunicipais = valorTotalAproximadoImpostosMunicipais;
//    }
//
//    @PositionalField(initialPosition = 618, finalPosition = 636)
//    public String getIdentificacaooClienteParaEfeitoFidelizacao() {
//        return identificacaooClienteParaEfeitoFidelizacao;
//    }
//
//    public void setIdentificacaooClienteParaEfeitoFidelizacao(String identificacaooClienteParaEfeitoFidelizacao) {
//        this.identificacaooClienteParaEfeitoFidelizacao = identificacaooClienteParaEfeitoFidelizacao;
//    }
}
