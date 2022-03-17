package uaslp.objetos.list.linkedlist;

class Node <T>{//Las clases solo pueden ser publicar o package privatre
    T data;//String data;
    Node<T> next;
    Node previous;

    Node(T data){
        this.data = data;
    }
}
