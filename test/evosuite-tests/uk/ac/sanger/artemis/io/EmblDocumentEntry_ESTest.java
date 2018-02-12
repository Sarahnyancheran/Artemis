/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:40:27 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.LogReadListener;
import uk.ac.sanger.artemis.io.BlastDocumentEntry;
import uk.ac.sanger.artemis.io.EmblDocumentEntry;
import uk.ac.sanger.artemis.io.Entry;
import uk.ac.sanger.artemis.io.EntryInformation;
import uk.ac.sanger.artemis.io.MSPcrunchDocumentEntry;
import uk.ac.sanger.artemis.io.MSPcrunchEntryInformation;
import uk.ac.sanger.artemis.io.SimpleEntryInformation;
import uk.ac.sanger.artemis.util.Document;
import uk.ac.sanger.artemis.util.URLDocument;
import uk.ac.sanger.artemis.util.ZipFileDocument;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmblDocumentEntry_ESTest extends EmblDocumentEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      BlastDocumentEntry blastDocumentEntry0 = new BlastDocumentEntry(simpleEntryInformation0);
      EmblDocumentEntry emblDocumentEntry0 = new EmblDocumentEntry(blastDocumentEntry0);
      assertFalse(emblDocumentEntry0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      LogReadListener logReadListener0 = new LogReadListener(";V");
      EmblDocumentEntry emblDocumentEntry0 = null;
      try {
        emblDocumentEntry0 = new EmblDocumentEntry(entryInformation0, (Document) null, logReadListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.SimpleDocumentEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      URL uRL0 = MockURL.getHttpExample();
      URLDocument uRLDocument0 = new URLDocument(uRL0);
      LogReadListener logReadListener0 = new LogReadListener("tGF");
      EmblDocumentEntry emblDocumentEntry0 = null;
      try {
        emblDocumentEntry0 = new EmblDocumentEntry(simpleEntryInformation0, uRLDocument0, logReadListener0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      MockFile mockFile0 = new MockFile("vcK");
      ZipFileDocument zipFileDocument0 = new ZipFileDocument(mockFile0, "vcK");
      LogReadListener logReadListener0 = new LogReadListener("ID");
      EmblDocumentEntry emblDocumentEntry0 = null;
      try {
        emblDocumentEntry0 = new EmblDocumentEntry(mSPcrunchEntryInformation0, zipFileDocument0, logReadListener0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      EmblDocumentEntry emblDocumentEntry0 = null;
      try {
        emblDocumentEntry0 = new EmblDocumentEntry(simpleEntryInformation0, (Entry) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.SimpleDocumentEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EmblDocumentEntry emblDocumentEntry0 = null;
      try {
        emblDocumentEntry0 = new EmblDocumentEntry((EntryInformation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.SimpleEntryInformation", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EmblDocumentEntry emblDocumentEntry0 = null;
      try {
        emblDocumentEntry0 = new EmblDocumentEntry((Entry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.EmblDocumentEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      EmblDocumentEntry emblDocumentEntry0 = new EmblDocumentEntry(mSPcrunchEntryInformation0);
      assertFalse(emblDocumentEntry0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      uk.ac.sanger.artemis.FeatureVector featureVector0 = new uk.ac.sanger.artemis.FeatureVector();
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureVector0, "ID");
      uk.ac.sanger.artemis.Entry entry0 = filteredEntryGroup0.createEntry();
      EntryInformation entryInformation0 = entry0.getEntryInformation();
      MSPcrunchDocumentEntry mSPcrunchDocumentEntry0 = new MSPcrunchDocumentEntry(entryInformation0);
      EmblDocumentEntry emblDocumentEntry0 = new EmblDocumentEntry(entryInformation0, mSPcrunchDocumentEntry0, false);
      EmblDocumentEntry emblDocumentEntry1 = new EmblDocumentEntry(entryInformation0);
  }
}
