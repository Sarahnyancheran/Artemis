/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:54:37 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.DisplayAdjustmentEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DisplayAdjustmentEvent_ESTest extends DisplayAdjustmentEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("AKq^?8=3Za#", 0, 0, 0, 0.0F, (-192), true, 7518);
      boolean boolean0 = displayAdjustmentEvent0.isRevCompDisplay();
      assertEquals((-192), displayAdjustmentEvent0.getScaleFactor());
      assertTrue(boolean0);
      assertEquals(0, displayAdjustmentEvent0.getWidthInBases());
      assertEquals(7518, displayAdjustmentEvent0.getType());
      assertEquals(0, displayAdjustmentEvent0.getEnd());
      assertEquals(0, displayAdjustmentEvent0.getStart());
      assertEquals(0.0F, displayAdjustmentEvent0.getBaseWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 4899, 4899, 1, 51.7F, 4899, false, 1);
      int int0 = displayAdjustmentEvent0.getWidthInBases();
      assertEquals(1, displayAdjustmentEvent0.getType());
      assertEquals(1, int0);
      assertFalse(displayAdjustmentEvent0.isRevCompDisplay());
      assertEquals(4899, displayAdjustmentEvent0.getStart());
      assertEquals(4899, displayAdjustmentEvent0.getEnd());
      assertEquals(4899, displayAdjustmentEvent0.getScaleFactor());
      assertEquals(51.7F, displayAdjustmentEvent0.getBaseWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("uk.ac.sanger.artemis.components.DisplayAdjustmentEvent", 5, 5, (-1), (-1197.967F), 6, false, 5);
      int int0 = displayAdjustmentEvent0.getWidthInBases();
      assertEquals(5, displayAdjustmentEvent0.getEnd());
      assertFalse(displayAdjustmentEvent0.isRevCompDisplay());
      assertEquals(5, displayAdjustmentEvent0.getType());
      assertEquals(6, displayAdjustmentEvent0.getScaleFactor());
      assertEquals((-1), int0);
      assertEquals((-1197.967F), displayAdjustmentEvent0.getBaseWidth(), 0.01F);
      assertEquals(5, displayAdjustmentEvent0.getStart());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("H,/Ck=6;e!&r@/fE,", 598, (-1348), (-1348), 0);
      int int0 = displayAdjustmentEvent0.getType();
      assertEquals((-1348), displayAdjustmentEvent0.getEnd());
      assertEquals((-1348), displayAdjustmentEvent0.getDropPosition());
      assertEquals(598, displayAdjustmentEvent0.getStart());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("uk.ac.sanger.artemis.components.DisplayAdjustmentEvent", 5, 5, (-1), (-1197.967F), 6, false, 5);
      int int0 = displayAdjustmentEvent0.getType();
      assertEquals((-1197.967F), displayAdjustmentEvent0.getBaseWidth(), 0.01F);
      assertEquals(5, displayAdjustmentEvent0.getStart());
      assertEquals(5, int0);
      assertFalse(displayAdjustmentEvent0.isRevCompDisplay());
      assertEquals(5, displayAdjustmentEvent0.getEnd());
      assertEquals(6, displayAdjustmentEvent0.getScaleFactor());
      assertEquals((-1), displayAdjustmentEvent0.getWidthInBases());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("uk.ac.sanger.artemis.components.DisplayAdjustmentEvent", 5, 5, (-1), (-1197.967F), 6, false, 5);
      int int0 = displayAdjustmentEvent0.getStart();
      assertEquals(5, displayAdjustmentEvent0.getType());
      assertEquals(6, displayAdjustmentEvent0.getScaleFactor());
      assertEquals((-1), displayAdjustmentEvent0.getWidthInBases());
      assertEquals((-1197.967F), displayAdjustmentEvent0.getBaseWidth(), 0.01F);
      assertEquals(5, displayAdjustmentEvent0.getEnd());
      assertEquals(5, int0);
      assertFalse(displayAdjustmentEvent0.isRevCompDisplay());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", (-1), 2239, 5, (-788.146F), (-1), false, 5);
      int int0 = displayAdjustmentEvent0.getStart();
      assertFalse(displayAdjustmentEvent0.isRevCompDisplay());
      assertEquals(2239, displayAdjustmentEvent0.getEnd());
      assertEquals((-1), displayAdjustmentEvent0.getScaleFactor());
      assertEquals((-1), int0);
      assertEquals(5, displayAdjustmentEvent0.getWidthInBases());
      assertEquals(5, displayAdjustmentEvent0.getType());
      assertEquals((-788.146F), displayAdjustmentEvent0.getBaseWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 0, 3373, 3484, 3373, (-2719), false, 353);
      int int0 = displayAdjustmentEvent0.getScaleFactor();
      assertEquals(3484, displayAdjustmentEvent0.getWidthInBases());
      assertEquals(0, displayAdjustmentEvent0.getStart());
      assertFalse(displayAdjustmentEvent0.isRevCompDisplay());
      assertEquals(3373.0F, displayAdjustmentEvent0.getBaseWidth(), 0.01F);
      assertEquals(353, displayAdjustmentEvent0.getType());
      assertEquals((-2719), int0);
      assertEquals(3373, displayAdjustmentEvent0.getEnd());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 4899, 4899, 1, 51.7F, 4899, false, 1);
      int int0 = displayAdjustmentEvent0.getEnd();
      assertEquals(51.7F, displayAdjustmentEvent0.getBaseWidth(), 0.01F);
      assertEquals(4899, int0);
      assertEquals(1, displayAdjustmentEvent0.getType());
      assertFalse(displayAdjustmentEvent0.isRevCompDisplay());
      assertEquals(1, displayAdjustmentEvent0.getWidthInBases());
      assertEquals(4899, displayAdjustmentEvent0.getStart());
      assertEquals(4899, displayAdjustmentEvent0.getScaleFactor());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 0, (-913), 1926, 2);
      int int0 = displayAdjustmentEvent0.getEnd();
      assertEquals(1926, displayAdjustmentEvent0.getDropPosition());
      assertEquals(2, displayAdjustmentEvent0.getType());
      assertEquals(0, displayAdjustmentEvent0.getStart());
      assertEquals((-913), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("*a2 \nf!t`gm>0/G?1", 0, 0, 0, 0);
      int int0 = displayAdjustmentEvent0.getDropPosition();
      assertEquals(0, int0);
      assertEquals(0, displayAdjustmentEvent0.getStart());
      assertEquals(0, displayAdjustmentEvent0.getType());
      assertEquals(0, displayAdjustmentEvent0.getEnd());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 1483, (-1121), 1483, 1483);
      int int0 = displayAdjustmentEvent0.getDropPosition();
      assertEquals(1483, int0);
      assertEquals(1483, displayAdjustmentEvent0.getStart());
      assertEquals((-1121), displayAdjustmentEvent0.getEnd());
      assertEquals(1483, displayAdjustmentEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 0, 641, (-224), 779.0F, (-1768), false, (-1768));
      float float0 = displayAdjustmentEvent0.getBaseWidth();
      assertEquals(641, displayAdjustmentEvent0.getEnd());
      assertFalse(displayAdjustmentEvent0.isRevCompDisplay());
      assertEquals(779.0F, float0, 0.01F);
      assertEquals((-224), displayAdjustmentEvent0.getWidthInBases());
      assertEquals((-1768), displayAdjustmentEvent0.getType());
      assertEquals((-1768), displayAdjustmentEvent0.getScaleFactor());
      assertEquals(0, displayAdjustmentEvent0.getStart());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("uk.ac.sanger.artemis.components.DisplayAdjustmentEvent", 5, 5, (-1), (-1197.967F), 6, false, 5);
      float float0 = displayAdjustmentEvent0.getBaseWidth();
      assertEquals(5, displayAdjustmentEvent0.getEnd());
      assertEquals((-1), displayAdjustmentEvent0.getWidthInBases());
      assertFalse(displayAdjustmentEvent0.isRevCompDisplay());
      assertEquals(6, displayAdjustmentEvent0.getScaleFactor());
      assertEquals((-1197.967F), float0, 0.01F);
      assertEquals(5, displayAdjustmentEvent0.getType());
      assertEquals(5, displayAdjustmentEvent0.getStart());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = null;
      try {
        displayAdjustmentEvent0 = new DisplayAdjustmentEvent((Object) null, 2015, (-471), (-471), (-2443));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = null;
      try {
        displayAdjustmentEvent0 = new DisplayAdjustmentEvent((Object) null, (-1), (-1684), (-1), (-1), (-1), false, 2808);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 0, 0, (-1), (-3602));
      int int0 = displayAdjustmentEvent0.getWidthInBases();
      assertEquals(0, displayAdjustmentEvent0.getStart());
      assertEquals((-3602), displayAdjustmentEvent0.getType());
      assertEquals(0, displayAdjustmentEvent0.getEnd());
      assertEquals((-1), displayAdjustmentEvent0.getDropPosition());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 0, 0, (-1), (-3602));
      displayAdjustmentEvent0.isRevCompDisplay();
      assertEquals(0, displayAdjustmentEvent0.getEnd());
      assertEquals((-3602), displayAdjustmentEvent0.getType());
      assertEquals((-1), displayAdjustmentEvent0.getDropPosition());
      assertEquals(0, displayAdjustmentEvent0.getStart());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 5, 5, 4, 0.0F, 732, false, 977);
      int int0 = displayAdjustmentEvent0.getScaleFactor();
      assertEquals(732, int0);
      assertEquals(5, displayAdjustmentEvent0.getEnd());
      assertEquals(0.0F, displayAdjustmentEvent0.getBaseWidth(), 0.01F);
      assertEquals(5, displayAdjustmentEvent0.getStart());
      assertEquals(977, displayAdjustmentEvent0.getType());
      assertEquals(4, displayAdjustmentEvent0.getWidthInBases());
      assertFalse(displayAdjustmentEvent0.isRevCompDisplay());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 0, 0, (-1), (-3602));
      int int0 = displayAdjustmentEvent0.getType();
      assertEquals((-3602), int0);
      assertEquals(0, displayAdjustmentEvent0.getStart());
      assertEquals((-1), displayAdjustmentEvent0.getDropPosition());
      assertEquals(0, displayAdjustmentEvent0.getEnd());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 0, 0, (-1), (-3602));
      int int0 = displayAdjustmentEvent0.getScaleFactor();
      assertEquals((-1), displayAdjustmentEvent0.getDropPosition());
      assertEquals(0, displayAdjustmentEvent0.getEnd());
      assertEquals((-3602), displayAdjustmentEvent0.getType());
      assertEquals(0, displayAdjustmentEvent0.getStart());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 0, 0, (-1), (-3602));
      int int0 = displayAdjustmentEvent0.getEnd();
      assertEquals((-1), displayAdjustmentEvent0.getDropPosition());
      assertEquals((-3602), displayAdjustmentEvent0.getType());
      assertEquals(0, int0);
      assertEquals(0, displayAdjustmentEvent0.getStart());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 0, 0, (-1), (-3602));
      int int0 = displayAdjustmentEvent0.getDropPosition();
      assertEquals(0, displayAdjustmentEvent0.getEnd());
      assertEquals(0, displayAdjustmentEvent0.getStart());
      assertEquals((-1), int0);
      assertEquals((-3602), displayAdjustmentEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 0, 0, (-1), (-3602));
      float float0 = displayAdjustmentEvent0.getBaseWidth();
      assertEquals((-1), displayAdjustmentEvent0.getDropPosition());
      assertEquals(0, displayAdjustmentEvent0.getStart());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, displayAdjustmentEvent0.getEnd());
      assertEquals((-3602), displayAdjustmentEvent0.getType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DisplayAdjustmentEvent displayAdjustmentEvent0 = new DisplayAdjustmentEvent("", 0, 0, (-1), (-3602));
      int int0 = displayAdjustmentEvent0.getStart();
      assertEquals(0, int0);
      assertEquals((-1), displayAdjustmentEvent0.getDropPosition());
      assertEquals((-3602), displayAdjustmentEvent0.getType());
      assertEquals(0, displayAdjustmentEvent0.getEnd());
  }
}
