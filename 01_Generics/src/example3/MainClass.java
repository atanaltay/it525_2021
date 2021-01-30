package example3;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		ArrayList<Monkey> monkeys = new ArrayList<Monkey>();
		
		ZooKeeper zooKeeper = new ZooKeeper();
		
		zooKeeper.feedAnimals(animals);
		
		zooKeeper.feedAnimals(monkeys);
	
		
	}
	
	
	
}
