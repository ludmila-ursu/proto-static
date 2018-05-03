
public class A {

public static int x =1;
String y;

//constructeur:
public A(int x, String y) {
	super();
	this.y = y;
}


static A a1 = new A(1, "a");
static A a2 = new A(1, "b");
static A a3 = new A(1, "c");
static A a4 = new A(1, "d");
static A a5 = new A(1, "e");
 
	
	
	//getters et setters
public static int getX() {
	return x;
}
public static void setX(int x) {
	A.x = x;
}
public String getY() {
	return y;
}
public void setY(String y) {
	this.y = y;
}

//hashcode et equals :
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	return result;
}

//@Override
//public String toString() {
//	return "A []";
//}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	A other = (A) obj;
		return false;
}
}
