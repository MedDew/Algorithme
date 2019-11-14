package com.meddew.algo.algorithme;

public class LinkedList {
    public static void main(String... args){
        LinkList linkList = new LinkList();
        linkList.insertFirstLink("JAVA", 50);
        linkList.insertFirstLink("PHP", 30);
        linkList.insertFirstLink("Oracle", 80);
        linkList.display();
        System.out.println("We looking for JAVA an we found it : "+ linkList.find("JAVA"));
        System.out.println("We looking for JAVa an we did not find it : "+linkList.find("JAVa"));

        System.out.println("We removing PHP  : "+linkList.removeLink("PHP"));
        linkList.display();
    }
}


class Link{
    public String bookName;
    private int millionSold;

    public Link next;

    public Link(String bookName, int millionSold) {
        this.bookName = bookName;
        this.millionSold = millionSold;
    }

    public void display(){
        System.out.println(bookName+" : "+millionSold+" 000,000 sold");
    }

    @Override
    public String toString() {
        return bookName;
    }


}

class LinkList{
    private Link firstLink;

    public LinkList() {
        firstLink = null;
    }

    public boolean isEmpty(){
        return firstLink == null;
    }

    public void insertFirstLink(String bookName, int millionSold){
        Link link = new Link(bookName, millionSold);
        link.next = firstLink;
        System.out.println("previous link : "+link.next);
        firstLink = link;
    }

    public Link removeFirst(){
        Link linkReference = firstLink;
        if(!isEmpty()){
            firstLink = firstLink.next;
        } else {
            System.out.println("List is empty");
        }

        return linkReference;
    }

    public Link find(String bookName){
        Link link = firstLink;
        if(!isEmpty()){

            while(link.bookName != bookName){
                System.out.println("Got "+link.bookName);
                if(link.next == null){
                    return null;
                } else {
                    link = link.next;
                    System.out.println("Next Link is "+link);
                }
            }
        } else {
            System.out.println("The list is empty");
        }

        return link;
    }

    public Link removeLink(String bookName){
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        System.out.println("1st : "+currentLink.bookName);
        while(currentLink.bookName != bookName){
            System.out.println("Got "+currentLink.bookName);
            if(currentLink.next == null){
                return null;
            } else {
                previousLink = currentLink;
                System.out.println("Next is  "+currentLink);
                currentLink = currentLink.next;
            }
        }

        System.out.println("CurrentLink : "+currentLink);
        System.out.println("firstLink : "+firstLink+" <=> "+firstLink.next);
        if(currentLink == firstLink){
            firstLink = firstLink.next;
        } else {
            previousLink.next = currentLink.next;
        }

        return currentLink;
    }

    public void display(){
        Link link = firstLink;
        while(link != null){
            link.display();
            System.out.println("Next Link : "+link.next);
            link = link.next;
            System.out.println();
        }
    }


}
