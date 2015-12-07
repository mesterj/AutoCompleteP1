package com.kite.joco.autocompletep1;

/**
 * Created by Joco on 2015.12.06..
 */
public class Person implements Comparable {


    String name, beoasztas;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return !(name != null ? !name.equals(person.name) : person.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public int compareTo(Object another) {
        return ((Person)another).compareTo(getName());
    }
}
