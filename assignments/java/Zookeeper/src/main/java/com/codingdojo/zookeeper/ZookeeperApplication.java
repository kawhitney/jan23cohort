package com.codingdojo.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZookeeperApplication {

	public static void main(String[] args) {
		System.out.println("=".repeat(20));
		System.out.println("GORILLA");
		System.out.println("=".repeat(20));
		
		// Gorilla instance
		Gorilla George = new Gorilla();
		// throw things x3
		George.throwSomething();
		George.throwSomething();
		George.throwSomething();
		George.displayEnergy();
		// eat bananas x2
		George.eatBanana();
		George.eatBanana();
		George.displayEnergy();
		// climb x1
		George.climb();
		George.displayEnergy();
		
		System.out.println("=".repeat(20));
		System.out.println("BAT");
		System.out.println("=".repeat(20));		
		// Bat instance
		Bat Jane = new Bat();
		// attack towns x3
		Jane.attackTown();
		Jane.attackTown();
		Jane.attackTown();
		Jane.displayEnergy();
		// eat humans x2
		Jane.eatHuman();
		Jane.eatHuman();
		Jane.displayEnergy();
		// fly x2
		Jane.fly();
		Jane.fly();
		Jane.displayEnergy();
		
		SpringApplication.run(ZookeeperApplication.class, args);
	}

}
