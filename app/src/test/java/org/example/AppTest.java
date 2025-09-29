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
}
