package hafta7lab;

public class Test {

	public static void main(String[] args) {
		Circle c=new Circle(2,"Circle",3);
		System.out.println(c.alan()+" "+c.getIsim());
		Square s=new Square(5,"square");
		System.out.println(s.alan()+" "+s.getIsim());
		Triangle t=new Triangle(4,"Triangle");
		System.out.println(t.alan()+" "+t.getIsim());
		
		
		Sphere ss =new Sphere(2,"Sphere",2);
		System.out.println(ss.alan()+" "+ss.getIsim());
		System.out.println(ss.hacim()+" "+ss.getIsim());
		Cube cc=new Cube(6,"Cube");
		System.out.println(cc.alan()+" "+cc.getIsim());
		Tetrahedron tt=new Tetrahedron(6,"Tetrahedron");
		System.out.println(tt.alan()+" "+t.getIsim());
		
		
		
		
	}

}
