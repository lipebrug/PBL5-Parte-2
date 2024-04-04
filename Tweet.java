public class Tweet extends Conteudo {

    // Objeto Tweet, postado publicamente

    private String localTwt;

    private int numView;

    private int numRt;

    public Tweet(String texto, int numCarac, int numLike, String localTwt, int numView, int numRt) {
        super(texto, numCarac, numLike);
        this.localTwt = localTwt;
        this.numView = numView;
        this.numRt = numRt;
    }


    public String getLocalTwt() {return localTwt;}
    public int getNumView() {return numView;}
    public int getNumRt() {return numRt;}


    // Ação "Retweetar" - ao apertar o botão de retweet, é adicionado em 1 ao total de retweets

    public int retweet() {
        return numRt++;
    }
}
