/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 16:03:50 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.io.GFFStreamFeature;
import uk.ac.sanger.artemis.io.GenbankStreamFeature;
import uk.ac.sanger.artemis.plot.CoilFeatureAlgorithm;
import uk.ac.sanger.artemis.plot.HydrophilicityAlgorithm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FeatureAlgorithm_ESTest extends FeatureAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm((Feature) null);
      int int0 = hydrophilicityAlgorithm0.getValueCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CoilFeatureAlgorithm coilFeatureAlgorithm0 = new CoilFeatureAlgorithm((Feature) null);
      Feature feature0 = coilFeatureAlgorithm0.getFeature();
      assertNull(feature0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm((Feature) null);
      float[] floatArray0 = new float[5];
      // Undeclared exception!
      try { 
        hydrophilicityAlgorithm0.getValues(1, 1, floatArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.HydroAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(genbankStreamFeature0, false);
      Feature feature0 = new Feature(gFFStreamFeature0);
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      hydrophilicityAlgorithm0.getFeature();
  }
}
