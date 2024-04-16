public class Animal {
    String family;

    String name;
    int age;
    boolean isMammal;
    public Animal(){

    }
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
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
