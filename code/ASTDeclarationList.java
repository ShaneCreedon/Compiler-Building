/* Generated By:JJTree: Do not edit this line. ASTDeclarationList.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTDeclarationList extends SimpleNode {
  public ASTDeclarationList(int id) {
    super(id);
  }

  public ASTDeclarationList(AssignmentTwo p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AssignmentTwoVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8f30aadd5a3acd953e0b766a96477686 (do not edit this line) */
