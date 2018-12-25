import java.util.*;


public class Task1 {
    public static void result(Collection<Integer> col,String name){
        for(int i=0;i<999;i++) {
            col.add(i);
        }
        long start1 = System.nanoTime();
        col.add(9);
        long total1 = System.nanoTime() - start1;
        long start2 = System.nanoTime();
        col.contains(5);
        long total2 = System.nanoTime() - start2;
        long start3 = System.nanoTime();
        col.remove(2);
        long total3 = System.nanoTime() - start3;
        System.out.println("Adding time for" + " "  + name + " " + total1);
        System.out.println("Finding time for" + " "  + name + " " + total2);
        System.out.println("Removing time for" + " "  + name + " " + total3);
    }
    public static void main(String[] args)  {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList= new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        result(linkedList, "LinkedList");
        result(arrayList,  "ArrayList");
        result(hashSet, "HashSet");
        result(treeSet, "TreeSet");
    }
}