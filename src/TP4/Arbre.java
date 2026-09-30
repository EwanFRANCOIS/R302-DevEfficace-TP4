package TP4;

import java.util.ArrayList;
import java.util.List;

public class Arbre<T> {

    private Node<T> racine;

    public Arbre() {
        this.racine = null;
    }

    public Arbre(Node<T> racine) {
        this.racine = racine;
    }

    public Node<T> getRacine() {
        return racine;
    }

    public void setRacine(Node<T> racine) {
        this.racine = racine;
    }

    public static <T> StringBuilder parcours_prefix(Node<T> racine) {
        if (racine == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(racine.getElement()).append(" ");

        for (Node<T> enfant : racine.getfils()) {
            sb.append(parcours_prefix(enfant));
        }
        sb.append(racine.getElement()).append(" ");

        return sb;
    }

    @Override
    public String toString() {
        return "Arbre{" +
                "racine=" + racine +
                '}';
    }

    private static class Node<T> {
        private T element;
        private List<Node<T>> fils;

        public Node(T element) {
            this.element = element;
            this.fils = new ArrayList<>();
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public List<Node<T>> getfils() {
            return fils;
        }

        public void setfils(Node<T> f) {
            fils.add(f);
        }

        @Override
        public String toString() {
            return "Node{" + element + ", fils=" + fils + "}";
        }
    }

    public static void main(java.lang.String[] args) {
      /* Résultat attendus :
                 A
               / | \
              B  C  D
             / \
            E   F
       */

        Node<String> a = new Node<>("A");
        Node<String> b = new Node<>("B");
        Node<String> c = new Node<>("C");
        Node<String> d = new Node<>("D");
        Node<String> e = new Node<>("E");
        Node<String> f = new Node<>("F");

        a.setfils(b);
        a.setfils(c);
        a.setfils(d);
        b.setfils(e);
        b.setfils(f);

        Arbre<String> monArbre = new Arbre<>(a);

        System.out.println("Racine  : " + monArbre.getRacine().getElement());
        System.out.println("Nb fils : " + monArbre.getRacine().getfils().size());
        System.out.println("Prefix  : " + parcours_prefix(monArbre.getRacine()));
    }
}

