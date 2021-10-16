package questao05;

public class AplicacaoProdutoQuimicoRobo implements RoboAction {

    private Acao acao;

    public AplicacaoProdutoQuimicoRobo(Acao acao) {
        this.acao = acao;
    }

    public void execute() {
        acao.aplicacaoProduto();
    }
}
