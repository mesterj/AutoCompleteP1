package com.kite.joco.autocompletep1;

/**
 * Created by Joco on 2015.12.06..
 */
public class Person {

    String name,beoasztas;
    int eletkor;

    public Person() {
    }

    public Person(String name, String beoasztas, int eletkor) {
        this.name = name;
        this.beoasztas = beoasztas;
        this.eletkor = eletkor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeoasztas() {
        return beoasztas;
    }

    public void setBeoasztas(String beoasztas) {
        this.beoasztas = beoasztas;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    @Override
    public String toString() {
        return name;
    }
}
