/* Generated By:JJTree: Do not edit this line. ASTGreater_Than_Or_Equal.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTGreater_Than_Or_Equal extends SimpleNode {
  public ASTGreater_Than_Or_Equal(int id) {
    super(id);
  }

  public ASTGreater_Than_Or_Equal(AssignmentTwo p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AssignmentTwoVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3e35cca8e22bba4ef1be044823461298 (do not edit this line) */