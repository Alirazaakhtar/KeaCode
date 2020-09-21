package cumtomList;

import java.util.Arrays;

public class MyList<T> {

    // lav en storage
    private T[] list = (T[]) new Object[4]; // start med 4

    private int cursor = 0;

    public boolean add(T element) {
// Precondition: There is always at least one empty slot
        list[cursor] = element;
        cursor++;// flyt cursor en pos til højre
        // check om cursor er blevet for stor ift. list
        if (cursor > list.length - 1) { // skaf mere plads
            T[] newArray = (T[]) new Object[list.length * 2];
            System.arraycopy(list, 0, newArray, 0, cursor);
            list = newArray;
            System.out.println("nyt array: " + list.length);
        }
        return true;
    }

    public T get(int index) {
        if (index > -1 && index < cursor) {
            return list[index];
        } else {
            throw new IndexOutOfBoundsException("Din index var " + index + " som er udenfor pædagogiks rækkevide");
        }
    }


    public boolean contains(T element) {
        for (int i = 0; i < cursor; i++) {
            if (element.equals(list[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(int index) {
// 1. check input
        if (index > -1 && index < cursor) {
            // slet element på index
            for (int i = index; i < cursor - 1; i++) {
                list[i] = list[i + 1];
            }
            cursor--;
            // 3.evt. halver list
            if (cursor < list.length / 2) {
                T[] newArray = (T[]) new Object[list.length / 2];
                System.arraycopy(list, 0, newArray, 0, cursor);
                list = newArray;
                System.out.println("nyt array: " + list.length);

            }

        } else {
            throw new IndexOutOfBoundsException("Din index var " + index + " som er udenfor pædagogiks rækkevide");
        }


        return true;


        /*
        if(list[index] != null){
            list[index] = null;

            for(int i = 0; i< cursor; i++){
                if(list[i] == null){
                    list[i] = list[i+1];
                    list[i+1] = null;
                }
            }


            return true;
        }

        return false;

         */

    }


    public boolean isEmpty() {
        if (list[0] == null) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "MyList{" +
                "list=" + Arrays.toString(list) +
                ", cursor=" + cursor +
                '}';
    }
}

