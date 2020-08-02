package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");



        // verify that the names Ulku, Busra are contained in students list
        boolean r1 = students.containsAll(  Arrays.asList("Ulku", "Busra", "Muhtar")   );

        System.out.println(r1);


        System.out.println("==============================================");

        ArrayList<String> group1=new ArrayList<>();
        // add all students name in your  group
        group1.addAll(Arrays.asList("ali","mehmet","zati"));
        System.out.println(group1);



    }

}