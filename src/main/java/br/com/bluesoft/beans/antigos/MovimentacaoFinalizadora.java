package br.com.bluesoft.beans.antigos;

import com.github.ffpojo.metadata.positional.annotation.PositionalField;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecord;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecordLineIdentifier;

@PositionalRecord(lineIdentifiers = {
		@PositionalRecordLineIdentifier(textIdentifier = "02")
})
public class MovimentacaoFinalizadora {
	
	private String tipoDeRegistro;
	private String identificacaoDoRegistro;
	private String numeroDoEquipamento;
	private String numeroSeqüencialDaOperacao;
	private String numeroDaFuncao;
	private String dataDoMovimento;
	private String tipoDeVenda;
	private String codigoDoOperadorDaVenda;
	private String codigoDaFinalizadora;
	private String numeroDePagamentos;
	private String valorRecebido;
	private String valorDoTrocoFornecido;
	private String codigoDoClienteEnvolvido;
	private String informacoesRelativasAConsulta;
	private String codigoDoFuncionario;
	private String numeroDoDocumentoDigitado;
	private String numeroDoDocumentoEmitido;
	private String codigoDoSupervisor;
	private String dataDigitada;
	private String segundoNumeroDeDocumento;
	private String terceiroNumeroDeDocumento;
	private String quartoNumeroDeDocumento;
	private String horarioDaVenda;
	private String numeroDeControleDoVasilhame;
	private String finalizadoraPaga;
	private String finalizadoraUsada;
	private String bandeiraDoCartao;
	private String codigoDeAutorizacao;
	private String numeroDeParcelas;
	private String numeroDeCiclos;
	private String binDoCartaoUsado;
	private String tipoDeVencimento;
	private String carencia;
	private String codigoDoPlanoDePagamentoUtilizado;
	private String quantidadeDeBonusAssociada;
	private String quintoNumeroDeDocumento;
	private String sextoNumeroDeDocumento;
	private String dadosRelacionadosComTransferenciaEletronica;
	private String cpfOuCnpj;
	private String numeroDoBancoDoCheque;
	private String numeroDaAgenciaDoCheque;
	private String numeroDoCheque;
	private String numeroDeIdentificacaoDaTransacaoFinanceira;
	private String numeroDeIdentificacaoDaTransacaoSiTef;
	private String leituraCompleta;
	private String codigoDaInstituicao;
	private String pontosConcedidos;
	private String codigoDoEstabelecimento;
	private String classeDaFinalizadora;
	private String numeroDaLoja;
	private String cro;
	private String numeroDoGuiche;
	private String numeroDoVoucherAceito;
	
	@PositionalField(initialPosition = 1, finalPosition = 2 )
	public String getTipoDeRegistro() {
		return tipoDeRegistro;
	}

	@PositionalField(initialPosition = 3 , finalPosition = 11 )
	public String getIdentificacaoDoRegistro() {
		return identificacaoDoRegistro;
	}

	@PositionalField(initialPosition = 12, finalPosition = 15 )
	public String getNumeroDoEquipamento() {
		return numeroDoEquipamento;
	}

	@PositionalField(initialPosition = 16, finalPosition = 21 )
	public String getNumeroSeqüencialDaOperacao() {
		return numeroSeqüencialDaOperacao;
	}

	@PositionalField(initialPosition = 22, finalPosition = 25)
	public String getNumeroDaFuncao() {
		return numeroDaFuncao;
	}

	@PositionalField(initialPosition = 26 , finalPosition = 31)
	public String getDataDoMovimento() {
		return dataDoMovimento;
	}

	@PositionalField(initialPosition = 32, finalPosition = 32)
	public String getTipoDeVenda() {
		return tipoDeVenda;
	}

	@PositionalField(initialPosition = 33, finalPosition = 41)
	public String getCodigoDoOperadorDaVenda() {
		return codigoDoOperadorDaVenda;
	}

	@PositionalField(initialPosition = 42 , finalPosition = 44)
	public String getCodigoDaFinalizadora() {
		return codigoDaFinalizadora;
	}

	@PositionalField(initialPosition = 45, finalPosition = 50 )
	public String getNumeroDePagamentos() {
		return numeroDePagamentos;
	}

	@PositionalField(initialPosition = 51, finalPosition = 62 )
	public String getValorRecebido() {
		return valorRecebido;
	}

	@PositionalField(initialPosition = 63, finalPosition = 74 )
	public String getValorDoTrocoFornecido() {
		return valorDoTrocoFornecido;
	}

	@PositionalField(initialPosition = 75, finalPosition = 89)
	public String getCodigoDoClienteEnvolvido() {
		return codigoDoClienteEnvolvido;
	}

	@PositionalField(initialPosition = 90, finalPosition = 91)
	public String getInformacoesRelativasAConsulta() {
		return informacoesRelativasAConsulta;
	}

	@PositionalField(initialPosition = 92 , finalPosition = 100)
	public String getCodigoDoFuncionario() {
		return codigoDoFuncionario;
	}

	@PositionalField(initialPosition = 101, finalPosition = 116)
	public String getNumeroDoDocumentoDigitado() {
		return numeroDoDocumentoDigitado;
	}

	@PositionalField(initialPosition = 117, finalPosition = 132)
	public String getNumeroDoDocumentoEmitido() {
		return numeroDoDocumentoEmitido;
	}

	@PositionalField(initialPosition = 133, finalPosition = 141)
	public String getCodigoDoSupervisor() {
		return codigoDoSupervisor;
	}

	@PositionalField(initialPosition = 142, finalPosition = 147)
	public String getDataDigitada() {
		return dataDigitada;
	}

	@PositionalField(initialPosition = 148, finalPosition = 163)
	public String getSegundoNumeroDeDocumento() {
		return segundoNumeroDeDocumento;
	}

	@PositionalField(initialPosition = 164, finalPosition = 179)
	public String getTerceiroNumeroDeDocumento() {
		return terceiroNumeroDeDocumento;
	}

	@PositionalField(initialPosition = 180, finalPosition = 195)
	public String getQuartoNumeroDeDocumento() {
		return quartoNumeroDeDocumento;
	}

	@PositionalField(initialPosition = 196, finalPosition = 199)
	public String getHorarioDaVenda() {
		return horarioDaVenda;
	}

	@PositionalField(initialPosition = 200, finalPosition = 208)
	public String getNumeroDeControleDoVasilhame() {
		return numeroDeControleDoVasilhame;
	}

	@PositionalField(initialPosition = 209, finalPosition = 210)
	public String getFinalizadoraPaga() {
		return finalizadoraPaga;
	}

	@PositionalField(initialPosition = 211, finalPosition = 224)
	public String getFinalizadoraUsada() {
		return finalizadoraUsada;
	}

	@PositionalField(initialPosition = 225, finalPosition = 229)
	public String getBandeiraDoCartao() {
		return bandeiraDoCartao;
	}

	@PositionalField(initialPosition = 230, finalPosition = 238)
	public String getCodigoDeAutorizacao() {
		return codigoDeAutorizacao;
	}

	@PositionalField(initialPosition = 239, finalPosition = 240)
	public String getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	@PositionalField(initialPosition = 241, finalPosition = 242)
	public String getNumeroDeCiclos() {
		return numeroDeCiclos;
	}

	@PositionalField(initialPosition = 243, finalPosition = 248)
	public String getBinDoCartaoUsado() {
		return binDoCartaoUsado;
	}

	@PositionalField(initialPosition = 249, finalPosition = 250)
	public String getTipoDeVencimento() {
		return tipoDeVencimento;
	}

	@PositionalField(initialPosition = 251, finalPosition = 252)
	public String getCarencia() {
		return carencia;
	}

	@PositionalField(initialPosition = 253, finalPosition = 255 )
	public String getCodigoDoPlanoDePagamentoUtilizado() {
		return codigoDoPlanoDePagamentoUtilizado;
	}

	@PositionalField(initialPosition = 256, finalPosition = 264)
	public String getQuantidadeDeBonusAssociada() {
		return quantidadeDeBonusAssociada;
	}

	@PositionalField(initialPosition = 265, finalPosition = 280)
	public String getQuintoNumeroDeDocumento() {
		return quintoNumeroDeDocumento;
	}

	@PositionalField(initialPosition = 281, finalPosition = 296)
	public String getSextoNumeroDeDocumento() {
		return sextoNumeroDeDocumento;
	}

	@PositionalField(initialPosition = 297, finalPosition = 302)
	public String getDadosRelacionadosComTransferenciaEletronica() {
		return dadosRelacionadosComTransferenciaEletronica;
	}

	@PositionalField(initialPosition = 303, finalPosition = 317 )
	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	@PositionalField(initialPosition = 318, finalPosition = 321)
	public String getNumeroDoBancoDoCheque() {
		return numeroDoBancoDoCheque;
	}

	@PositionalField(initialPosition = 322, finalPosition = 325)
	public String getNumeroDaAgenciaDoCheque() {
		return numeroDaAgenciaDoCheque;
	}

	@PositionalField(initialPosition = 326, finalPosition = 337)
	public String getNumeroDoCheque() {
		return numeroDoCheque;
	}

	@PositionalField(initialPosition = 338, finalPosition = 349)
	public String getNumeroDeIdentificacaoDaTransacaoFinanceira() {
		return numeroDeIdentificacaoDaTransacaoFinanceira;
	}

	@PositionalField(initialPosition = 350, finalPosition = 361)
	public String getNumeroDeIdentificacaoDaTransacaoSiTef() {
		return numeroDeIdentificacaoDaTransacaoSiTef;
	}

	@PositionalField(initialPosition = 362, finalPosition = 408)
	public String getLeituraCompleta() {
		return leituraCompleta;
	}
	
	@PositionalField(initialPosition = 409, finalPosition = 410)
	public String getCodigoDaInstituicao() {
		return codigoDaInstituicao;
	}
	
	@PositionalField(initialPosition = 411, finalPosition = 419)
	public String getPontosConcedidos() {
		return pontosConcedidos;
	}

	@PositionalField(initialPosition = 420, finalPosition = 438)
	public String getCodigoDoEstabelecimento() {
		return codigoDoEstabelecimento;
	}

	@PositionalField(initialPosition = 439, finalPosition = 443)
	public String getClasseDaFinalizadora() {
		return classeDaFinalizadora;
	}

	@PositionalField(initialPosition = 444, finalPosition = 447)
	public String getNumeroDaLoja() {
		return numeroDaLoja;
	}

	@PositionalField(initialPosition = 448, finalPosition = 451 )
	public String getCro() {
		return cro;
	}

	@PositionalField(initialPosition = 452, finalPosition = 454)
	public String getNumeroDoGuiche() {
		return numeroDoGuiche;
	}


	public void setTipoDeRegistro(String tipoDeRegistro) {
		this.tipoDeRegistro = tipoDeRegistro;
	}

	public void setIdentificacaoDoRegistro(String identificacaoDoRegistro) {
		this.identificacaoDoRegistro = identificacaoDoRegistro;
	}

	public void setNumeroDoEquipamento(String numeroDoEquipamento) {
		this.numeroDoEquipamento = numeroDoEquipamento;
	}

	public void setNumeroSeqüencialDaOperacao(String numeroSeqüencialDaOperacao) {
		this.numeroSeqüencialDaOperacao = numeroSeqüencialDaOperacao;
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

	public void setCodigoDoOperadorDaVenda(String codigoDoOperadorDaVenda) {
		this.codigoDoOperadorDaVenda = codigoDoOperadorDaVenda;
	}

	public void setCodigoDaFinalizadora(String codigoDaFinalizadora) {
		this.codigoDaFinalizadora = codigoDaFinalizadora;
	}

	public void setNumeroDePagamentos(String numeroDePagamentos) {
		this.numeroDePagamentos = numeroDePagamentos;
	}

	public void setValorRecebido(String valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	public void setValorDoTrocoFornecido(String valorDoTrocoFornecido) {
		this.valorDoTrocoFornecido = valorDoTrocoFornecido;
	}

	public void setCodigoDoClienteEnvolvido(String codigoDoClienteEnvolvido) {
		this.codigoDoClienteEnvolvido = codigoDoClienteEnvolvido;
	}

	public void setInformacoesRelativasAConsulta(
			String informacoesRelativasAConsulta) {
		this.informacoesRelativasAConsulta = informacoesRelativasAConsulta;
	}

	public void setCodigoDoFuncionario(String codigoDoFuncionario) {
		this.codigoDoFuncionario = codigoDoFuncionario;
	}

	public void setNumeroDoDocumentoDigitado(String numeroDoDocumentoDigitado) {
		this.numeroDoDocumentoDigitado = numeroDoDocumentoDigitado;
	}

	public void setNumeroDoDocumentoEmitido(String numeroDoDocumentoEmitido) {
		this.numeroDoDocumentoEmitido = numeroDoDocumentoEmitido;
	}

	public void setCodigoDoSupervisor(String codigoDoSupervisor) {
		this.codigoDoSupervisor = codigoDoSupervisor;
	}

	public void setDataDigitada(String dataDigitada) {
		this.dataDigitada = dataDigitada;
	}

	public void setSegundoNumeroDeDocumento(String segundoNumeroDeDocumento) {
		this.segundoNumeroDeDocumento = segundoNumeroDeDocumento;
	}

	public void setTerceiroNumeroDeDocumento(String terceiroNumeroDeDocumento) {
		this.terceiroNumeroDeDocumento = terceiroNumeroDeDocumento;
	}

	public void setQuartoNumeroDeDocumento(String quartoNumeroDeDocumento) {
		this.quartoNumeroDeDocumento = quartoNumeroDeDocumento;
	}

	public void setHorarioDaVenda(String horarioDaVenda) {
		this.horarioDaVenda = horarioDaVenda;
	}

	public void setNumeroDeControleDoVasilhame(String numeroDeControleDoVasilhame) {
		this.numeroDeControleDoVasilhame = numeroDeControleDoVasilhame;
	}

	public void setFinalizadoraPaga(String finalizadoraPaga) {
		this.finalizadoraPaga = finalizadoraPaga;
	}

	public void setFinalizadoraUsada(String finalizadoraUsada) {
		this.finalizadoraUsada = finalizadoraUsada;
	}

	public void setBandeiraDoCartao(String bandeiraDoCartao) {
		this.bandeiraDoCartao = bandeiraDoCartao;
	}

	public void setCodigoDeAutorizacao(String codigoDeAutorizacao) {
		this.codigoDeAutorizacao = codigoDeAutorizacao;
	}

	public void setNumeroDeParcelas(String numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public void setNumeroDeCiclos(String numeroDeCiclos) {
		this.numeroDeCiclos = numeroDeCiclos;
	}

	public void setBinDoCartaoUsado(String binDoCartaoUsado) {
		this.binDoCartaoUsado = binDoCartaoUsado;
	}

	public void setTipoDeVencimento(String tipoDeVencimento) {
		this.tipoDeVencimento = tipoDeVencimento;
	}

	public void setCarencia(String carencia) {
		this.carencia = carencia;
	}

	public void setCodigoDoPlanoDePagamentoUtilizado(
			String codigoDoPlanoDePagamentoUtilizado) {
		this.codigoDoPlanoDePagamentoUtilizado = codigoDoPlanoDePagamentoUtilizado;
	}

	public void setQuantidadeDeBonusAssociada(String quantidadeDeBonusAssociada) {
		this.quantidadeDeBonusAssociada = quantidadeDeBonusAssociada;
	}

	public void setQuintoNumeroDeDocumento(String quintoNumeroDeDocumento) {
		this.quintoNumeroDeDocumento = quintoNumeroDeDocumento;
	}

	public void setSextoNumeroDeDocumento(String sextoNumeroDeDocumento) {
		this.sextoNumeroDeDocumento = sextoNumeroDeDocumento;
	}

	public void setDadosRelacionadosComTransferenciaEletronica(
			String dadosRelacionadosComTransferenciaEletronica) {
		this.dadosRelacionadosComTransferenciaEletronica = dadosRelacionadosComTransferenciaEletronica;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public void setNumeroDoBancoDoCheque(String numeroDoBancoDoCheque) {
		this.numeroDoBancoDoCheque = numeroDoBancoDoCheque;
	}

	public void setNumeroDaAgenciaDoCheque(String numeroDaAgenciaDoCheque) {
		this.numeroDaAgenciaDoCheque = numeroDaAgenciaDoCheque;
	}

	public void setNumeroDoCheque(String numeroDoCheque) {
		this.numeroDoCheque = numeroDoCheque;
	}

	public void setNumeroDeIdentificacaoDaTransacaoFinanceira(
			String numeroDeIdentificacaoDaTransacaoFinanceira) {
		this.numeroDeIdentificacaoDaTransacaoFinanceira = numeroDeIdentificacaoDaTransacaoFinanceira;
	}

	public void setNumeroDeIdentificacaoDaTransacaoSiTef(
			String numeroDeIdentificacaoDaTransacaoSiTef) {
		this.numeroDeIdentificacaoDaTransacaoSiTef = numeroDeIdentificacaoDaTransacaoSiTef;
	}

	public void setLeituraCompleta(String leituraCompleta) {
		this.leituraCompleta = leituraCompleta;
	}

	public void setCodigoDaInstituicao(String codigoDaInstituicao) {
		this.codigoDaInstituicao = codigoDaInstituicao;
	}

	public void setPontosConcedidos(String pontosConcedidos) {
		this.pontosConcedidos = pontosConcedidos;
	}

	public void setCodigoDoEstabelecimento(String codigoDoEstabelecimento) {
		this.codigoDoEstabelecimento = codigoDoEstabelecimento;
	}

	public void setClasseDaFinalizadora(String classeDaFinalizadora) {
		this.classeDaFinalizadora = classeDaFinalizadora;
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
