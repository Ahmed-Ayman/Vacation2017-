package com.yourname.re.vogel_examples;

/**
 * http://www.vogella.com/tutorials/JavaRegularExpressions/article.html#java-regex-examples
 */

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckNumber
{
    @Test
    public void testSimpleTrue()
    {
        String s = "1233";
        assertTrue(test(s));
        s = "0";
        assertFalse(test(s));
        s = "29 Kasdkf 2300 Kdsdf";
        assertTrue(test(s));
        s = "99900234";
        assertTrue(test(s));
    }


    public static boolean test(String s)
    {
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

}