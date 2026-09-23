package br.edu.insper.desagil.pi.cleiton;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProjetoTest {
    private static final double DELTA = 0.01;

    @Test
    void total() {
        Map<String, Ferramenta> ferramentas = new HashMap<>();
        ferramentas.put("a", criaFerramenta(false, 32));
        ferramentas.put("b", criaFerramenta(false, 334.4));
        ferramentas.put("c", criaFerramenta(true, 32));
        ferramentas.put("d", criaFerramenta(true, 334.4));

        Projeto p = new Projeto(ferramentas);
        assertEquals(700.8, p.calculaTotal(), DELTA);
    }

    private Ferramenta criaFerramenta(boolean premium, double preco) {
        Usuario usuario = mock(Usuario.class);
        when(usuario.isPremium()).thenReturn(premium);

        Ferramenta ferramenta = mock(Ferramenta.class);
        when(ferramenta.getUsuario()).thenReturn(usuario);
        when(ferramenta.calculaPreco()).thenReturn(preco);
        return ferramenta;
    }
}
