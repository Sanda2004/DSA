/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author Sandali
 */
public class Array<T> {
private T[]stack;
    private int top;
    private static final int capacity = 10;
    
    public Array() {
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    
    public void push(T item) {
        if (top == stack.length - 1) {
            resize(2 * stack.length);  
        }
        stack[++top] = item;
    }

    
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow");
        }
        T item = stack[top];
        stack[top--] = null; 
        return item;
    }

    
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity -1;
    }
    
    public int size() {
        return top + 1;
    }

    
    
    private void resize(int newCapacity) {
        T[] newStack = (T[]) new Object[newCapacity];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
    }

    
    public void printStack() {
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        Array<Integer> myStack = new Array<>();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println("Is Full? " + myStack.isFull());
        myStack.printStack();

        System.out.println("Top: " + myStack.peek());
        System.out.println("Popped: " + myStack.pop());
        myStack.printStack();

        System.out.println("Size: " + myStack.size());
        System.out.println("Is Empty? " + myStack.isEmpty());
    }

    
}
