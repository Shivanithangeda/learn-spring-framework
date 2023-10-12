package com.firstproject.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.firstproject.spring.learnspringframework.enterprise.example.web.MyWebContoller;
import com.firstproject.spring.learnspringframework.game.GameRunner;
@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//when we launch spring application context spring framework creates instance for spring components
		ConfigurableApplicationContext context =
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);
	    //MarioGame game= new MarioGame();
		//SuperContraGame game=new SuperContraGame();
//		 PacManGame game=new PacManGame();
		
		//THERE ARE TWO STEPS IN  CREATING GAMERUNNER CLASS 1.IMPLEMENTATION OF GAMING CONOLE
		//2.PASS TAHT AS CONSTRUCTOR ARG AND CREATE GAMERUNNER CLASS. TO CREATE GAMEURNNER WE NEDD INSTANCE OF GAMINGCONSOLE(GAME).
		//THEREFORE GAMINGCONSOLE INTERFACE IS DEPENDENCY ON GAMERUNNER CLASS 
		
		//GamingConsole game=new MarioGame(); //1.
	    //GameRunner runner= new GameRunner(game); //2.
	    GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		
		
		
		
		
		
		
		MyWebContoller controller = context.getBean(MyWebContoller.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
