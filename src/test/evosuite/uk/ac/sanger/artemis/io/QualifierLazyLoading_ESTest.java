/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:55:04 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.LazyQualifierValue;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.io.QualifierLazyLoading;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class QualifierLazyLoading_ESTest extends QualifierLazyLoading_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("", (LazyQualifierValue) null);
      Qualifier qualifier0 = qualifierLazyLoading0.copy();
      qualifierLazyLoading0.removeValue((Object) null);
      StringVector stringVector0 = qualifier0.getValues();
      assertTrue(stringVector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LazyQualifierValue lazyQualifierValue0 = mock(LazyQualifierValue.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(lazyQualifierValue0).getString();
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("K.0t", lazyQualifierValue0);
      StringVector stringVector0 = qualifierLazyLoading0.getValues();
      QualifierLazyLoading qualifierLazyLoading1 = new QualifierLazyLoading("K.0t", stringVector0);
      LazyQualifierValue lazyQualifierValue1 = qualifierLazyLoading1.getValue(0);
      assertNull(lazyQualifierValue1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LazyQualifierValue lazyQualifierValue0 = mock(LazyQualifierValue.class, new ViolatedAssumptionAnswer());
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading((String) null, lazyQualifierValue0);
      String string0 = qualifierLazyLoading0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("", (List) null);
      String string0 = qualifierLazyLoading0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("6R-.D", (List) null);
      List<Object> list0 = qualifierLazyLoading0.getLazyValues();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("", (LazyQualifierValue) null);
      qualifierLazyLoading0.removeValue((Object) null);
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.removeValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierLazyLoading", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("", (LazyQualifierValue) null);
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.isAllLazyValuesLoaded();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierLazyLoading", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LazyQualifierValue lazyQualifierValue0 = mock(LazyQualifierValue.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(lazyQualifierValue0).toString();
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("", lazyQualifierValue0);
      qualifierLazyLoading0.addValue((Object) "");
      LazyQualifierValue lazyQualifierValue1 = qualifierLazyLoading0.getValue(0);
      qualifierLazyLoading0.removeValue(lazyQualifierValue1);
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.isAllLazyValuesLoaded();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to uk.ac.sanger.artemis.io.LazyQualifierValue
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierLazyLoading", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LazyQualifierValue lazyQualifierValue0 = mock(LazyQualifierValue.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(lazyQualifierValue0).getString();
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("MJi^k", lazyQualifierValue0);
      qualifierLazyLoading0.addValue((Object) "MJi^k");
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.getValues();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to uk.ac.sanger.artemis.io.LazyQualifierValue
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierLazyLoading", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("\"", (List) null);
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.getValue(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierLazyLoading", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LazyQualifierValue lazyQualifierValue0 = mock(LazyQualifierValue.class, new ViolatedAssumptionAnswer());
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("n!zJo.}E|cb ln}8D", lazyQualifierValue0);
      qualifierLazyLoading0.addValue((Object) "n!zJo.}E|cb ln}8D");
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.getValue(1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to uk.ac.sanger.artemis.io.LazyQualifierValue
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierLazyLoading", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("hlw1`Y'lllz#.\bC", (LazyQualifierValue) null);
      List<Object> list0 = qualifierLazyLoading0.getLazyValues();
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.addValues(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("=", (List) null);
      String string0 = qualifierLazyLoading0.getName();
      assertEquals("=", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LazyQualifierValue lazyQualifierValue0 = mock(LazyQualifierValue.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(lazyQualifierValue0).getString();
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("internal error - zero length values vector", lazyQualifierValue0);
      StringVector stringVector0 = qualifierLazyLoading0.getValues();
      qualifierLazyLoading0.addValues((List) stringVector0);
      assertEquals("[null]", stringVector0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LazyQualifierValue lazyQualifierValue0 = mock(LazyQualifierValue.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(lazyQualifierValue0).isLazyLoaded();
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("internal error - zero length values vector", lazyQualifierValue0);
      boolean boolean0 = qualifierLazyLoading0.isAllLazyValuesLoaded();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LazyQualifierValue lazyQualifierValue0 = mock(LazyQualifierValue.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(lazyQualifierValue0).isLazyLoaded();
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("Ba2B", lazyQualifierValue0);
      boolean boolean0 = qualifierLazyLoading0.isAllLazyValuesLoaded();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("[D", (List) null);
      StringVector stringVector0 = qualifierLazyLoading0.getValues();
      assertNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LazyQualifierValue lazyQualifierValue0 = mock(LazyQualifierValue.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(lazyQualifierValue0).getString();
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("Ba2B", lazyQualifierValue0);
      StringVector stringVector0 = qualifierLazyLoading0.getValues();
      assertNotNull(stringVector0);
      assertEquals("[null]", stringVector0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("=", (List) null);
      qualifierLazyLoading0.setForceLoad(true);
      qualifierLazyLoading0.addValues((List) null);
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.getValues();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.QualifierLazyLoading", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LazyQualifierValue lazyQualifierValue0 = mock(LazyQualifierValue.class, new ViolatedAssumptionAnswer());
      QualifierLazyLoading qualifierLazyLoading0 = new QualifierLazyLoading("[D", lazyQualifierValue0);
      // Undeclared exception!
      try { 
        qualifierLazyLoading0.getValue(765);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 765
         //
         verifyException("java.util.Vector", e);
      }
  }
}