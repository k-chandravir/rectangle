package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    Rectangle dummyRectangle = new Rectangle();

    @Nested
    class Area{
        @Test
        void toReturnAreaAsEightWhenLengthIsFourAndBreadthIsTwo(){
            int expectedArea = 8;

            int actualArea = dummyRectangle.area(4, 2);

            assertEquals(expectedArea, actualArea);
        }

//        @Test
//        void toThrowExceptionWhenLengthOrBreadthIsNegative(){
//            assertThrows()
//        }
    }

}
