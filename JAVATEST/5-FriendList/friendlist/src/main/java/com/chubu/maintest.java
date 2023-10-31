package com.chubu;

import work02.FLTEST;
import work02.fltestself;

public class maintest {
    public static void main(String[] args) {
        fltestself f1 = fltestself.helpconstructer();

        f1.addFriend("Auto");
        f1.addFriend("Win");
        System.out.println(f1);
    }
}
