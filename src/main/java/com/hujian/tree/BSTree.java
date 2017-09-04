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
	
	//ǰ�����
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
     * �������"������"
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
     * �������"������"
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
     * 递归查询
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
     * 非递归查询
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
     * 寻找二叉树中最小的节点 
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
     * 寻找二叉树中最大的节点 
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
     * 后继节点
     */
    public BSTNode<T> successor(BSTNode<T> x) {
    	 // 如果x存在右孩子，则"x的后继结点"为 "以其右孩子为根的子树的最小结点"。
    	if(x.right!=null) {
    		return minimum(x.right);
    	}

    	 // 如果x没有右孩子。则x有以下两种可能：
    	// (01) x是"一个左孩子"，则"x的后继结点"为 "它的父结点"。
    	// (02) x是"一个右孩子"，则查找"x的最低的父结点，并且该父结点要具有左孩子"，找到的这个"最低的父结点"就是"x的后继结点"。
    	BSTNode<T> parent = x.parent;
		while(parent!=null && (x == parent.right)) {
			x = parent;
			parent = parent.parent;
		}
		return parent;
    }
    
    /** 
     * 前驱节点
     */
    public BSTNode<T> predecessor(BSTNode<T> x) {
        // 如果左子树存在的话，则返回左子树中最大的节点，即为比它小的之中的最大的节点 
        if (x.left != null)
            return maximum(x.left);

        /* 如果左子树不存在的话，则需要往上找，直到找到目标节点是目标节点父亲节点的右孩子 */  
        BSTNode<T> y = x.parent;
        while ((y!=null) && (x==y.left)) {
            x = y;
            y = y.parent;
        }

        return y;
    }
    
    /* 
     * 将结点插入到二叉树中
     *
     * 参数说明：
     *     tree 二叉树的
     *     z 插入的结点
     */
    private void insert(BSTree<T> bst, BSTNode<T> z) {
        int cmp;
        BSTNode<T> y = null;
        BSTNode<T> x = bst.root;

        // 查找z的插入位置
        while (x != null) {
            y = x;
            cmp = z.key.compareTo(x.key);
            if (cmp < 0)
                x = x.left;
            else
                x = x.right;
        }

        z.parent = y;
        if (y==null)
            bst.root = z;
        else {
            cmp = z.key.compareTo(y.key);
            if (cmp < 0)
                y.left = z;
            else
                y.right = z;
        }
    }

    /* 
     * 新建结点(key)，并将其插入到二叉树中
     *
     * 参数说明：
     *     tree 二叉树的根结点
     *     key 插入结点的键值
     */
    public void insert(T key) {
        BSTNode<T> z=new BSTNode<T>(key,null,null,null);

        // 如果新建结点失败，则返回。
        if (z != null)
            insert(this, z);
    }
    
}
