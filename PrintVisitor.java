// Name:PrintVisitor.java
// Author: David Sinclair      Date: 29 Aug 2012
//
// Visitor for "pretty printing" an abstract syntax tree in the ExprLang language
//

public class PrintVisitor implements AssignmentTwoVisitor
{
    public Object visit(SimpleNode node, Object data) {
		throw new RuntimeException("Visit SimpleNode");
    }

    public Object visit(ASTprogram node, Object data) {
		node.jjtGetChild(0).jjtAccept(this, data);
		node.jjtGetChild(1).jjtAccept(this, data);
		return data;
    }
    
	public Object visit(ASTDecl node, Object data) {
		node.jjtGetChild(0).jjtAccept(this, data);
		return data;
    }

    public Object visit(ASTVar_decl node, Object data) {	
		System.out.print("variable ");
		node.jjtGetChild(0).jjtAccept(this, data);
		System.out.print(" : ");
		node.jjtGetChild(1).jjtAccept(this, data);
		System.out.println(";");
		return data;
    }

	public Object visit(ASTConst_decl node, Object data) {
        System.out.print("constant ");
        node.jjtGetChild(0).jjtAccept(this, data);
		System.out.print(" : ");
        node.jjtGetChild(1).jjtAccept(this, data);	
        node.jjtGetChild(2).jjtAccept(this, data);
		System.out.println(";");
        return data;
    }

	public Object visit(ASTFunction node, Object data) {
		System.out.println();
        node.jjtGetChild(0).jjtAccept(this, data);
		System.out.print(" ");
        node.jjtGetChild(1).jjtAccept(this, data);
		System.out.print("(");
		
		for (int i = 0; i < node.jjtGetChild(2).jjtGetNumChildren()-1; i++) {
			node.jjtGetChild(2).jjtGetChild(i).jjtAccept(this, data);
			System.out.print(": ");	
			node.jjtGetChild(2).jjtGetChild(i+1).jjtAccept(this, data);
			System.out.print(";");	
		}

		System.out.println(") is");
		System.out.print("    ");
		node.jjtGetChild(3).jjtAccept(this, data);

		System.out.println("    begin");
		for(int i = 4; i < node.jjtGetNumChildren(); i++)
        	node.jjtGetChild(i).jjtAccept(this, data);
		System.out.println("\n    end");
        return data;
    }
    
    public Object visit(ASTStatement_block node, Object data) {		
		for(int i = 0; i < node.jjtGetNumChildren(); i++) {
			System.out.print("        ");
    		node.jjtGetChild(i).jjtAccept(this, data);
		}
		return data;
    }

    public Object visit(ASTStatement node, Object data) {		
		node.jjtGetChild(0).jjtAccept(this, data);
		node.jjtGetChild(1).jjtAccept(this, data);
		System.out.println(";");
		return data;
    }

    public Object visit(ASTanyType node, Object data) {		
		System.out.print(node.value);
		return data;
    }

    public Object visit(ASTtypeInteger node, Object data) {		
		System.out.print(node.value);
		return data;
    }

    public Object visit(ASTtypeBoolean node, Object data) {		
		System.out.print(node.value);
		return data;
    }

    public Object visit(ASTAssignment_exp node, Object data) {		
		System.out.print(" := ");
		node.jjtGetChild(0).jjtAccept(this, data);
		return data;
    }

    public Object visit(ASTFunction_call_statement node, Object data) {		
		System.out.print(node.value + " ");
		return data;
    }

    public Object visit(ASTNemp_parameter_list node, Object data) {
		for(int i = 0; i < node.jjtGetNumChildren(); i++) {
    		node.jjtGetChild(i).jjtAccept(this, data);
			System.out.println(";");
		}
		return data;
    }

    public Object visit(ASTFunction_list node, Object data) {
		for(int i = 0; i < node.jjtGetNumChildren(); i++)
    		node.jjtGetChild(i).jjtAccept(this, data);
		return data;
    }

	public Object visit(ASTDec_list node, Object data) {
		for(int i = 0; i < node.jjtGetNumChildren(); i++)
    		node.jjtGetChild(i).jjtAccept(this, data);
		return data;
    }

    public Object visit(ASTParameter_list node, Object data) {
		node.jjtGetChild(0).jjtAccept(this, data);
		return data;
    }

    public Object visit(ASTNemp_parameter_list node, Object data) {
		node.jjtGetChild(0).jjtAccept(this, data);
		return data;
    }

    public Object visit(ASTBinary_arith_op node, Object data) {
		node.jjtGetChild(0).jjtAccept(this, data);
		System.out.print(" " + node.value + " ");
		node.jjtGetChild(1).jjtAccept(this, data);
		return data;
    }

    public Object visit(ASTBool_op node, Object data) {
		node.jjtGetChild(0).jjtAccept(this, data);
		System.out.print(" " + node.value + " ");
		node.jjtGetChild(1).jjtAccept(this, data);
		return data;
    }

    public Object visit(ASTBinary_mult_op node, Object data) {
		System.out.print(" " + node.value + " ");
		return data;
    }

    public Object visit(ASTNot_op node, Object data) {
		System.out.print("~");
		return(node.jjtGetChild(0).jjtAccept(this, data));
    }

    public Object visit(ASTsimple_condition node, Object data) {
		return(node.jjtGetChild(0).jjtAccept(this, data));
	}

    public Object visit(ASTcondition node, Object data) {
		return(node.jjtGetChild(0).jjtAccept(this, data));
	}

    public Object visit(ASTExp node, Object data) {
		for(int i = 0; i < node.jjtGetNumChildren(); i++)
    		node.jjtGetChild(i).jjtAccept(this, data);
		return(data);
    }

    public Object visit(ASTsimple_special_expression node, Object data) {
		for(int i = 0; i < node.jjtGetNumChildren(); i++)
    		node.jjtGetChild(i).jjtAccept(this, data);
		return(data);
    }

    public Object visit(ASTidentifier node, Object data) {
		System.out.print(node.value);
		return data;
    }

    public Object visit(ASTMinus_sign node, Object data) {
		System.out.print(node.value);
    	node.jjtGetChild(0).jjtAccept(this, data);
		return data;
    }

    public Object visit(ASTnumber node, Object data) {
		System.out.print(node.value);
		return data;
    }

	public Object visit(ASTReturn node, Object data) {
		System.out.print("        return ");
		if(node.jjtGetNumChildren() == 0) 
			System.out.print("()");
		else  {
			System.out.print("(");
			node.jjtGetChild(0).jjtAccept(this, data);
			System.out.print(")");
		}

		System.out.print(";");
		return data;
	}

    public Object visit(ASTMain node, Object data) {
		return data;
    }
}