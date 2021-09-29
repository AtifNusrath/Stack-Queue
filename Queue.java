package com.bridgelabz;

class Node<E>
{
    private E data;
    private Node<E> next;
    public Node(E data)
    {
        this.data=data;
    }
    public void setData(E data)
    {
        this.data=data;
    }
    public E getData()
    {
        return data;
    }
    public void setNext(Node<E> next)
    {
        this.next=next;
    }
    public Node<E> getNext()
    {
        return next;
    }
}
class Queue<E> {

    private Node<E> front;
    private Node<E> rear;
    private int size;

    public Queue()
    {
        front=null;
        rear=null;
        size=0;
    }

    public void enqueue(E element)
    {
        Node<E> node=new Node<>(element);
        if(!isEmpty())
        {
            rear.setNext(node);
            rear=node;
        }
        else {
            front=node;
            rear=node;
        }
        size++;
    }

    public E dequeue()
    {
        E response=null;
        if(!isEmpty()) {
            front=front.getNext();
            if(front==null)
            {
                rear=null;
            }
        }
        else {
            System.out.println("Queue is already empty you can't perform dequeue on it.");
        }
        size--;
        return response;
    }

    public E peek()
    {
        E response=null;
        if(!isEmpty())
        {
            response=front.getData();
        }
        return response;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if(front==null) {
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        Node<E> temp=front;
        while(temp!=null) {
            System.out.print(temp.getData()+"    ");
            temp=temp.getNext();
        }
    }

    public static void main(String args[]) {
        Queue<Integer> q = new Queue<>();
        System.out.println("\nQueue Element: ");
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        q.show();
        System.out.println("\nSize of Queue: " + q.size());

        q.dequeue();
        q.dequeue();

        System.out.print("\nQueue Element after dequeue: ");
        q.show();
        System.out.println("\nIs queue Empty: " +q.isEmpty());

    }
}
