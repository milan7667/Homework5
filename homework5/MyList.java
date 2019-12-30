package com.cursor.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Comparable<T>> {
    public static void main(String[] args) {
        getLargestValue();
        getSmallestValue();
    }

    public void toAddElementtoList() {
            List<T> MyList = new ArrayList<>();
        MyList.add(T t1);
        MyList.add(T t2);
        MyList.add(T t3);
    }

    public getLargestValue() {
        return Collections.max(MyList);
    }

    public getSmallestValue() {
        return Collections.min(MyList);
    }
}
