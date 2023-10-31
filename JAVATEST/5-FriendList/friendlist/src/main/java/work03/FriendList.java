package work03;

public class FriendList {
    private final String friend;
    private FriendList next;

    private FriendList(String friend) {
        this.friend = friend;
    }

    public static FriendList newList() {
        return new FriendList("");
    }

    public boolean addFriend(String friend) {
        if (friend.equals(null) || friend.isBlank()) {
        }

        FriendList c = this;

        while (c.next != null) {
            c = c.next;
        }

        c.next = new FriendList(friend); // c.next = new constructer

        FriendList c2 = this;

        while (c2.next != null) {

            if (friend == c2.friend) {
                c.next = null;
                return false;
            }
            c2 = c2.next;
        }

        return true;
    }

    public void popFriend() {
        FriendList c = this;
        FriendList prev = c;
        while (c.next != null) {
            prev = c;
            c = c.next;
        }
        prev.next = null;

    }

    public void pushFriend(String friend) {
        FriendList c = this;
        if (c.next == null) {
            c.next = new FriendList(friend);
        }

        FriendList newObj = new FriendList(friend);
        newObj.next = c.next;

        this.next = newObj;

    }

    public int countFriends() {
        int result = 1;
        FriendList c = this.next;
        while (c.next != null) {
            c = c.next;
            result++;
        }
        return result;
    }

    public FriendList searchFriendList(int index) {
        System.out.println(index);
        if (index == 0) {
            return this;
        } else if (index > this.countFriends()) {
            throw new IllegalArgumentException();
        } else if (index < 0) {
            index = (this.countFriends() + index) + 1;
            if (index == 0) {
                return this;
            } else if (index < -1) {
                throw new IllegalArgumentException();
            }
        }

        FriendList c = this.next;

        for (int i = 1; i < index; i++) {
            c = c.next;
        }
        return c;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        FriendList c = this.next;

        while (c != null) {
            s.append(c.friend);
            c = c.next;
            if (c != null) {
                s.append(", ");
            }
        }

        return s.toString();
    }
}
