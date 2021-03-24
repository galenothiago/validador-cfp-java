package com.concrete.validadorCPF;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.InputMismatchException;
import com.concrete.validadorCPF.models.Cliente;

@SpringBootTest
class ValidadorCpfApplicationTests{

	@Test
	void paraValidarCPF() {
		Cliente cliente = new Cliente();
		cliente.setNome("Thiago");
		cliente.setCpf("09316011426");
		assertEquals(true, cliente.validarCPF());
	}

	@Test
	void paraValidarCPFInvalido(){
        Cliente cliente = new Cliente("Thiago", "09316011429");
		assertEquals(false, cliente.validarCPF());
	}

	@Test
	void paraValidarCPFFormatado(){
        Cliente cliente = new Cliente();
		cliente.setNome("Thiago");
		cliente.setCpf("093.160.114-26");
		assertEquals(true, cliente.validarCPF());
	}

	@Test
	void paraValidarCPFInvalidoFormatado(){
        Cliente cliente = new Cliente();
		cliente.setNome("Thiago");
		cliente.setCpf("093.160.114-29");
		assertEquals(false, cliente.validarCPF());
	}

    @Test
	void paraValidarCPFInvalidoNulo(){
        Cliente cliente = new Cliente();
		cliente.setNome("Thiago");
		assertEquals(false, cliente.validarCPF());
	}
}