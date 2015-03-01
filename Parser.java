/**
  *
  * Java parser for cpsc 449
  *
  * @version 0.0 from 2/23/15
  * @author Group 5-04
  */
  
import java.io.*;
import java.util.*;
import java.text.*;

public class Parser {
    // start attributes
    // end attributes
    
    /*The entry point for the program.
    *This method will read the command line arguments and decide which mode if any will be used
    *   --TODO--
    *   accept qualifiers based on - that can be combined such as "-hv" which combined -h and -v
    *   accept qualifiers based on -- that are case insensitive such as "--help" and "--HELP"
    *   run help mode if -h, -? or --help are inputs
    *   throw a fatal error if any other arguments appear with a help qualifier
    *   run help mode WITHOUT the last paragraph (just the synopsis) if no qualifiers or arguments are present
    *   run normal mode if a required first argument and an optional second argument appear
    */
    // start methods
    public static void main(String[] args) {
        boolean verbose = true; //placeholder setting, needs to be true if and only if specified in the command line argument
        parser(verbose);
    } // end of main
    
    /*The main looping function
    *This method will print the help text before beginning the loop where it interprets the expressions
    *   --TODO--
    *   prompt the user with a ">"
    *   interpret the line as a meta command or as an expression
    *   print the result
    */
    public static void parser(boolean verbose) {
        ParseTree tree = new ParseTree();    
        while (true) { 
            System.out.print(">");
            System.out.print(inputGet()+System.lineSeparator());
        } // end of while
    } // end of parser
    
    /*Helper function to retrieve user input
    *This method may prove to be redundant
    *This method may be inefficient in creating a new scanner for each call
    */
    public static String inputGet() {
            return new Scanner(System.in).nextLine();
    }
    // end methods

} // end of class Parser