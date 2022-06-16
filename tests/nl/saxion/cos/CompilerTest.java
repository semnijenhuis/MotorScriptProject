package nl.saxion.cos;

import nl.saxion.cos.compiler.JasminBytecode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This file shows a few different ways you can do automated tests:
 * <p>
 * - checkByteCode():        Shows how to compile a file and check that the bytecode that was
 * generated matches your expectations.
 * - checkByteCode2():       Same as above, but now the output is stored in a file.
 * - syntaxErrorsAreFound(): Checks that a file with syntax errors stops compilation.
 * - checkOutputFile():      This test shows how to compile a file, run it and check if the output
 * matches your expectations.
 * - checkOutputString():    Same as above, but now the source code is coming from a string within
 * the test.
 * <p>
 * Not shown is a test where the file contains no syntax errors, but the checker should find some
 * error. You can of course add that yourself.
 */


class CompilerTest extends TestBase {
    /**
     * ----------------------------------------------Must Files----------------------------------------------------*
     */
    @Test
    void must1() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("testFiles/must/must1", "must");
        code.writeJasminToFile("testFiles/must/must1.j");
        assertNotNull(code);
    }

    @Test
    void must2() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("testFiles/must/must2", "must2");
        code.writeJasminToFile("testFiles/must/must2.j");
        assertNotNull(code);
    }

    @Test
    void must3() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("testFiles/must/must3", "must3");
        code.writeJasminToFile("testFiles/must/must3.j");
        assertNotNull(code);
    }

    // TODO set the System.in to an int in and increment with for loop to properly test this
    @Test
    void must4() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("testFiles/must/must4", "must4");
        assertNotNull(code);
        code.writeJasminToFile("testFiles/must/must4.j");

    }

//    @Test
    //
//    void must5() throws Exception {
//        Compiler c = new Compiler();
//        JasminBytecode code = c.compileFile("testFiles/must/must5", "must5");
//        code.writeJasminToFile("testFiles/must/must5.j");
//        assertNotNull(code);
//    }

    /**
     * ---------------------------------------Type testing (Good Weather)-----------------------------------------------*
     */

    @Test
    void inline4() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("inline4 number is 4# burnout(number)#", "inline4");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "4"
        }, output.toArray());

    }

    @Test
    void flat4() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("flat4 number is 4.4# burnout(number)#", "flat4");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "4.4"
        }, output.toArray());
    }

    @Test
    void sentence() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("""
                sentence line is "hello"# 
                burnout(line)#
                """, "sentence");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "hello"
        }, output.toArray());
    }

    @Test
    void ev() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("ev bool is false# burnout(bool)#", "ev");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "0"
        }, output.toArray());
    }

    /**
     * ---------------------------------------Type testing (bad Weather)-----------------------------------------------*
     */

    @Test
    void inline4BW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("""
                inline4 number is something#
                burnout(number)#
                """, "inline4BW");
        assertNull(code);

    }

    @Test
    void flat4BW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("""
                flat4 number is 5#
                burnout(number)#
                """, "flat4BW");
        assertNull(code);
    }

    @Test
    void sentenceBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("""
                sentence line is 88#
                burnout(line)#
                """, "sentenceBW");
        assertNull(code);
    }

    @Test
    void evBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("""
                ev bool is 88#
                burnout(bool)#
                """, "evBW");
        assertNull(code);
    }

    /**
     * --------------------------------------Basic Functions (Good Weather)----------------------------------------------*
     */

    @Test
    void divide() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(4 divide 2)#", "divideOperator");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "2"
        }, output.toArray());
    }

    @Test
    void downshift() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(6 downshift 2)#", "downshiftOperator");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "4"
        }, output.toArray());
    }

    @Test
    void nitro() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(2 nitro 2)#", "nitroOperator");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "4"
        }, output.toArray());
    }

    @Test
    void upshift() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(1 upshift 1)#", "addingOperator");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "2"
        }, output.toArray());
    }

    /**
     * --------------------------------------Basic Functions (Bad Weather)----------------------------------------------*
     */

    @Test
    void divideBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(4 divide hello)#", "divideOperatorBW");
        assertNull(code);
    }

    @Test
    void downshiftBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(e downshift 2)#", "downshiftOperator");
        assertNull(code);
    }

    @Test
    void nitroBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(f nitro u)#", "nitroOperator");
        assertNull(code);
    }

    @Test
    void upshiftBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(o upshift 1)#", "addingOperator");
        assertNull(code);
    }

    /**
     * -----------------------------------------Statements (Good Weather)------------------------------------------------*
     */

    @Test
    void blockstmt() throws Exception {
        Compiler c = new Compiler();

        JasminBytecode code = c.compileString(
                """
                        if(1 == 1) {
                            burnout("1 is equal to 1")#
                        } else {
                            burnout("1 not equal to 1")#
                        }
                        """, "blockstmt");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "1 is equal to 1"
        }, output.toArray());
    }

    @Test
    void varDeclaration() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("inline4 test is 10# burnout(test upshift 1)#", "varDeclaration");
        assertNotNull(code);
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "11"
        }, output.toArray());
    }

    @Test
    void printStmt() throws Exception {
        Compiler compiler = new Compiler();
        JasminBytecode code = compiler.compileString("burnout(1 upshift 1)#", "printStmt");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "2"
        }, output.toArray());
    }

    @Test
    void IfStatement() throws Exception {
        Compiler c = new Compiler();

        JasminBytecode code = c.compileString(
                """
                        if(1 == 1) {
                            burnout("1 is equal to 1")#
                        } else {
                            burnout("1 not equal to 1")#
                        }
                        """, "testIfStatement");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "1 is equal to 1"
        }, output.toArray());
    }

    @Test
    void whileloop() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("""
                inline4 a is 0#
                while (a < 5) {
                    a^^#
                    burnout(a)#
                }
                                
                """, "whileLoop");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "1",
                "2",
                "3",
                "4",
                "5"
        }, output.toArray());
    }

    @Test
    void array() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("inline4[] arrayname is new inline4[10]#", "arrayDeclaration");
        assertNotNull(code);
    }

    @Test
    void arrayAssign() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("""
                inline4[] array is new inline4[10]#
                array[0] is 7#
                burnout(array[0])#
                """, "arrayAssign");
        assertNotNull(code);

        List<String> output = runCode(code);
        System.out.println(output);
        assertArrayEquals(new String[]{
                "7"
        }, output.toArray());
    }

    @Test
    void noArgsFunctionDecl() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("funky void test() { inline4 a is 10# burnout(a)#}", "functionDecl");
        assertNotNull(code);

    }

    @Test
    void noArgsFunctionCall() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("funky void test() { inline4 a is 10# burnout(a)# } test()#", "functionCall");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "10"
        }, output.toArray());
    }

    @Test
    void returnStmt() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("inline4 a is 10# return b# burnout(a)#", "returnStmt");
        assertNull(code);

    }

    @Test
    void scannerDecl() throws Exception {
        Compiler compiler = new Compiler();
        JasminBytecode code = compiler.compileString("scanner input#", "scannerDecl");
        assertNotNull(code);
    }

    @Test
    void argsFunctionDecl() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("funky inline4 test(inline4 a) { burnout(a)# }", "functionDecl");
        assertNotNull(code);

    }

    @Test
    void argsFunctionCall() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("funky inline4 test(inline4 a) { a upshift 1#} ", "functionDecl");
        assertNotNull(code);

    }

    /**
     * -----------------------------------------Statements (Bad Weather)------------------------------------------------*
     */

    @Test
    void blockstmtBW() throws Exception {
        Compiler c = new Compiler();

        JasminBytecode code = c.compileString(
                """
                        if(1 == 1) {
                            burnout("1 is equal to 1")#
                        } else 
                        """, "blockstmt");
        assertNull(code);

    }


    @Test
    void varDeclarationBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("inline4 test is 10.5#", "varDeclaration");
        assertNull(code);
    }

    @Test
    void printStmtBW() throws Exception {
        Compiler compiler = new Compiler();
        JasminBytecode code = compiler.compileString("burnout()#", "printStmt");
        assertNull(code);
    }

    @Test
    void IfStatementBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("if(1) { burnout(2)# }", "ifStatement");
        assertNull(code);
    }

    @Test
    void whileloopBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("""
                inline4 a is 0#
                while () {
                    a^^#
                    burnout(a)#
                }
                                
                """, "whileLoop");
        assertNull(code);
    }

    @Test
    void arrayBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("inline4[] arrayname is new flat4[10]#", "arrayDeclaration");
        assertNull(code);
    }

    @Test
    void arrayAssignBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("""
                inline4[] array is new inline4[10]#
                array[] is 7#
                burnout(array[0])#
                """, "arrayAssign");
        assertNull(code);

    }

    //TODO: Function BW call test
    @Test
    void functionDeclBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("", "functionDecl");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                ""
        }, output.toArray());
    }

    //TODO: Function call BW test

    @Test
    void functionCallBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("", "functionCall");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                ""
        }, output.toArray());
    }


    @Test
    void returnStmtBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("inline4 a is 10# return b# burnout(a)#", "returnStmt");
        assertNull(code);

    }


    @Test
    void scannerDeclBW() throws Exception {
        Compiler compiler = new Compiler();
        JasminBytecode code = compiler.compileString("scanner 8#", "declareScanner");
        assertNull(code);
    }


    /**
     * -----------------------------------------Operator (Good Weather)------------------------------------------------*
     */

    @Test
    void And() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("if (2 > 1 AND 1 < 2) { burnout(1)# } " +
                "else {burnout(2)#}", "ANDopTest");

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "1",
        }, output.toArray());
    }

    @Test
    void Or() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("if (false OR false) { burnout(1)# } " +
                "else {burnout(2)#}", "ORopTest");

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "2",
        }, output.toArray());
    }

    @Test
    void increment() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("inline4 var is 0# var^^# burnout(var)#", "increment");

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "1",
        }, output.toArray());
    }

    @Test
    void decrement() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("inline4 var is 1# var--# burnout(var)#", "decrement");

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "0",
        }, output.toArray());
    }

    @Test
    void biggerthen() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(
                """
                        if(2 > 1) {
                            burnout("2 is bigger then 1")#
                        } else {
                            burnout("1 not equal to 1")#
                        }
                        """, "testIfStatement");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "2 is bigger then 1"
        }, output.toArray());
    }

    @Test
    void smallerthen() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(
                """
                        if(2 < 1) {
                            burnout("2 is bigger then 1")#
                        } else {
                            burnout("2 is smaller then 1")#
                        }
                        """, "testIfStatement");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "2 is smaller then 1"
        }, output.toArray());
    }

    @Test
    void equals() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(1==1)#", "printBool");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "1"
        }, output.toArray());
    }

    @Test
    void notEquals() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(1!=1)#", "printBool");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "0"
        }, output.toArray());

    }

    @Test
    void equalsFloat() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(1.0==1.0)#", "printBool");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "1"
        }, output.toArray());

    }

    @Test
    void notEqualsFloat() throws Exception {
        Compiler c = new Compiler();

        JasminBytecode code = c.compileString("burnout(1.0!=1.1)#", "printBool");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "1"
        }, output.toArray());

    }

    /**
     * -----------------------------------------Operator (bad Weather)------------------------------------------------*
     */

    @Test
    void AndBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("""
                if (2 > 1 AND 4) {
                burnout(1)# 
                } else {
                burnout(2)#
                }
                """, "ANDopTest");
        assertNull(code);

    }

    @Test
    void OrBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("""
                if (1 > 2 OR scanner sc) {
                burnout(1)#
                } else {
                burnout(2)#
                }
                """, "ORopTest");
        assertNull(code);
    }

    @Test
    void incrementBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("sentence var is 'hello' # var^^# burnout(var)#", "increment");
        assertNull(code);

    }

    @Test
    void decrementBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("flat4 var is 3.3# var--# burnout(var)#", "decrement");
        assertNull(code);

    }

    @Test
    void biggerthenBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(
                """
                        if(2 > 1.1) {
                            burnout("2 is bigger then 1")#
                        } else {
                            burnout("1 not equal to 1")#
                        }
                        """, "testIfStatement");
        assertNull(code);
    }

    @Test
    void smallerthenBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(
                """
                        sentence a is "hoi"#
                        if(2 < a) {
                            burnout("2 is bigger then 1")#
                        } else {
                            burnout("2 is smaller then 1")#
                        }
                        """, "testIfStatement");
        assertNull(code);
    }

    @Test
    void equalsBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(1==1.1)#", "printBool");
        assertNull(code);

    }

    @Test
    void notEqualsBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(11.1!=1)#", "printBool");
        assertNull(code);
    }

    @Test
    void equalsFloatBW() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(1.0==1)#", "printBool");
        assertNull(code);
    }

    @Test
    void notEqualsFloatbBW() throws Exception {
        Compiler c = new Compiler();

        JasminBytecode code = c.compileString("burnout(10!=1.1)#", "printBool");
        assertNull(code);

    }

    /**
     * -----------------------------------------------Extra Tests------------------------------------------------------*
     */

    @Test
    void arrayIndex() throws Exception {
        Compiler c = new Compiler();

        JasminBytecode code = c.compileString(
                """
                        inline4[] array is new inline4[10]#
                        array[1] is 32# inline4 a is array[1]#
                        burnout(a)#
                         """, "arrayAssign");

        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "32"
        }, output.toArray());
    }

    @Test
    void multiplicationOperatorPrint() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout(11 nitro 3)#", "multiplicationOperator");
        assertNotNull(code);

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "33"
        }, output.toArray());
    }

    @Test
    void scoping() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("", "scope");
        assertNotNull(code);
    }

    @Test
    void parenthesisExpression() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("burnout((5 nitro 2) upshift 2)#", "parenthExpre");

        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "12",
        }, output.toArray());
    }

    @Test
    void scanner() throws Exception {
        Compiler c = new Compiler();

        int data = 2;
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(String.valueOf(data).getBytes()));
            JasminBytecode code = c.compileString("scanner input# inline4 test# test is input.scan#", "test");
            assertNotNull(code);

            List<String> output = runCode(code);
//			assertArrayEquals(new String[]{
//					"2"
//			}, output.toArray());
        } catch (Exception e) {
            Assertions.fail(e);
        } finally {
            System.setIn(stdin);
        }

    }

    @Test
    void scanner2() throws Exception {
        Compiler c = new Compiler();

        String input = "Hallo!";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            JasminBytecode code = c.compileString("scanner input# sentence test# test is input.scan#", "scanner");
            assertNotNull(code);

        } catch (Exception e) {
            Assertions.fail(e);
        } finally {
            System.setIn(stdin);
        }


        //

//		String input = "Hallo!";
//		InputStream newIn = new ByteArrayInputStream(input.getBytes());
//		System.setIn(newIn);
//
//		String expected = input;
//
//		InputStream oldIn = System.in;
//
//		try {
//			assertEquals("Hello!", newIn);
//
//		} catch (Exception e) {
//			Assertions.fail(e);
//		} finally {
//			System.setIn(oldIn);
//		}

    }

    @Test
    void checkVariableInScope() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("if(true) " +
                "{ inline4 a is 10# }" +
                "burnout(a)#", "ifStatement");
        assertNull(code);
    }

}
