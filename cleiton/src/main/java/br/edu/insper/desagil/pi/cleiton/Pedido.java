package br.edu.insper.desagil.pi.cleiton;

public class Pedido extends Ferramenta {
    private String pergunta;
    private String resposta;

    public Pedido(Usuario criador, String pergunta) {
        super(criador);
        this.pergunta = pergunta;
        this.resposta = null;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    @Override
    public void executa() {
        resposta = "";
        for (int i = 0; i < pergunta.length(); i++) {
            char c = pergunta.charAt(i);
            resposta += "[" + c + "]";
        }
    }

    @Override
    public double calculaPreco() {
        if (resposta == null) {
            throw new IllegalStateException("sem resposta");
        }
        return pergunta.length() + resposta.length();
    }
}
