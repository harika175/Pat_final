/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 17 04:56:31 GMT 2022
 */

package evo_suite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import evo_suite.AVLTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-6747));
      aVLTree0.delete((-6747));
      aVLTree0.insert((-6747));
      aVLTree0.insert((-1495));
      aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.insert(333);
      aVLTree0.delete((-6747));
      aVLTree0.height();
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.right;
      aVLTree0.insert(1);
      aVLTree0.delete((-1));
      aVLTree_Node0.height = 333;
      int int0 = 0;
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node2 = aVLTree0.find(0);
      aVLTree_Node2.height = (-1495);
      aVLTree_Node2.right = null;
      aVLTree0.find(1);
      // Undeclared exception!
      try { 
        aVLTree0.insert((-6747));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("evo_suite.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-6747));
      aVLTree0.insert((-6747));
      aVLTree0.insert((-1495));
      aVLTree0.find((-6747));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.insert(333);
      aVLTree0.delete((-6747));
      aVLTree0.height();
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.right;
      aVLTree0.delete((-1495));
      aVLTree0.delete((-1));
      aVLTree_Node0.height = 333;
      int int0 = 0;
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node2 = aVLTree0.find(0);
      aVLTree_Node2.height = (-1495);
      aVLTree_Node2.right = aVLTree_Node0;
      aVLTree0.getBalance(aVLTree_Node2);
      aVLTree0.find(1);
      // Undeclared exception!
      try { 
        aVLTree0.insert((-6747));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("evo_suite.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.insert(1637);
      aVLTree0.delete((-589));
      aVLTree0.insert((-3961));
      aVLTree0.find(1);
      aVLTree0.height();
      aVLTree0.delete(1);
      aVLTree0.insert((-520));
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.insert(1);
      aVLTree0.height();
      aVLTree0.delete(0);
      aVLTree0.delete((-1923));
      aVLTree0.delete((-589));
      aVLTree0.delete(3710);
      aVLTree0.find((-1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.delete((-888));
      aVLTree0.insert((-888));
      aVLTree0.insert(623);
      aVLTree0.height();
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(623);
      aVLTree_Node0.key = (-3535);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.delete(1);
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.insert(0);
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.delete(246);
      aVLTree0.find((-2191));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1425));
      aVLTree0.insert((-717));
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      int int0 = 0;
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      aVLTree0.insert(0);
      aVLTree_Node0.height = 0;
      aVLTree_Node0.key = (-934);
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("evo_suite.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1));
      aVLTree0.insert(2970);
      aVLTree0.insert((-1079));
      aVLTree0.insert((-1));
      aVLTree0.insert(1998);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1995);
      aVLTree0.height();
      aVLTree_Node0.height = 0;
      aVLTree0.insert(2084);
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node(0);
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree0.getBalance(aVLTree_Node0);
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree0.getBalance(aVLTree_Node2);
      aVLTree0.getBalance(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1134);
      aVLTree0.height();
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.height = 1134;
      aVLTree_Node0.key = 0;
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.height();
      aVLTree0.getRoot();
      int int0 = aVLTree0.height();
      aVLTree0.find((-1));
      aVLTree0.height();
      aVLTree0.height();
      // Undeclared exception!
      try { 
        aVLTree0.delete(int0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(2539);
      aVLTree0.delete(1);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      aVLTree0.find(0);
      aVLTree0.insert(1);
      aVLTree0.find(0);
      aVLTree0.insert((-429));
      aVLTree0.insert(2226);
      aVLTree0.find(0);
      aVLTree0.insert(0);
      // Undeclared exception!
      try { 
        aVLTree0.insert((-429));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("evo_suite.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 2637;
      aVLTree0.insert(2637);
      int int1 = 969;
      aVLTree0.insert(969);
      aVLTree0.delete(0);
      int int2 = (-2027);
      // Undeclared exception!
      try { 
        aVLTree0.delete(2637);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("evo_suite.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.getRoot();
      aVLTree0.insert(351);
      aVLTree0.delete((-5396));
      aVLTree0.delete(99);
      aVLTree0.delete(0);
      aVLTree0.height();
      aVLTree0.insert(0);
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.find((-1));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.insert((-695));
      aVLTree0.insert(1096);
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(3289);
      aVLTree0.delete(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      int int0 = (-1);
      AVLTree aVLTree1 = new AVLTree();
      aVLTree1.delete(0);
      AVLTree.Node aVLTree_Node1 = aVLTree1.new Node(1057);
      aVLTree_Node1.key = 939;
      aVLTree_Node1.left = aVLTree_Node0;
      AVLTree.Node aVLTree_Node2 = aVLTree_Node1.left;
      aVLTree_Node0.left = aVLTree_Node2;
      aVLTree0.insert(int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = aVLTree0.height();
      assertEquals((-1), int0);
      
      int int1 = 0;
      aVLTree0.insert(0);
      aVLTree0.delete((-1));
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("evo_suite.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find(0);
      aVLTree0.delete(0);
      aVLTree0.insert((-1196));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-3061));
      aVLTree0.getBalance((AVLTree.Node) null);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      int int0 = 0;
      aVLTree0.delete(0);
      aVLTree0.insert((-900));
      aVLTree0.getRoot();
      aVLTree0.delete((-1));
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree0.getBalance(aVLTree_Node1);
      aVLTree0.height();
      // Undeclared exception!
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      aVLTree_Node0.key = 1;
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1105);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1048));
      aVLTree0.delete(353);
      aVLTree0.delete((-1048));
      aVLTree0.getRoot();
      aVLTree0.insert(353);
      aVLTree0.find(2657);
      assertEquals(0, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(504);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      int int0 = 1528;
      aVLTree0.delete(1528);
      aVLTree0.delete(1528);
      aVLTree0.delete(1279);
      aVLTree0.insert(1528);
      // Undeclared exception!
      try { 
        aVLTree0.insert(1528);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("evo_suite.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.insert((-1));
      aVLTree0.find((-1));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("evo_suite.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1));
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-237));
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(528);
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1));
      aVLTree0.insert(0);
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("evo_suite.AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-612));
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.insert(274);
      aVLTree0.insert(1);
      aVLTree0.delete(553);
      aVLTree0.delete(1);
      aVLTree0.insert(0);
      aVLTree0.delete((-612));
      aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1288));
      aVLTree0.delete((-1073));
      aVLTree0.find((-1073));
      int int0 = aVLTree0.height();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-612));
      aVLTree0.insert((-791));
      aVLTree0.insert(274);
      aVLTree0.insert(0);
      aVLTree0.delete((-612));
      aVLTree0.getRoot();
      aVLTree0.find(1);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-6747));
      aVLTree0.insert((-6747));
      aVLTree0.insert((-1495));
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree0.insert(333);
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.right;
      aVLTree_Node0.right = null;
      aVLTree0.delete((-6747));
      aVLTree0.delete((-1495));
      aVLTree_Node0.height = 333;
      aVLTree0.insert(0);
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.find(1);
      aVLTree0.insert((-6747));
      aVLTree0.find(333);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.height();
      aVLTree0.insert((-1));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("evo_suite.AVLTree", e);
      }
  }
}
