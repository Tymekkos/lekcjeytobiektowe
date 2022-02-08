package com.company;

public class Uzytkownik {
    private int age;
    private String name;

    public Uzytkownik(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public boolean czyMozeKupicAlko(){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }else{
            throw new RuntimeException("wiek musi byc wiekszy od 0");
        }

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
