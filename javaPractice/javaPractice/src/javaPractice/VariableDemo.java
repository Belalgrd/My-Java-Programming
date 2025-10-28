package javaPractice;

public class VariableDemo {
    // Instance variable
    private int instanceVar = 10;
    
    // Static variable (class variable)
    private static int staticVar = 20;
    
    // Method demonstrating local variable
    public void demonstrateVariables() {
        // Local variable
        int localVar = 30;
        
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
        
        // Modifying variables
        instanceVar += 5;
        staticVar += 5;
        localVar += 5;
    }
    
    public static void main(String[] args) {
        VariableDemo obj1 = new VariableDemo();
        VariableDemo obj2 = new VariableDemo();
        
        System.out.println("Object 1:");
        obj1.demonstrateVariables();
        
        System.out.println("\nObject 2:");
        obj2.demonstrateVariables();
        
        // Notice that static variable is shared
        System.out.println("\nStatic variable value: " + staticVar);
    }
}