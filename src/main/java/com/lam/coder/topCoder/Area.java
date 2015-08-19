package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Usuario
 *
 * 
 */

public class Area {
	public static final char UP = 'U';
	public static final char DOWN = 'D';
	public static final char LEFT = 'L';
	public static final char RIGHT = 'R';

	private List<Point> points;
	
	public Area() {
		points = new ArrayList<Point>();
	}
	
	private class Point {
		private int x, y;
		
		Point(int x, int y) {
			this.x = x;
			this.x = y;
		}
		
		Point() {
			this.x = 0;
			this.x = 0;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public void setY(int y) {
			this.y = y;
		}
		
		public int getX() {
			return this.x;
		}
	    	
		public int getY() {
			return this.y;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

		private Area getOuterType() {
			return Area.this;
		}
		
		
	}
	
	public int totalEnclosed(int startX, int startY, String commands) {
		Point start = new Point(startX, startY);
	
		points.add(start);
		
		Point current;
		Point former = start;
		for (int i = 0; i < commands.length(); i++) {
			current = this.applyCommand(former, commands.charAt(i));

			if (current.equals(former)) {
			} else {
				points.add(current);
			}
			former = current;
		}

		boolean isRectangle = this.isRectagle(points.get(points.size() - 1));
		if (isRectangle) {
			System.out.println("It is a rectangle !");
			// Find area
		}
		
		

		return 0;
	}
	
   private boolean isRectagle(Point point) {
	   if (this.points.contains(point)) {
		   return true;
	   }
	   
	   return false;
   }
	
	public Point applyCommand(Point point, char command) {
		int x = point.getX();
		int y = point.getY();
		
		Point position = new Point();
		
		switch (command) {
		case RIGHT:
			x++;
			break;
		case LEFT:
			x--;
			break;
		case UP:
			y++;
			break;
		case DOWN:
			y--;
			break;
		default:
			break;
		}
		
		position.setX(x);
		position.setY(y);
		
		return position;
	}

}
