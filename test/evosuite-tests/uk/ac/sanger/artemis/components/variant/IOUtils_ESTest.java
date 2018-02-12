/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:32:11 GMT 2018
 */

package uk.ac.sanger.artemis.components.variant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.awt.datatransfer.Clipboard;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.variant.IOUtils;
import uk.ac.sanger.artemis.components.variant.VCFview;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      IOUtils.wrapString("", stringBuffer0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(java.lang.System.getProperty("user.dir") + "/Nlt5#ivM5j=oR$Ruy");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "org.emboss.jemboss.gui.Browser$JIconButton");
      // Undeclared exception!
      try { 
        IOUtils.isBCF("Nlt5#ivM5j=oR$Ruy");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("htsjdk.samtools.util.BlockCompressedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.wrapString("JM", (StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      try { 
        IOUtils.isBCF("_");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.exportVariantFasta((VCFview) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      // Undeclared exception!
      try { 
        IOUtils.exportFastaByRange((VCFview) null, (Selection) null, false, charArrayWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      // Undeclared exception!
      try { 
        IOUtils.createFeatures((VCFview) null, simpleEntryGroup0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.SimpleEntryGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.countVariants((VCFview) null, (FeatureVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.variant.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.isBCF("ftp:v&");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "GAME1.2");
      IOUtils.wrapString("ftp:Reverse Correlation Scores", stringBuffer0);
      assertEquals(38, stringBuffer0.length());
      assertEquals("GAME1.2ftp:Reverse Correlation Scores\n", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("org.biojava.bio.seq.homol.SimilarityPairFeature$Template");
      Selection selection0 = new Selection(clipboard0);
      FeatureVector featureVector0 = selection0.getSelectedFeatures();
      // Undeclared exception!
      try { 
        IOUtils.countVariants((VCFview) null, featureVector0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Selection selection0 = new Selection((Clipboard) null);
      // Undeclared exception!
      try { 
        IOUtils.exportFastaByRange((VCFview) null, selection0, true, stringWriter0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("No base range selected.");
      Selection selection0 = new Selection(clipboard0);
      FeatureVector featureVector0 = selection0.getAllFeatures();
      // Undeclared exception!
      try { 
        IOUtils.writeVCF((Map<String, Boolean>) null, (String) null, (-878), (VCFview) null, featureVector0, (-1611522464));
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Boolean> hashMap0 = new HashMap<String, Boolean>();
      File file0 = IOUtils.writeVCF(hashMap0, "ovnga,+", 1597, (VCFview) null, (FeatureVector) null, 1597);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
  }
}
