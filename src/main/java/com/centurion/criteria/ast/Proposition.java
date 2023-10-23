package com.centurion.criteria.ast;

import com.centurion.criteria.PredicateVisitor;

abstract class Proposition {

    public abstract <R> R accept(PredicateVisitor<R> visitor);
}
