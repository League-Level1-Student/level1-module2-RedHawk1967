package _01_getters_and_setters;

public class Person {

private String name = new String();
private String superpower = new String();

public String getName() {
	return name;
}
public String getSuperpower() {
	return superpower;
}
public void setName(String name) {
	this.name = name;
}
public void setSuperpower(String superpower) {
	this.superpower = superpower;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " has mad " + superpower + " skills"; 
	}


}
