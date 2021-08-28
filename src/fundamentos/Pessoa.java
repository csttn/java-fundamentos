package fundamentos;

public class Pessoa {

    String nome;
    double peso;

    void comer(Comida comida){
        this.peso += comida.pesoDaComida;
    }


    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
