public class Conteudo {
    protected String texto;

    protected int numCarac;

    protected int numLike;

    public Conteudo() {
        this.texto = "Texto da mensagem ou tweet";
        this.numCarac = 0; // Número de caracteres no tweet, máximo de 280
        this.numLike = 0; // Número de curtidas da mensagem ou tweet
    }

    public Conteudo(String texto, int numCarac, int numLike) {
        this.texto = texto;
        this.numCarac = numCarac;
        this.numLike = numLike;
    }

    public String getTexto() {return texto;}

    public int getNumLike() {return numLike;}

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setNumCarac(int numCarac) {
        if (numCarac < 281) {
            this.numCarac = numCarac;
        } else {
            System.out.println("Número de caracteres não pode ser maior que 280");
        }
    }

    public void setTextoDlt(String texto) {
        this.texto = "Conteúdo Excluído";
    }

    public int curtir() {
        return numLike++;
    }
}
