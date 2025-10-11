/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author camilocardonasuarez
 */
public class RectanguloFigura extends Figura{
    private Punto p1; 
    private Punto p2; 

    public RectanguloFigura(double x1, double y1, double x2, double y2) {
        super("Rectangulo");
        this.p1 = new Punto(x1, y1);
        this.p2 = new Punto(x2, y2);
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }


    @Override
    public double area() {
        return Math.abs((p2.getX() - p1.getX()) * (p2.getY() - p1.getY()));
    }

    public void escalar(double factor) {
        double vx = p2.getX() - p1.getX();
        double vy = p2.getY() - p1.getY();
        p2.setX(p1.getX() + factor * vx);
        p2.setY(p1.getY() + factor * vy);
    }

    public void mover(double dx, double dy) {
        if (dx != 0 && dy != 0) {
            throw new IllegalArgumentException("Solo se permite mover horizontal o vertical.");
        }
        p1.setX(p1.getX() + dx);
        p2.setX(p2.getX() + dx);
        p1.setY(p1.getY() + dy);
        p2.setY(p2.getY() + dy);
    }

    public boolean contiene(double x, double y) {
        double xMin = Math.min(p1.getX(), p2.getX());
        double xMax = Math.max(p1.getX(), p2.getX());
        double yMin = Math.min(p1.getY(), p2.getY());
        double yMax = Math.max(p1.getY(), p2.getY());
        return x >= xMin && x <= xMax && y >= yMin && y <= yMax;
    }

    public boolean contiene(Punto p) {
        return contiene(p.getX(), p.getY());
    }

    @Override
    public String toString() {
        return getNombre() + " p1=(" + p1.getX() + "," + p1.getY() + ") p2=("
                + p2.getX() + "," + p2.getY() + ") area=" + area();
    }
    
}
