// Ruawatrain :: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW96 --  BSTs is the Perfect Place for Shade
// 2022-05-10
// time spent: .5 hrs

/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

 /*
 DISCO
 0. We cannot use the standard pass-by-reference for Objects equal to null
    Thus we had to add null checks into our insert code.

 QCC
 0. What the <insert most colorful swear on hand> is null.
    Why can't we reassign pointers that point to null in the "standard" way?
 1. Can we go over insert in class some to clear up the null issues? (is there a way to avoid the large if checks and stuff?)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST() // defaults to public??
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    _root = null;
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    // PLAN while the value is less than or greater than keep iterating. Once done iterating insert.
    /*** YOUR IMPLEMENTATION HERE ***/
    insert(_root, newNode);
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    // PLAN move the root along until we are at the right space, then insert
    /*** YOUR IMPLEMENTATION HERE ***/

    if ( _root == null ) { // AAAAAAAAAGHHHHHHHHHHHHHHHHHHHH
      _root = newNode;
    }
    else {
      if (stRoot.getValue() > newNode.getValue()) {  // if newNode is smaller it belongs in the LEFT
        if (stRoot.getLeft() != null) { // AAAAAAAAAGHHHHHHHHHHHHHHHHHHHH
          insert(stRoot.getLeft(), newNode);
        }
        else {
          stRoot.setLeft( newNode );
        }
      }
      else {  // if newNode is larger it belongs in the RIGHT
        if (stRoot.getRight() != null) { // AAAAAAAAAGHHHHHHHHHHHHHHHHHHHH
          insert(stRoot.getRight(), newNode);
        }
        else {
          stRoot.setRight( newNode );
        }
      }
    }
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if ( ! (currNode == null) ) { // make sure we are actually looking at a node
      System.out.println(currNode.getValue());
      preOrderTrav(currNode.getLeft());
      preOrderTrav(currNode.getRight());
    }
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    inOrderTrav(_root);
  }
  public void inOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if ( ! (currNode == null) ) {
      inOrderTrav(currNode.getLeft());
      System.out.println(currNode.getValue());
      inOrderTrav(currNode.getRight());
    }
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    postOrderTrav(_root);
  }
  public void postOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if ( ! (currNode == null) ) {
      postOrderTrav(currNode.getLeft());
      postOrderTrav(currNode.getRight());
      System.out.println(currNode.getValue());
    }
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~

  /*****************************************************
   * TreeNode search(int)
   * returns pointer to node containing target,
   * or null if target not found
   *****************************************************/
  TreeNode search( int target )
  {
    return search(_root,target);
  }

  TreeNode search( TreeNode currNode, int target ) // helper for searc
  {
    if (currNode == null) {
      return null;
    }
    if (currNode.getValue() == target) {
      return currNode;
    }

    if (currNode.getValue() > target) {
      return search( currNode.getLeft(), target );
    }
    else {
      return search( currNode.getRight(), target );
    }
  }


  /*****************************************************
   * int height()
   * returns height of this tree (length of longest leaf-to-root path)
   * eg: a 1-node tree has height 1
   *****************************************************/
  public int height()
  {
    return height(_root);
  }

  public int height( TreeNode currNode )  // helper method for height()
  {
    int rHeight,lHeight;

    if (currNode == null) {
      return -1;  // wacky hacky to ensure we count levels STRICTLY below
    }
    // originally had a case of if it was a leaf, but this is obsolete
    lHeight = height(currNode.getLeft());
    rHeight = height(currNode.getRight());

    if (lHeight > rHeight) {
      return lHeight + 1;
    }
    else {
      return rHeight + 1;
    }
  }


  /*****************************************************
   * int numLeaves()
   * returns number of leaves in tree
   *****************************************************/
  public int numLeaves()
  {
    return numLeaves(_root);
  }

  public int numLeaves( TreeNode currNode ) {
    if (currNode == null) {
      return 0;
    }

    if (currNode.getLeft() == null && currNode.getRight() == null) {
      return 1;
    }

    return numLeaves( currNode.getLeft() ) + numLeaves( currNode.getRight() );
  }


  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //main method for testing
  public static void main( String[] args )
  {

      BST arbol = new BST();

      //PROTIP: sketch state of tree after each insertion
      //        ...BEFORE executing these.
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 6 );
      arbol.insert( 1 );
      arbol.insert( 3 );

      /*
             4
           /  \
         2     5
       /  \     \
      1   3      6
      */

      System.out.println(arbol.height());
      System.out.println(arbol.numLeaves());

      System.out.println(arbol.search(3).getValue()); // 3
      System.out.println(arbol.search(4).getValue()); // 4
      System.out.println(arbol.search(7));  // null

      BST yggdrasil = new BST();

      yggdrasil.insert(13);
      yggdrasil.insert(8);
      yggdrasil.insert(2);
      yggdrasil.insert(15);
      yggdrasil.insert(11);
      yggdrasil.insert(17);
      yggdrasil.insert(38);
      yggdrasil.insert(5);
      yggdrasil.insert(1);

      /*
              13
             /  \
            8   15
           /   /  \
          2  11   17
         / \        \
        1   5       38
      */

      System.out.println(yggdrasil.height()); // 3
      System.out.println(yggdrasil.numLeaves());  // 4

      System.out.println(yggdrasil.search(13).getValue());  // 13
      System.out.println(yggdrasil.search(15).getValue());  // 15
      System.out.println(yggdrasil.search(38).getValue());  // 38
      System.out.println(yggdrasil.search(42)); // null

      BST treebeard = new BST();

      treebeard.insert(42);
      treebeard.insert(72);
      treebeard.insert(4);
      treebeard.insert(17);
      treebeard.insert(2);
      treebeard.insert(23);
      treebeard.insert(694);
      treebeard.insert(251);
      treebeard.insert(900);
      treebeard.insert(19);
      treebeard.insert(81);
      treebeard.insert(93); // PRIME
      treebeard.insert(29);

      /*
                42
              /    \
            4       72
          /  \         \
        2    17         694
              \         /  \
              23      251   900
            /  \      /
          19   29   81
           \          \
           20         93
      */

      System.out.println(treebeard.height()); // 5
      System.out.println(treebeard.numLeaves());  // 5

      System.out.println(treebeard.search(42).getValue());  // 42
      System.out.println(treebeard.search(93).getValue());  // 93
      System.out.println(treebeard.search(19).getValue());  // 19
      System.out.println(treebeard.search(10)); // null
  }

}//end class
