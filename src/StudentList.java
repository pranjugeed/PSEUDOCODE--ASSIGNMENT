import java.util.LinkedList;
import java.util.Collections;

public class StudentList {
        public static void main(String[] args) {
            LinkedList<String> list1 = new LinkedList<>();
            list1.add("Aman");
            list1.add("Riya");
            list1.add("Sohan");
            list1.addFirst("Priya");
            LinkedList<String> list2 = new LinkedList<>();
            list2.add("Neha");
            list2.add("Rahul");
            list1.addAll(list2);
            System.out.println("Normal Order: " + list1);
            Collections.reverse(list1);
            System.out.println("Reverse Order: " + list1);
        }
    }



