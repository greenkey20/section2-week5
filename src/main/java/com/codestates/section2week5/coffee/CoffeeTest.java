package com.codestates.section2week5.coffee;

// 2022.10.19(수) 17h
public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeService coffeeService = new CoffeeService();

        Coffee coffee = new Coffee(0L, "오트 라떼", "oat latte", 3700);
        coffeeService.createCoffee(coffee);

        if (coffeeService.getCoffee(0L).getKorName().equals(coffee.getKorName())) {
            System.out.println("오트 라떼가 등록되었습니다");
        }

        coffeeService.editCoffee(0L, "오트 라떼", 3000);

        if (coffeeService.getCoffee(0L).getPrice() == 3000) {
            System.out.println("오트 라떼의 가격이 정상적으로 변경되었습니다");
        }

        coffeeService.deleteCoffee(0L);

        if (coffeeService.getCoffee(0L) == null) {
            System.out.println("오트 라떼가 정상적으로 삭제되었습니다");
        }
    }
}
