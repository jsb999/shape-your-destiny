package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  // ---- Circle Tests ----
  @Test
  void testCircleDefaultConstructor() {
    Circle c = new Circle();
    assertEquals(0, c.getRadius(), 0.0001);
    assertEquals(0, c.getArea(), 0.0001);
    assertEquals(0, c.getPerimeter(), 0.0001);
  }

  @Test
  void testCircleWithRadius() {
    Circle c = new Circle(5);
    assertEquals(5, c.getRadius(), 0.0001);
    assertEquals(Math.PI * 25, c.getArea(), 0.0001); 
    assertEquals(2 * Math.PI * 5, c.getPerimeter(), 0.0001);
  }

  // ---- Rectangle Tests ----
  @Test
  void testRectangleDefaultConstructor() {
    Rectangle r = new Rectangle();
    assertEquals(0, r.getLength(), 0.0001);
    assertEquals(0, r.getWidth(), 0.0001);
    assertEquals(0, r.getArea(), 0.0001);
    assertEquals(0, r.getPerimeter(), 0.0001);
  }

  @Test
  void testRectangleWithSides() {
    Rectangle r = new Rectangle(4, 6);
    assertEquals(4, r.getLength(), 0.0001);
    assertEquals(6, r.getWidth(), 0.0001);
    assertEquals(24, r.getArea(), 0.0001);
    assertEquals(20, r.getPerimeter(), 0.0001);
  }

  // ---- RightTriangle Tests ----
  @Test
  void testRightTriangleDefaultConstructor() {
    RightTriangle t = new RightTriangle();
    assertEquals(0, t.getBase(), 0.0001);
    assertEquals(0, t.getHeight(), 0.0001);
    assertEquals(0, t.getArea(), 0.0001);
    assertEquals(0, t.getPerimeter(), 0.0001);
  }

  @Test
  void testRightTriangleWithLegs() {
    RightTriangle t = new RightTriangle(3, 4);
    assertEquals(3, t.getBase(), 0.0001);
    assertEquals(4, t.getHeight(), 0.0001);
    assertEquals(6, t.getArea(), 0.0001); // (3*4)/2
    assertEquals(3 + 4 + Math.sqrt(9 + 16)/*sqrt(25) = 5*/, t.getPerimeter(), 0.0001);
  }

  // --- Square Tests ---
  @Test
  void testSquareAreaAndPerimeter() {
      Square s = new Square(4.0);
      assertEquals(16.0, s.getArea(), 0.0001, "Square area should be side^2");
      assertEquals(16.0, s.getPerimeter(), 0.0001, "Square perimeter should be 4 * side");
  }

  @Test
  void testSquareImplementsPolygon() {
      Square s = new Square(5.0);
      assertTrue(s instanceof Polygon, "Square should implement Polygon");
      assertEquals(4, s.numberOfSides(), "Square should have 4 sides");
  }

  // --- IsoscelesRightTriangle Tests ---
  @Test
  void testIsoscelesRightTriangleArea() {
      IsoscelesRightTriangle t = new IsoscelesRightTriangle(3.0);
      // area = (leg * leg) / 2
      assertEquals(4.5, t.getArea(), 0.0001, "Area should be (leg^2)/2");
  }

  @Test
  void testIsoscelesRightTrianglePerimeter() {
      IsoscelesRightTriangle t = new IsoscelesRightTriangle(3.0);
      // perimeter = leg + leg + hypotenuse
      double expected = 3.0 + 3.0 + Math.sqrt(18.0);
      assertEquals(expected, t.getPerimeter(), 0.0001, "Perimeter should include both legs + hypotenuse");
  }

  @Test
  void testIsoscelesRightTriangleInheritsPolygon() {
      IsoscelesRightTriangle t = new IsoscelesRightTriangle(3.0);
      assertTrue(t instanceof Polygon, "IsoscelesRightTriangle should implement Polygon via RightTriangle");
      assertEquals(3, t.numberOfSides(), "Triangle should have 3 sides");
  }

  // --- Polygon General Test ---
  @Test
  void testPolygonPolymorphism() {
      Polygon p = new Square(2.0); // polymorphic reference
      assertEquals(4, p.numberOfSides(), "Polygon reference to Square should return 4 sides");

      p = new IsoscelesRightTriangle(2.0);
      assertEquals(3, p.numberOfSides(), "Polygon reference to Triangle should return 3 sides");
  }
}
