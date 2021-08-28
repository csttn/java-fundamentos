package fundamentos;

public class Jantar {

    public static void main(String[] args) {

        Pessoa cleyton = new Pessoa("Cleyton Santana", 70.0);
        Comida pizza = new Comida("Pizza", 1.7);


        System.out.println(cleyton.nome + " peso atual: "+ cleyton.peso);
        cleyton.comer(pizza);
        System.out.println(cleyton.nome +" Após comer: "+ cleyton.getPeso());



    }
}
