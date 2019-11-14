package com.meddew.algo.algorithme;

public class DoubleEndedLinkedList {
        public static void main(String ... args){
            DoubleLinkList doubleLinkList = new DoubleLinkList();
            doubleLinkList.insertInFirstPosition("Mr Thil", 6);
            System.out.println("Next 1st link : "+doubleLinkList.getFirstLink().next);
            System.out.println("Previous 1st link : "+doubleLinkList.getFirstLink().previous);
            System.out.println("Next last link : "+doubleLinkList.getLastLink().next);
            System.out.println("Previous last link : "+doubleLinkList.getLastLink().previous);
            System.out.println();

            doubleLinkList.insertInFirstPosition("Miss Hambli", 8);
            System.out.println("Next 1st link : "+doubleLinkList.getFirstLink().next);
            System.out.println("Previous 1st link : "+doubleLinkList.getFirstLink().previous);
            System.out.println("Next last link : "+doubleLinkList.getLastLink().next);
            System.out.println("Previous last link : "+doubleLinkList.getLastLink().previous);
            System.out.println();

            doubleLinkList.insertInFirstPosition("Mr Zigon", 10);
            System.out.println("Next 1st link : "+doubleLinkList.getFirstLink().next);
            System.out.println("Previous 1st link : "+doubleLinkList.getFirstLink().previous);
            System.out.println("Next last link : "+doubleLinkList.getLastLink().next);
            System.out.println("Previous last link : "+doubleLinkList.getLastLink().previous);
            System.out.println();

            doubleLinkList.display();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            doubleLinkList.insertInLastPosition("Mr Gacem", 7);
            System.out.println("Next 1st link : "+doubleLinkList.getFirstLink().next);
            System.out.println("Previous 1st link : "+doubleLinkList.getFirstLink().previous);
            System.out.println("Next last link : "+doubleLinkList.getLastLink().next);
            System.out.println("Previous last link : "+doubleLinkList.getLastLink().previous);
            System.out.println();

            doubleLinkList.insertInLastPosition("Mr Tosi", 8);
            System.out.println("Next 1st link : "+doubleLinkList.getFirstLink().next);
            System.out.println("Previous 1st link : "+doubleLinkList.getFirstLink().previous);
            System.out.println("Next last link : "+doubleLinkList.getLastLink().next);
            System.out.println("Previous last link : "+doubleLinkList.getLastLink().previous);
            System.out.println();

            doubleLinkList.insertInLastPosition("Mr Lenny", 10);
            System.out.println("Next 1st link : "+doubleLinkList.getFirstLink().next);
            System.out.println("Previous 1st link : "+doubleLinkList.getFirstLink().previous);
            System.out.println("Next last link : "+doubleLinkList.getLastLink().next);
            System.out.println("Previous last link : "+doubleLinkList.getLastLink().previous);
            System.out.println();

            doubleLinkList.display();
        }
}

class Neighbor {
    public String houseOwnerName;
    public int houseNumber;

    public Neighbor previous;
    public Neighbor next;

    public Neighbor(String houseOwnerName, int houseNumber) {
        this.houseOwnerName = houseOwnerName;
        this.houseNumber = houseNumber;
    }

    public void display(){
        System.out.println(houseOwnerName+" : "+houseNumber);
    }

    @Override
    public String toString() {
        return "Neighbor{" +
                "houseOwnerName='" + houseOwnerName + '\'' +
                '}';
    }
}

class DoubleLinkList{
    Neighbor firstLink;
    Neighbor lastLink;

    public void insertInFirstPosition(String houseOwnerName, int houseNumber){
        Neighbor theNewLink = new Neighbor(houseOwnerName, houseNumber);

        if(isEmpty()){
            lastLink = theNewLink;
            setLastLink(lastLink);
        }
        else {
            firstLink.previous = theNewLink;
        }
        theNewLink.next = firstLink;
        firstLink = theNewLink;
        setFirstLink(firstLink);
    }

    public void insertInLastPosition(String houseOwnerName, int houseNumber){
        Neighbor theNewLink = new Neighbor(houseOwnerName, houseNumber);

        if(isEmpty()){
            firstLink = theNewLink;
        } else {
            lastLink.next = theNewLink;
            theNewLink.previous = lastLink;
        }

        lastLink  = theNewLink;
        setFirstLink(firstLink);
        setLastLink(lastLink);
    }

    public void display(){
        Neighbor neighbor = firstLink;
        while(neighbor != null){
            neighbor.display();
            neighbor = neighbor.next;
            System.out.println();
        }
    }

    public void setFirstLink(Neighbor firstLink) {
        this.firstLink = firstLink;
    }

    public Neighbor getFirstLink() {
        return firstLink;
    }

    public Neighbor getLastLink() {
        return lastLink;
    }

    public void setLastLink(Neighbor lastLink) {
        this.lastLink = lastLink;
    }

    public boolean isEmpty(){
        return firstLink == null;
    }
}