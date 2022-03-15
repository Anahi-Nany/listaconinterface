package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;

//Cambiamos : agregamos implements
public class ArrayListIterator implements Iterator {

    private final ArrayList arrayList;
    private int currentItem;

    ArrayListIterator(ArrayList arrayList){
        this.arrayList = arrayList;
    }

    public boolean hasNext(){
        return currentItem < arrayList.getSize();
    }

    public String next() {
        String data = arrayList.getAt(currentItem);

        currentItem++;
        return data;
    }
}
