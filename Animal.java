package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;


    public Animal(){

    }
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        if(age >= 0)
            this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily(){
        return this.family;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isMammal(){
        return this.isMammal;
    }

    public void setFamily(String family){
        this.family = family;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age >= 0)
            this.age = age;
    }

    public void setMammal(boolean isMammal){
        this.isMammal = isMammal;
    }

    @Override
    public String toString(){
        return name + " : " + family + " | " + age + " | " + isMammal;
    }

    @Override
    public boolean equals(Object o){
        return ((Animal)o).name.equals(this.name);
    }

}
