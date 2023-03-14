package StepDefinitions;


import Utilities.BasicDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {


    @Before
    public void beforeScenario(){
        System.out.println("Scenario has started.");
    }

//    @After
//    public void afterScenario(){
//        BasicDriver.quitDriver();
//        System.out.println("Scenario has ended.");
//
//    }

 //   @BeforeStep
 //   public void beforeStep(){
 //       System.out.println("Step has started.");
 //  }
 //  @AfterStep
 //   public void afterStep(){
 //       System.out.println("Step has ended.");
 //   }
}