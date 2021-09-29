package com.bridgelabz;

import java.util.EmptyStackException;

public class MyStack<T> {
    Node1<T> head;
    int count = 0;


    public void push(T data) {
        Node1 node = new Node1<>(data);
        node.data = data;
        node.next = head;
        head = node;
        count++;
    }

    public T pop() {
        if (head == null) {
            System.out.println("Stack UnderFlow!!!");
            return null;
        }
        T result = head.data;
        head = head.next;
        count--;
        return result;
    }

    public T peak() {

        if (isEmpty()) {
            System.out.println("Stack is empty!!!");
        }
        return head.data;
    }

    public boolean isEmpty() {
        return count == 0 ? true : false;
    }

    public int size() {
        return count;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node1 temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        MyStack<Integer> s = new MyStack<>();
        s.push(70);
        s.push(30);
        s.push(56);
        System.out.println("\nStack Elements: " );
        s.display();

        System.out.println("\nDelete first element of stack: "+s.pop());
        System.out.println("\nStack Elements: " );
        s.display();
        System.out.println("\nPeak of Stack: "+s.peak());

        System.out.println("\nStack Elements: " );
        s.display();
    }
}

class Node1<T> {
    T data;
    Node1<T> next;

    Node1(T data) {
        this.data = data;
        this.next = null;
    }
}
