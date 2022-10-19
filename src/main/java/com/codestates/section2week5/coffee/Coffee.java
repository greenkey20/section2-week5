package com.codestates.section2week5.coffee;

// 2022.10.19(수) 16h40
public class Coffee {
    // 멤버 변수
    private Long coffeeId;
    private String korName;
    private String engName;
    private int price; // 음료 가격/금액

    // 생성자
    public Coffee(Long coffeeId, String korName, String engName, int price) {
        this.coffeeId = coffeeId;
        this.korName = korName;
        this.engName = engName;
        this.price = price;
    }

    // g/setter
    public Long getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(Long coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getKorName() {
        return korName;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
