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
        // ��������������Ԫ�ش����ɽ��
        List<Node> nodes = new ArrayList<>();
        for (int value : arr) {
            nodes.add(new Node(value));
        }
        // ѭ���������²���
        while (nodes.size() > 1) {
            // ����Ȩֵ����ѡ�������㷨��
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
            // ȡ��Ȩֵ��С������������
            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);
            // �����µĶ�����
            Node parent = new Node(leftNode.data + rightNode.data);
            // �Ƴ�ȡ���Ķ�����
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            // ����ԭ���Ķ�����������
            nodes.add(parent);
        }
        return nodes.get(0);
    }
}
