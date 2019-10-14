package com.hope.corejava.treedata;

import java.util.ArrayList;
import java.util.List;

/**
 * HuffmanTree
 *
 * @author zhougf
 * @date 2019/10/14
 */
public class HuffmanTree {
    public static Node createHuffmanTree(int arr[]) {
        // 将传进来的数组元素创建成结点
        List<Node> nodes = new ArrayList<>();
        for (int value : arr) {
            nodes.add(new Node(value));
        }
        // 循环处理以下操作
        while (nodes.size() > 1) {
            // 依据权值排序（选择排序算法）
            Node temp;
            for (int i = 0; i < nodes.size(); i++) {
                int k = i;
                for (int j = nodes.size() - 1; j > i; j--) {
                    if (nodes.get(j).data < nodes.get(k).data) {
                        k = j;
                    }
                }
                temp = nodes.get(i);
                nodes.set(i, nodes.get(k));
                nodes.set(k, temp);
            }
            // 取出权值最小的两个二叉树
            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);
            // 创建新的二叉树
            Node parent = new Node(leftNode.data + rightNode.data);
            // 移除取出的二叉树
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            // 放入原来的二叉树集合中
            nodes.add(parent);
        }
        return nodes.get(0);
    }
}
