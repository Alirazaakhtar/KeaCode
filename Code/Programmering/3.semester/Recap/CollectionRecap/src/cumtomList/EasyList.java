package cumtomList;

import java.util.ArrayList;

public class EasyList<T> extends ArrayList {

    public boolean isSomeWhatFull(){

        return size() > 10;
    }


    public boolean isThereLessThenFive(){

        if(size() < 5){

            return true;
        }

        return false;
    }



}
