package com.enigmacamp.fund;

import java.util.*;

public class Person {

    private String nama;
    private String pekerjaan;
    private List<Person> friends = new ArrayList<Person>();

    public Person(String nama, String pekerjaan) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
    }

    public void addFriend(Person person) {
        this.friends.add(person);
    }

    public void getMutualFriends(Person person) {
        for (Person nilai : this.friends) {
            for (Person nilai2 : person.friends) {
                if (nilai.equals(nilai2)) {
                    System.out.println(nilai.nama);
                }
            }
        }
    }

    public void listFriends() {
        System.out.println("Daftar teman - teman " + this.nama + " adalah = ");
        for (Person nama : this.friends) {
            System.out.println(nama.nama);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "nama='" + nama + '\'' +
                ", pekerjaan='" + pekerjaan + '\''  +
                '}';
    }
}
