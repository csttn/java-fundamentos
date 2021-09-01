package com.oop.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos(){

//        Acesos de ANA
//        private String segredo = "segredo da ana";
//        String facoDentroDeCasa = "..."; // default package
//        protected String formaDeFalar = "Sotaque Carioca";
//        public String todosSabem = "dkfkdj";


        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
