package com.oop.encapsulamento.casaB;

import com.oop.encapsulamento.casaA.Ana;

public class Pedro  extends Ana {

    void acessosAna(){
        //        Acesos de ANA
//        private String segredo = "segredo da ana";
//        String facoDentroDeCasa = "..."; // default package
//        protected String formaDeFalar = "Sotaque Carioca";
//        public String todosSabem = "dkfkdj";

        System.out.println(super.formaDeFalar); // protected é passado por herança
        System.out.println(super.todosSabem);
    }
}
