package questao05;

public class Aplicacao {
    public static void main(String[] args) {
        Acao acao = new Acao();
        Experimento experimento = new Experimento();
        experimento.adiciona(new AplicacaoProdutoQuimicoRobo(acao));
        experimento.adiciona(new ElevacaoTemperaturaAmbienteRobo(acao));
        experimento.prcessa();
    }
}
