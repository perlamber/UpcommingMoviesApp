package com.arctouch.codechallenge;

import android.content.Context;
import android.os.Bundle;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.arctouch.codechallenge.model.Movie;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class BasicInstrumentedTest {
    @Test
    public void movieSerializationTest() throws Exception {
        Bundle b = new Bundle();
        Movie m1 = new Movie();
        m1.id = 123;
        m1.overview="blabla";

        b.putSerializable("M",m1);

        Movie m2 = (Movie)b.getSerializable("M");
        assertEquals(m2, m1);
    }
}
