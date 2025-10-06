package com.example.demo.interview;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ExecutorService executorService = Executors.newFixedThreadPool(1000);
        ExecutorService executorService1 = Executors.newFixedThreadPool(1000);
        executorService.submit(()->{
            System.out.println("Hello "+Thread.currentThread().getName());
        });
        executorService1.submit(()->{
            System.out.println("Second "+Thread.currentThread().getName());
        });

        reverse(arr, 2);
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        CompletableFuture.runAsync(()->{
            System.out.println("ASYNC : "+Thread.currentThread().getName());
        });
    }

    public static void reverse(int[] arr, int k) {
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    public static void reverse(int[] arr, int start, int high) {
        while (start < high) {
            int temp = arr[start];
            arr[start] = arr[high];
            arr[high] = temp;
            start++;
            high--;
        }
    }
}
