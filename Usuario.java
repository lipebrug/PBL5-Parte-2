import java.util.Scanner;

public class Usuario {

    // Objeto Usuário
    private String nomeConta;
    private String nomeUsuario;
    private int idade;
    private String genero;
    private String local;

    public Usuario() {
        this.nomeConta = "Nome imutável da conta";
        this.nomeUsuario = "Nome mutável de usuário";
        this.idade = 0;
        this.genero = "Gênero do usuário";
        this.local = "Localização do usuário";
    }

    public Usuario(String nomeConta, String nomeUsuario, int idade, String genero, String local) {
        this.nomeConta = nomeConta;
        this.nomeUsuario = nomeUsuario;
        this.idade = idade;
        this.genero = genero;
        this.local = local;
    }

    // Ação "Ver dados do usuário"

    public String getNomeConta() {return nomeConta;}

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public int getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public String getLocal() {
        return local;
    }

    // Ação "Editar" (edita as informações mutáveis de uma conta, como o nome de usuário e a localização)
    public void setNomeUsuario(String NomeUsuario) {
        this.nomeUsuario = NomeUsuario;
    }

    public void setLocal(String Local) {
        this.local = Local;
    }

    public void criarUsuario() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----Criar Usuário----");
            System.out.println(" ");
            System.out.println("Digite o nome da conta (com @ no início):");
            String nomeConta = scanner.nextLine();
            System.out.println(" ");
            System.out.println("Digite o nome de usuário:");
            String nomeUsuario = scanner.nextLine();
            System.out.println(" ");
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
            System.out.println(" ");
            System.out.println("Digite o seu gênero:");
        String genero = scanner.nextLine();
            System.out.println(" ");
            System.out.println("Digite sua localização:");
            String local = scanner.nextLine();
            System.out.println(" ");
            Usuario usuario = new Usuario(nomeConta, nomeUsuario, idade, genero, local);
            System.out.println("Usuário criado com sucesso!");
            System.out.println(" ");
            System.out.println("Dados do usuário:");
            System.out.println(usuario.getNomeConta());
            System.out.println("Nome de usuário: " + usuario.getNomeUsuario());
            System.out.println("Idade: " + usuario.getIdade());
            System.out.println("Gênero: " + usuario.getGenero());
            System.out.println("Local: " + usuario.getLocal());
            System.out.println(" ");
    }

}
