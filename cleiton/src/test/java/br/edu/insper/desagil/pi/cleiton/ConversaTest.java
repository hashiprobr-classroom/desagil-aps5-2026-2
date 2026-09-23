package br.edu.insper.desagil.pi.cleiton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ConversaTest {
    private static final double DELTA = 0.01;

    private Conversa c;

    @BeforeEach
    void setUp() {
        Usuario usuario = mock(Usuario.class);

        c = new Conversa(usuario);
    }

    @Test
    void zeroPedidos() {
        assertEquals(0, c.calculaPreco(), DELTA);
    }

    @Test
    void umPedido() {
        c.adiciona(criaPedido(32));
        assertEquals(32, c.calculaPreco(), DELTA);
    }

    @Test
    void doisPedidos() {
        c.adiciona(criaPedido(32));
        c.adiciona(criaPedido(320));
        assertEquals(334.4, c.calculaPreco(), DELTA);
    }

    private Pedido criaPedido(double preco) {
        Pedido pedido = mock(Pedido.class);
        when(pedido.calculaPreco()).thenReturn(preco);
        return pedido;
    }
}
