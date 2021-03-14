package cumtomList;

public class UseMyList {


    public static void main(String[] args) {

        int[] a = new int[3];



        MyList<Integer> list = new MyList<>();

        MyList<String> myList = new MyList<>();

        myList.add("Charlie");
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");


        System.out.println(myList.contains("c"));

        System.out.println(myList);

        myList.remove(1);
        myList.remove(2);


        System.out.println(myList);

        //System.out.println(myList);

        //System.out.println(myList.isEmpty());

    }

}