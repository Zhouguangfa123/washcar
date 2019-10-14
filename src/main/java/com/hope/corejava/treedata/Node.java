package com.hope.corejava.treedata;

/**
 * Node
 *
 * @author zhougf
 * @date 2019/10/14
 */
public class Node {

    /**数据域*/
    public int data;
    /**权值*/
    public int weight;
    /**左子节点*/
    public Node left;
    /**右子节点*/
    public Node right;

    public Node(int data) {
        this.data = data;
    }

}
