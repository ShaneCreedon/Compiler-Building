/* Generated By:JJTree: Do not edit this line. ASTLogical_Disjunction.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTLogical_Disjunction extends SimpleNode {
  public ASTLogical_Disjunction(int id) {
    super(id);
  }

  public ASTLogical_Disjunction(AssignmentTwo p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AssignmentTwoVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8b0b37d485672a6403dc4851d346ea36 (do not edit this line) */