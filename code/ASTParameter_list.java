/* Generated By:JJTree: Do not edit this line. ASTParameter_list.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTParameter_list extends SimpleNode {
  public ASTParameter_list(int id) {
    super(id);
  }

  public ASTParameter_list(AssignmentTwo p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AssignmentTwoVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=25b02dd9f7ef014dc97efca4da5c97d0 (do not edit this line) */
