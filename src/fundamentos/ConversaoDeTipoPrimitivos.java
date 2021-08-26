package fundamentos;

public class ConversaoDeTipoPrimitivos {

    public static void main(String[] args) {


        //      declarando  forma implicita
        double a = 1;

        //       declarando formas explicitas (CAST)
        float b = 1f;
        float c = (float) 2.9;

        // convertendo tipos de forma explicita, pois o valor de int é maior do que byte
        int d = 4;
        byte e = (byte) d; // é necessario ter cuidado nas converções explicitas pois o tamanho do tipo a ser convertido
//         pode afetar o valor, nesse caso o valor de "d" não pode ser maior que 127, pois o valor na conversão seria quebrado.


//        Convertendo valores com pontos flutuantes
        double f = 1.999999;
        int g = (int) f;
        // nesse cenário é delicadado, pois no momento da conversão para int as casas decimais são
//        completamente ignoradas na conversão, o ideal a ser passado como valor seria 2, porém, as casas são ignoradas.




    }


}
