package br.com.bluesoft.beans.antigos;

import com.github.ffpojo.metadata.positional.annotation.PositionalField;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecord;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecordLineIdentifier;

@PositionalRecord
public class RegistroItemVendido {
	
	private String tipoDeRegistro;
	private String identificacaoDoRegistro;
	private String numeroDoEquipamento;
	private String numeroSequencialDaOperacao;
	private String numeroDaFuncao;
	private String dataDoMovimento;
	private String tipoDeVenda;
	private String codigoDaMercadoria;
	private String codigoDoDepartamentoM03AI;
	private String codigoDeTributacao;
	private String codigoDaFaixaDePreco;
	private String codigoDoGrupo;
	private String codigoDoVendedor;
	private String porcentagemDeComissaoUtilizada;
	private String quantidadeDeMercadoriasVendidas;
	private String valorTotalVendido;
	private String valorDoDescontoNesteItem;
	private String numeroDoControleDeVendaDigitado;
	private String horarioDaVenda;
	private String valorDeReducaoDaBaseDeCalculo;
	private String valorDoDescontoAFuncionario;
	private String valorDoAcrescimoPorFinanciamento;
	private String controlePorTipoDeDesconto;
	private String valorDoDescontoQueFoiConcedidoNoItem;
	private String aliquotaDeTributacao;
	private String codigoDoPlanoDePagamentoAplicadoAoItem;
	private String valorDoCustoContabilDaMercadoria;
	private String codigoDoClienteEnvolvido;
	private String codigoDeVendaEspecial;
	private String numeroQueConteraOCnpjDoConvenio;
	private String numeroDoPedidoQueOriginouAVendaDoItem;
	private String observacaoDoItemConstanteDoPedido;
	private String quantidadeDeMercadoriasPontuadasPeloUsoDeCupomPromocional;
	private String numeroDePontosAtribuidosPeloUsoDeCupomPromocional;
	private String pontosConcedidosNesteItem;
	private String meioUtilizadoParaObterOCcdigoDeMercadoria;
	private String codigoDaMercadoriaQueGerouAVendaDesteItem;
	private String numeroDaLoja;
	private String cro;
	private String numeroDoGuiche;
	private String produtoIsentoDePisCofins;
	private String informacaoComplementar;
	private String numeradorDeDecomposicaoNoCupomFiscal;
	private String numeradorDoInsumoDentroDaDecomposicao;
	private String quantidadeRegistradaDoProdutoQueGerouADecomposicao;
	private String valorRegistradoNoProdutoQueGerouADecomposicao;
	private String valorDoCustoContábilDaMercadoriaQueGerouADecomposicao;
	private String motivoDoCancelamentoDoItem;
	private String funcionarioAutorizadorDoCancelamento;
	private String segundaInformacaoComplementar;
	private String terceiraInformacaoComplementar;
	private String codigoDaPromocaoUtilizadaNoProduto;
	private String quantidadeDeBonusAdquiridos;
	private String quantidadeDeBonusNegativos;
	private String quantidadeDeBonusUtilizados;
	private String posicaoDoItemNoCupom;
	private String instanteEmSegundosDoRegistroDoItem;
	private String tipoDeEvento;
	private String flags;
	private String numeroIdentificadorDaPromocao;
	private String tipoDePreco;
	private String codigoDoDepartamentoM03CJ;
	private String modoDoDescontoConcedidoNoItem;
	private String informacoesAdicionaisCapturadas;
	private String conteudoDoCampo1;
	private String tipoDeCampo2;
	private String conteudoDoCampo2;
	private String tipoDeCampo3;
	private String conteudoDoCampo3;
	private String tipoDeCampo4;
	private String conteudoDoCampo4;
	private String tipoDeCampo5;
	private String conteudoDoCampo5;
	private String crz;
	private String posicaoDoSubRegistro;
	private String quantidadeTotalDeSubRegistros;
	private String codigoDoAutorizadorDaVendaDoProduto;
	private String assinaturaNoMomentoDoRegistroDoItem;
	private String assinaturaNoMomentoDoCancelamentoDoItem;
	private String assinaturaNoMomentoDoDescontoEmSubtotal;
	private String assinaturaNoMomentoDoDescontoEmItem;
	private String motivoDoDescontoEmSubtotal;
	private String codigoDoAutorizadorDoDescontoEmSubtotal;
	private String motivoDoDescontoEmItem;
	private String codigoDoAutorizadorDoDescontoEmItem;
	private String codigoDaAutorizacaoPbms;
	private String segundaOcorrenciaIdentificacaoDaPromocao;
	private String segundaOcorrenciaQuantidadeDeBonusAdquiridos;
	private String segundaOcorrenciaQuantidadeDeBonusNegativos;
	private String segundaOcorrenciaQuantidadeDeBonusUtilizados;
	private String terceiraOcorrenciaIdentificacaoDaPromocao;
	private String terceiraOcorrenciaQuantidadeDeBonusAdquiridos;
	private String terceiraOcorrenciaQuantidadeDeBonusNegativos;
	private String terceiraOcorrenciaQuantidadeDeBonusUtilizados;
	private String quartaOcorrenciaIdentificacaoDaPromocao;
	private String quartaOcorrenciaQuantidadeDeBonusAdquiridos;
	private String quartaOcorrenciaQuantidadeDeBonusNegativos;
	private String quartaOcorrenciaQuantidadeDeBonusUtilizados;
	private String quintaOcorrenciaIdentificaçãoDaPromoção;
	private String quintaOcorrenciaQuantidadeDeBonusAdquiridos;
	private String quintaOcorrenciaQuantidadeDeBonusNegativos;
	private String quintaOcorrenciaQuantidadeDeBonusUtilizados;
	private String primeiraOcorrenciaMultiplicadorDePontosDaPromocao;
	private String segundaOcorrenciaMultiplicadorDePontosDaPromocao;
	private String terceiraOcorrenciaMultiplicadorDePontosDaPromocao;
	private String quartaOcorrenciaMultiplicadorDePontosDaPromocao;
	private String quintaOcorrenciaMultiplicadorDePontosDaPromocao;
	private String valorDoAcrescimo;
	private String assinaturaDaExecucaoDoProgramaGeradorNoMomentoDoAcrescimo;
	private String motivoDoAcrescimoEmSubtotal;
	private String codigoDoAutorizadorDoAcrescimoEmSubtotal;
	private String modoDeObtençãoDaQuantidade;
	private String valorUnitarioUsadoNoRegistroNoEcf;
	private String valorUnitarioDeReferenciaDoItem;
	private String numeroDeSerieColetado;
	private String codigoDeBarrasOriginal;
	private String tipoDeSistemaUsadoNoTratamento;
	private String valorAproximadoDosImpostos;
	private String identificacaoDoProgramaDeFidelizacao;
	private String numeroDoCicloDoProgramaDeFidelizacao;
	private String tipoDoProgramaDeFidelizacao;
	private String codigoValidadoNoArquivo;
	private String tratamentoDeProdutoSeparado;
	private String valorAproximadoDosImpostosFederais;
	private String valorAproximadoDosImpostosEstaduais;
	private String valorAproximadoDosImpostosMunicipais;
	private String modoDeRegistroDoPedido;
	
	@PositionalField(initialPosition = 1, finalPosition = 2)
	public String getTipoDeRegistro() {
		return tipoDeRegistro;
	}

	@PositionalField(initialPosition = 3, finalPosition = 11)
	public String getIdentificacaoDoRegistro() {
		return identificacaoDoRegistro;
	}

	@PositionalField(initialPosition = 12, finalPosition = 15)
	public String getNumeroDoEquipamento() {
		return numeroDoEquipamento;
	}

	@PositionalField(initialPosition = 16, finalPosition = 21)
	public String getNumeroSequencialDaOperacao() {
		return numeroSequencialDaOperacao;
	}

	@PositionalField(initialPosition = 22, finalPosition = 25)
	public String getNumeroDaFuncao() {
		return numeroDaFuncao;
	}

	@PositionalField(initialPosition = 26, finalPosition = 31)
	public String getDataDoMovimento() {
		return dataDoMovimento;
	}

	@PositionalField(initialPosition = 32, finalPosition = 32)
	public String getTipoDeVenda() {
		return tipoDeVenda;
	}

	@PositionalField(initialPosition = 33, finalPosition = 49)
	public String getCodigoDaMercadoria() {
		return codigoDaMercadoria;
	}

	@PositionalField(initialPosition = 50, finalPosition = 52)
	public String getCodigoDoDepartamentoM03AI() {
		return codigoDoDepartamentoM03AI;
	}

	@PositionalField(initialPosition = 53, finalPosition = 54)
	public String getCodigoDeTributacao() {
		return codigoDeTributacao;
	}

	@PositionalField(initialPosition = 55, finalPosition = 57)
	public String getCodigoDaFaixaDePreco() {
		return codigoDaFaixaDePreco;
	}

	@PositionalField(initialPosition = 58, finalPosition = 60)
	public String getCodigoDoGrupo() {
		return codigoDoGrupo;
	}

	@PositionalField(initialPosition = 61, finalPosition = 69)
	public String getCodigoDoVendedor() {
		return codigoDoVendedor;
	}

	@PositionalField(initialPosition = 70, finalPosition = 74)
	public String getPorcentagemDeComissaoUtilizada() {
		return porcentagemDeComissaoUtilizada;
	}

	@PositionalField(initialPosition = 75, finalPosition = 83)
	public String getQuantidadeDeMercadoriasVendidas() {
		return quantidadeDeMercadoriasVendidas;
	}

	@PositionalField(initialPosition = 84, finalPosition = 95)
	public String getValorTotalVendido() {
		return valorTotalVendido;
	}

	@PositionalField(initialPosition = 96, finalPosition = 107)
	public String getValorDoDescontoNesteItem() {
		return valorDoDescontoNesteItem;
	}

	@PositionalField(initialPosition = 108, finalPosition = 123)
	public String getNumeroDoControleDeVendaDigitado() {
		return numeroDoControleDeVendaDigitado;
	}

	@PositionalField(initialPosition = 124, finalPosition = 127)
	public String getHorarioDaVenda() {
		return horarioDaVenda;
	}

	@PositionalField(initialPosition = 128, finalPosition = 139)
	public String getValorDeReducaoDaBaseDeCalculo() {
		return valorDeReducaoDaBaseDeCalculo;
	}

	@PositionalField(initialPosition = 140, finalPosition = 151)
	public String getValorDoDescontoAFuncionario() {
		return valorDoDescontoAFuncionario;
	}

	@PositionalField(initialPosition = 152, finalPosition = 163)
	public String getValorDoAcrescimoPorFinanciamento() {
		return valorDoAcrescimoPorFinanciamento;
	}

	@PositionalField(initialPosition = 164, finalPosition = 164)
	public String getControlePorTipoDeDesconto() {
		return controlePorTipoDeDesconto;
	}

	@PositionalField(initialPosition = 165, finalPosition = 176)
	public String getValorDoDescontoQueFoiConcedidoNoItem() {
		return valorDoDescontoQueFoiConcedidoNoItem;
	}

	@PositionalField(initialPosition = 177, finalPosition = 181)
	public String getAliquotaDeTributacao() {
		return aliquotaDeTributacao;
	}

	@PositionalField(initialPosition = 182, finalPosition = 184)
	public String getCodigoDoPlanoDePagamentoAplicadoAoItem() {
		return codigoDoPlanoDePagamentoAplicadoAoItem;
	}

	@PositionalField(initialPosition = 185, finalPosition = 196)
	public String getValorDoCustoContabilDaMercadoria() {
		return valorDoCustoContabilDaMercadoria;
	}

	@PositionalField(initialPosition = 197, finalPosition = 212)
	public String getCodigoDoClienteEnvolvido() {
		return codigoDoClienteEnvolvido;
	}

	@PositionalField(initialPosition = 213, finalPosition = 214)
	public String getCodigoDeVendaEspecial() {
		return codigoDeVendaEspecial;
	}

	@PositionalField(initialPosition = 215, finalPosition = 230)
	public String getNumeroQueConteraOCnpjDoConvenio() {
		return numeroQueConteraOCnpjDoConvenio;
	}

	@PositionalField(initialPosition = 231, finalPosition = 241)
	public String getNumeroDoPedidoQueOriginouAVendaDoItem() {
		return numeroDoPedidoQueOriginouAVendaDoItem;
	}

	@PositionalField(initialPosition = 242, finalPosition = 265)
	public String getObservacaoDoItemConstanteDoPedido() {
		return observacaoDoItemConstanteDoPedido;
	}

	@PositionalField(initialPosition = 266, finalPosition = 274)
	public String getQuantidadeDeMercadoriasPontuadasPeloUsoDeCupomPromocional() {
		return quantidadeDeMercadoriasPontuadasPeloUsoDeCupomPromocional;
	}

	@PositionalField(initialPosition = 275, finalPosition = 280)
	public String getNumeroDePontosAtribuidosPeloUsoDeCupomPromocional() {
		return numeroDePontosAtribuidosPeloUsoDeCupomPromocional;
	}

	@PositionalField(initialPosition = 281, finalPosition = 289)
	public String getPontosConcedidosNesteItem() {
		return pontosConcedidosNesteItem;
	}

	@PositionalField(initialPosition = 290, finalPosition = 290)
	public String getMeioUtilizadoParaObterOCcdigoDeMercadoria() {
		return meioUtilizadoParaObterOCcdigoDeMercadoria;
	}

	@PositionalField(initialPosition = 291, finalPosition = 307)
	public String getCodigoDaMercadoriaQueGerouAVendaDesteItem() {
		return codigoDaMercadoriaQueGerouAVendaDesteItem;
	}

	@PositionalField(initialPosition = 308, finalPosition = 311)
	public String getNumeroDaLoja() {
		return numeroDaLoja;
	}

	@PositionalField(initialPosition = 312, finalPosition = 315)
	public String getCro() {
		return cro;
	}

	@PositionalField(initialPosition = 316, finalPosition = 318)
	public String getNumeroDoGuiche() {
		return numeroDoGuiche;
	}

//	@PositionalField(initialPosition = 319, finalPosition = 319)
//	public String getProdutoIsentoDePisCofins() {
//		return produtoIsentoDePisCofins;
//	}
//
//	@PositionalField(initialPosition = 320, finalPosition = 338)
//	public String getInformacaoComplementar() {
//		return informacaoComplementar;
//	}
//
//	@PositionalField(initialPosition = 339, finalPosition = 341)
//	public String getNumeradorDeDecomposicaoNoCupomFiscal() {
//		return numeradorDeDecomposicaoNoCupomFiscal;
//	}
//
//	@PositionalField(initialPosition = 342, finalPosition = 344)
//	public String getNumeradorDoInsumoDentroDaDecomposicao() {
//		return numeradorDoInsumoDentroDaDecomposicao;
//	}
//
//	@PositionalField(initialPosition = 345, finalPosition = 353)
//	public String getQuantidadeRegistradaDoProdutoQueGerouADecomposicao() {
//		return quantidadeRegistradaDoProdutoQueGerouADecomposicao;
//	}
//
//	@PositionalField(initialPosition = 354, finalPosition = 365)
//	public String getValorRegistradoNoProdutoQueGerouADecomposicao() {
//		return valorRegistradoNoProdutoQueGerouADecomposicao;
//	}
//
//	@PositionalField(initialPosition = 366, finalPosition = 377)
//	public String getValorDoCustoContábilDaMercadoriaQueGerouADecomposicao() {
//		return valorDoCustoContábilDaMercadoriaQueGerouADecomposicao;
//	}
//
//	@PositionalField(initialPosition = 378, finalPosition = 381)
//	public String getMotivoDoCancelamentoDoItem() {
//		return motivoDoCancelamentoDoItem;
//	}
//
//	@PositionalField(initialPosition = 382, finalPosition = 390)
//	public String getFuncionarioAutorizadorDoCancelamento() {
//		return funcionarioAutorizadorDoCancelamento;
//	}
//
//	@PositionalField(initialPosition = 391, finalPosition = 397)
//	public String getSegundaInformacaoComplementar() {
//		return segundaInformacaoComplementar;
//	}
//
//	@PositionalField(initialPosition = 398, finalPosition = 399)
//	public String getTerceiraInformacaoComplementar() {
//		return terceiraInformacaoComplementar;
//	}
//
//	@PositionalField(initialPosition = 400, finalPosition = 401)
//	public String getCodigoDaPromocaoUtilizadaNoProduto() {
//		return codigoDaPromocaoUtilizadaNoProduto;
//	}
//
//	@PositionalField(initialPosition = 402, finalPosition = 410)
//	public String getQuantidadeDeBonusAdquiridos() {
//		return quantidadeDeBonusAdquiridos;
//	}
//
//	@PositionalField(initialPosition = 411, finalPosition = 419)
//	public String getQuantidadeDeBonusNegativos() {
//		return quantidadeDeBonusNegativos;
//	}
//
//	@PositionalField(initialPosition = 420, finalPosition = 428)
//	public String getQuantidadeDeBonusUtilizados() {
//		return quantidadeDeBonusUtilizados;
//	}
//
//	@PositionalField(initialPosition = 429, finalPosition = 432)
//	public String getPosicaoDoItemNoCupom() {
//		return posicaoDoItemNoCupom;
//	}
//
//	@PositionalField(initialPosition = 433, finalPosition = 438)
//	public String getInstanteEmSegundosDoRegistroDoItem() {
//		return instanteEmSegundosDoRegistroDoItem;
//	}
//
//	@PositionalField(initialPosition = 439, finalPosition = 442)
//	public String getTipoDeEvento() {
//		return tipoDeEvento;
//	}
//
//	@PositionalField(initialPosition = 443, finalPosition = 447)
//	public String getFlags() {
//		return flags;
//	}
//
//	@PositionalField(initialPosition = 448, finalPosition = 454)
//	public String getNumeroIdentificadorDaPromocao() {
//		return numeroIdentificadorDaPromocao;
//	}
//
//	@PositionalField(initialPosition = 455, finalPosition = 459)
//	public String getTipoDePreco() {
//		return tipoDePreco;
//	}
//
//	@PositionalField(initialPosition = 460 , finalPosition = 468)
//	public String getCodigoDoDepartamentoM03CJ() {
//		return codigoDoDepartamentoM03CJ;
//	}
//
//	@PositionalField(initialPosition = 469 , finalPosition = 470)
//	public String getModoDoDescontoConcedidoNoItem() {
//		return modoDoDescontoConcedidoNoItem;
//	}
//
//	@PositionalField(initialPosition = 471, finalPosition = 474)
//	public String getInformacoesAdicionaisCapturadas() {
//		return informacoesAdicionaisCapturadas;
//	}
//
//	@PositionalField(initialPosition = 475, finalPosition = 493)
//	public String getConteudoDoCampo1() {
//		return conteudoDoCampo1;
//	}
//
//	@PositionalField(initialPosition = 494, finalPosition = 497)
//	public String getTipoDeCampo2() {
//		return tipoDeCampo2;
//	}
//
//	@PositionalField(initialPosition = 498, finalPosition = 516)
//	public String getConteudoDoCampo2() {
//		return conteudoDoCampo2;
//	}
//
//	@PositionalField(initialPosition = 517, finalPosition = 520 )
//	public String getTipoDeCampo3() {
//		return tipoDeCampo3;
//	}
//
//	@PositionalField(initialPosition = 521, finalPosition = 539)
//	public String getConteudoDoCampo3() {
//		return conteudoDoCampo3;
//	}
//
//	@PositionalField(initialPosition = 540, finalPosition = 543)
//	public String getTipoDeCampo4() {
//		return tipoDeCampo4;
//	}
//
//	@PositionalField(initialPosition = 544, finalPosition = 562)
//	public String getConteudoDoCampo4() {
//		return conteudoDoCampo4;
//	}
//
//	@PositionalField(initialPosition = 563 , finalPosition = 566)
//	public String getTipoDeCampo5() {
//		return tipoDeCampo5;
//	}
//
//	@PositionalField(initialPosition = 567, finalPosition = 585)
//	public String getConteudoDoCampo5() {
//		return conteudoDoCampo5;
//	}
//
//	@PositionalField(initialPosition = 586, finalPosition = 590)
//	public String getCrz() {
//		return crz;
//	}
//
//	@PositionalField(initialPosition = 591 , finalPosition = 594)
//	public String getPosicaoDoSubRegistro() {
//		return posicaoDoSubRegistro;
//	}
//
//	@PositionalField(initialPosition = 595 , finalPosition = 598)
//	public String getQuantidadeTotalDeSubRegistros() {
//		return quantidadeTotalDeSubRegistros;
//	}
//
//	@PositionalField(initialPosition = 599, finalPosition = 607)
//	public String getCodigoDoAutorizadorDaVendaDoProduto() {
//		return codigoDoAutorizadorDaVendaDoProduto;
//	}
//
//	@PositionalField(initialPosition = 608, finalPosition = 612)
//	public String getAssinaturaNoMomentoDoRegistroDoItem() {
//		return assinaturaNoMomentoDoRegistroDoItem;
//	}
//
//	@PositionalField(initialPosition = 613 , finalPosition = 617)
//	public String getAssinaturaNoMomentoDoCancelamentoDoItem() {
//		return assinaturaNoMomentoDoCancelamentoDoItem;
//	}
//
//	@PositionalField(initialPosition = 618, finalPosition = 622)
//	public String getAssinaturaNoMomentoDoDescontoEmSubtotal() {
//		return assinaturaNoMomentoDoDescontoEmSubtotal;
//	}
//
//	@PositionalField(initialPosition = 623, finalPosition = 627)
//	public String getAssinaturaNoMomentoDoDescontoEmItem() {
//		return assinaturaNoMomentoDoDescontoEmItem;
//	}
//
//	@PositionalField(initialPosition = 628, finalPosition = 631)
//	public String getMotivoDoDescontoEmSubtotal() {
//		return motivoDoDescontoEmSubtotal;
//	}
//
//	@PositionalField(initialPosition = 632, finalPosition = 640)
//	public String getCodigoDoAutorizadorDoDescontoEmSubtotal() {
//		return codigoDoAutorizadorDoDescontoEmSubtotal;
//	}
//
//	@PositionalField(initialPosition = 641, finalPosition = 644)
//	public String getMotivoDoDescontoEmItem() {
//		return motivoDoDescontoEmItem;
//	}
//
//	@PositionalField(initialPosition = 645, finalPosition = 653)
//	public String getCodigoDoAutorizadorDoDescontoEmItem() {
//		return codigoDoAutorizadorDoDescontoEmItem;
//	}
//
//	@PositionalField(initialPosition = 654, finalPosition = 672)
//	public String getCodigoDaAutorizacaoPbms() {
//		return codigoDaAutorizacaoPbms;
//	}
//
//	@PositionalField(initialPosition = 673, finalPosition = 679)
//	public String getSegundaOcorrenciaIdentificacaoDaPromocao() {
//		return segundaOcorrenciaIdentificacaoDaPromocao;
//	}
//
//	@PositionalField(initialPosition = 680, finalPosition = 688)
//	public String getSegundaOcorrenciaQuantidadeDeBonusAdquiridos() {
//		return segundaOcorrenciaQuantidadeDeBonusAdquiridos;
//	}
//
//	@PositionalField(initialPosition = 689, finalPosition = 697)
//	public String getSegundaOcorrenciaQuantidadeDeBonusNegativos() {
//		return segundaOcorrenciaQuantidadeDeBonusNegativos;
//	}
//
//	@PositionalField(initialPosition = 698, finalPosition = 706)
//	public String getSegundaOcorrenciaQuantidadeDeBonusUtilizados() {
//		return segundaOcorrenciaQuantidadeDeBonusUtilizados;
//	}
//
//	@PositionalField(initialPosition = 707 , finalPosition = 713)
//	public String getTerceiraOcorrenciaIdentificacaoDaPromocao() {
//		return terceiraOcorrenciaIdentificacaoDaPromocao;
//	}
//
//	@PositionalField(initialPosition = 714, finalPosition = 722)
//	public String getTerceiraOcorrenciaQuantidadeDeBonusAdquiridos() {
//		return terceiraOcorrenciaQuantidadeDeBonusAdquiridos;
//	}
//
//	@PositionalField(initialPosition = 723, finalPosition = 731)
//	public String getTerceiraOcorrenciaQuantidadeDeBonusNegativos() {
//		return terceiraOcorrenciaQuantidadeDeBonusNegativos;
//	}
//
//	@PositionalField(initialPosition = 732, finalPosition = 740)
//	public String getTerceiraOcorrenciaQuantidadeDeBonusUtilizados() {
//		return terceiraOcorrenciaQuantidadeDeBonusUtilizados;
//	}
//
//	@PositionalField(initialPosition = 741, finalPosition = 747)
//	public String getQuartaOcorrenciaIdentificacaoDaPromocao() {
//		return quartaOcorrenciaIdentificacaoDaPromocao;
//	}
//
//	@PositionalField(initialPosition = 748, finalPosition = 756)
//	public String getQuartaOcorrenciaQuantidadeDeBonusAdquiridos() {
//		return quartaOcorrenciaQuantidadeDeBonusAdquiridos;
//	}
//
//	@PositionalField(initialPosition = 757, finalPosition = 765)
//	public String getQuartaOcorrenciaQuantidadeDeBonusNegativos() {
//		return quartaOcorrenciaQuantidadeDeBonusNegativos;
//	}
//
//	@PositionalField(initialPosition = 766, finalPosition = 774)
//	public String getQuartaOcorrenciaQuantidadeDeBonusUtilizados() {
//		return quartaOcorrenciaQuantidadeDeBonusUtilizados;
//	}
//
//	@PositionalField(initialPosition = 775 , finalPosition = 781)
//	public String getQuintaOcorrenciaIdentificaçãoDaPromoção() {
//		return quintaOcorrenciaIdentificaçãoDaPromoção;
//	}
//
//	@PositionalField(initialPosition = 782, finalPosition = 790)
//	public String getQuintaOcorrenciaQuantidadeDeBonusAdquiridos() {
//		return quintaOcorrenciaQuantidadeDeBonusAdquiridos;
//	}
//
//	@PositionalField(initialPosition = 791, finalPosition = 799)
//	public String getQuintaOcorrenciaQuantidadeDeBonusNegativos() {
//		return quintaOcorrenciaQuantidadeDeBonusNegativos;
//	}
//
//	@PositionalField(initialPosition = 800, finalPosition = 808)
//	public String getQuintaOcorrenciaQuantidadeDeBonusUtilizados() {
//		return quintaOcorrenciaQuantidadeDeBonusUtilizados;
//	}
//
//	@PositionalField(initialPosition = 809, finalPosition = 817)
//	public String getPrimeiraOcorrenciaMultiplicadorDePontosDaPromocao() {
//		return primeiraOcorrenciaMultiplicadorDePontosDaPromocao;
//	}
//
//	@PositionalField(initialPosition = 818, finalPosition = 826)
//	public String getSegundaOcorrenciaMultiplicadorDePontosDaPromocao() {
//		return segundaOcorrenciaMultiplicadorDePontosDaPromocao;
//	}
//
//	@PositionalField(initialPosition = 827, finalPosition = 835)
//	public String getTerceiraOcorrenciaMultiplicadorDePontosDaPromocao() {
//		return terceiraOcorrenciaMultiplicadorDePontosDaPromocao;
//	}
//
//	@PositionalField(initialPosition = 836, finalPosition = 844)
//	public String getQuartaOcorrenciaMultiplicadorDePontosDaPromocao() {
//		return quartaOcorrenciaMultiplicadorDePontosDaPromocao;
//	}
//
//	@PositionalField(initialPosition = 845 , finalPosition = 853)
//	public String getQuintaOcorrenciaMultiplicadorDePontosDaPromocao() {
//		return quintaOcorrenciaMultiplicadorDePontosDaPromocao;
//	}
//
//	@PositionalField(initialPosition = 854, finalPosition = 865)
//	public String getValorDoAcrescimo() {
//		return valorDoAcrescimo;
//	}
//
//	@PositionalField(initialPosition = 866, finalPosition = 870)
//	public String getAssinaturaDaExecucaoDoProgramaGeradorNoMomentoDoAcrescimo() {
//		return assinaturaDaExecucaoDoProgramaGeradorNoMomentoDoAcrescimo;
//	}
//
//	@PositionalField(initialPosition = 871, finalPosition = 874)
//	public String getMotivoDoAcrescimoEmSubtotal() {
//		return motivoDoAcrescimoEmSubtotal;
//	}
//
//	@PositionalField(initialPosition = 875, finalPosition = 883)
//	public String getCodigoDoAutorizadorDoAcrescimoEmSubtotal() {
//		return codigoDoAutorizadorDoAcrescimoEmSubtotal;
//	}
//
//	@PositionalField(initialPosition = 884, finalPosition = 884)
//	public String getModoDeObtençãoDaQuantidade() {
//		return modoDeObtençãoDaQuantidade;
//	}
//
//	@PositionalField(initialPosition = 885, finalPosition = 896)
//	public String getValorUnitarioUsadoNoRegistroNoEcf() {
//		return valorUnitarioUsadoNoRegistroNoEcf;
//	}
//
//	@PositionalField(initialPosition = 897, finalPosition = 908)
//	public String getValorUnitarioDeReferenciaDoItem() {
//		return valorUnitarioDeReferenciaDoItem;
//	}
//
//	@PositionalField(initialPosition = 909, finalPosition = 938)
//	public String getNumeroDeSerieColetado() {
//		return numeroDeSerieColetado;
//	}
//
//	@PositionalField(initialPosition = 939, finalPosition = 976)
//	public String getCodigoDeBarrasOriginal() {
//		return codigoDeBarrasOriginal;
//	}
//
//	@PositionalField(initialPosition = 977, finalPosition = 978)
//	public String getTipoDeSistemaUsadoNoTratamento() {
//		return tipoDeSistemaUsadoNoTratamento;
//	}
//
//	@PositionalField(initialPosition = 979 , finalPosition = 990)
//	public String getValorAproximadoDosImpostos() {
//		return valorAproximadoDosImpostos;
//	}
//
//	@PositionalField(initialPosition = 991, finalPosition = 994)
//	public String getIdentificacaoDoProgramaDeFidelizacao() {
//		return identificacaoDoProgramaDeFidelizacao;
//	}
//
//	@PositionalField(initialPosition = 995 , finalPosition = 996)
//	public String getNumeroDoCicloDoProgramaDeFidelizacao() {
//		return numeroDoCicloDoProgramaDeFidelizacao;
//	}
//
//	@PositionalField(initialPosition = 997, finalPosition = 998)
//	public String getTipoDoProgramaDeFidelizacao() {
//		return tipoDoProgramaDeFidelizacao;
//	}
//
//	@PositionalField(initialPosition = 999, finalPosition = 1015)
//	public String getCodigoValidadoNoArquivo() {
//		return codigoValidadoNoArquivo;
//	}
//
//	@PositionalField(initialPosition = 1016, finalPosition = 1017)
//	public String getTratamentoDeProdutoSeparado() {
//		return tratamentoDeProdutoSeparado;
//	}
//
//	@PositionalField(initialPosition = 1018, finalPosition = 1029)
//	public String getValorAproximadoDosImpostosFederais() {
//		return valorAproximadoDosImpostosFederais;
//	}
//
//	@PositionalField(initialPosition = 1030, finalPosition = 1041)
//	public String getValorAproximadoDosImpostosEstaduais() {
//		return valorAproximadoDosImpostosEstaduais;
//	}
//
//	@PositionalField(initialPosition = 1042 , finalPosition = 1053)
//	public String getValorAproximadoDosImpostosMunicipais() {
//		return valorAproximadoDosImpostosMunicipais;
//	}
//
//	@PositionalField(initialPosition = 1054, finalPosition = 1055)
//	public String getModoDeRegistroDoPedido() {
//		return modoDeRegistroDoPedido;
//	}
	
	public void setTipoDeRegistro(String tipoDeRegistro) {
		this.tipoDeRegistro = tipoDeRegistro;
	}
	public void setIdentificacaoDoRegistro(String identificacaoDoRegistro) {
		this.identificacaoDoRegistro = identificacaoDoRegistro;
	}
	public void setNumeroDoEquipamento(String numeroDoEquipamento) {
		this.numeroDoEquipamento = numeroDoEquipamento;
	}
	public void setNumeroSequencialDaOperacao(String numeroSequencialDaOperacao) {
		this.numeroSequencialDaOperacao = numeroSequencialDaOperacao;
	}
	public void setNumeroDaFuncao(String numeroDaFuncao) {
		this.numeroDaFuncao = numeroDaFuncao;
	}
	public void setDataDoMovimento(String dataDoMovimento) {
		this.dataDoMovimento = dataDoMovimento;
	}
	public void setTipoDeVenda(String tipoDeVenda) {
		this.tipoDeVenda = tipoDeVenda;
	}
	public void setCodigoDaMercadoria(String codigoDaMercadoria) {
		this.codigoDaMercadoria = codigoDaMercadoria;
	}
	public void setCodigoDoDepartamentoM03AI(String codigoDoDepartamentoM03AI) {
		this.codigoDoDepartamentoM03AI = codigoDoDepartamentoM03AI;
	}
	public void setCodigoDeTributacao(String codigoDeTributacao) {
		this.codigoDeTributacao = codigoDeTributacao;
	}
	public void setCodigoDaFaixaDePreco(String codigoDaFaixaDePreco) {
		this.codigoDaFaixaDePreco = codigoDaFaixaDePreco;
	}
	public void setCodigoDoGrupo(String codigoDoGrupo) {
		this.codigoDoGrupo = codigoDoGrupo;
	}
	public void setCodigoDoVendedor(String codigoDoVendedor) {
		this.codigoDoVendedor = codigoDoVendedor;
	}
	public void setPorcentagemDeComissaoUtilizada(
			String porcentagemDeComissaoUtilizada) {
		this.porcentagemDeComissaoUtilizada = porcentagemDeComissaoUtilizada;
	}
	public void setQuantidadeDeMercadoriasVendidas(
			String quantidadeDeMercadoriasVendidas) {
		this.quantidadeDeMercadoriasVendidas = quantidadeDeMercadoriasVendidas;
	}
	public void setValorTotalVendido(String valorTotalVendido) {
		this.valorTotalVendido = valorTotalVendido;
	}
	public void setValorDoDescontoNesteItem(String valorDoDescontoNesteItem) {
		this.valorDoDescontoNesteItem = valorDoDescontoNesteItem;
	}
	public void setNumeroDoControleDeVendaDigitado(
			String numeroDoControleDeVendaDigitado) {
		this.numeroDoControleDeVendaDigitado = numeroDoControleDeVendaDigitado;
	}
	public void setHorarioDaVenda(String horarioDaVenda) {
		this.horarioDaVenda = horarioDaVenda;
	}
	public void setValorDeReducaoDaBaseDeCalculo(
			String valorDeReducaoDaBaseDeCalculo) {
		this.valorDeReducaoDaBaseDeCalculo = valorDeReducaoDaBaseDeCalculo;
	}
	public void setValorDoDescontoAFuncionario(String valorDoDescontoAFuncionario) {
		this.valorDoDescontoAFuncionario = valorDoDescontoAFuncionario;
	}
	public void setValorDoAcrescimoPorFinanciamento(
			String valorDoAcrescimoPorFinanciamento) {
		this.valorDoAcrescimoPorFinanciamento = valorDoAcrescimoPorFinanciamento;
	}
	public void setControlePorTipoDeDesconto(String controlePorTipoDeDesconto) {
		this.controlePorTipoDeDesconto = controlePorTipoDeDesconto;
	}
	public void setValorDoDescontoQueFoiConcedidoNoItem(
			String valorDoDescontoQueFoiConcedidoNoItem) {
		this.valorDoDescontoQueFoiConcedidoNoItem = valorDoDescontoQueFoiConcedidoNoItem;
	}
	public void setAliquotaDeTributacao(String aliquotaDeTributacao) {
		this.aliquotaDeTributacao = aliquotaDeTributacao;
	}
	public void setCodigoDoPlanoDePagamentoAplicadoAoItem(
			String codigoDoPlanoDePagamentoAplicadoAoItem) {
		this.codigoDoPlanoDePagamentoAplicadoAoItem = codigoDoPlanoDePagamentoAplicadoAoItem;
	}
	public void setValorDoCustoContabilDaMercadoria(
			String valorDoCustoContabilDaMercadoria) {
		this.valorDoCustoContabilDaMercadoria = valorDoCustoContabilDaMercadoria;
	}
	public void setCodigoDoClienteEnvolvido(String codigoDoClienteEnvolvido) {
		this.codigoDoClienteEnvolvido = codigoDoClienteEnvolvido;
	}
	public void setCodigoDeVendaEspecial(String codigoDeVendaEspecial) {
		this.codigoDeVendaEspecial = codigoDeVendaEspecial;
	}
	public void setNumeroQueConteraOCnpjDoConvenio(
			String numeroQueConteraOCnpjDoConvenio) {
		this.numeroQueConteraOCnpjDoConvenio = numeroQueConteraOCnpjDoConvenio;
	}
	public void setNumeroDoPedidoQueOriginouAVendaDoItem(
			String numeroDoPedidoQueOriginouAVendaDoItem) {
		this.numeroDoPedidoQueOriginouAVendaDoItem = numeroDoPedidoQueOriginouAVendaDoItem;
	}
	public void setObservacaoDoItemConstanteDoPedido(
			String observacaoDoItemConstanteDoPedido) {
		this.observacaoDoItemConstanteDoPedido = observacaoDoItemConstanteDoPedido;
	}
	public void setQuantidadeDeMercadoriasPontuadasPeloUsoDeCupomPromocional(
			String quantidadeDeMercadoriasPontuadasPeloUsoDeCupomPromocional) {
		this.quantidadeDeMercadoriasPontuadasPeloUsoDeCupomPromocional = quantidadeDeMercadoriasPontuadasPeloUsoDeCupomPromocional;
	}
	public void setNumeroDePontosAtribuidosPeloUsoDeCupomPromocional(
			String numeroDePontosAtribuidosPeloUsoDeCupomPromocional) {
		this.numeroDePontosAtribuidosPeloUsoDeCupomPromocional = numeroDePontosAtribuidosPeloUsoDeCupomPromocional;
	}
	public void setPontosConcedidosNesteItem(String pontosConcedidosNesteItem) {
		this.pontosConcedidosNesteItem = pontosConcedidosNesteItem;
	}
	public void setMeioUtilizadoParaObterOCcdigoDeMercadoria(
			String meioUtilizadoParaObterOCcdigoDeMercadoria) {
		this.meioUtilizadoParaObterOCcdigoDeMercadoria = meioUtilizadoParaObterOCcdigoDeMercadoria;
	}
	public void setCodigoDaMercadoriaQueGerouAVendaDesteItem(
			String codigoDaMercadoriaQueGerouAVendaDesteItem) {
		this.codigoDaMercadoriaQueGerouAVendaDesteItem = codigoDaMercadoriaQueGerouAVendaDesteItem;
	}
	public void setNumeroDaLoja(String numeroDaLoja) {
		this.numeroDaLoja = numeroDaLoja;
	}
	public void setCro(String cro) {
		this.cro = cro;
	}
	public void setNumeroDoGuiche(String numeroDoGuiche) {
		this.numeroDoGuiche = numeroDoGuiche;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

	
	
	
	
}
