/*@Purpose:: Ability to create a BST by adding 56 and then
 *           adding 30 & 70 - Use INode to create My Binary
 *           Node - Note the key has to extend comparable to
 *           compare and determine left or right node
 * - First add 56 as root node so 30 will be added to left and 70 to right
 * @File  ::Binary Search Tree
 * @Author::Shubham Raj
 */

package com.bridgelabz.dsagenerics;

public class BSTImplimentation {
    /*
     * @Purpose : Insert Elements in BST
     */
    public static void main(String[] args) {
        BST tree = new BST();
        Node root = null;
        root = tree.insert(root, 56);
        root = tree.insert(root, 30);
        root = tree.insert(root, 70);

        tree.printInorder(root);
        System.out.println(root);
    }
}