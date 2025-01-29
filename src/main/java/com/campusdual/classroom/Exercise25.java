package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> customQueu = new Stack<>();

        customQueu.push("Smith");
        customQueu.push("Montessori");
        customQueu.push("Peralta");
        customQueu.push("House");

        return customQueu;

    }


    public static void printAndEmptyStack(Stack<String> stack) {
        // Mostrar el elemento en la cima de la pila
        //if (!stack.isEmpty()) {
            System.out.println(stack.peek() + "\n");
       // }

        // Recorrer la pila y vaciarla
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void main(String[] args) {
       // Stack<String> stack = createStack();
        printAndEmptyStack(createStack());
    }

}

