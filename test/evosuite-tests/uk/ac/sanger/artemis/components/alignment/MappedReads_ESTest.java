/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 11:22:10 GMT 2018
 */

package uk.ac.sanger.artemis.components.alignment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.alignment.BamView;
import uk.ac.sanger.artemis.components.alignment.GroupBamFrame;
import uk.ac.sanger.artemis.components.alignment.MappedReads;
import uk.ac.sanger.artemis.io.Range;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MappedReads_ESTest extends MappedReads_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Entry entry0 = simpleEntryGroup0.createEntry();
      FeatureVector featureVector0 = entry0.getFeaturesInRange((Range) null);
      MappedReads mappedReads0 = null;
      try {
        mappedReads0 = new MappedReads((BamView) null, featureVector0, 502, true, true, false, true);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      FeatureVector featureVector0 = simpleEntryGroup0.getAllFeatures();
      MappedReads mappedReads0 = null;
      try {
        mappedReads0 = new MappedReads((BamView) null, featureVector0, true, true, false);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MappedReads mappedReads0 = null;
      try {
        mappedReads0 = new MappedReads((BamView) null, (GroupBamFrame) null, 500, 500, 1, true, false);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
