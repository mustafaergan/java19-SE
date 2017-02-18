package com.vektorel2.koleksiyon.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Islem {
	public static void main(String[] args) {
		
//		Queue<String> kuyruk = new LinkedList<>();
//
//		kuyruk.offer("1");
//		kuyruk.offer("2");
//		kuyruk.offer("3");
//		System.out.println(kuyruk.peek());
//		
//		System.out.println(kuyruk);
//		
//		System.out.println(kuyruk.poll());
//		System.out.println(kuyruk.poll());
//
//		System.out.println(kuyruk.peek());
//		System.out.println(kuyruk);
		
		
		MyQueue kuyrukSifim = new MyQueue();
		kuyrukSifim.offer("ahmet");
		kuyrukSifim.offer("mehmet");
		kuyrukSifim.offer("hasana");
		kuyrukSifim.veriGoster();
		System.out.println(kuyrukSifim.poll());

		
	}

}
