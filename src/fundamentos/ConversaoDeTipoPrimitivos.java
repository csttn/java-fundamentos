package fundamentos;


import javax.swing.*;
import java.math.BigDecimal;

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


//        Conversão de números para String

        Integer num1 = 10000;
        System.out.println(num1.toString());

        int num2 = 20000;

        System.out.println(Integer.toString(num2));


//         conversão de string para numero
        String valor1 = (JOptionPane.showInputDialog("Digite o seu numero"));
        String valor2 = (JOptionPane.showInputDialog("Digite o seu segundo numero"));


        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        System.out.println(numero1 + numero2);
//        é retonardo um numero com muitas casas decimais pois é usado um algortimo não tão preciso para calcular os numeros

//        é preciso converter o tipo double para string pata evitar imprecisão
        BigDecimal bigDecimalNum1 = new BigDecimal(Double.toString(numero1));
        BigDecimal bigDecimalNum2 = new BigDecimal(Double.toString(numero2));

        BigDecimal bigResult = bigDecimalNum1.add(bigDecimalNum2);
        System.out.println("BigDecimal Value: "+ bigResult.toString());





    }


}
