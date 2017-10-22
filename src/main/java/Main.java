import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        List arrayList = new ArrayList();
        List vector = new Vector();
        List linkedList = new LinkedList();

        arrayList.add(1);
        arrayList.add(null);
        arrayList.add(1);
        System.out.println(arrayList.indexOf(null));
        System.out.println(arrayList.indexOf(1));
        System.out.println(arrayList.contains(1));
        System.out.println(arrayList.contains(2));
        System.out.println(arrayList.lastIndexOf(1));

        ArrayList al = new ArrayList();
        ArrayList al1 = new ArrayList();

        al.addAll(arrayList);
        al1 = al;

        System.out.println(al1);
        System.out.println(al.add(10));
        System.out.println(al);
        System.out.println(al.remove(3));
        System.out.println(al);
        al.clear();
        System.out.println(al);
        al.addAll(arrayList);
        al.add(11);
        al.add(15);
        al.add(17);
        al.removeAll(arrayList);
        System.out.println(al);
        al.addAll(arrayList);
        al.retainAll(arrayList);
        System.out.println(al);

    }

}
