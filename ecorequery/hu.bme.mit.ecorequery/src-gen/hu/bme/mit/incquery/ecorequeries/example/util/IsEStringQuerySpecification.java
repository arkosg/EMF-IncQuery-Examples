package hu.bme.mit.incquery.ecorequeries.example.util;

import com.google.common.collect.Sets;
import hu.bme.mit.incquery.ecorequeries.example.IsEStringMatch;
import hu.bme.mit.incquery.ecorequeries.example.IsEStringMatcher;
import hu.bme.mit.incquery.ecorequeries.example.util.ECoreNamedElementQuerySpecification;
import hu.bme.mit.incquery.ecorequeries.example.util.IsInECoreQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate IsEStringMatcher in a type-safe way.
 * 
 * @see IsEStringMatcher
 * @see IsEStringMatch
 * 
 */
@SuppressWarnings("all")
public final class IsEStringQuerySpecification extends BaseGeneratedEMFQuerySpecification<IsEStringMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IsEStringQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected IsEStringMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return IsEStringMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.incquery.ecorequeries.example.IsEString";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("Element");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("Element", "org.eclipse.emf.ecore.EClassifier"));
  }
  
  @Override
  public IsEStringMatch newEmptyMatch() {
    return IsEStringMatch.newEmptyMatch();
  }
  
  @Override
  public IsEStringMatch newMatch(final Object... parameters) {
    return IsEStringMatch.newMatch((org.eclipse.emf.ecore.EClassifier) parameters[0]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_Element = body.getOrCreateVariableByName("Element");
      PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_Element, "Element")
      ));
      
      new PositivePatternCall(body, new FlatTuple(var_Element), IsInECoreQuerySpecification.instance());
      new ConstantValue(body, var__virtual_0_, "EString");
      new PositivePatternCall(body, new FlatTuple(var_Element, var__virtual_0_), ECoreNamedElementQuerySpecification.instance());
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static IsEStringQuerySpecification INSTANCE = make();
    
    public static IsEStringQuerySpecification make() {
      return new IsEStringQuerySpecification();					
      
    }
  }
}
