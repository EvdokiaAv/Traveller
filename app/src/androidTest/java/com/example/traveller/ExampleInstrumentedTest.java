package com.example.traveller;

import android.content.Context;

//import androidx.test.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
//import androidx.test.InstrumentationRegistry;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.internal.runner.InstrumentationConnection;
import androidx.test.internal.runner.junit4.AndroidJUnit4Builder;
//import androidx.test.runner.AndroidJUnit4;
import androidx.test.runner.AndroidJUnitRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
//        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("com.example.traveller", appContext.getPackageName());
    }
}
