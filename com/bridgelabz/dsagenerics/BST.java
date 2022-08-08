/*@Purpose:: Ability to create a BST by adding 56 and then
 *           adding 30 & 70 - Use INode to create My Binary
 *           Node - Note the key has to extend comparable to
 *           compare and determine left or right node
 * - First add 56 as root node so 30 will be added to left and 70 to right
 * @File  ::Binary Search Tree
 * @Author::Shubham Raj
 */

package com.bridgelabz.dsagenerics;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        Node left = null;
        Node right = null;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
    }

}

public class BST {
    int size = 0;

    /*
     * @Purpose : Insert Elements in BST
     *
     * @Return : Node
     */
    public Node insert(Node node, int data) {

        if (node == null) {
            node = createNewNode(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }

        return node;
    }

    /*
     * @Purpose : Create New Node For Elements in BST
     *
     * @Return : MyNode
     */
    private Node createNewNode(int data) {
        Node mynode = new Node(data);
        size += 1;
        return mynode;
    }

    /*
     * @Purpose : Print InOrder Traversal in BST
     *
     * @Return : Null
     */
    public void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + "->");
        printInorder(node.right);

    }

    /*
     * @Purpose : Getting Size Of BST
     *
     * @Return : Size
     */
    public int size() {
        return size;
    }

}