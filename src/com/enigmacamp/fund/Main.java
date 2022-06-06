package com.enigmacamp.fund;

public class Main {

    public static void main(String[] args) {

        Person dicky = new Person("Dicky", "Admin");
        Person diana = new Person("Diana", "Programmer");
        Person satria = new Person("Satria", "Guru");
        Person musa = new Person("Musa", "Admin");
        Person gilang = new Person("Gilang", "Marketing");

//        System.out.println(dicky);
//        System.out.println(diana);
//        System.out.println(satria);
//        System.out.println(musa);
//        System.out.println(gilang);

        dicky.addFriend(diana);
        dicky.addFriend(satria);
        musa.addFriend(gilang);
        musa.addFriend(satria);

        dicky.listFriends();
        musa.listFriends();
        System.out.println("===== mutual =====");
        dicky.getMutualFriends(musa);
    }
}