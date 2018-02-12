/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:55:39 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.GFF3Encoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GFF3Encoder_ESTest extends GFF3Encoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = GFF3Encoder.encode("%09");
      assertEquals("%2509", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = GFF3Encoder.encode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = GFF3Encoder.decode("9");
      assertEquals("9", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = GFF3Encoder.decode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GFF3Encoder gFF3Encoder0 = new GFF3Encoder();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = GFF3Encoder.decode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = GFF3Encoder.encode((String) null);
      assertNull(string0);
  }
}
