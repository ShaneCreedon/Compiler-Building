/* Generated By:JJTree: Do not edit this line. ASTFunction_call_structure.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTFunction_call_structure extends SimpleNode {
  public ASTFunction_call_structure(int id) {
    super(id);
  }

  public ASTFunction_call_structure(AssignmentTwo p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AssignmentTwoVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=18226ecd9101d5de115d200166f21895 (do not edit this line) */