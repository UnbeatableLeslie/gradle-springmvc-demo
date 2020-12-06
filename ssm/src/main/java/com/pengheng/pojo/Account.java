package com.pengheng.pojo;

/**
 * @Author pengheng
 * @Date 2020/12/6 1:26
 * @Remark
 */
public class Account {

    private String name;
    private String cardNo;
    private int money;

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

}
