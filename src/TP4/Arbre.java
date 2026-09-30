package TP4;

import java.util.List;

public class Arbre<T> {

    private Feuilles root;

    public Arbre() {
        this.root = null;
    }

    public Arbre(Feuilles root) {
        this.root = root;
    }

    private static class Feuilles<T> {
        private List<T> element;
        private Feuilles nextChildren;

        public Feuilles() {
            this.element = null;
            this.nextChildren = null;
        }

        public Feuilles(List<T> element, Feuilles nextChildren) {
            this.element = element;
            this.nextChildren = nextChildren;
        }

        public List<T> getElement() {
            return element;
        }

        public void setElement(List<T> element) {
            this.element = element;
        }

        public Feuilles getNextChildren() {
            return nextChildren;
        }

        public void setNextChildren(Feuilles nextChildren) {
            this.nextChildren = nextChildren;
        }


    }

    public static void main(String[] args) {

    }
}

