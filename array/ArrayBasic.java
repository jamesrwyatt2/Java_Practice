import java.util.ArrayList;

public class ArrayBasic{

    public void arrayPrint(){
        // Array VS ArrayList

        // Array (static)
        //int[] arrays;
        //arrays = new int[10];

        //int[] newArrays = {1,2,3,4,5,6,7,8,9,10};

        // ArrayList (dynamic)
        ArrayList<Integer> List = new ArrayList<Integer>();
        List.add(0); //push
        List.add(1); //push
        List.remove(List.size()-1); //pop
        System.out.println(List);
    }
    public void bars(){
        for (int i = 0; i < 7; i++){
            System.out.println("bar");
        }
    }
}