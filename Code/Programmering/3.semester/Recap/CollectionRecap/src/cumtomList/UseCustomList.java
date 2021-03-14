package cumtomList;

public class UseCustomList {

    public static void main(String[] args) {


        EasyList<Integer> list = new EasyList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);

        if (list.isThereLessThenFive()){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }





//        easyList.add("Hello ");
//        easyList.add("Hello ");
//        easyList.add("Hello ");
//        easyList.add("Hello ");
//        easyList.add("Hello ");
//        easyList.add("Hello ");
//        easyList.add("Hello ");
//        easyList.add("Hello ");
//        easyList.add("Hello ");
//        easyList.add("Hello ");
//        easyList.add("Hello ");
//
//
//
//        if (easyList.isSomeWhatFull()){
//            System.out.println("good");
//        }
//        else {
//            System.out.println("add more");
//        }
    }
}
