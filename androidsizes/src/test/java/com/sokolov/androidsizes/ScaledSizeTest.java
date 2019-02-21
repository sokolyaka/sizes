package com.sokolov.androidsizes;

import junit.framework.TestCase;

import org.junit.Assert;

public class ScaledSizeTest extends TestCase {

    public void test() {
        final ScaledSize scaledSize =
                new ScaledSize(
                        new SmplSize(100, 200),
                        50);

        Assert.assertEquals(50, scaledSize.width());
        Assert.assertEquals(100, scaledSize.height());
    }
}