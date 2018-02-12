/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 11:54:42 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.ExternalProgram;
import uk.ac.sanger.artemis.components.ExternalProgramOptions;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExternalProgramOptions_ESTest extends ExternalProgramOptions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExternalProgramOptions externalProgramOptions0 = null;
      try {
        externalProgramOptions0 = new ExternalProgramOptions((ExternalProgram) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.ExternalProgramOptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExternalProgram externalProgram0 = new ExternalProgram((String) null, (String) null, 1000);
      ExternalProgramOptions externalProgramOptions0 = null;
      try {
        externalProgramOptions0 = new ExternalProgramOptions(externalProgram0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - please hit the programmer
         //
         verifyException("uk.ac.sanger.artemis.components.ExternalProgramOptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExternalProgram externalProgram0 = new ExternalProgram("", "", 1);
      ExternalProgramOptions externalProgramOptions0 = null;
      try {
        externalProgramOptions0 = new ExternalProgramOptions(externalProgram0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExternalProgram externalProgram0 = new ExternalProgram("p#HS,v$[QyfEr9", "p#HS,v$[QyfEr9", 0);
      ExternalProgramOptions externalProgramOptions0 = null;
      try {
        externalProgramOptions0 = new ExternalProgramOptions(externalProgram0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
