public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha(int capacidade){
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[this.capacidade];
    }
}
