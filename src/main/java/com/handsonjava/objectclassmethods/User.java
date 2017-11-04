package com.handsonjava.objectclassmethods;

import com.sun.istack.internal.Nullable;

public class User {
    private long userId;
    private String fullName;
    private String email;

    User() {
        this(0, "", "");
    }

    User(long userId, String fullName, String email) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public boolean equals(@Nullable Object o) {
//        if (this == o) return true;
//        //if(this == null) return false;
//        if (this.getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return userId != user.userId
//                && (!fullName.equals(((User) o).fullName))
//                && (!email.equals(((User) o).email));
//    }
//    @Override

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getUserId() != user.getUserId()) return false;
        if (!getFullName().equals(user.getFullName())) return false;
        return getEmail() != null ? getEmail().equals(user.getEmail()) : user.getEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getUserId() ^ (getUserId() >>> 32));
        result = 31 * result + getFullName().hashCode();
        result = 31 * result + (getEmail() != null ?  getEmail().hashCode() : 0);
        return result;
    }

//public int hashCode(){
//
//    }
}
