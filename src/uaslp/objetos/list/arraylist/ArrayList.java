
package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.List;
import uaslp.objetos.list.Iterator;

//Cambiamos el class
//Aca digo q arraylist cumple con el contrato de la lista
//buena practica pner @overlay
//el simbolo es de que son parte
public class ArrayList <T> implements List <T> {
    private static final int DEFAULT_SIZE = 50;
    private T[] array;

    private int size;

    public static String getName(){return "ArrayList";}

    //Sobrecarga
    public ArrayList(){
        array = (T[])new Object[DEFAULT_SIZE];
    }
    public ArrayList(int size){
        array = (T[])new Object[size];
    }
    //object a ser el padre, se

    //Agregar a la cola
    public void addAtTail(T data) {
        if(size == array.length){
            increaseArraySize();
        }
        array[size] = data;
        size++;
    }

    //Agregar al frente
    public void addAtFront(T data){
        if(size == array.length){
            increaseArraySize();
        }

        if (size >= 0){
            System.arraycopy(array, 0, array, 1, size);
        }
        array[0]=data;
        size++;
    }

    //se recorren datos / disminuye size
    public  void remove(int index){
        if (index < 0 || index >= size){
            return;
        }

        for( int i= index ; i<size-1; i++) {
            array[i] = array[i+1];
        }
        array[size -1] = null;
        size--;
    }

    public void removeAll(){
        for ( int i= 0; i<size-1; i++){
            array[i] = null;
        }
        size =0;
    }

    public void setAt(int index, T data){
        if (index >= 0 && index < size){
            array[index] = data;
        }
    }

    public T getAt(int index){
        return index >= 0 && index < size ? array[index] : null;
    }

    //Cambio arraylistIterator por iterator
    //pido que regrese la generalizacion
    public Iterator<T> getIterator(){
        return new ArrayListIterator <>(this);
    }
    //Solo se pone el diamante vacio

    public int getSize(){
        return size;
    }

    private void increaseArraySize(){
        T []newArray = (T[])new Object[array.length * 2];
//casteo
        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }

        array = newArray;
    }

}
