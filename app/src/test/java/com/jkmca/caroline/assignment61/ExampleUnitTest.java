package com.jkmca.caroline.assignment61;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void isUsernameCorrect() throws Exception{
        assertTrue("Invalid Username",CheckUsername.isUsernameValid("caroline"));
    }

    @Test
    public void isPasswordCorrect() throws Exception{
        assertTrue("Invalid Password",CheckPassword.isPasswordValid("12345678"));
    }

}