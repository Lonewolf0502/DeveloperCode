import java.util.Comparator;
import java.util.PriorityQueue;

public class huffmanAlgo {

    static class Node {
        int data;
        char ch;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, char ch) {
            this.data = data;
            this.ch = ch;
        }
    }

    public static void printcode(Node n){
        printcode(n,"");
    }
    public static void printcode(Node n, String str) { //printing the encoded huffman code
        if (n.left == null && n.right == null)//always only the leaf node will have a character stored
            {
            System.out.println(n.ch + ":\t" + str);
            return;
        }
            printcode(n.left, str + "0");
        //recursing ustil reaching the leaf
        printcode(n.right, str + "1");
    }
    static class comp implements Comparator<Node> {
        public int compare(Node a, Node b) {
            return a.data - b.data;
        }
    }
    public static void main(String[] args) {
        char[] arr = { 'h', 'e', 't', 'r', 'p', 'a' ,'l'};
        int[] freq = {1,2,5,8,11,20,21};
        //taking priorly sorted elements with their frequencies

        PriorityQueue<Node> q= new PriorityQueue<>(freq.length,new comp());
        int i = 0;
        while(i<freq.length){
            q.add(new Node(freq[i],arr[i]));
            i++;//transferring elements to Node
        }
        Node n = null;
        while(q.size() != 1) {
            int sNode = 0;
            Node temp1 = q.remove();
            //step by step removing nodes from tree and storing their freq sum as parent node
            Node temp2 = q.remove();
            sNode += temp1.data + temp2.data;
            n = new Node(sNode);
            q.add(n);
            n.left = temp1;
            n.right = temp2;
        }
        printcode(n);
    }
}
