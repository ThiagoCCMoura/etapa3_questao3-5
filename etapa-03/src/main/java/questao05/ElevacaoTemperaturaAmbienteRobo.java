package questao05;

public class ElevacaoTemperaturaAmbienteRobo implements RoboAction{

    private Acao acao;

    public ElevacaoTemperaturaAmbienteRobo(Acao acao) {
        this.acao = acao;
    }

    public void execute() {
        acao.elevacaoTemperaturaAmbiente();
    }
}
