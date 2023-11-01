package Cours1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo_Class {
    public static void main(String[] args) {
        Personne phil = new Personne("Phil", 29);
        System.out.println(phil.estMajeur());
    }
    static class Personne {
        String nom;
        int age;

        Personne(String _nom, int _age) {
            nom = _nom;
            age = _age;
        }

        boolean estMajeur() {
            return  age >= 18;
        }
    }

}
