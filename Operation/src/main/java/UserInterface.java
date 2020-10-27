/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zach
 */
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Operation> operations;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.operations = new ArrayList<>();
    }
    
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }
    
    public void start() {
        while (true) {
            printOperations();
            System.out.println("Choice: ");
            
            String choice = this.scanner.nextLine();
            if (choice.equals("0")) {
                break;
            }
            
            executeOperation(choice);
            System.out.println();
        }
    }
    
    private void printOperations() {
        System.out.println("\t0: Stop");
        int i = 0;
        while (i < this.operations.size()) {
            String operationName = this.operations.get(i).getName();
            System.out.println("\t" + (i + 1) + ": " + operationName);
            i = i + 1;
        }
    }
    
    private void executeOperation(String choice) {
        int operation = Integer.valueOf(choice);
        
        Operation chosen = this.operations.get(operation - 1);
        chosen.execute(scanner);
    }
}
