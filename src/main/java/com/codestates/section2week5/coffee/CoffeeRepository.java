package com.codestates.section2week5.coffee;

import java.util.HashMap;
import java.util.Map;

// 2022.10.19(수) 16h50
public class CoffeeRepository {
    // 클래스 변수
    private static Map<Long, Coffee> drinks = new HashMap<>();

    // 인스턴스 메서드
    public void postCoffee(Coffee coffee) {
        drinks.put(coffee.getCoffeeId(), coffee);
    }

    public Coffee patchCoffee(Long coffeeId, String korName, int price) {
        Coffee drink = drinks.get(coffeeId);
        drink.setKorName(korName);
        drink.setPrice(price);

        return drinks.put(coffeeId, drink); // Map 인터페이스의 put() 메서드의 반환 값 = 전달인자로 받은 key에 해당하는 value
    }

    public Coffee getCoffee(Long coffeeId) {
        return drinks.get(coffeeId);
    }

    public void deleteCoffee(Long coffeeId) {
        drinks.remove(coffeeId);
    }
}
