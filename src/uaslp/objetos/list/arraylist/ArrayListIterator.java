package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;

//Cambiamos : agregamos implements
//la ge es para definir
public class ArrayListIterator <T> implements Iterator<T> {

    private final ArrayList<T> arrayList;
    private int currentItem;

    ArrayListIterator(ArrayList arrayList){
        this.arrayList = arrayList;
    }

    public boolean hasNext(){
        return currentItem < arrayList.getSize();
    }

    public T next() {
        T data = arrayList.getAt(currentItem);

        currentItem++;
        return data;
    }
}
