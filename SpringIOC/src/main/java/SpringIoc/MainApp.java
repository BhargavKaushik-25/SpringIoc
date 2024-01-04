package SpringIoc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {
        //this is the return type of the particular object
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. LAPTOP");
        System.out.println("2. PROJECTOR");
        int choice = scanner.nextInt();

        Machine machine = null;

        if (choice == 1){
                        //it is going to return the object of particular class
            machine = context.getBean("laptop", Laptop.class);//we are providing .class extension so that jvm can read byte code not rather than source
        }else if (choice == 2)
        {
                        //it is going to return the object of particular class
            machine = context.getBean("projector", Projector.class);//we are providing .class extension so that jvm can read byte code not rather than source
        }else
        {
            System.out.println("INVALID CHOICE");
        }

        if (machine != null){
            machine.getMachineInformation();
            machine.getMachinePrice();
        }else {
            System.out.println("SOMETHING WENT WRONG");
        }
    }
}
