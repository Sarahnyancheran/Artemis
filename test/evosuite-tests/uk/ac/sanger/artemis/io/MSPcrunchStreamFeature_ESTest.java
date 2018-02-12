/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:16:34 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sshtools.j2ssh.io.ByteArrayReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PushbackReader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.MalformedInputException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.DatabaseStreamFeature;
import uk.ac.sanger.artemis.io.Feature;
import uk.ac.sanger.artemis.io.GenbankStreamFeature;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Location;
import uk.ac.sanger.artemis.io.MSPcrunchStreamFeature;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MSPcrunchStreamFeature_ESTest extends MSPcrunchStreamFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-115);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Charset charset0 = Charset.defaultCharset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      InputStreamReader inputStreamReader0 = new InputStreamReader(byteArrayInputStream0, charsetDecoder0);
      PushbackReader pushbackReader0 = new PushbackReader(inputStreamReader0);
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(pushbackReader0);
      try { 
        MSPcrunchStreamFeature.readFromStream(linePushBackReader0);
        fail("Expecting exception: MalformedInputException");
      
      } catch(MalformedInputException e) {
         //
         // Input length = 1
         //
         verifyException("java.nio.charset.CoderResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        MSPcrunchStreamFeature.readFromStream((LinePushBackReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.MSPcrunchStreamFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(pipedReader0);
      try { 
        MSPcrunchStreamFeature.readFromStream(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MSPcrunchStreamFeature mSPcrunchStreamFeature0 = null;
      try {
        mSPcrunchStreamFeature0 = new MSPcrunchStreamFeature((Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.MSPcrunchStreamFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayReader byteArrayReader0 = new ByteArrayReader(byteArray0);
      Charset charset0 = Charset.defaultCharset();
      InputStreamReader inputStreamReader0 = new InputStreamReader(byteArrayReader0, charset0);
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(inputStreamReader0);
      try { 
        MSPcrunchStreamFeature.readFromStream(linePushBackReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // invalid MSPcrunch line (not enough fields): \u0000
         //
         verifyException("uk.ac.sanger.artemis.io.MSPcrunchStreamFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Key key0 = Key.CDS;
      QualifierVector qualifierVector0 = new QualifierVector();
      MSPcrunchStreamFeature mSPcrunchStreamFeature0 = new MSPcrunchStreamFeature(key0, (Location) null, qualifierVector0);
      Feature feature0 = mSPcrunchStreamFeature0.copy();
      assertNotSame(feature0, mSPcrunchStreamFeature0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      DatabaseStreamFeature databaseStreamFeature0 = new DatabaseStreamFeature(genbankStreamFeature0);
      MSPcrunchStreamFeature mSPcrunchStreamFeature0 = new MSPcrunchStreamFeature(databaseStreamFeature0);
      PipedReader pipedReader0 = new PipedReader();
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      mSPcrunchStreamFeature0.writeToStream(pipedWriter0);
  }
}
