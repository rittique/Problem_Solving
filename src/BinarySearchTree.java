public class BinarySearchTree{
     static class Node{
        int value;
        Node left, right;

        public Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(Node node, int value){
        if(value < node.value){
            if(node.left != null){
                insert(node.left, value);
            }
            else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        }
        else if (value > node.value) {
            if(node.right != null){
                insert(node.right, value);
            }
            else {
                System.out.println(" Inserted " + value + " to right " + node.value);
                node.right = new Node(value);
            }
        }
    }

    public void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.println(" "+node.value);
            traverseInOrder(node.right);
        }
    }
}
