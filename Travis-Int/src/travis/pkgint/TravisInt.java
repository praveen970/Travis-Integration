/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travis.pkgint;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author PraveenKumar
 */
public class TravisInt {

    
    
    public static <T> int linearSearch(List<T> list, Predicate<T> check) {
        for (int pos = 0; pos < list.size(); pos++)
            if (check.test(list.get(pos)))
                return pos;
        return -1;
    }
    
    public static void print(String msg) {
        System.out.println(msg);
    }
    public static Predicate<String> findP(){
        return name -> name.length() == 5;
    }
    public static Predicate<Integer> findN(){
        return num -> num < 0;
    }
    public static Predicate<String> findB(){
        return num -> false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("zebra", "ox", "tiger");
        List<Integer> nums = Arrays.asList(5, 2, -3);
        //System.out.println(linearSearch(animals, (name)-> name.length() == 5));
        System.out.println(linearSearch(animals, findP()));
       // System.out.println(linearSearch(nums, (num)-> num < 0));
        System.out.println(linearSearch(nums, findN()));
        //System.out.println(linearSearch(animals, (name)-> false));
        System.out.println(linearSearch(animals, findB()));
    }

    
}
