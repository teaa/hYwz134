/**
  *
  * Description
  *
  * @version 1.0 from 2/25/15
  * @author Ahmed Al Kawally
  */

public class ParseTreeNode {
    
    // start attributes
    private ParseTreeNode leftNode;
    private ParseTreeNode rightNode;
    // end attributes
    
    // start methods
    public ParseTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(ParseTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public ParseTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(ParseTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    // end methods
} // end of ParseTreeNode
