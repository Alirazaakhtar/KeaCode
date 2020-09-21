package cumtomList;

import java.util.ArrayList;

public class EasyList<T> extends ArrayList {

    public boolean isSomeWhatFull(){

        return size() > 10;
    }

}
