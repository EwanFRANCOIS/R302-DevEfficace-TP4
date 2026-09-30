package TP4;

import java.util.ArrayList;

public class Arbre<String> {
    private String racine;
    private ArrayList<Feuilles> feuilles;

    public Arbre() {
        this.racine = null;
        this.feuilles = null;
    }

    public Arbre(String element, ArrayList<Feuilles> feuilles) {
        this.racine = element;
        this.feuilles = feuilles;
    }

    public String getElement() {
        return racine;
    }

    public void setElement(String element) {
        this.racine = element;
    }

    public ArrayList<Feuilles> getFeuilles() {
        return feuilles;
    }

    public void setFeuilles(ArrayList<Feuilles> feuilles) {
        this.feuilles = feuilles;
    }

    private static class Feuilles<String> {
        private ArrayList<String> element;
        private Feuilles nextFeuilles;

        public Feuilles() {
            this.element = null;
            this.nextFeuilles = null;
        }

        public Feuilles(ArrayList<String> element, Feuilles nextChildren) {
            this.element = element;
            this.nextFeuilles = nextChildren;
        }

        public ArrayList<String> getElement() {
            return element;
        }

        public void setElement(ArrayList<String> element) {
            this.element = element;
        }

        public Feuilles getNextChildren() {
            return nextFeuilles;
        }

        public void setNextChildren(Feuilles nextChildren) {
            this.nextFeuilles = nextChildren;
        }

        @Override
        public java.lang.String toString() {
            return "Feuilles{" +
                    "element=" + element +
                    ", nextFeuilles=" + nextFeuilles +
                    '}';
        }
    }

    @Override
    public java.lang.String toString() {
        return "Arbre{" +
                "racine=" + racine +
                ", feuilles=" + feuilles +
                '}';
    }

    public static void main(java.lang.String[] args) {
        Arbre monArbre = new Arbre();

        // Creation des feuilles
        ArrayList<Feuilles> listeDeFeuilles = new ArrayList<>();

        // Element
        ArrayList<java.lang.String> element = new ArrayList<>();

        element.add("body");

        Feuilles f1 = new Feuilles();
        Feuilles f2 = new Feuilles();

        f1.setElement(element);

        listeDeFeuilles.add(f1);
        listeDeFeuilles.add(f2);

        monArbre.setElement("head");
        monArbre.setFeuilles(listeDeFeuilles);

        System.out.println(monArbre.toString());
    }
}

