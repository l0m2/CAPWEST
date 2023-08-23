public class App {
    public static void main(String[] args) throws Exception {
 // Definindo as nações
        Nacao usa = new Nacao("USA");
        Nacao cuba = new Nacao("Cuba");
        Nacao ira = new Nacao("Irã");

       
        Pessoa west = new Pessoa("West", true);
        Pessoa pessoa1 = new Pessoa("Pessoa1", false);

        
        Arma arma1 = new Arma("Arma1");
        Arma arma2 = new Arma("Arma2");

       
        usa.adicionarInimigoPolitico(cuba);
        usa.adicionarInimigoPolitico(ira);

       
        if (west.ehAmericano() && west.vendeArma(usa, arma1) && usa.ehHostil() && arma1.ehArma()) {
            System.out.println("West é criminoso.");
        } else {
            System.out.println("West não é criminoso.");
        }

      
        if (pessoa1.ehInimigoPolitico(usa) && usa.ehHostil()) {
            System.out.println("Pessoa1 é hostil.");
        } else {
            System.out.println("Pessoa1 não é hostil.");
        }
    }
}