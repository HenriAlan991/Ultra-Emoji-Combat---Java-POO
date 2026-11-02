package aula7a;

public class Luta {

    // ------ ATRIBUTOS -------
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // MÉTODOS PÚBLICOS
    public void marcarLuta(Lutador l1, Lutador l2){
        if(verificarLuta(l1,l2)){
            System.out.println("--- LUTA MARCADA ---");
            espaco();
            System.out.println("LUTADOR 1");
            espaco();
            l1.status();
            espaco();
            System.out.println("LUTADOR 2");
            l2.status();
            
        }
        else{
            System.out.println("Não foi possivel marcar está luta!");
        }

    }
    public void lutar(){

    }

    // MÉTODOS PRIVADOS
    private boolean verificarLuta(Lutador lutador1, Lutador lutador2) {
        if(lutador1.equals(lutador2) || !(lutador1.getCategoria().equals(lutador2.getCategoria())) ){
            setAprovada(false);
            setDesafiado(null);
            setDesafiado(null);
            return false;

        }
        else{
            setAprovada(true);
            setDesafiado(lutador1);
            setDesafiante(lutador2);
            return true;
        }


    }

    // MÉTODOS ESPECIAIS
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    public void espaco(){
        System.out.println("_________________");

    }
}
