/* Generated By:JJTree: Do not edit this line. ASTNemp_paramater_list.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTNemp_paramater_list extends SimpleNode {
  public ASTNemp_paramater_list(int id) {
    super(id);
  }

  public ASTNemp_paramater_list(AssignmentTwo p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AssignmentTwoVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=dd12a83f92987c40e1dcba088d35ca7c (do not edit this line) */