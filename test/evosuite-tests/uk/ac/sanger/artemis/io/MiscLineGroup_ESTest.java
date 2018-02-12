/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:13:49 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.EmblMisc;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MiscLineGroup_ESTest extends MiscLineGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmblMisc emblMisc0 = new EmblMisc(".u+^-bv9pgy{V");
      MockFileWriter mockFileWriter0 = new MockFileWriter(".u+^-bv9pgy{V");
      emblMisc0.writeToStream(mockFileWriter0);
      assertEquals(".u+^-bv9pgy{V", emblMisc0.getLine());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmblMisc emblMisc0 = new EmblMisc(".u+^-bv9pgy{V");
      String string0 = emblMisc0.getLine();
      assertEquals(".u+^-bv9pgy{V", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmblMisc emblMisc0 = new EmblMisc("");
      String string0 = emblMisc0.getLine();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmblMisc emblMisc0 = new EmblMisc("lK%eh");
      // Undeclared exception!
      try { 
        emblMisc0.writeToStream((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.MiscLineGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmblMisc emblMisc0 = new EmblMisc(".u+^-bv9pgy{V");
      emblMisc0.setLine(".u+^-bv9pgy{V");
      assertEquals(".u+^-bv9pgy{V", emblMisc0.getLine());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1568), (-1568));
      Charset charset0 = Charset.defaultCharset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      InputStreamReader inputStreamReader0 = new InputStreamReader(byteArrayInputStream0, charsetDecoder0);
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(inputStreamReader0);
      EmblMisc emblMisc0 = new EmblMisc(linePushBackReader0);
      assertNull(emblMisc0.getLine());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EmblMisc emblMisc0 = new EmblMisc("lK%eh");
      String string0 = emblMisc0.toString();
      assertEquals("lK%eh\n", string0);
  }
}
