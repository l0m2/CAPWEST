
class Pessoa {
    private String nome;
    private boolean americano;

    public Pessoa(String nome, boolean americano) {
        this.nome = nome;
        this.americano = americano;
    }

    public boolean ehAmericano() {
        return americano;
    }

    public boolean vendeArma(Nacao nacao, Arma arma) {
        return true;
    }

    public boolean ehInimigoPolitico(Nacao nacao) {
        return true;
    }
}