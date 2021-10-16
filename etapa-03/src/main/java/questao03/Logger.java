package questao03;

public class Logger {
    private static Logger instance;
    private boolean ativo = false;

    private Logger(){}

    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public boolean isAtivo(){
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void log(String s){
        if (this.ativo)
            System.out.println("LOG ::"+  s);
    }
}
