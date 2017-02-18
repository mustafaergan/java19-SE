package com.vektorel2.koleksiyon.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue{

	Queue<String> kuyruk = new LinkedList<>();
	
	public void offer(String veri){
		kuyruk.offer(veri);
	}
	public String poll(){
		if(kuyruk.isEmpty())
			return "";
		return kuyruk.poll();
	}
	public void veriGoster(){
		Iterator<String> array = kuyruk.iterator();
		while (array.hasNext()) {
			String string = array.next();
			System.out.println(string);
		}
	
	
	}
	
	
	

	
}
