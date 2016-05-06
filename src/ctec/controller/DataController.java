package ctec.controller;

import java.util.Queue;
import java.util.Stack;

import ctec.model.*;

public class DataController
{
	
	private Queue<Customer> customerQueue;
	private Stack<Dish> dishes;
	
	public void sta()
	{
		doStuffToDishes();
		useTheCustomerQueue();
	}
	
	private void doStuffToDishes()
	{
		dishes = new Stack<Dish>();
		dishes.add(new Dish(true, java.awt.Color.BLACK, 8));
		System.out.println(dishes.size());
		dishes.pop();
		dishes.push(new Dish(false, java.awt.Color.MAGENTA, 54));
	}
	
	private void useTheCustomerQueue(){
		customerQueue = LinkedList<Customer>();
		customerQueueadd(new Customer(false, "", 3234.3));
		customerQueue.remove();
	}

}
