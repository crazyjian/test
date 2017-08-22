package com.hujian.tree;

public class BSTree<T extends Comparable<T>> {

	private BSTNode<T> root;
	
	public BSTree() {
		root = null;
	}
	
	public class BSTNode<T extends Comparable<T>>	{
		T key;
		BSTNode<T> left;
		BSTNode<T> right;
		BSTNode<T> parent;
		
		public BSTNode(T key, BSTNode<T> parent, BSTNode<T> left, BSTNode<T> right) {
	        this.key = key;
	        this.parent = parent;
	        this.left = left;
	        this.right = right;
	    }
		
		public T getKey() {
		    return key;
	    }
			
        public String toString() {
              return "key:"+key;
         }
	}
	
	//前序遍历
	public void preOrder(BSTNode<T> node) {
		if(node!=null) {
			System.out.print(node.key+" ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	public void preOrder() {
	    preOrder(root);
	}
	
	 /**
     * 中序遍历"二叉树"
     */
    private void inOrder(BSTNode<T> node) {
        if(node != null) {
            inOrder(node.left);
            System.out.print(node.key+" ");
            inOrder(node.right);
        }
    }

    public void inOrder() {
        inOrder(root);
    }


    /**
     * 后序遍历"二叉树"
     */
    private void postOrder(BSTNode<T> node) {
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key+" ");
        }
    }
    
    public void postOrder() {
        postOrder(root);
    }
    
    /**
     * (递归实现)查找"二叉树x"中键值为key的节点
     */
    private BSTNode<T> search(BSTNode<T> x, T key) {
    	if(x==null) {
    		return x;
    	}
    	if(x.key.compareTo(key) == 0) {
    		return x;
    	}else if(x.key.compareTo(key) < 0) {
    		return search(x.right,key);
    	}else {
    		return search(x.left,key);
    	}
    }
    
    public BSTNode<T> search(T key) {
        return search(root, key);
    }
    
    /**
     * (非递归实现)查找"二叉树x"中键值为key的节点
     */
    private BSTNode<T> iterativeSearch(BSTNode<T> x, T key) {
    	while(x!=null) {
    		if(x.key.compareTo(key) < 0) {
    			x = x.right;
    		}else if(x.key.compareTo(key) < 0) {
    			x = x.left;
    		}else 
    			return x;
    	}
    	return x;
    }
    
    public BSTNode<T> iterativeSearch(T key) {
        return iterativeSearch(root, key);
    }
    
    /** 
     * 查找最小结点：返回tree为根结点的二叉树的最小结点。
     */
    private BSTNode<T> minimum(BSTNode<T> node) {
    	if(node==null) {
    		return null;
    	}
		while(node.left!=null) {
			node = node.left;
		}
		return node;
    }
    
    public T minimum() {
        BSTNode<T> p = minimum(root);
        if (p != null)
            return p.key;

        return null;
    }
    
    /**
     * 查找最大结点：返回tree为根结点的二叉树的最大结点。
     */
    private BSTNode<T> maximum(BSTNode<T> node) {
    	if(node==null) {
    		return null;
    	}
		while(node.right!=null) {
			node = node.right;
		}
		return node;
    }
    
    public T maximum() {
        BSTNode<T> p = maximum(root);
        if (p != null)
            return p.key;

        return null;
    }
    
    /** 
     * 找结点(x)的后继结点。即，查找"二叉树中数据值大于该结点"的"最小结点"。
     */
    public BSTNode<T> successor(BSTNode<T> x) {
    	if(x.right!=null) {
    		return minimum(x.right);
    	}
    	BSTNode<T> parent = x.parent;
		while(parent!=null && (x == parent.right)) {
			x = parent;
			parent = parent.parent;
		}
		return parent;
    }
    
    /** 
     * 找结点(x)的前驱结点。即，查找"二叉树中数据值小于该结点"的"最大结点"。
     */
    public BSTNode<T> predecessor(BSTNode<T> x) {
        // 如果x存在左孩子，则"x的前驱结点"为 "以其左孩子为根的子树的最大结点"。
        if (x.left != null)
            return maximum(x.left);

        // 如果x没有左孩子。则x有以下两种可能：
        // (01) x是"一个右孩子"，则"x的前驱结点"为 "它的父结点"。
        // (01) x是"一个左孩子"，则查找"x的最低的父结点，并且该父结点要具有右孩子"，找到的这个"最低的父结点"就是"x的前驱结点"。
        BSTNode<T> y = x.parent;
        while ((y!=null) && (x==y.left)) {
            x = y;
            y = y.parent;
        }

        return y;
    }
    
}
