package org.example;

public class CustomLinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public CustomLinkedList<T> add(T element) {
        Node<T> node = new Node<>();
        node.setData(element);
        node.setNext(null);

        if (size == 0) {
            setFirst(node);
        } else {
            last.setNext(node);
        }

        setLast(node);

        size++;
        return this;
    }

    public CustomLinkedList<T> add(T element, int n) {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }
        
        Node<T> nodeBefore = getNodeByIndex(n);
        Node<T> nodeAfter = nodeBefore.getNext();

        Node<T> node = new Node<>();
        node.setData(element);
        node.setNext(nodeAfter);

        nodeBefore.setNext(node);

        if (nodeAfter == null) {
            setLast(node);
        }

        size++;
        return this;
    }

    public CustomLinkedList<T> remove(T element) {
        return null;
    }

    public T getFirst() {
        if (first == null) {
            throw new IndexOutOfBoundsException();
        }
        return first.getData();
    }

    public T get(int n) {
        return getNodeByIndex(n).getData();
    }

    private void setFirst(Node<T> first) {
        this.first = first;
    }

    public T getLast() {
        if (last == null) {
            throw new IndexOutOfBoundsException();
        }
        return last.getData();
    }

    private void setLast(Node<T> last) {
        this.last = last;
    }
    
    public int size() {
        return size;
    }

    private Node<T> getNodeByIndex(int index) {
        if (first == null) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
            if (node == null) {
                throw new IndexOutOfBoundsException();
            }
        }

        return node;
    }

}
