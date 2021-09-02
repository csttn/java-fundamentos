package com.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class InterfacesFuncionais {

        public static void main(String[] args) {

                // Recebe um parametro e retorna um valor
                UnaryOperator<String> unaryOperator = (String s) -> s.toUpperCase();
                System.out.println(unaryOperator.apply("Unary, recebe um parametro de um tipo e retorna o mesmo tipo"));

                // Não Recebe nada e retorna um valor
                Supplier<String> supplier = () -> "Supplier, Não recebe nada e retorna um valor";
                System.out.println(supplier.get());

                // Recebe um parametro e retorna um valor
                Consumer<String> consumer = (String s) -> System.out.println(s);
                consumer.accept("Consumer, recebe um valor e retorna um valor");

                BinaryOperator<Double> binaryOperator = (Double a, Double b) -> a + b;
                System.out.println(binaryOperator.apply(1.0, 2.0)
                                + "BinaryOperator, Recebe dois parametros do mesmo tipo e retorna o memso tipo");

                BiFunction<Double, Integer, String> biFunction = (Double a,
                                Integer b) -> "BiFunction, recebe dois parametros de tipos diferentes e retorna o tipo que deseja -> "
                                                + a + b;
                System.out.println(biFunction.apply(1.0, 2));

                Function<String, String> function = (String s) -> s
                                + " , recebe um parametro de um tipo e retorna um valor do tipo especificado";
                System.out.println(function.apply("function"));

                Predicate<String> predicate = (String s) -> s.length() > 0;
                System.out.println("Predicate, recebe um parametro do tipo e retorna um valor booleano. "
                                + predicate.test("Predicate"));

                IntBinaryOperator intBinaryOperator = (a, b) -> a + b;
                System.out.println(intBinaryOperator.applyAsInt(1, 2)
                                + "IntBinaryOperator, recebe dois parametros do tipo Int e retorna um Int");

                // É possível trabalahr com essas mesmas interfaces com tipos especificos
                // Ex: IntSupplier, IntToDoubleFunction e etc... Existem muitas...

                // Composição de funções
                Function<String, String> function1 = (String s) -> s;
                Function<String, String> function2 = (String s) -> s + ", function 2";
                Function<String, String> function3 = (String s) -> s + "!!!";

                System.out.println(function1.andThen(function2).andThen(function3).apply("function 1"));
        }
}
