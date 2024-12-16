/*
3번 부터 7번 문제까지 상속해주는 클래스
*/

package Quection0307;

public class Point {
	private int x,y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y ) { this.x = x; this.y = y; }
}
