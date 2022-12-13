package Seminar_6;

import java.util.ArrayList;
import java.util.List;

//Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//а) информационной системой ветеринарной клиники
//б) архивом выставки котов
//в) информационной системой Театра кошек Ю. Д. Куклачёва
//Можно записать в текстовом виде, не обязательно реализовывать в java.

public class Cat {
    private String name;
    private int age;
    private List<String> SeekStory;
    private long passport;
    private Doctor doctor;

    public Cat(String name){
        this.name = name;
        SeekStory = new ArrayList<>();
    }
    public void invite(){

    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setPassport(long passport){
        this.passport = passport;
    }
    public long getPassport(){
        return passport;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List <String> getClinicalRecord() {
        return SeekStory;
    }

    public void setAge(List <String> SeekStory) {
        this.SeekStory = SeekStory;
    }
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    @Override
    public String toString(){
        return "Cat{" + 
                "age=" + age +
                ", name=" + name + '\'' +
                ", seekStory=" + SeekStory + 
                ", passport=" + passport +
                ", doctor=" + doctor +
                '}';

    }
    @Override
    public boolean equals(Object obj){
       if (this == obj){
        return true;
       }
       if (!(obj instanceof Cat)){
        return false;
       }
       Cat cat = (Cat) obj;
        if (this.getName().equals(cat.getName()) && this.passport == cat.getPassport()){
            return true;
        }
        return false;        
    }
    @Override
    public int hashCode() {
        return (int)passport + name.hashCode();
    }
}
