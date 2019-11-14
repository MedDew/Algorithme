package com.meddew.algo.algorithme;

import java.util.Arrays;

public class StackAndQueue {
    private String stackArray [];
    private int stackSize;
    private int topOfStack = -1;

    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;

    public StackAndQueue(int stackSize) {
        this.stackSize = stackSize;
        stackArray = new String[stackSize];
        Arrays.fill(stackArray, "-1");

        queueSize = stackSize;
        queueArray = new String[queueSize];
        Arrays.fill(queueArray, "-1");
    }

    public static void main(String[] args){
        System.out.println("++++++++++++++++++++++++++STACK++++++++++++++++++++++++++");
        StackAndQueue stack = new StackAndQueue(5);
        stack.displayTheStack();
        stack.push("Hey");
        stack.push("YAWP");
        stack.peek();
        stack.pop();
        stack.pushMany("Hey How Are U Out There");
        stack.popAll();
        System.out.println("\n++++++++++++++++++++++++++QUEUE++++++++++++++++++++++++++");
        StackAndQueue queue = new StackAndQueue(10);
        queue.displayTheQueue();
        queue.insert("How");
        queue.insert("was");
        queue.insert("the fashion week?");
        queue.insert("Woow");
        queue.insert("Amazing");
        queue.remove();
        queue.peekQueue();
        queue.removeAll();
        queue.displayTheQueue();
        queue.priorityInsert("YEAH");
        queue.priorityInsert("Med");
        queue.priorityInsert("Lenny Boy");
        queue.priorityInsert("Astrid");
        queue.displayTheQueue();



    }

    private void push(String value){
        if(topOfStack + 1  < stackSize){
            topOfStack++;
            stackArray[topOfStack] = value;
        } else {
            System.out.println("Sorry but the stack is full");
        }
        displayTheStack();
        System.out.println("\nPUSH \"" + value + "\" Was Added to the Stack\n");
    }

    private String pop(){
        if(topOfStack>=0){
            displayTheStack();
            stackArray[topOfStack] = "-1";
            displayTheStack();
            return stackArray[topOfStack--];
        } else {
            displayTheStack();
            System.out.println("Sorry but the stack is empty");
            return "-1";
        }
    }

    private void popAll(){
        Arrays.stream(stackArray).forEach(s -> {
            pop();
        });
    }

    private String peek(){
        displayTheStack();
        System.out.println("\nPEEK \""+stackArray[topOfStack]+ "\" is at the top of the stack");
        return stackArray[topOfStack];
    }

    private void pushMany(String multipleValues){
        String[] arrValues = multipleValues.split(" ");
        Arrays.stream(arrValues).forEach(s -> {
            push(s);
        });
    }

    private void displayTheStack(){
            System.out.println();
        Arrays.stream(stackArray).forEach(s -> {
            System.out.print(s+" | ");
        });
    }

    private void insert(String input){
        if(numberOfItems + 1 <=  queueSize){
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println("\n\nINSERT \"" + input + "\" Was Added to the Stack");
        } else {
            System.out.println("Sorry but the queue is full");
        }
        displayTheQueue();
    }

    private void remove(){
        if(numberOfItems > 0){
            System.out.println("\n\nREMOVE \"" + queueArray[front] + "\" Was Removed From the Queue");
            queueArray[front] = "-1";
            displayTheQueue();
            front++;
            numberOfItems--;
        } else {
            System.out.println("Sorry but the queue is empty");
        }
    }

    private void removeAll(){
            System.out.println();

            System.out.println("numberOfItems : " + numberOfItems + " front :" + front + " rear: " + rear);
            int temp = numberOfItems;
            for(int i = front; i <= numberOfItems; i++){
                queueArray[i] = "-1";
                temp--;
                if(front > 0){
                    front--;
                }
            }
            numberOfItems = temp;
            rear = 0;

    }

    private void displayTheQueue(){
        Arrays.stream(queueArray).forEach(s -> {
            System.out.print(s+" | ");
        });
        System.out.println();
    }

    private void peekQueue(){
        System.out.println("\nThe element in the front of the queue is : "+queueArray[front]);
    }

    public void priorityInsert(String input){
        int i;
        System.out.println("numberOfItems : " + numberOfItems + " front :" + front + " rear: " + rear);
        if(numberOfItems == 0){
            insert(input);
        } else {
            for(i = numberOfItems - 1; i >= 0; i--){
                if(input.compareTo(queueArray[i]) < 0){
                    queueArray[i+1] = queueArray[i];
                } else {
                    break;
                }
            }
            queueArray[i+1] = input;
            rear++;
            numberOfItems++;
        }
        System.out.println("numberOfItems : " + numberOfItems + " front :" + front + " rear: " + rear);
    }
}
