package com.concrete.validadorCPF.models;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

@SpringBootTest
public class ClienteTest {
	@Test
	void testandoInstanciaDeCliente() {
		Cliente cli = new Cliente();
		cli.setNome("Thiago");
		assertEquals(cli.getNome(), "Thiago");
	}

	@DisplayName("Dado que eu passei um CPF válido, então devo receber uma validação verdadeira")
	@Test
		void testandoValidacaoDeCpfValida() {
		Cliente cli = new Cliente();
		cli.setCpf("235.086.800-10");
		assertEquals(cli.validarCPF(), true);
		}

	@DisplayName("Dado que eu passei um CPF inválido, então devo receber uma validação falsa")
	@Test
		void testandoValidacaoDeCpfInvalida() {
		Cliente cli = new Cliente();
		cli.setCpf("235.086.800-11");
		assertEquals(cli.validarCPF(), false);
		}

}