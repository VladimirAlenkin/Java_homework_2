// Задача 4. К калькулятору из предыдущего дз добавить логирование.

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;

public class task2_4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите первое число: ");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();
        
        System.out.printf("Введите второе число: ");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();

        System.out.printf("Введите операцию (+; -; *; /): ");
        char operation = scanner.next().charAt(0);

        int result = 0;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            }
    System.out.println("Результат операции: " + result);
    n1.close();
    n2.close();
        
            Logger logger = Logger.getLogger(task2_4.class.getName());
       
            ConsoleHandler ch = new ConsoleHandler (); 
           
            logger.addHandler(ch); 

            SimpleFormatter sFormat = new SimpleFormatter();
            ch.setFormatter(sFormat);
            
            logger.log(Level.WARNING, "Тестовое логирование 1");
            logger.info("Тестовое логирование 2");
    }

    
}
