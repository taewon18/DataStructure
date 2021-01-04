package com.taewon.algo.dataStructure;

public class Main {

    public static void main(String[] args) {
	    //insert test
        SingleNodeList nodeList = SingleNodeList.create();
        for(int count = 0; count < 10; count++) {
            StringBuilder builder = new StringBuilder();
            String data = builder.append(count + 1).append(" node").toString();
            SingleNode node = SingleNode.create(data);
            nodeList.insertNode(node);
        }
        nodeList.printNodes();
        System.out.println("node count :: " + nodeList.getNodesCnt());
    }
}
