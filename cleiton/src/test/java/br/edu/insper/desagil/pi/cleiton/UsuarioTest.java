package br.edu.insper.desagil.pi.cleiton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {
    private Usuario u;

    @BeforeEach
    void setUp() {
        u = new Usuario("couveiro", "Zé das Couves", false);
    }

    @Test
    void constroi() {
        assertEquals("couveiro", u.getApelido());
        assertEquals("Zé das Couves", u.getNome());
        assertFalse(u.isPremium());
    }

    @Test
    void mudaNome() {
        u.setNome("João do Brócolis");
        assertEquals("João do Brócolis", u.getNome());
    }

    @Test
    void duasTrocas() {
        u.troca();
        assertTrue(u.isPremium());
        u.troca();
        assertFalse(u.isPremium());
    }
}
