package com.example.demo.interview;

import java.util.ArrayList;
import java.util.List;

public class SubSetDemo {

    public static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> subSetList = new ArrayList<>();
        subset(arr, 0, subSetList, new ArrayList<>());
        return subSetList;

    }

    public static void subset(int[] arr, int index, List<List<Integer>> subSetList, List<Integer> currList) {

        subSetList.add(new ArrayList<>(currList));
        /*  for (int i = index; i < arr.length; i++) {
        currList.add(arr[i]);
        subset(arr, i + 1, subSetList, currList);
        currList.remove(currList.size() - 1);
         }*/
        if(index == arr.length)
            return;

        currList.add(arr[index]);
        subset(arr, index + 1, subSetList, currList);
        currList.remove(currList.size() - 1);
        subset(arr, index + 1, subSetList, currList);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subset(arr));
    }
}
