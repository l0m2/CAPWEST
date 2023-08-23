import java.util.ArrayList;
import java.util.List;


    class Nacao {
    private String nome;
    private boolean hostil;
    private List<Nacao> inimigosPoliticos = new ArrayList<>();

    public Nacao(String nome) {
        this.nome = nome;
    }

    public void adicionarInimigoPolitico(Nacao inimigo) {
        inimigosPoliticos.add(inimigo);
    }

    public boolean ehHostil() {
        return hostil;
    }
}

