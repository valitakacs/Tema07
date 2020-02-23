package org.FastTrackIt.HomeWork07.Ex1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Nume: " + person.getName("Marius") + ", Varsta: " + person.getAge(23) + ", Casatorit: " + person.isMarried(true));

        Person person1 = new Person();
        System.out.println("Nume: " + person1.getName("Mircea") + ", Varsta: " + person.getAge(38) + ", Casatorit: " + person.isMarried(true));

        Person person2 = new Person();
        System.out.println("Nume: " + person2.getName("Vali") + ", Varsta: " + person.getAge(20) + ",` Casatorit: " + person.isMarried(false));
        /*Puteam sa fac un constructor care sa primeasca parametri nume ,varsta ,statut si
            sa fac o methoda to string in care sa-mi afiseze numele , varsta si statutul;

              Ex:  Person person = new Person("vali",20,false);
                 System.out.println(persoana);
                Persoana persoana1 = new Persoana(alt nume, alta varsta, alt statut)
                System.out.println(persoana1);

    */
    }


}
