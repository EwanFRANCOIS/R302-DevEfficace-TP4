package TP4;

import java.util.ArrayList;

public class Arbre<T> {
    private T racine;
    private ArrayList<Arbre<T>> enfants;

    public Arbre() {
        this.racine = null;
        this.enfants = null;
    }

    public Arbre(T racine, ArrayList<Feuilles> feuilles) {
        this.racine = racine;
        this.enfants = enfants;
    }

    public T getRacine() {
        return racine;
    }

    public void setRacine(T racine) {
        this.racine = racine;
    }

    public ArrayList<Arbre<T>> getEnfants() {
        return enfants;
    }

    public void setEnfants(ArrayList<Arbre<T>> enfants) {
        this.enfants = enfants;
    }

    public void parcours_prefix() {

        System.out.println(racine);

        for (Arbre<T> enfant : enfants) {
            enfant.parcours_prefix();
        }
    }

    private static class Feuilles<T> {
        private ArrayList<T> element;
        private Feuilles nextFeuilles;

        public Feuilles() {
            this.element = null;
            this.nextFeuilles = null;
        }

        public Feuilles(ArrayList<T> element, Feuilles nextChildren) {
            this.element = element;
            this.nextFeuilles = nextChildren;
        }

        public ArrayList<T> getElement() {
            return element;
        }

        public void setElement(ArrayList<T> element) {
            this.element = element;
        }

        public Feuilles getNextChildren() {
            return nextFeuilles;
        }

        public void setNextChildren(Feuilles nextChildren) {
            this.nextFeuilles = nextChildren;
        }
    }

    public static void main(java.lang.String[] args) {
        Arbre monArbre = new Arbre();

    }
}

