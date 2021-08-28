package fundamentos;

public class PrimeiroTrauma {

    int a = 3;
    static int b = 5;

    public static void main(String[] args) {

//         acessando varivale fora do metodo estatico pela instcia da classe
        PrimeiroTrauma p = new PrimeiroTrauma();
        System.out.println(p.a);
//        scessndo variavel statica pela classe
        System.out.println(PrimeiroTrauma.b);



    }
}
