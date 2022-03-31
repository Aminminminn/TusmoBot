package fr.amin.main;

import java.text.Normalizer;

public class TusmoBot {

    //Méthode permettant
    public String stripAccents(String s) {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        return s.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    public static void main(String[] args) {

    }

}
