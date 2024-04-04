public class Comunidade {

    // Objeto comunidade, onde se pode adentrar e sair, seus tweets enviados na comunidade aparecem apenas nela e não publicamente

    private String nomeCom;

    private String tema;

    private int numMembros;

    public Comunidade() {
        this.nomeCom = "Nome imutável da comunidade";
        this.tema = "Tema imutável da comunidade";
        this.numMembros = 0; // Número de membros da comunidade
    }

    public Comunidade(String nomeCom, String tema, int numMembros) {
        this.nomeCom = nomeCom;
        this.tema = tema;
        this.numMembros = numMembros;
    }

    public String getNomeCom() {return nomeCom;}
    public String getTema() {return tema;}
    public int getNumMembros() {return numMembros;}

    // Ação "Entrar na comunidade"
    public void entrar() {System.out.println("Você entrou na comunidade!");}

    // Ação "Sair da comunidade"
    public void sair() {System.out.println("Você saiu da comunidade!");}

}
