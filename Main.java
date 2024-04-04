// Felipe Fumagalli, Jose Gabriel Kojo, Nicole Fatuch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int contador = 5;
        System.out.println("----- Bem vindo! -----");
        while (contador != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("O que você deseja fazer? (1: Criar usuário. 2: Tweetar. 3: Criar comunidade. 0: Sair.)");
            int numInteiro = scanner.nextInt();
            if(numInteiro == 1) {
                Usuario usuario = new Usuario();
                usuario.criarUsuario();
            }
            else if (numInteiro == 0) {
                System.out.println("Até mais!");
                break;
            }
        }

        Usuario usuario = new Usuario("@felipebrugnera", "Lipe", 21, "Masculino", "Curitiba - PR, Brasil");

        // Mostrando dados do usuário

        System.out.println("Dados do usuário:");
        System.out.println(usuario.getNomeConta());
        System.out.println("Nome de usuário: " + usuario.getNomeUsuario());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Gênero: " + usuario.getGenero());
        System.out.println("Local: " + usuario.getLocal());
        System.out.println(" ");

        usuario.setNomeUsuario("Lipe12");
        usuario.setLocal("São Paulo - SP, Brasil");

        System.out.println("Dados do usuário:");
        System.out.println(usuario.getNomeConta());
        System.out.println("Nome de usuário: " + usuario.getNomeUsuario());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Gênero: " + usuario.getGenero());
        System.out.println("Local: " + usuario.getLocal());
        System.out.println(" ");

        // Ação "Escrever mensagem"

        Mensagem mensagem = new Mensagem("Tudo bem", 8, 1, "@nicole123");

        //

        // Mostrando dados da mensagem

        System.out.println("Mensagem de " + usuario.getNomeUsuario() + ":");
        System.out.println("Para: " + mensagem.getDestinatario());
        System.out.println(mensagem.getTexto());
        System.out.println(" ");

        // Ação "Escrever e postar tweet"

        Tweet tweet = new Tweet("Grande dia", 10, 143, "São Paulo - SP, Brasil",869, 52);

        //

        // Ação ler tweet

        System.out.println("Tweet de " + usuario.getNomeUsuario() + ":");
        System.out.println(tweet.getTexto());
        System.out.println("De " + tweet.getLocalTwt());
        System.out.println(tweet.getNumView() + " Views");
        System.out.println(tweet.getNumLike() + " Likes");
        System.out.println(tweet.getNumRt() + " Retweets");
        System.out.println(" ");

        //

        tweet.setTexto("Pessimo dia");
        tweet.setNumCarac(11);
        tweet.curtir();
        tweet.retweet();


        System.out.println("Tweet de " + usuario.getNomeUsuario() + ":");
        System.out.println(tweet.getTexto());
        System.out.println("De " + tweet.getLocalTwt());
        System.out.println(tweet.getNumView() + " Views");
        System.out.println(tweet.getNumLike() + " Likes");
        System.out.println(tweet.getNumRt() + " Retweets");
        System.out.println(" ");

        tweet.setTextoDlt("");

        System.out.println(tweet.getTexto());
        System.out.println(" ");

        Comunidade comunidade = new Comunidade("Gamers101","Jogos", 203);

        System.out.println("Comunidade " + comunidade.getNomeCom());
        System.out.println("Tema " + comunidade.getTema());
        System.out.println("Membros: " + comunidade.getNumMembros());
    }
}