/* Generated By:JJTree: Do not edit this line. ASTBracket_Expression.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTBracket_Expression extends SimpleNode {
  public ASTBracket_Expression(int id) {
    super(id);
  }

  public ASTBracket_Expression(AssignmentTwo p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AssignmentTwoVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=0826dd378dc78b6f82a4976fffa7e65f (do not edit this line) */