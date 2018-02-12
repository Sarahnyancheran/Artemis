/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:28:13 GMT 2018
 */

package uk.ac.sanger.artemis.components.variant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.variant.HeaderLine;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HeaderLine_ESTest extends HeaderLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine("v06&[3O9dYok{fdZD+", "v06&[3O9dYok{fdZD+", hashtable0);
      String string0 = headerLine0.toString();
      assertEquals("v06&[3O9dYok{fdZD+", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine("", "FILTER_NONSYN", hashtable0);
      String string0 = headerLine0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      hashtable0.put("Type", "");
      HeaderLine headerLine0 = new HeaderLine("", "", hashtable0);
      String string0 = headerLine0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashtable0.merge("Number", "CwZ%E&k2Ji2", biFunction0);
      HeaderLine headerLine0 = new HeaderLine("CwZ%E&k2Ji2", "CwZ%E&k2Ji2", hashtable0);
      String string0 = headerLine0.getNumberString();
      assertEquals("CwZ%E&k2Ji2", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine("", "", hashtable0);
      String string0 = headerLine0.getHeaderTypeStr();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = null;
      try {
        headerLine0 = new HeaderLine((String) null, (String) null, hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashtable0.merge("Number", "", biFunction0);
      HeaderLine headerLine0 = new HeaderLine("", "", hashtable0);
      String string0 = headerLine0.getNumberString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      hashtable0.put("Type", "?w");
      HeaderLine headerLine0 = new HeaderLine("?w", "?w", hashtable0);
      String string0 = headerLine0.getType();
      assertEquals("?w", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine("FILTER_HOMOZYG", "FILTER_HOMOZYG", hashtable0);
      int int0 = headerLine0.getHeaderType();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine((String) null, "yZKP", hashtable0);
      String string0 = headerLine0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine((String) null, "yZKP", hashtable0);
      boolean boolean0 = headerLine0.isFlag();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine("?w", "?w", hashtable0);
      String string0 = headerLine0.getID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine((String) null, "yZKP", hashtable0);
      int int0 = headerLine0.getNumber();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine("?w", "?w", hashtable0);
      String string0 = headerLine0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine((String) null, "yZKP", hashtable0);
      int int0 = headerLine0.getHeaderType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine((String) null, "yZKP", hashtable0);
      String string0 = headerLine0.getHeaderTypeStr();
      assertEquals("yZKP", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine((String) null, "yZKP", hashtable0);
      String string0 = headerLine0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      HeaderLine headerLine0 = new HeaderLine("", "", hashtable0);
      String string0 = headerLine0.getNumberString();
      assertNull(string0);
  }
}
