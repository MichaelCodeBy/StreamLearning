package Interfaces;

import ObjectClass.Test;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.function.Predicate;

public class FunctionInterface {


    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(4));
        System.out.println(isPositive.test(-37));
        System.out.println(isPositive.test(4));
        System.out.println(isPositive.test(-2));

    }
}


