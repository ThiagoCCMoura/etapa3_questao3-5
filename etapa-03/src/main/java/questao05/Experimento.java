package questao05;

import java.util.ArrayList;
import java.util.List;

public class Experimento {
    private List<RoboAction> acoes;
    public Experimento(){
        acoes = new ArrayList<RoboAction>();
    }
    public void adiciona(RoboAction acao){
        acoes.add(acao);
    }
    public void prcessa(){
      for (RoboAction acao : acoes){
          acao.execute();
      }
    }
}
