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
            l1.espaco();
            System.out.println("LUTADOR 1");
            l1.espaco();
            l1.status();
            l1.espaco();
            System.out.println("LUTADOR 2");
            l2.status();
            l1.espaco();

            lutar(l1,l2);

        }
        else{
            System.out.println("Não foi possivel marcar essa luta!");
        }

    }
    public void lutar(Lutador l1, Lutador l2){
        int resultado = randomNumber(1,3);
        if(resultado == 1){
            System.out.println("--- EMPATE ---");
            l1.setEmpates(l1.getEmpates() + 1);
            l2.setEmpates(l2.getEmpates() + 1);

        }
        else if(resultado == 2){
            System.out.println("-- LUTADOR 1 VENCE! ---");
            l1.setVitorias(l1.getVitorias() + 1);
            l2.setDerrotas(l2.getDerrotas() + 1);

        }
        else{
            System.out.println("-- LUTADOR 2 VENCE! ---");
            l2.setVitorias(l2.getVitorias() + 1);
            l1.setDerrotas(l1.getDerrotas() + 1);

        }

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

    private int randomNumber(int min, int max){
        int result = (int) (Math.random() * (max - min + 1) + min);
        return result;
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

}
