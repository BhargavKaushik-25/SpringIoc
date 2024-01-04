package EnginePackage;

//IT IS EXAMPLE OF IOC :- INVERSION OF CONTROL WHICH MEANS OBJECT CREATION IS SHIFTED TO SPRING FRAMEWORK RATHER THAN new Keyword

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1. PETROL");
        System.out.println("2. DIESEL");
        int choice = scanner.nextInt();

        Engine engine = null;

        if (choice == 1){
            engine = context.getBean("petrol", PetrolEngine.class);
        } else if (choice == 2) {
            engine = context.getBean("diesel", DieselEngine.class);
        }else
        {
            System.out.println("INVALID CHOICE");
        }

        if (engine != null){
            engine.getEngineInformation();
            engine.getEngineType();
        }else {
            System.out.println("SOMETHING WENT WRONG");
        }
    }
}
