/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:30:42 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.GenbankStreamSequence;
import uk.ac.sanger.artemis.io.LineGroup;
import uk.ac.sanger.artemis.io.Sequence;
import uk.ac.sanger.artemis.io.StreamSequence;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class GenbankStreamSequence_ESTest extends GenbankStreamSequence_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(" ;s]k@_ m8i#A}X6");
      assertEquals(16, genbankStreamSequence0.length());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(16, genbankStreamSequence0.getOtherCount());
      assertNotNull(genbankStreamSequence0);
      
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn("ORIGINfive_prime_UTR").when(linePushBackReader0).readLine();
      genbankStreamSequence0.readHeader(linePushBackReader0);
      assertEquals(16, genbankStreamSequence0.length());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(16, genbankStreamSequence0.getOtherCount());
      assertEquals("ORIGINfive_prime_UTR", genbankStreamSequence0.getHeader());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertNotNull(genbankStreamSequence0);
      
      genbankStreamSequence0.setHeader("");
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals("", genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getTCount());
      
      String string0 = genbankStreamSequence0.getHeader();
      assertEquals("", string0);
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals("", genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(".tbi");
      assertEquals(3, genbankStreamSequence0.getOtherCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(1, genbankStreamSequence0.getTCount());
      assertEquals(4, genbankStreamSequence0.length());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNotNull(genbankStreamSequence0);
      
      GenbankStreamSequence genbankStreamSequence1 = (GenbankStreamSequence)genbankStreamSequence0.copy();
      assertFalse(genbankStreamSequence1.equals((Object)genbankStreamSequence0));
      assertNotSame(genbankStreamSequence0, genbankStreamSequence1);
      assertNotSame(genbankStreamSequence1, genbankStreamSequence0);
      assertEquals(3, genbankStreamSequence0.getOtherCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(1, genbankStreamSequence0.getTCount());
      assertEquals(4, genbankStreamSequence0.length());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(2, genbankStreamSequence1.getFormatType());
      assertEquals(3, genbankStreamSequence1.getOtherCount());
      assertEquals(1, genbankStreamSequence1.getTCount());
      assertEquals(0, genbankStreamSequence1.getCCount());
      assertNull(genbankStreamSequence1.getHeader());
      assertEquals(4, genbankStreamSequence1.length());
      assertEquals(0, genbankStreamSequence1.getACount());
      assertEquals(0, genbankStreamSequence1.getGCount());
      assertNotNull(genbankStreamSequence1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("pseudogene");
      assertEquals(10, genbankStreamSequence0.length());
      assertEquals(1, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(9, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNotNull(genbankStreamSequence0);
      
      GenbankStreamSequence genbankStreamSequence1 = (GenbankStreamSequence)genbankStreamSequence0.copy();
      assertFalse(genbankStreamSequence1.equals((Object)genbankStreamSequence0));
      assertNotSame(genbankStreamSequence0, genbankStreamSequence1);
      assertNotSame(genbankStreamSequence1, genbankStreamSequence0);
      assertEquals(10, genbankStreamSequence0.length());
      assertEquals(1, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(9, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(0, genbankStreamSequence1.getACount());
      assertNull(genbankStreamSequence1.getHeader());
      assertEquals(0, genbankStreamSequence1.getTCount());
      assertEquals(0, genbankStreamSequence1.getCCount());
      assertEquals(10, genbankStreamSequence1.length());
      assertEquals(1, genbankStreamSequence1.getGCount());
      assertEquals(9, genbankStreamSequence1.getOtherCount());
      assertEquals(2, genbankStreamSequence1.getFormatType());
      assertNotNull(genbankStreamSequence1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("+c,");
      assertEquals(3, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(2, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(1, genbankStreamSequence0.getCCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertNotNull(genbankStreamSequence0);
      
      GenbankStreamSequence genbankStreamSequence1 = (GenbankStreamSequence)genbankStreamSequence0.copy();
      assertFalse(genbankStreamSequence1.equals((Object)genbankStreamSequence0));
      assertNotSame(genbankStreamSequence0, genbankStreamSequence1);
      assertNotSame(genbankStreamSequence1, genbankStreamSequence0);
      assertEquals(3, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(2, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(1, genbankStreamSequence0.getCCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(2, genbankStreamSequence1.getFormatType());
      assertEquals(0, genbankStreamSequence1.getTCount());
      assertEquals(3, genbankStreamSequence1.length());
      assertEquals(0, genbankStreamSequence1.getACount());
      assertNull(genbankStreamSequence1.getHeader());
      assertEquals(2, genbankStreamSequence1.getOtherCount());
      assertEquals(0, genbankStreamSequence1.getGCount());
      assertEquals(1, genbankStreamSequence1.getCCount());
      assertNotNull(genbankStreamSequence1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("vj, bY-i");
      assertEquals(8, genbankStreamSequence0.getOtherCount());
      assertEquals(8, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertNotNull(genbankStreamSequence0);
      
      // Undeclared exception!
      try { 
        genbankStreamSequence0.writeToStream((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("");
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      assertNotNull(genbankStreamSequence0);
      
      genbankStreamSequence0.forceReset();
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      
      GenbankStreamSequence genbankStreamSequence1 = new GenbankStreamSequence(genbankStreamSequence0);
      assertFalse(genbankStreamSequence1.equals((Object)genbankStreamSequence0));
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence1.getOtherCount());
      assertEquals(0, genbankStreamSequence1.getTCount());
      assertEquals(0, genbankStreamSequence1.length());
      assertNull(genbankStreamSequence1.getHeader());
      assertEquals(2, genbankStreamSequence1.getFormatType());
      assertEquals(0, genbankStreamSequence1.getCCount());
      assertEquals(0, genbankStreamSequence1.getACount());
      assertEquals(0, genbankStreamSequence1.getGCount());
      assertNotNull(genbankStreamSequence1);
      
      String string0 = null;
      genbankStreamSequence0.setHeader((String) null);
      assertFalse(genbankStreamSequence0.equals((Object)genbankStreamSequence1));
      assertNotSame(genbankStreamSequence0, genbankStreamSequence1);
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      
      int int0 = LineGroup.getLineType("");
      assertEquals(2, int0);
      
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn("", (String) null).when(linePushBackReader0).readLine();
      genbankStreamSequence0.readSequence(linePushBackReader0);
      assertFalse(genbankStreamSequence0.equals((Object)genbankStreamSequence1));
      assertNotSame(genbankStreamSequence0, genbankStreamSequence1);
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      
      genbankStreamSequence1.setCounts();
      assertFalse(genbankStreamSequence0.equals((Object)genbankStreamSequence1));
      assertFalse(genbankStreamSequence1.equals((Object)genbankStreamSequence0));
      assertNotSame(genbankStreamSequence0, genbankStreamSequence1);
      assertNotSame(genbankStreamSequence1, genbankStreamSequence0);
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence1.getOtherCount());
      assertEquals(0, genbankStreamSequence1.getTCount());
      assertEquals(0, genbankStreamSequence1.length());
      assertNull(genbankStreamSequence1.getHeader());
      assertEquals(2, genbankStreamSequence1.getFormatType());
      assertEquals(0, genbankStreamSequence1.getCCount());
      assertEquals(0, genbankStreamSequence1.getACount());
      assertEquals(0, genbankStreamSequence1.getGCount());
      
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      genbankStreamSequence0.setSequencePackingCapacity(int0);
      assertFalse(genbankStreamSequence0.equals((Object)genbankStreamSequence1));
      assertNotSame(genbankStreamSequence0, genbankStreamSequence1);
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      
      String string1 = "";
      int int1 = LineGroup.getLineType(string1);
      assertTrue(int1 == int0);
      assertEquals(2, int1);
      
      genbankStreamSequence1.writeToStream(writer0);
      assertFalse(genbankStreamSequence0.equals((Object)genbankStreamSequence1));
      assertFalse(genbankStreamSequence1.equals((Object)genbankStreamSequence0));
      assertNotSame(genbankStreamSequence0, genbankStreamSequence1);
      assertNotSame(genbankStreamSequence1, genbankStreamSequence0);
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence1.getOtherCount());
      assertEquals(0, genbankStreamSequence1.getTCount());
      assertEquals(0, genbankStreamSequence1.length());
      assertNull(genbankStreamSequence1.getHeader());
      assertEquals(2, genbankStreamSequence1.getFormatType());
      assertEquals(0, genbankStreamSequence1.getCCount());
      assertEquals(0, genbankStreamSequence1.getACount());
      assertEquals(0, genbankStreamSequence1.getGCount());
      
      String string2 = genbankStreamSequence0.getHeader();
      assertFalse(genbankStreamSequence0.equals((Object)genbankStreamSequence1));
      assertNotSame(genbankStreamSequence0, genbankStreamSequence1);
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      assertNull(string2);
      
      char char0 = genbankStreamSequence0.charAt(int1);
      assertFalse(genbankStreamSequence0.equals((Object)genbankStreamSequence1));
      assertTrue(int1 == int0);
      assertEquals('u', char0);
      assertNotSame(genbankStreamSequence0, genbankStreamSequence1);
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getOtherCount());
      
      String string3 = "D(&@}P";
      LinePushBackReader linePushBackReader1 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(linePushBackReader1).getLineNumber();
      doReturn(string3).when(linePushBackReader1).readLine();
      try { 
        genbankStreamSequence0.readSequence(linePushBackReader1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // GENBANK sequence file contains a character that is not a letter: (
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("-)_>J!");
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(6, genbankStreamSequence0.getOtherCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(6, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertNotNull(genbankStreamSequence0);
      
      // Undeclared exception!
      try { 
        genbankStreamSequence0.readSequence((LinePushBackReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(" ;s]k@_ m8i#A}X6");
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(16, genbankStreamSequence0.length());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(16, genbankStreamSequence0.getOtherCount());
      assertNotNull(genbankStreamSequence0);
      
      // Undeclared exception!
      try { 
        genbankStreamSequence0.readHeader((LinePushBackReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(",aa:Sec)");
      assertEquals(2, genbankStreamSequence0.getACount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(8, genbankStreamSequence0.length());
      assertEquals(1, genbankStreamSequence0.getCCount());
      assertEquals(5, genbankStreamSequence0.getOtherCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertNotNull(genbankStreamSequence0);
      
      genbankStreamSequence0.setSequencePackingCapacity(0);
      assertEquals(2, genbankStreamSequence0.getACount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(8, genbankStreamSequence0.length());
      assertEquals(1, genbankStreamSequence0.getCCount());
      assertEquals(5, genbankStreamSequence0.getOtherCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getTCount());
      
      // Undeclared exception!
      try { 
        genbankStreamSequence0.copy();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("uk.ac.sanger.artemis.io.StreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(linePushBackReader0).readLine();
      GenbankStreamSequence genbankStreamSequence0 = null;
      try {
        genbankStreamSequence0 = new GenbankStreamSequence(linePushBackReader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = null;
      try {
        genbankStreamSequence0 = new GenbankStreamSequence((Sequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = null;
      try {
        genbankStreamSequence0 = new GenbankStreamSequence((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("BASE COUNT");
      assertEquals(10, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(10, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertNotNull(genbankStreamSequence0);
      
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn("BASE COUNT", "A").when(linePushBackReader0).readLine();
      try { 
        genbankStreamSequence0.readHeader(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Genbank sequence data should have \"ORIGIN\" on the second line
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(" ;s]k@_ m8i#A}X6");
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(16, genbankStreamSequence0.length());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(16, genbankStreamSequence0.getOtherCount());
      assertNotNull(genbankStreamSequence0);
      
      genbankStreamSequence0.setHeader(" ;s]k@_ m8i#A}X6");
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(16, genbankStreamSequence0.length());
      assertEquals(" ;s]k@_ m8i#A}X6", genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(16, genbankStreamSequence0.getOtherCount());
      
      String string0 = genbankStreamSequence0.getHeader();
      assertEquals(" ;s]k@_ m8i#A}X6", string0);
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(16, genbankStreamSequence0.length());
      assertEquals(" ;s]k@_ m8i#A}X6", genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(16, genbankStreamSequence0.getOtherCount());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("GENBANK sequence file contains a character that is not a letter: ");
      assertEquals(6, genbankStreamSequence0.getACount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(7, genbankStreamSequence0.getTCount());
      assertEquals(48, genbankStreamSequence0.getOtherCount());
      assertEquals(4, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(65, genbankStreamSequence0.length());
      assertNotNull(genbankStreamSequence0);
      
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      genbankStreamSequence0.writeToStream(writer0);
      assertEquals(6, genbankStreamSequence0.getACount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(7, genbankStreamSequence0.getTCount());
      assertEquals(48, genbankStreamSequence0.getOtherCount());
      assertEquals(4, genbankStreamSequence0.getCCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(65, genbankStreamSequence0.length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("+c,");
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(2, genbankStreamSequence0.getOtherCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(1, genbankStreamSequence0.getCCount());
      assertEquals(3, genbankStreamSequence0.length());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertNotNull(genbankStreamSequence0);
      
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(linePushBackReader0).getLineNumber();
      doReturn("O*rRIG(NOR").when(linePushBackReader0).readLine();
      try { 
        genbankStreamSequence0.readSequence(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // GENBANK sequence file contains a character that is not a letter: (
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("score");
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertEquals(5, genbankStreamSequence0.length());
      assertEquals(4, genbankStreamSequence0.getOtherCount());
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(1, genbankStreamSequence0.getCCount());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertNotNull(genbankStreamSequence0);
      
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(linePushBackReader0).getLineNumber();
      doReturn("BASE COUNT-?YD$5xg#Q#[\"hL").when(linePushBackReader0).readLine();
      try { 
        genbankStreamSequence0.readSequence(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // GENBANK sequence file contains a character that is not a letter: ?
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(" ;s]k@_ m8i#A}X6");
      assertEquals(2, genbankStreamSequence0.getFormatType());
      assertEquals(0, genbankStreamSequence0.getGCount());
      assertEquals(0, genbankStreamSequence0.getACount());
      assertEquals(16, genbankStreamSequence0.getOtherCount());
      assertNull(genbankStreamSequence0.getHeader());
      assertEquals(0, genbankStreamSequence0.getCCount());
      assertEquals(16, genbankStreamSequence0.length());
      assertEquals(0, genbankStreamSequence0.getTCount());
      assertNotNull(genbankStreamSequence0);
      
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(linePushBackReader0).getLineNumber();
      doReturn(" ;s]k@_ m8i#A}X6").when(linePushBackReader0).readLine();
      try { 
        genbankStreamSequence0.readSequence(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // GENBANK sequence file contains a character that is not a letter: ;
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("+c,");
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn((-1910518341)).when(linePushBackReader0).getLineNumber();
      doReturn("uk.ac.sanger.artemis.util.Document", "", "03FS\"okX)T8jq@_FMTS").when(linePushBackReader0).readLine();
      try { 
        genbankStreamSequence0.readSequence(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // GENBANK sequence file contains a character that is not a letter: \"
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn("ORIGINshared_id", "//").when(linePushBackReader0).readLine();
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(linePushBackReader0);
      assertEquals("ORIGINshared_id", genbankStreamSequence0.getHeader());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn("P").when(linePushBackReader0).readLine();
      GenbankStreamSequence genbankStreamSequence0 = null;
      try {
        genbankStreamSequence0 = new GenbankStreamSequence(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Genbank sequence data should begin with \"BASE COUNT\" or \"ORIGIN\"
         //
         verifyException("uk.ac.sanger.artemis.io.GenbankStreamSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("0aK");
      StreamSequence streamSequence0 = genbankStreamSequence0.copy();
      assertEquals(1, streamSequence0.getACount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinePushBackReader linePushBackReader0 = mock(LinePushBackReader.class, new ViolatedAssumptionAnswer());
      doReturn("ORIGIN", (String) null).when(linePushBackReader0).readLine();
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(linePushBackReader0);
      genbankStreamSequence0.copy();
      assertEquals("ORIGIN", genbankStreamSequence0.getHeader());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("0aK");
      int int0 = genbankStreamSequence0.getFormatType();
      assertEquals(2, int0);
      assertEquals(1, genbankStreamSequence0.getACount());
  }
}