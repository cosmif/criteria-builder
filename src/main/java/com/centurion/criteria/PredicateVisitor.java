package com.centurion.criteria;

import com.centurion.criteria.ast.Conjunction;
import com.centurion.criteria.ast.Disjunction;
import com.centurion.criteria.ast.Predicate;

/**
 * An interface for visiting the proposition terms.
 *
 * @param <R> Return type of the visitor's method.
 */
public interface PredicateVisitor<R> {

    R visit(Conjunction conjunction);

    R visit(Disjunction disjunction);

    R visit(Predicate predicate);
}
