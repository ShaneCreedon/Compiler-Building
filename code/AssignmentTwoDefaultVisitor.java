/* Generated By:JavaCC: Do not edit this line. AssignmentTwoDefaultVisitor.java Version 7.0.2 */
public class AssignmentTwoDefaultVisitor implements AssignmentTwoVisitor{
  public Object defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTprogram node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFunction_list node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTDec_list node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTDecl node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTVar_decl node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTConst_decl node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFunction node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTStatement_block node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTReturn node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTParameter_list node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNemp_parameter_list node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMinus_sign node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBinary_arith_op node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTExp node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTCondition node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNot_op node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBinary_logical_op node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTComparison_op node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTArg_list node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNemp_arg_list node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAssignment_exp node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFunction_call_statement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTnumber node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTidentifier node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTanyType node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTtypeInteger node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTtypeBoolean node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMain node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=825bbfd151b775dd04445b3f2e46b386 (do not edit this line) */
