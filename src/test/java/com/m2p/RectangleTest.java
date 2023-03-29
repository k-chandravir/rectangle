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

            int actualArea = dummyRectangle.areaOfRectangle(4, 2);

            assertEquals(expectedArea, actualArea);
        }

        @Test
        void toThrowExceptionWhenLengthOrBreadthIsNegative(){
            assertThrows(IllegalArgumentException.class, () -> dummyRectangle.areaOfRectangle(-8, -2));
        }
    }

    @Nested
    class Perimeter{
        @Test
        void toReturnPerimeterAsTwelveWhenLengthIsFourAndBreadthIsTwo(){
            int expectedPerimeter = 12;

            int actualPerimeter = dummyRectangle.perimeterOfRectangle(4, 2);

            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        void toThrowExceptionWhenLengthOrBreadthIsNegative(){
            assertThrows(IllegalArgumentException.class, () -> dummyRectangle.perimeterOfRectangle(-8, -2));
        }
    }

}
