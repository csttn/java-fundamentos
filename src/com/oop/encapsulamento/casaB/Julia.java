package com.oop.encapsulamento.casaB;

import com.oop.encapsulamento.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();

    void acessosDeAna(){

        //        Acesos de ANA
//        private String segredo = "segredo da ana";
//        String facoDentroDeCasa = "..."; // default package
//        protected String formaDeFalar = "Sotaque Carioca";
//        public String todosSabem = "dkfkdj";


//        Somente o todos sabem
        System.out.println(sogra.todosSabem);
    }
}
