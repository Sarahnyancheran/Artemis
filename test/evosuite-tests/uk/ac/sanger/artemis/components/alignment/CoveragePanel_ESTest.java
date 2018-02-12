/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 11:19:22 GMT 2018
 */

package uk.ac.sanger.artemis.components.alignment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import htsjdk.samtools.SAMRecord;
import java.util.List;
import javax.swing.DebugGraphics;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.dom.GenericDocument;
import org.apache.batik.dom.GenericDocumentType;
import org.apache.batik.svggen.DefaultExtensionHandler;
import org.apache.batik.svggen.ImageHandlerBase64Encoder;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.alignment.BamView;
import uk.ac.sanger.artemis.components.alignment.CoveragePanel;
import uk.ac.sanger.artemis.components.alignment.LineAttributes;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CoveragePanel_ESTest extends CoveragePanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = CoveragePanel.getLineAttributes(523);
      LineAttributes[] lineAttributesArray1 = CoveragePanel.getLineAttributes((-397));
      assertSame(lineAttributesArray1, lineAttributesArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem("");
      coveragePanel0.createMenus(jCheckBoxMenuItem0);
      assertFalse(jCheckBoxMenuItem0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      coveragePanel0.setPlotHeatMap(true);
      boolean boolean0 = coveragePanel0.isPlotHeatMap();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = CoveragePanel.getLineAttributes(0);
      assertNotNull(lineAttributesArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        coveragePanel0.paintComponent(debugGraphics0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DebugGraphics", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel((BamView) null);
      GenericDocumentType genericDocumentType0 = new GenericDocumentType("%bl", "y}YM)u", "y}YM)u");
      GenericDOMImplementation genericDOMImplementation0 = new GenericDOMImplementation();
      GenericDocument genericDocument0 = new GenericDocument(genericDocumentType0, genericDOMImplementation0);
      SVGGeneratorContext sVGGeneratorContext0 = SVGGeneratorContext.createDefault(genericDocument0);
      SVGGraphics2D sVGGraphics2D0 = new SVGGraphics2D(sVGGeneratorContext0, true);
      DebugGraphics debugGraphics0 = new DebugGraphics(sVGGraphics2D0, coveragePanel0);
      // Undeclared exception!
      try { 
        coveragePanel0.paintComponent(debugGraphics0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.DebugGraphics cannot be cast to java.awt.Graphics2D
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.CoveragePanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      CoveragePanel.getLineAttributes(80000);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        CoveragePanel.getLineAttributes((-841));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.LineAttributes", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      GenericDocumentType genericDocumentType0 = new GenericDocumentType("6PH", "]-nK_U~U", "]-nK_U~U");
      GenericDOMImplementation genericDOMImplementation0 = new GenericDOMImplementation();
      GenericDocument genericDocument0 = new GenericDocument(genericDocumentType0, genericDOMImplementation0);
      ImageHandlerBase64Encoder imageHandlerBase64Encoder0 = new ImageHandlerBase64Encoder();
      DefaultExtensionHandler defaultExtensionHandler0 = new DefaultExtensionHandler();
      SVGGraphics2D sVGGraphics2D0 = new SVGGraphics2D(genericDocument0, imageHandlerBase64Encoder0, defaultExtensionHandler0, true);
      // Undeclared exception!
      try { 
        coveragePanel0.draw(sVGGraphics2D0, (-852), 487, (List<Short>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.CoveragePanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel((BamView) null);
      // Undeclared exception!
      try { 
        coveragePanel0.createMenus((JComponent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.CoveragePanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      // Undeclared exception!
      try { 
        coveragePanel0.addRecord((SAMRecord) null, 0, "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.CoveragePanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      boolean boolean0 = coveragePanel0.hasSelectedBams();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      coveragePanel0.singleClick(true, Integer.MAX_VALUE);
      assertFalse(coveragePanel0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      String string0 = coveragePanel0.getToolTipText(Integer.MAX_VALUE);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      coveragePanel0.setPlotByStrand(true);
      boolean boolean0 = CoveragePanel.isRedraw();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = CoveragePanel.isRedraw();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = CoveragePanel.getLineAttributes(531);
      LineAttributes[] lineAttributesArray1 = CoveragePanel.getLineAttributes(1298);
      assertNotSame(lineAttributesArray1, lineAttributesArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LineAttributes[] lineAttributesArray0 = CoveragePanel.getLineAttributes(531);
      LineAttributes[] lineAttributesArray1 = CoveragePanel.getLineAttributes(531);
      assertSame(lineAttributesArray1, lineAttributesArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      float float0 = coveragePanel0.getMaxCoverage();
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      GenericDocumentType genericDocumentType0 = new GenericDocumentType("NP3U)?)y", "3JgG%m:OQ*", "");
      GenericDOMImplementation genericDOMImplementation0 = new GenericDOMImplementation();
      GenericDocument genericDocument0 = new GenericDocument(genericDocumentType0, genericDOMImplementation0);
      SVGGeneratorContext sVGGeneratorContext0 = SVGGeneratorContext.createDefault(genericDocument0);
      SVGGraphics2D sVGGraphics2D0 = new SVGGraphics2D(sVGGeneratorContext0, true);
      coveragePanel0.paintComponent(sVGGraphics2D0);
      assertFalse(coveragePanel0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      boolean boolean0 = coveragePanel0.isPlotHeatMap();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      // Undeclared exception!
      try { 
        coveragePanel0.showLabels(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.CoveragePanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      coveragePanel0.setPlotHeatMap(true);
      // Undeclared exception!
      try { 
        coveragePanel0.singleClick(true, 2019);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.CoveragePanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      List<String> list0 = coveragePanel0.getSelected();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel((BamView) null);
      // Undeclared exception!
      try { 
        coveragePanel0.init((BamView) null, 1419.2F, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.CoveragePanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CoveragePanel coveragePanel0 = new CoveragePanel();
      CoveragePanel.HeatMapLn coveragePanel_HeatMapLn0 = coveragePanel0.new HeatMapLn(240, 0, "Coverage Options");
      String string0 = coveragePanel_HeatMapLn0.toString();
      assertEquals("Coverage Options", string0);
  }
}
