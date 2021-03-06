/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:56:19 GMT 2018
 */

package uk.ac.sanger.artemis.circular.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.List;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.DefaultEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.digest.FileSelectionPanel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FileSelectionPanel_ESTest extends FileSelectionPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Stack<File> stack0 = new Stack<File>();
      File file0 = MockFile.createTempFile("k+XwR!BJW", "k+/wR!J");
      stack0.add(file0);
      stack0.add(file0);
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel("org.apache.log4j.PropertyConfigurator", stack0, stack0, false);
      fileSelectionPanel0.getSequenceFiles();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel((String) null, (List<File>) null, (List<File>) null, false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel((String) null, (List<File>) null, (List<File>) null, true);
      FileSelectionPanel.SelectionRow fileSelectionPanel_SelectionRow0 = fileSelectionPanel0.new SelectionRow();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel("", (List<File>) null, (List<File>) null, false);
      boolean boolean0 = fileSelectionPanel0.isMethylation();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel("VuBP", (List<File>) null, (List<File>) null, true);
      List<File> list0 = fileSelectionPanel0.getSequenceFiles();
      FileSelectionPanel fileSelectionPanel1 = new FileSelectionPanel("VuBP", (List<File>) null, list0, true);
      List<File> list1 = fileSelectionPanel1.getRestrictOutputs();
      assertSame(list0, list1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Stack<File> stack0 = new Stack<File>();
      File file0 = MockFile.createTempFile("k+XwR!BJW", "k+/wR!J");
      stack0.add(file0);
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel("org.apache.log4j.PropertyConfigurator", stack0, stack0, false);
      List<File> list0 = fileSelectionPanel0.getRestrictOutputs();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Stack<File> stack0 = new Stack<File>();
      File file0 = MockFile.createTempFile("k+XwR!BJW", "k+X/NwR!BJ");
      stack0.add(file0);
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel("org.apache.log4j.PropertyConfigurator", stack0, stack0, false);
      JTextField jTextField0 = fileSelectionPanel0.getEmbossRootField();
      assertNull(jTextField0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Stack<File> stack0 = new Stack<File>();
      stack0.add((File) null);
      FileSelectionPanel fileSelectionPanel0 = null;
      try {
        fileSelectionPanel0 = new FileSelectionPanel("$", stack0, stack0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.digest.FileSelectionPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel("", (List<File>) null, (List<File>) null, false);
      List<File> list0 = fileSelectionPanel0.getSequenceFiles();
      FileSelectionPanel fileSelectionPanel1 = new FileSelectionPanel("", list0, list0, false);
      assertTrue(fileSelectionPanel1.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel("k+X/NwR!BJW", (List<File>) null, (List<File>) null, true);
      boolean boolean0 = fileSelectionPanel0.isMethylation();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel("k+X/NwR!BJW", (List<File>) null, (List<File>) null, true);
      JTextField jTextField0 = fileSelectionPanel0.getEmbossRootField();
      assertFalse(jTextField0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel("", (List<File>) null, (List<File>) null, false);
      String string0 = fileSelectionPanel0.getEnzymes();
      assertEquals("xbai", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel("k+X/NwR!BJW", (List<File>) null, (List<File>) null, true);
      List<File> list0 = fileSelectionPanel0.getRestrictOutputs();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSelectionPanel fileSelectionPanel0 = new FileSelectionPanel("", (List<File>) null, (List<File>) null, false);
      DefaultEditorKit.CopyAction defaultEditorKit_CopyAction0 = new DefaultEditorKit.CopyAction();
      // Undeclared exception!
      try { 
        fileSelectionPanel0.showJFrame((JFrame) null, defaultEditorKit_CopyAction0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.digest.FileSelectionPanel", e);
      }
  }
}
