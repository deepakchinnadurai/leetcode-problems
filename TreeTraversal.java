import java.util.*;

class Node{
  int data;
  Node left,right;
  Node(int item){
       data = item;
       left = right = null;
  }
}

class BinaryTree{
  Node root;
  BinaryTree(){
    root = null;
  }
  void printPreorder(Node root){
    if(root == null) return;
    printPreorder(root.left);
    printPreorder(root.right);
    System.out.println(root.data);
  }

  void printInorder(Node root){
    if(root==null) return;
    printInorder(root.left);
    System.out.println(root.data);
    printInorder(root.right);

  }

  void printPostorder(Node root){
    if(root == null) return;
    System.out.println(root.data);
    printPostorder(root.left);
    printPostorder(root.right);
  }
  void printInorder(){
    printInorder(root);
  }
  void printPostorder(){
    printPostorder(root);
  }
  void printPreorder(){
    printPreorder(root);
  }
}


public class Hello{
  public static void main(String args[]){
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    
    tree.printPostorder();

  
  }
}
