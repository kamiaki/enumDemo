package com.aki;

public class TestMain {
    public static void main(String[] args) {
        String a = PositionEnum.getValueByCode("165");
        System.out.println(a);
        boolean existByCode = PositionEnum.isExistByCode("165");
        System.out.println(existByCode);
    }
}
