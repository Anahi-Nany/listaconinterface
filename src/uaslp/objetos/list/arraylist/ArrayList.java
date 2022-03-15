package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;

//Cambiamos el class
public class ArrayList implements List{
    private static final int DEFAULT_SIZE = 50;
    private String[] array;
    private int size;

    //Sobrecarga
    public ArrayList(){
        array = new String[DEFAULT_SIZE];
    }
    public ArrayList(int size){
        array = new String[size];
    }

    //Agregar a la cola
    public void addAtTail(String data) {
        if(size == array.length){
            increaseArraySize();
        }
        array[size] = data;
        size++;
    }

    //Agregar al frente
    public void addAtFront(String data){
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

    public void setAt(int index, String data){
        if (index >= 0 && index < size){
            array[index] = data;
        }
    }

    public String getAt(int index){
        return index >= 0 && index < size ? array[index] : null;
    }

    //Cambio arraylistIterator por iterator
    public Iterator getIterator(){
        return new ArrayListIterator(this);
    }

    public int getSize(){
        return size;
    }

    private void increaseArraySize(){
        String []newArray = new String[array.length * 2];

        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }

        array = newArray;
    }

}
