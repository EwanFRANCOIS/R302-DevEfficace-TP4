package TP4;

public class Arbre {

    private Node racine;

    public Arbre() {
        this.racine = null;
    }

    public Arbre(Node racine) {
        this.racine = racine;
    }

    public Node getRacine() {
        return racine;
    }

    public void setRacine(Node racine) {
        this.racine = racine;
    }

    public static StringBuilder parcours_prefix(Node racine) {
        if (racine == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(racine.getElement());
        sb.append(parcours_prefix(racine.getNext()));
        sb.append(parcours_prefix(racine.getNextNodeDroite()));

        return sb;
    }

    private static class Node {
        private Integer element;
        private Node next;
        private Node droite;

        public Node(Integer element, Node next) {
            this.element = element;
            this.next = next;
        }

        public Node(Integer element) {
            this.element = element;
        }

        public Integer getElement() {
            return element;
        }

        public void setElement(Integer element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public Node getNextNodeDroite() {
            return droite;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setNextNodeDroite(Node droite) {
            this.droite = droite;
        }
    }

    public static void main(java.lang.String[] args) {
        Arbre monArbre = new Arbre();


    }
}

