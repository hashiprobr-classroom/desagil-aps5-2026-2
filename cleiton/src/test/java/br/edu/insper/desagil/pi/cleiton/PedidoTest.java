package br.edu.insper.desagil.pi.cleiton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class PedidoTest {
    private static final double DELTA = 0.01;

    private Usuario usuario;
    private Pedido p;

    @BeforeEach
    void setUp() {
        usuario = mock(Usuario.class);

        p = new Pedido(usuario, "pergunta");
    }

    @Test
    void constroi() {
        assertSame(usuario, p.getUsuario());
        assertEquals("pergunta", p.getPergunta());
        assertNull(p.getResposta());
    }

    @Test
    void comResposta() {
        p.executa();
        assertEquals("[p][e][r][g][u][n][t][a]", p.getResposta());
        assertEquals(32, p.calculaPreco(), DELTA);
    }

    @Test
    void semResposta() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            p.calculaPreco();
        });
        assertEquals("sem resposta", exception.getMessage());
    }
}
