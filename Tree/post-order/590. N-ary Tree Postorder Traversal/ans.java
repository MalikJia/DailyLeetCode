approach 1: recursive
   List<Integer> ans = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        helper(root);
        return ans;
    }
    
    private void helper(Node root) {
        if(root == null) {
            return;
        }
         for(Node child : root.children) {
            helper(child);
        }
      //因为postoeder的最后一步才遍历root
        ans.add(root.val);
    }

approach 2: iterate
   public List<Integer> postorder(Node root) {
        Deque<Node> stack = new ArrayDeque<>();
        LinkedList<Integer> ans = new LinkedList<>();
        if(root == null) {
            return ans;
        }
        
        stack.add(root);
        while(!stack.isEmpty()) {
            Node cur = stack.pollLast();
            ans.push(cur.val);
            for(Node child : cur.children) {
                 if (child != null) {
                      stack.add(child);
                 }
               
            }
           
        }
        return ans;
    }
    
//备注
//1: 尽量不使用stack, 而使用Deque或者list来模拟stack, 从而提高运行效率
//2: push相当于addFirst, 即add和push的结果不同

https://leetcode.com/problems/n-ary-tree-postorder-traversal/
