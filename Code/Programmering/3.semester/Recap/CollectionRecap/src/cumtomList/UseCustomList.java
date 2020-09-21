package cumtomList;

public class UseCustomList {

    public static void main(String[] args) {
        EasyList<String> easyList = new EasyList();


        if (easyList.isSomeWhatFull()){
            System.out.println("good");
        }
        else {
            System.out.println("add more");
        }
    }
}
