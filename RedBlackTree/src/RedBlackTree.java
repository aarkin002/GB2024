class RedBlackTree {
    Node root;
    class Node{
        int value;
        Node left;
        Node right;
        Color color;
    }

    enum Color{
        BLACK,
        RED
    }

    public void insert(int value){
        if (root!=null){
            insert(root, value);
            root = balance(root);
        }
        else{
            root = new Node();
            root.value = value;
        }
        root.color = Color.BLACK;
    }

    private void insert(Node node, int value){
        if(node.value != value){
            if(node.value < value){
                if(node.right !=null){
                    insert(node.right, value);
                    node.right = balance(node.right);
                }else{
                    node.right = new Node();
                    node.right.value = value;
                    node.right.color = Color.RED;
                }
            }else{
                if(node.left != null){
                    insert(node.left, value);
                    node.left = balance(node.left);
                }else{
                    node.left = new Node();
                    node.left.value = value;
                    node.left.color = Color.RED;
                }
            }
        }
    }

    public Node find(int value){
        return find(root, value);
    }

    private Node find(Node node, int value){
        if(node == null)
            return null;
        if(node.value == value)
            return node;
        if(node.value < value){
            return find(node.right, value);
        }else{
            return find(node.left, value);
        }
    }

    private Node rotateLeft(Node node){
        Node cur = node.right;
        node.right = cur.left;
        cur.left = node;
        cur.color = node.color;
        node.color = Color.RED;
        return cur;
    }

    private Node rotateRight(Node node){
        Node cur = node.left;
        node.left = cur.right;
        cur.right = node;
        cur.color = node.color;
        node.color = Color.RED;
        return cur;
    }

    private void flipColors(Node node){
        node.color = (node.color == Color.RED ? Color.BLACK : Color.RED);
        node.left.color = (node.left.color == Color.RED ? Color.BLACK : Color.RED);
        node.right.color = (node.right.color == Color.RED ? Color.BLACK : Color.RED);
    }

    private Node balance(Node node){
        Node cur = node;
        boolean flag = true;
        do{
            flag = false;
            if(cur.right != null && cur.right.color == Color.RED && (cur.left == null || cur.left.color == Color.BLACK)){
                flag = true;
                cur = rotateLeft(cur);
            }
            if(cur.left != null && cur.left.color == Color.RED && cur.left.left!=null && cur.left.left.color == Color.RED){
                flag = true;
                cur = rotateRight(cur);
            }
            if(cur.left!=null && cur.left.color == Color.RED && cur.right != null && cur.right.color == Color.RED){
                flag = true;
                flipColors(cur);
            }
        }while (flag);
        return cur;
    }

    public void print(){
        print(root, 0);
    }

    private void print(Node node, int deep){
        if(node == null){
            return;
        }

        print(node.left, deep + 4);

        for (int i =0; i < deep; i++)
            System.out.print(" ");
        System.out.println("value: " + node.value + " {color: " + node.color + "}");

        print(node.right, deep + 4);
    }

}

