package br.com.caelum.agiletickets.controllers;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import br.com.caelum.agiletickets.domain.Agenda;
import br.com.caelum.agiletickets.domain.DiretorioDeEstabelecimentos;
import br.com.caelum.agiletickets.models.Espetaculo;
import br.com.caelum.agiletickets.models.Sessao;
import br.com.caelum.agiletickets.models.TipoDeEspetaculo;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.util.test.MockResult;
import br.com.caelum.vraptor.util.test.MockValidator;
import br.com.caelum.vraptor.validator.ValidationException;

public class EspetaculosControllerTest {


	@Test
	public void naoDeveCadastrarEspetaculosSemNome() throws Exception {

	}

	@Test(expected=ValidationException.class)
	public void naoDeveCadastrarEspetaculosSemDescricao() throws Exception {

	}

	@Test
	public void deveCadastrarEspetaculosComNomeEDescricao() throws Exception {

	}

	@Test
	public void deveRetornarNotFoundSeASessaoNaoExiste() throws Exception {

	}

	@Test(expected=ValidationException.class)
	public void naoDeveReservarZeroIngressos() throws Exception {

	}

	@Test
	public void naoDeveReservarMaisIngressosQueASessaoPermite() throws Exception {

	}

	@Test
	public void deveReservarSeASessaoTemIngressosSuficientes() throws Exception {

	}
}
