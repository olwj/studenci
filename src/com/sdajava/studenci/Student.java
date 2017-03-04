package com.sdajava.studenci;

/**
 * Created by RENT on 2017-02-18.
 */

public class Student {

    //pola klasy Student
    public String imie;
    public String nazwisko;
    public String miasto;
    public int wiek;
    public int index;

    //konstruktor klasy Student
    public Student(String imie, String nazwisko, String miasto, int wiek, int index){

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.wiek = wiek;
        this.index = index;

    }

    public void getImie() {
        System.out.println("Imie: " + this.imie);
    }
}