import java.util.SortedSet;
import java.util.TreeSet;

public class Triangle implements Comparable<Triangle>{

	private double base;
	private double altura;

	public Triangle(double base, double altura) {
		this.base=base;
		this.altura=altura;
		
	}
	
	public double area() {
		return base*altura/2;
		
	}
	
	public boolean equals (Object o) {
		Triangle other;
		try {
			other= (Triangle)o;
			return (this.base==other.base && this.altura==other.altura);
				
			
		}
		catch(Exception e) {
			return false;
		}
		
	}
	
	public int compareTo(Triangle altre) {
		if (area()>altre.area()) return 1;
		else if(area()<altre.area()) return -1;
		else return (int)(altura-altre.altura);
		
	}
	
	public static void main (String[] args) {
		
		SortedSet<Triangle> tris = new TreeSet<>();
		tris.add(new Triangle(6,4));
		tris.add(new Triangle(4,6));
		tris.add(new Triangle(3,4));
		tris.add(new Triangle(4,1));
		tris.add(new Triangle(4,6));
		tris.add(new Triangle(2,4));
		tris.add(new Triangle(2,8));
		tris.add(new Triangle(2,5));
		tris.add(new Triangle(2,6));
		tris.remove(tris.first());
		tris.remove(tris.last());
		
		double total =0.0;
		for (Triangle t : tris) {
			if (t.compareTo(new Triangle(2,6))<0) {
				total+=t.area();
			}
		}
		System.out.println(total);









		
	}




}
