package com.classification.client_classification;

import com.classification.client_classification.model.Client;

import org.hibernate.annotations.TimeZoneStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class ClientClassificationApplicationTests {

	@Mock
	private Client clientMock;

	@InjectMocks
    private ClienteClassificationService clienteClassificationService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }


	@Test
	public void testClassificarClienteBlack() {
        // Configuração do mock do cliente
        LocalDate dataCadastro = LocalDate.now().minusMonths(24);
        Double consumoTotal = 3500.0;
        when(clienteMock.getDataCadastro()).thenReturn(dataCadastro);
        when(clienteMock.getConsumoTotal()).thenReturn(consumoTotal);

        // Execução do método a ser testado
        clienteClassificationService.classificarCliente(clienteMock);

        // Verificação do resultado esperado
        assertEquals("Black", clienteMock.getClassificacao());
        assertEquals("Vale-presente no valor de R$ 350,00", clienteMock.getPresente());
    }

	@Test
	public void testClassificarClientePlatinum() {
        // Configuração do mock do cliente
        LocalDate dataCadastro = LocalDate.now().minusMonths(24);
        Double consumoTotal = 1000.0;
        when(clienteMock.getDataCadastro()).thenReturn(dataCadastro);
        when(clienteMock.getConsumoTotal()).thenReturn(consumoTotal);

        // Execução do método a ser testado
        clienteClassificationService.classificarCliente(clienteMock);

        // Verificação do resultado esperado
        assertEquals("Platinum", clienteMock.getClassificacao());
        assertEquals("Vale-presente no valor de R$ 150,00", clienteMock.getPresente());
    }

	@Test
	public void testClassificarClienteGold() {
        // Configuração do mock do cliente
        LocalDate dataCadastro = LocalDate.now().minusMonths(24);
        Double consumoTotal = 250;
        when(clienteMock.getDataCadastro()).thenReturn(dataCadastro);
        when(clienteMock.getConsumoTotal()).thenReturn(consumoTotal);

        // Execução do método a ser testado
        clienteClassificationService.classificarCliente(clienteMock);

        // Verificação do resultado esperado
        assertEquals("Gold", clienteMock.getClassificacao());
        assertEquals("Voucher de descontro de 45% em qualquer produto da Loja", clienteMock.getPresente());
    }

	
}
