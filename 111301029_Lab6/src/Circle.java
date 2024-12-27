public class Circle {
    private int radius;
    private int x;
    private int y;

    Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getRadius() {
        return this.radius;
    }

    public double area() {
        double area = Math.PI * this.radius * this.radius;
        return area;
    }

    public double circumference() {
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }

    public String rangePoint(int x, int y) {
        double squareD = Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2);
        double d = Math.sqrt(squareD);
        if (d > this.radius) {
            return "the point outside the circle.";
        } else if (d == this.radius) {
            return "the point on the circle.";
        } else {
            return "the point inside the circle.";
        }
    }

    public String rangeCircle(Circle c2){
        double squareD = Math.pow(this.x - c2.getX(), 2)
                + Math.pow(this.y - c2.getY(), 2);
        double d =Math.sqrt(squareD);
        double c2Radius = c2.getRadius();
        double c1Radius = this.radius;
        if (d < Math.abs(this.radius - c2Radius)){
            return "the centre of one circle lies on the other circle.";
        } else if (d == Math.abs(this.radius - c2Radius)){
            return "two circles are concentric.";
        } else if (d > Math.abs(this.radius - c2Radius)
                && d < this.radius + c2Radius){
            return "two circles intersect at two points.";
        } else if (d == this.radius + c2Radius) {
            return "the circles touch externally.";
        } else{
            return "the circles do not touch or intersect each other.";
        }
    }
}
