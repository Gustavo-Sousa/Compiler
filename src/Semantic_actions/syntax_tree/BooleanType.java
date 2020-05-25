package Semantic_actions.syntax_tree;

import Semantic_actions.visitor.*;
//import visitor.TypeVisitor;

public class BooleanType extends Type {
  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
}