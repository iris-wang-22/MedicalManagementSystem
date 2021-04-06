package com.tosit.yl.entity;

/**
 * Created by Administrator on 2017/6/30.
 */
public class Opma {
    private int userId;
    private int opId;
    private Operation operation;
    private User user;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOpId() {
        return opId;
    }

    public void setOpId(int opId) {
        this.opId = opId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Opma{" +
                "userId=" + userId +
                ", opId=" + opId +
                '}';
    }
}
