package com.Pizza;

public class BuildersPizzas {

    // este es el objeto que va a construir nuestro Builder
    // utilizamos el guion bajo para remarcar que es un objeto de esta clase
    protected Pizza _pizza;

    // metodo que devuelve el objeto terminado
    public Pizza build() {
        return this._pizza;
    }

    // crea la pizza para configurarla
    public BuildersPizzas() {
        _pizza = new Pizza();
    }

    // metodos para la personalizacion de la pizza
    public BuildersPizzas setMasa(int Masa) {
        _pizza.setTipoMasa(Masa);
        return this;
    }

    public BuildersPizzas setSize(int size) {
        _pizza.setSize(size);
        return this;
    }

    public BuildersPizzas setRelleno(boolean relleno) {
        _pizza.setRellena(relleno);
        return this;
    }

    public BuildersPizzas setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuildersPizzas setSinGluten(boolean sinGluten){
        _pizza.setSinGluten(sinGluten);
        return this;
    }


   


}
