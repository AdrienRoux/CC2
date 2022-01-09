package fr.esgi.archi_logicielle_cc2.domain.models;

public class Membership {
    private String name;
    private String firstname;
    private int age;

    public Membership(String name, String firstname, int age) {
        this.name = name;
        this.firstname = firstname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
