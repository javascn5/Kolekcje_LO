package com.sda.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();


        lista.add("Jan");
        lista.add("Maciej");
        lista.add("Tadeusz");

        System.out.println("Rozmiar: " + lista.size());

        lista.add("Mateusz");
        lista.add("Karol");

        System.out.println("Rozmiar: " + lista.size());

        for (String imie: lista){
            System.out.println("Imie: " + imie);
        }

        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

        lista.remove("Jan");
        lista.remove(0);
        String imie;
        try {
             imie = lista.get(72);
            System.out.println("Element o indeksie 2: " + imie);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Za daleko!!");
            e.printStackTrace();
        }

        lista.clear();

        List<User> users = new ArrayList<>();

        User user = new User("Jan", "Kowalski", 23);
        User user1 = new User("Karol", "Nowak", 23);

        users.add(user);
        users.add(user1);

        for (User u: users){
            System.out.println("Imie: " + u.getName());
        }

        for (int i=0; i<users.size(); i++){
            System.out.println("Imie: " + users.get(i));
        }

    }
}
