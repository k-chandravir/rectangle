package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
//    Rectangle rectangleObject = new Rectangle();
//    Square squareObject = new Square();

    @Nested
    class AreaOfRectangle{
        @Test
        void toReturnAreaAsEightWhenLengthIsFourAndBreadthIsTwo(){
            Rectangle rectangleObject = new Rectangle(4, 2);
            int expectedAreaOfRectangle = 8;

            int actualAreaOfRectangle = rectangleObject.area();

            assertEquals(expectedAreaOfRectangle, actualAreaOfRectangle);
        }

        @Test
        void toThrowExceptionWhenLengthOrBreadthIsNegative(){
            Rectangle rectangleObject = new Rectangle(-8 , -2);
            assertThrows(IllegalArgumentException.class, rectangleObject::area);
        }
    }

    @Nested
    class PerimeterOfRectangle{
        @Test
        void toReturnPerimeterAsTwelveWhenLengthIsFourAndBreadthIsTwo(){
            Rectangle rectangleObject = new Rectangle(4, 2);
            int expectedPerimeterOfRectangle = 12;

            int actualPerimeterOfRectangle = rectangleObject.perimeter();

            assertEquals(expectedPerimeterOfRectangle, actualPerimeterOfRectangle);
        }

        @Test
        void toThrowExceptionWhenLengthOrBreadthIsNegative(){
            Rectangle rectangleObject = new Rectangle(-8, -2);
            assertThrows(IllegalArgumentException.class, rectangleObject::perimeter);
        }
    }

    @Nested
    class PerimeterOfSquare{
        @Test
        void toReturnPerimeterAsEightWhenTheSideIsTwo(){
            Rectangle squareObject = Rectangle.createSquare(2);
            int expectedPerimeterOfSquare = 8;

            int actualPerimeterOfSquare = squareObject.perimeter();

            assertEquals(expectedPerimeterOfSquare, actualPerimeterOfSquare);
        }
    }

    @Nested
    class AreaOfSquare{
        @Test
        void toReturnAreaAsSixteenWhenTheSideIsFour(){
            Rectangle squareObject = Rectangle.createSquare(4);
            int expectedAreaOfSquare = 16;

            int actualAreaOfSquare = squareObject.area();

            assertEquals(expectedAreaOfSquare,actualAreaOfSquare);
        }
    }

}
