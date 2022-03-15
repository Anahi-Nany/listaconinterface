import uaslp.objetos.list.List;
import uaslp.objetos.list.Iterator;
//import uaslp.objetos.list.uaslp.objetos.list.linkedlist.arraylist.ArrayList;
//import uaslp.objetos.list.linkedlist.LinkedListIterator;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.linkedlist.LinkedList;

public class  Main {
    public static void main(String[] Args) {
        //inicializo
        List team1 = new LinkedList();
        List team2 = new LinkedList();
        List team3 = new LinkedList();

        System.out.println("CON LISTAS TIPO LINKEDLIST");
        testingList(team1, team2, team3);
        System.out.println();

        team1 = new ArrayList();
        team2 = new ArrayList();
        team3 = new ArrayList();

        System.out.println("CON LISTAS TIPO ARRAYLIST");
        testingList(team1, team2, team3);
    }

    public static void testingList(List team1, List team2, List team3){
        team1.addAtTail("Anahi");
        team1.addAtTail("Rebeca");
        team1.addAtTail("Imelda");

        team2.addAtFront("Angel");
        team2.addAtFront("Santiago");
        team2.addAtFront("Daniel");

        team3.addAtFront("Marina");

        Iterator iterator;

        iterator = team1.getIterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println();

        iterator = team2.getIterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        team1.remove(0);
        team1.addAtFront("Rebeca");
        System.out.println();
        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");

        iterator = team1.getIterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        team2.remove(2);
        team2.addAtTail("Rita");
        System.out.println();
        System.out.println("Team 2 tiene: " + team2.getSize() + " integrantes");

        iterator = team2.getIterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        team3.remove(0);
        team3.remove(0);

        team3.addAtTail("Tadeo");
        team3.addAtFront("Isai");

        System.out.println();
        System.out.println("Team 3 tiene: " + team3.getSize() + " integrantes");

        iterator = team3.getIterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        if (team1.getAt(1).equals("Salomon")){
            team1.setAt(1,"Luis");
        }

        System.out.println();
        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");

        iterator = team1.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
