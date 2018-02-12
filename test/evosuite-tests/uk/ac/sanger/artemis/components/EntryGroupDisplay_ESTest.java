/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 11:50:57 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.EntryEdit;
import uk.ac.sanger.artemis.components.EntryGroupDisplay;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EntryGroupDisplay_ESTest extends EntryGroupDisplay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntryGroupDisplay entryGroupDisplay0 = null;
      try {
        entryGroupDisplay0 = new EntryGroupDisplay((EntryEdit) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.EntryGroupDisplay", e);
      }
  }
}
