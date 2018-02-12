/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 12:05:09 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class FileDialogEntrySource_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.FileDialogEntrySource"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/London"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FileDialogEntrySource_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.components.LogViewer$1",
      "org.biojava.bio.seq.AcceptNoneFilter",
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "uk.ac.sanger.artemis.components.genebuilder.OpenSectionButton",
      "org.biojava.bio.seq.ByHierarchy",
      "uk.ac.sanger.artemis.components.EntryFileDialog$3",
      "htsjdk.samtools.util.Log$LogLevel",
      "org.apache.log4j.AppenderSkeleton",
      "uk.ac.sanger.artemis.components.EntryFileDialog$1",
      "org.biojava.bio.seq.projection.ProjectionContext",
      "uk.ac.sanger.artemis.components.EntryFileDialog$2",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "uk.ac.sanger.artemis.components.filetree.RemoteFileNode",
      "uk.ac.sanger.artemis.OptionChangeEvent",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox",
      "uk.ac.sanger.artemis.plot.GCDeviationAlgorithm",
      "org.apache.log4j.Level",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "uk.ac.sanger.artemis.plot.CodonUsageAlgorithm",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "org.biojava.utils.ChangeType",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.Selectable",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "htsjdk.variant.variantcontext.VariantContextComparator",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "uk.ac.sanger.artemis.io.RangeVector",
      "htsjdk.variant.vcf.VCFIDHeaderLine",
      "uk.ac.sanger.artemis.plot.NcAlgorithm",
      "uk.ac.sanger.artemis.components.BasePlot",
      "uk.ac.sanger.artemis.GotoEvent",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.EntrySourceVector",
      "uk.ac.sanger.artemis.util.StringVector",
      "org.emboss.jemboss.JembossParams",
      "org.biojava.bio.symbol.EmptyAlphabet",
      "org.biojava.bio.seq.Feature$Template",
      "uk.ac.sanger.artemis.components.StickyFileChooser",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.plot.CumulativeATSkewAlgorithm",
      "org.biojava.bio.seq.CircularView",
      "uk.ac.sanger.artemis.ChangeEvent",
      "org.biojava.bio.seq.SimpleFeatureRealizer",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "uk.ac.sanger.artemis.components.genebuilder.gff.RemoveButton",
      "uk.ac.sanger.artemis.components.genebuilder.gff.PropertiesPanel",
      "org.apache.log4j.Hierarchy",
      "org.emboss.jemboss.gui.Browser$3",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.emboss.jemboss.gui.Browser$4",
      "org.emboss.jemboss.gui.MemoryComboBox",
      "org.biojava.utils.Changeable",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "uk.ac.sanger.artemis.plot.GCFrameAlgorithm",
      "org.emboss.jemboss.gui.Browser$6",
      "uk.ac.sanger.artemis.components.genebuilder.ReferencesPanel",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "uk.ac.sanger.artemis.io.QualifierInfoHash",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.components.FeatureEdit",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "uk.ac.sanger.artemis.plot.PositionalAsymmetryAlgorithm",
      "uk.ac.sanger.artemis.io.Sequence",
      "org.biojava.utils.ChangeVetoException",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.sequence.MarkerInternal",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "htsjdk.variant.vcf.VCFFormatHeaderLine",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "uk.ac.sanger.artemis.components.Splash$2",
      "org.gmod.schema.dao.GeneralDaoI",
      "org.biojava.utils.bytecode.GeneratedClassLoader",
      "org.gmod.schema.dao.BaseDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "org.biojava.bio.symbol.Edit",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "uk.ac.sanger.artemis.components.SwingWorker",
      "uk.ac.sanger.artemis.util.RemoteFileDocument",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.editor.MultiLineToolTipUI",
      "uk.ac.sanger.artemis.io.LazyQualifierValue",
      "org.apache.log4j.or.ObjectRenderer",
      "uk.ac.sanger.artemis.components.FeatureDisplay$11",
      "org.biojava.utils.bytecode.CodeGenerator",
      "org.gmod.schema.cv.CvTerm",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "uk.ac.sanger.artemis.components.QualifierTextArea$2",
      "org.biojava.utils.bytecode.CodeMethod",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.genebuilder.cv.CVPanel",
      "org.biojava.bio.Annotation",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.apache.log4j.Category",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.components.PlotMouseListener",
      "org.biojava.bio.seq.FeatureFilter",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "uk.ac.sanger.artemis.plot.Algorithm",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.gmod.schema.pub.Pub",
      "htsjdk.variant.vcf.VCFInfoHeaderLine",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "uk.ac.sanger.artemis.io.ChadoCanonicalGene",
      "uk.ac.sanger.artemis.components.MessageDialog",
      "org.gmod.schema.sequence.Feature",
      "org.biojava.bio.symbol.FiniteAlphabet",
      "org.biojava.bio.seq.FeatureFilter$OnlyChildren",
      "org.apache.log4j.PropertyWatchdog",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.EntrySource",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "org.biojava.bio.Annotatable",
      "org.gmod.schema.utils.Rankable",
      "uk.ac.sanger.artemis.components.FileViewer$2",
      "uk.ac.sanger.artemis.components.SegmentBorder",
      "uk.ac.sanger.artemis.plot.CodonUsageWeight",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "org.biojava.bio.seq.AcceptAllFilter",
      "htsjdk.tribble.TribbleException$InternalCodecException",
      "uk.ac.sanger.artemis.plot.KarlinSigAlgorithm",
      "org.biojava.bio.seq.FeatureHolder",
      "uk.ac.sanger.artemis.components.FileDialogEntrySource",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "uk.ac.sanger.artemis.plot.EntropyAlgorithm",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "htsjdk.samtools.SAMSequenceDictionary",
      "org.gmod.schema.dao.OrganismDaoI",
      "org.apache.log4j.spi.AppenderAttachable",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "uk.ac.sanger.artemis.io.GFF3AttributeAggregator",
      "uk.ac.sanger.artemis.util.InputStreamProgressListenerVector",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "org.biojava.utils.Unchangeable",
      "org.apache.log4j.Priority",
      "uk.ac.sanger.artemis.util.PushBackException",
      "uk.ac.sanger.artemis.components.FeatureDisplay$12",
      "org.biojava.bio.symbol.SymbolList",
      "uk.ac.sanger.artemis.components.FeatureDisplay$3",
      "org.biojava.bio.BioException",
      "uk.ac.sanger.artemis.plot.CodonUsageFormatException",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "uk.ac.sanger.artemis.components.FeatureDisplay$2",
      "org.biojava.bio.seq.FeatureHolder$EmptyFeatureHolder",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "htsjdk.variant.vcf.VCFHeader",
      "org.biojava.bio.symbol.EmptySymbolList",
      "org.apache.log4j.DefaultCategoryFactory",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.plot.Codon12CorrelationAlgorithm",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.util.WorkingGZIPInputStream",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "uk.ac.sanger.artemis.ExternalProgram",
      "htsjdk.variant.vcf.VCFCompoundHeaderLine",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "uk.ac.sanger.artemis.SelectionChangeEvent",
      "uk.ac.sanger.artemis.plot.BaseAlgorithm",
      "org.gmod.schema.general.DbXRef",
      "uk.ac.sanger.artemis.sequence.BasePattern",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.plot.ScaledChiAlgorithm",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "htsjdk.variant.vcf.VCFSimpleHeaderLine",
      "uk.ac.sanger.artemis.Entry",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "org.biojava.utils.ClassTools",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "org.biojava.bio.seq.impl.ViewSequence",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.plot.MRIAlgorithm",
      "uk.ac.sanger.artemis.io.Qualifier",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "uk.ac.sanger.artemis.plot.ATDeviationAlgorithm",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "uk.ac.sanger.artemis.sequence.MarkerRangeVector",
      "uk.ac.sanger.artemis.io.DocumentEntryAutosaveThread",
      "uk.ac.sanger.artemis.ChangeListener",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.plot.LineAttributes",
      "uk.ac.sanger.artemis.sequence.Marker",
      "org.biojava.bio.seq.Feature$ByLocationComparator",
      "uk.ac.sanger.artemis.plot.CSCSAlgorithm",
      "org.apache.log4j.helpers.Loader",
      "uk.ac.sanger.artemis.sequence.MarkerChangeEvent",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.components.EntryFileDialog",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "org.apache.log4j.helpers.FileWatchdog",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "uk.ac.sanger.artemis.components.genebuilder.GeneEditorPanel",
      "uk.ac.sanger.artemis.components.KeyChoice",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "org.gmod.schema.dao.SequenceDaoI",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "uk.ac.sanger.artemis.components.QualifierChoice",
      "org.apache.log4j.spi.RootLogger",
      "org.emboss.jemboss.gui.Browser$JIconButton",
      "org.biojava.bio.BioError",
      "htsjdk.variant.vcf.VCFContigHeaderLine",
      "org.apache.log4j.spi.ErrorHandler",
      "uk.ac.sanger.artemis.ExternalProgramException",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.apache.log4j.spi.RendererSupport",
      "org.biojava.bio.seq.OptimizableFilter",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.util.FileDocument",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "org.biojava.bio.symbol.Symbol",
      "htsjdk.samtools.util.Log",
      "org.biojava.bio.seq.RealizingFeatureHolder",
      "uk.ac.sanger.artemis.plot.CodonWeight",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.util.InputStreamProgressEvent",
      "uk.ac.sanger.artemis.GotoEventSource",
      "uk.ac.sanger.artemis.components.genebuilder.gff.AddButton",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "org.gmod.schema.dao.CvDaoI",
      "uk.ac.sanger.artemis.plot.GCWindowAlgorithm",
      "htsjdk.tribble.TribbleException",
      "uk.ac.sanger.artemis.components.genebuilder.ortholog.MatchPanel$3",
      "uk.ac.sanger.artemis.io.ReadListener",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "uk.ac.sanger.artemis.plot.GCSDWindowAlgorithm",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.io.Feature",
      "uk.ac.sanger.artemis.io.Packing",
      "org.biojava.bio.seq.Sequence",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.components.DisplayComponent",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentListener",
      "org.apache.log4j.spi.RepositorySelector",
      "uk.ac.sanger.artemis.plot.AGWindowAlgorithm",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.Range",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.EntryGroupChangeListener",
      "uk.ac.sanger.artemis.components.LogViewer",
      "uk.ac.sanger.artemis.io.BetweenRange",
      "uk.ac.sanger.artemis.ExternalProgramMonitor",
      "uk.ac.sanger.artemis.io.Entry",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "org.apache.log4j.or.DefaultRenderer",
      "uk.ac.sanger.artemis.util.ProgressInputStream",
      "htsjdk.variant.vcf.VCFHeaderLine",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "org.biojava.bio.EmptyAnnotation",
      "uk.ac.sanger.artemis.plot.CumulativeGCSkewAlgorithm",
      "org.apache.log4j.PropertyConfigurator",
      "htsjdk.tribble.TribbleException$InvalidHeader",
      "uk.ac.sanger.artemis.util.Document",
      "org.gmod.schema.organism.Organism",
      "org.apache.log4j.Appender",
      "uk.ac.sanger.artemis.components.FileViewer",
      "uk.ac.sanger.artemis.Selection",
      "org.biojava.bio.symbol.Alphabet",
      "org.biojava.utils.walker.WalkerFactory",
      "org.biojava.bio.seq.FeatureRealizer",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "org.biojava.utils.bytecode.CodeException",
      "org.biojava.utils.AssertionFailure",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "uk.ac.sanger.artemis.FeaturePredicate",
      "htsjdk.variant.vcf.VCFFilterHeaderLine",
      "uk.ac.sanger.artemis.components.QualifierTextArea",
      "uk.ac.sanger.artemis.Logger",
      "org.biojava.bio.seq.IsTopLevel",
      "org.apache.log4j.spi.LoggingEvent",
      "uk.ac.sanger.artemis.plot.ICDIAlgorithm",
      "uk.ac.sanger.artemis.io.QualifierLazyLoading",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.FeatureEnumeration",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "org.apache.log4j.spi.LoggerRepository",
      "uk.ac.sanger.artemis.SelectionChangeListener",
      "org.gmod.schema.dao.PubDaoI",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.GotoListener"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("uk.ac.sanger.artemis.util.InputStreamProgressListener", false, FileDialogEntrySource_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FileDialogEntrySource_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.components.Splash",
      "uk.ac.sanger.artemis.util.FastVector",
      "uk.ac.sanger.artemis.io.KeyVector",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.ExternalProgram",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.components.StickyFileChooser",
      "uk.ac.sanger.artemis.components.EntryFileDialog",
      "org.emboss.jemboss.gui.Browser",
      "uk.ac.sanger.artemis.components.BasePlotGroup",
      "org.emboss.jemboss.JembossParams",
      "uk.ac.sanger.artemis.io.LineGroup",
      "uk.ac.sanger.artemis.io.Packing",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.sequence.Strand",
      "uk.ac.sanger.artemis.components.CanvasPanel",
      "uk.ac.sanger.artemis.components.EntryGroupPanel",
      "uk.ac.sanger.artemis.components.FeatureDisplay",
      "uk.ac.sanger.artemis.components.ZoomScrollBar",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.components.DisplayAdjustmentEvent",
      "org.biojava.utils.ChangeType",
      "org.biojava.bio.seq.Feature",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.components.Plot",
      "uk.ac.sanger.artemis.components.BasePlot",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.FeaturePredicateConjunction",
      "uk.ac.sanger.artemis.sequence.BasePattern",
      "uk.ac.sanger.artemis.sequence.Marker",
      "org.biojava.bio.seq.SimpleFeatureRealizer",
      "org.biojava.bio.seq.impl.ViewSequence",
      "org.biojava.bio.seq.CircularView",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "uk.ac.sanger.artemis.io.LocationParseNodeVector",
      "uk.ac.sanger.artemis.io.LocationParseNode",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.io.RangeVector",
      "htsjdk.variant.vcf.VCFHeader"
    );
  }
}
