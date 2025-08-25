public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;
    private boolean cheia;
    private boolean vazia;

    public Pilha(int capacidade){
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[this.capacidade];
    }

    public boolean vazia(){
        if(this.topo == -1){
            this.vazia = true;
            return this.vazia;
        }
        else{
            this.vazia = false;
            return this.vazia;
        }
    }

    public boolean cheia(){
        if(this.topo == this.capacidade - 1){
            this.cheia = true;
            return this.cheia;
        }
        else{
            this.cheia = false;
            return this.cheia;
        }
    }

    public int[] insere(int x){
        if(this.cheia == false){
            this.topo += 1;
            this.dados[topo] = x;
            return this.dados;
        }
        else{
            System.out.println("Pilha cheia");
            return this.dados;
        }
    }
}
