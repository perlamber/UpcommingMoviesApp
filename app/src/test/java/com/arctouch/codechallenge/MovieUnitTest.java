package com.arctouch.codechallenge;

import com.arctouch.codechallenge.model.Movie;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MovieUnitTest {
    @Test
    public void movieEqualsComparationPass() throws Exception {
        Movie m1 = new Movie();
        m1.id = 123;
        Movie m2 = new Movie();
        m2.id = 123;
        assertEquals(m2, m1);
    }
    @Test
    public void movieEqualsComparationFails() throws Exception {
        Movie m1 = new Movie();
        m1.id = 123;
        m1.overview="blabla";
        Movie m2 = new Movie();
        m2.id = 123;
        m2.overview="blabla2";
        assertNotEquals(m2, m1);
    }
}