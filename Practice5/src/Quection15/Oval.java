package Quection15;

class Oval implements Shape {
    private int width, height; // 타원의 가로, 세로 길이

    public Oval(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(width + "X" + height + "에 내접하는 타원");
    }

    @Override
    public double getArea() {
        return PI * (width / 2.0) * (height / 2.0);
    }
}