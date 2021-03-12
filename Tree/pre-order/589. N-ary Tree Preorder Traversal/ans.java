approach 1: Iterative
   public List<Integer> preorder(Node root) {
        Deque<Node> stk = new ArrayDeque<Node>();
        List<Integer> preorder = new LinkedList<Integer>();
        if(root == null) {
            return preorder;
        }
        
        stk.push(root);
        while(!stk.isEmpty()) {
            Node curr = stk.pop();
            preorder.add(curr.val);
            for(int i = curr.children.size() - 1; i >= 0; i--) {
                stk.push(curr.children.get(i));
            }
        }
        return preorder;
    }
    
approach 2: Recursive
  List<Integer> preorder = new LinkedList<Integer>();

    public List<Integer> preorder(Node root) {
        traverse(root);
        return preorder;
    }

    public void traverse(Node root) {
        if (root == null) {
            return;
        }

        preorder.add(root.val);
        for (Node child : root.children) {
            traverse(child);
        }
    }
