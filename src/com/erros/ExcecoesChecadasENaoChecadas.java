package com.erros;

public class ExcecoesChecadasENaoChecadas {

    public static void main(String[] args) {

        gerarErro1();

        try {
            gerarErro2();
        } catch (Exception e) {
            System.out.println("Erro 2: " + e.getMessage());
        }

        System.out.println("Fim");

    }

    // Exceção não checada, pois o método não declarou o throws
    // São obrigadas a usar o bloco try-catch
    static void gerarErro1() {
        throw new RuntimeException("Erro 1");
        // qualquer classe que herde de runtimeException é uma exceção não checada
        // quem chamar esse erro não é obrigado a tratar a exceção com try-catch
    }

    // Exceção checada, pois o método declarou o throws
    static void gerarErro2() throws Exception {
        throw new RuntimeException("Erro 2");

        // qualquer classe que herde de exception é uma exceção checada
        // quem chamar esse erro é obrigado a tratar a exceção com try-catch
    }
}
