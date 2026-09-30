package TP4;

import java.util.List;

public class Arbre<T> {
    private T data;
    private List<String> children;

    public Arbre() {

    }

    public Arbre(T data, List<String> children) {
        this.data = data;
        this.children = children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }
}
