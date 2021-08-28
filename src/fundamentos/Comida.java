package fundamentos;

public class Comida {

    String nomeDaComida;
    double pesoDaComida;


    public Comida(String nomeDaComida, double pesoDaComida) {
        this.nomeDaComida = nomeDaComida;
        this.pesoDaComida = pesoDaComida;
    }

    public String getNomeDaComida() {
        return nomeDaComida;
    }

    public double getPesoDaComida() {
        return pesoDaComida;
    }

    public void setNomeDaComida(String nomeDaComida) {
        this.nomeDaComida = nomeDaComida;
    }

    public void setPesoDaComida(int pesoDaComida) {
        this.pesoDaComida = pesoDaComida;
    }
}
