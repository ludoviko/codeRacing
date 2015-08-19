/**
 * 
 */
package com.lam.coder.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lazuajemolle
 *
 */
public class Regex_helper {

    /**
     * Extracts the contents of the given file. The file is expected to be a non-java delimeted 
     * regex pattern.
     * 
     * @param file_name: the name of the file that has the regex pattern.
     * @returns a string holding the content of the file.
     * @author Mehran Habibi.
     * 
     * 
     **/
    
    public static String getRegex(String file_name) {
        String regex_expression = null;
        FileChannel fc;
        try {
          // open the file  
          FileInputStream fis = new FileInputStream (file_name);
          // get a file channel
          fc = fis.getChannel();
          // Create a ByteBuffer that is large enough
          ByteBuffer byte_buffer = ByteBuffer.allocate((int)fc.size());
          fc.read(byte_buffer);
          byte_buffer.flip();
          regex_expression = new String (byte_buffer.array() );
          // release the file channel
          fc.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fc = null;
        };
        return regex_expression;
    };
    
    /**
     * Extracts the contents of the given file at a given key. 
     * The file is expected to be a non-java delimeted 
     * regex pattern.
     * 
     * @param file_name: the name of the file that has the regex pattern.
     * @param key: the key that defines the regex in the file.
     * @returns a string holding the content of the file.
     * @author Mehran Habibi.
     * 
     * 
     **/
    
    public static String getRegex(String file_name, String key) {
        String regex_expression = null;
        
        String  content = Regex_helper.getRegex(file_name);
        
        // if the file has content, then try to find the key
        if ( content != null ) {
            // look for a beginning of file, followed by the key,
            // followed by an equal sign, and capture everything between
            // that key and the EOL.
            
            String key_regex = "^" + key + "=(.*)$";
            // the output might have multiple lines
            // xxx ?
            Pattern pattern = Pattern.compile(key_regex, Pattern.MULTILINE);
            Matcher matcher = pattern.matcher(content);
            
            if (matcher != null ) {
              if (matcher.find()) {
                regex_expression = matcher.group( 1 );
                System.out.println(key + "=" + regex_expression);
              };  
            };
        };
        
        return regex_expression;
    };

    
    public static void main(String[] string) {
      PrintStream out =  System.out;  
//      String result = "";
//      result = Regex_helper.getRegex(string[0], "email");
//      result = Regex_helper.getRegex(string[0], "email_with_ip");
//      result = Regex_helper.getRegex(string[0], "zip");
//      result = Regex_helper.getRegex(string[0], "dates");
//      result = Regex_helper.getRegex(string[0], "IP");
//      result = Regex_helper.getRegex(string[0], "IP_CAPTURING");
//      result = Regex_helper.getRegex(string[0], "credit_card");
//      result = Regex_helper.getRegex(string[0], "real_number");
//      result = Regex_helper.getRegex(string[0], "name_pattern");
      isNameFormatValid( string[0], "Albert Delgado Fuente");
    }; 

    public static boolean isNameFormatValid( String file_name, String full_name) {
        boolean is_valid = false;
        System.out.println("The name expected is: First_name [Middle_Name] Last_name");
        System.out.println("The name tested is: " + full_name);
        
        String name_pattern = Regex_helper.getRegex(file_name, "name_pattern");
//        String name_pattern = "\\p{Upper}\\p{Lower}+\\s?";
        
        // search for an exact match
        String full_name_pattern = "(" + name_pattern  +"){2,3}";
        is_valid = full_name.matches(full_name_pattern);
        if (is_valid) {
            System.out.println("And the test is: " +  is_valid + "\n"); 
        } else {
            System.err.println("And the test is: " +  is_valid + "\n"); 
        };
        return is_valid;
      };

}
