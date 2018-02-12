/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 10:44:45 GMT 2018
 */

package uk.ac.sanger.artemis.circular.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PipedReader;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.digest.CutSite;
import uk.ac.sanger.artemis.circular.digest.EmbossTableParser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmbossTableParser_ESTest extends EmbossTableParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[1] = ']';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      LineNumberReader lineNumberReader0 = new LineNumberReader(charArrayReader0, 3);
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      List<CutSite> list0 = embossTableParser0.parse(lineNumberReader0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[5];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      LineNumberReader lineNumberReader0 = new LineNumberReader(charArrayReader0, 3);
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      List<CutSite> list0 = embossTableParser0.parse(lineNumberReader0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      StringReader stringReader0 = new StringReader("fuU?qWY6");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0, 11);
      LineNumberReader lineNumberReader0 = new LineNumberReader(pushbackReader0);
      embossTableParser0.list = null;
      List<CutSite> list0 = embossTableParser0.parse(lineNumberReader0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      // Undeclared exception!
      try { 
        embossTableParser0.parse((BufferedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.digest.EmbossTableParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      PipedReader pipedReader0 = new PipedReader(2253);
      BufferedReader bufferedReader0 = new BufferedReader(pipedReader0, 65);
      try { 
        embossTableParser0.parse(bufferedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EmbossTableParser embossTableParser0 = new EmbossTableParser();
      int int0 = embossTableParser0.getLength();
      assertEquals(0, int0);
  }
}
