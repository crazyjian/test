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
     * (�ݹ�ʵ��)����"������x"�м�ֵΪkey�Ľڵ�
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
     * (�ǵݹ�ʵ��)����"������x"�м�ֵΪkey�Ľڵ�
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
     * ������С��㣺����treeΪ����Ķ���������С��㡣
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
     * ��������㣺����treeΪ����Ķ�����������㡣
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
     * 前驱节点
     */
    public BSTNode<T> predecessor(BSTNode<T> x) {
        // ���x�������ӣ���"x��ǰ����"Ϊ "��������Ϊ��������������"��
        if (x.left != null)
            return maximum(x.left);

        // ���xû�����ӡ���x���������ֿ��ܣ�
        // (01) x��"һ���Һ���"����"x��ǰ����"Ϊ "��ĸ����"��
        // (01) x��"һ������"�������"x����͵ĸ���㣬���Ҹø����Ҫ�����Һ���"���ҵ������"��͵ĸ����"����"x��ǰ����"��
        BSTNode<T> y = x.parent;
        while ((y!=null) && (x==y.left)) {
            x = y;
            y = y.parent;
        }

        return y;
    }
    
}
