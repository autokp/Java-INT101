package com.chubu;

import work02.FriendList;

public class Main {
    public static void main(String[] args) {
        // FriendList f1 = new FriendList("");
        FriendList f1 = FriendList.newList();
        work03.FriendList f2 = work03.FriendList.newList();
        f1.addFriend("Most");
        f1.addFriend("Fern");
        
        f2.addFriend("Most");
        f2.addFriend("Fern");

        
        System.out.println(f1);
        System.out.println(f2.searchFriendList(-1));

    }
}