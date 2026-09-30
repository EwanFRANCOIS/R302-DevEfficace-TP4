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

    @Override
    public String toString() {
        return "Arbre{" +
                "racine=" + racine +
                '}';
    }

    private static class Node {
        private String element;
        private Node next;
        private Node droite;

        public Node(String element, Node next) {
            this.element = element;
            this.next = next;
        }

        public Node(String element) {
            this.element = element;
        }

        public String getElement() {
            return element;
        }

        public void setElement(String element) {
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
        Node n5 = new Node("5");
        Node n2 = new Node("2");
        Node n8 = new Node("8");

        Node plus = new Node("+", n5);
        plus.setNextNodeDroite(n2);

        Node fois = new Node("*", plus);
        fois.setNextNodeDroite(n8);

        Arbre monArbre = new Arbre(fois);

        System.out.println("Racine : " + monArbre.getRacine().getElement());
        System.out.println("Gauche : " + monArbre.getRacine().getNext().getElement());
        System.out.println("Droite : " + monArbre.getRacine().getNextNodeDroite().getElement());
        System.out.println("Prefix : " + Arbre.parcours_prefix(monArbre.getRacine()));
    }
}

