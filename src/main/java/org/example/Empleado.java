package org.example;

public class Empleado {

    // Atributos
    String nombre;

    //Constructor

    public Empleado() {

    }


    //Metodos especiales

    //La licuadora
    public String saludar(String nombres){
        String saludo = "Hola " + nombres;
        return saludo;
    }
    public int sumar(int numeroUno, int numeroDos){
        return numeroUno + numeroDos;
    }
}
