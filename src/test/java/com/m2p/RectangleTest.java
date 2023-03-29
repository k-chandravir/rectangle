package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    Rectangle rectangleObject = new Rectangle();
    Square squareObject = new Square();

    @Nested
    class AreaOfRectangle{
        @Test
        void toReturnAreaAsEightWhenLengthIsFourAndBreadthIsTwo(){
            int expectedAreaOfRectangle = 8;

            int actualAreaOfRectangle = rectangleObject.areaOfRectangle(4, 2);

            assertEquals(expectedAreaOfRectangle, actualAreaOfRectangle);
        }

        @Test
        void toThrowExceptionWhenLengthOrBreadthIsNegative(){
            assertThrows(IllegalArgumentException.class, () -> rectangleObject.areaOfRectangle(-8, -2));
        }
    }

    @Nested
    class PerimeterOfRectangle{
        @Test
        void toReturnPerimeterAsTwelveWhenLengthIsFourAndBreadthIsTwo(){
            int expectedPerimeterOfRectangle = 12;

            int actualPerimeterOfRectangle = rectangleObject.perimeterOfRectangle(4, 2);

            assertEquals(expectedPerimeterOfRectangle, actualPerimeterOfRectangle);
        }

        @Test
        void toThrowExceptionWhenLengthOrBreadthIsNegative(){
            assertThrows(IllegalArgumentException.class, () -> rectangleObject.perimeterOfRectangle(-8, -2));
        }
    }

    @Nested
    class PerimeterOfSquare{
        @Test
        void toReturnPerimeterAsEightWhenTheSideIsTwo(){
            int expectedAreaOfSquare = 8;

            int actualAreaOfSquare = squareObject.perimeterOfSquare(2);

            assertEquals(expectedAreaOfSquare, actualAreaOfSquare);
        }
    }

}
