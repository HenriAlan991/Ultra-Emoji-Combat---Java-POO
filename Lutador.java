package aula7a;

public class Lutador {

    public Lutador(
            String nome,
            String nacionalidade,
            int idade,
            double altura,
            double peso,
            String categoria,
            int vitorias,
            int derrotas,
            int empates
    ){
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);


        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);
    }
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar(){
        System.out.println("LUTADOR: " + getNome());
        System.out.println("NACIONALIDADE: " + getNacionalidade());
        System.out.println("ALTURA: " + getAltura());
        System.out.println("PESO: " + getPeso());
        System.out.println("CATEGORIA: " + getCategoria());
        System.out.println("VITÓRIAS: " + getVitorias());
        System.out.println("DERROTAS: " + getDerrotas());
        System.out.println("EMPATES: " + getEmpates());

    }
    public void status(){
        System.out.println("LUTADOR: " + getNome());
        System.out.println("PESO: " + getPeso());
        System.out.println("VITÓRIAS: " + getVitorias());
        System.out.println("DERROTAS: " + getDerrotas());
        System.out.println("EMPATES: " + getEmpates());

    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


}
