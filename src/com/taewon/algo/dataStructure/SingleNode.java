package com.taewon.algo.dataStructure;

public class SingleNode {
    private String data;
    private SingleNode node;

    public static SingleNode create(String data) { return new SingleNode(data); }
    public SingleNode(String data) { this.data = data; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public SingleNode getSingleNode() { return node; }
    public void setSingleNode(SingleNode node) { this.node = node; }

    public void print() {
        System.out.print(data);
        if(getSingleNode() != null) {
            System.out.print(" -> ");
            node.print();
        }
    }

    public void insertNode(SingleNode node) {
        if(this.node == null) { this.node = node; }
        else { this.node.insertNode(node); }
    }

    public int getCount(int count) {
        count = count + 1;
        if(node != null) { count = node.getCount(count); }
        return count;
    }
}
