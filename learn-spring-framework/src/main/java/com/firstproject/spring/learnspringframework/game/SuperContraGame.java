package com.firstproject.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//when u have multiple beans u can define one of them as primary like default
@Primary
public class SuperContraGame implements GamingConsole{
  public void up() {
	  System.out.println("SuperContraGame jump");
  }
  public void down() {
	  System.out.println("SuperContraGame Down in a hole");
  }
  public void left() {
	  System.out.println("SuperContraGame stop");
  }

  public void right() {
	  System.out.println("SuperContraGame accelerate");
  }

}
