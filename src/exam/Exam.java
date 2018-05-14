/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("====== Students Manager ======");
            System.out.println("1. Add new student.");
            System.out.println("2. Save.");
            System.out.println("3. Display all students.");
            System.out.println("4.Exit.");
            System.out.println("=============================");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    controller.addStudent();
                    break;
                case 2:
                    controller.save();
                    break;
                case 3:
                    controller.showStudents();
                    break;
                case 4:
                    System.exit(choice);
                    break;
            }
            
            
        
    }
    }
}
