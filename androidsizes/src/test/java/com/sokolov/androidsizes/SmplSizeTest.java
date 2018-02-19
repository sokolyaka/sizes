package com.sokolov.androidsizes;

import junit.framework.TestCase;

public class SmplSizeTest extends TestCase {
    public void testEquals() {
        assertEquals(
                new SmplSize(10, 4),
                new SmplSize(10, 4));
    }

    public void testNotSame() {
        assertNotSame(
                new SmplSize(1, 4),
                new SmplSize(10, 4));
    }

    public void testHashCode() {
        assertEquals(
                new SmplSize(10, 4).hashCode(),
                new SmplSize(10, 4).hashCode());
    }

}