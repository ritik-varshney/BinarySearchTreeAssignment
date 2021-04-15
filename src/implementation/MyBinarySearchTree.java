package implementation;

import myinterface.BinarySearchTreeADT;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    Node<E> root = null;

    public Node<E> getRoot() {
        return root ;
    }

    @Override
    public void insert(E data) {
        java.lang.Object element;
        Node<E> node = new Node<>(element);
        if (isEmpty()) {
            root = node;
        } else {
            //traverse and reach the position where new node
            // will be inserted as well as keep reference of parent
            Node<E> temp = root;
            Node<E> parent = null;
            while (temp != null) {
                parent = temp;
                if (element.compareTo(temp.getData()) <= 0) {
                    //update temp to refer left subtree
                    temp = temp.getLeft();
                } else {
                    //update temp to refer right subtree
                    temp = temp.getRight();
                }
            }
            //checking whether new node will be left or right
            //child of parent
            if (element.compareTo(parent.getData()) <= 0) {
                //set new node to left child of parent
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }

    }

    private boolean isEmpty() {
        return root==null;
    }

    @Override
    public boolean  search(E searchElement) {


        return false;
    }

    @Override
    public void inOrder(Node<E> node) {

    }

    @Override
    public void preOrder(Node<E> node) {

    }

    @Override
    public void postOrder(Node<E> node) {

    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
}
