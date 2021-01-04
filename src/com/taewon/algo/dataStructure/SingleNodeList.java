package com.taewon.algo.dataStructure;

public class SingleNodeList {

    private SingleNode head;

    public static SingleNodeList create() { return new SingleNodeList(); }
    public SingleNode getHead() { return head; }
    public void setHead(SingleNode head) { this.head = head; }

    public void insertNode(SingleNode node) {
        if(getHead() == null) { head = node; }
        else { head.insertNode(node); }
    }

    public void deleteNode() {

    }

    public void printNodes() {
        if(getHead() == null) {
            System.out.println("Not exist node");
            return;
        }
        head.print();
        System.out.println();
    }

    public int getNodesCnt() {
        int count = 0;
        if(head != null) { count = head.getCount(count); }
        return count;
    }
}
