package day28_recap;
//clamates
/// classmates  from
///  all  students

import java.util.Arrays;

public class MultiD_Array_Practice1 {
    public static void main(String[] args) {

        String [] group33 = {"Davut","Dilara","Nurmamet","Nurbiye","Pavlo","Julaiti","Virginia","Zain","Ali","Etnick","Aigul","Mike","Veola"};
        String [] group22 = {"Aiperi","Aalia","Rumiya","Viorel", "Samir"};
        String [] group21 = {"Violeta","Alla", "Adam", "Lilia"};
        String [] group17 = {"Elvira", "Zeliha", "Paban","Asylkan", "Dilyar", "Roza","Kamil", "Sedge"};
        String [] group2 = {"Ali", "Anton", "Elif", "Filip", "Guljannat","Muhtar"};

        String[][] batch20={group33,group22,group2,group21,group17};

        for(int i=0; i<=batch20.length-1;i++){
            String[] eachgroup=batch20[i];
            //System.out.println(Arrays.toString(eachgroup));
            for(int j=0; j<=eachgroup.length-1;j++){
                String eachStudent=eachgroup[j];
                if(eachStudent.toLowerCase().contains("m")){
                    System.out.print(eachStudent+" ");
                }

            }
            System.out.println();
        }

        System.out.println("======================");
        for(String[] eachGroup:batch20){
            for(String eachStudent:eachGroup){
                System.out.print(eachStudent + " ");
            }
            System.out.println();
        }
    }

}