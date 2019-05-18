package _03_smurf;

public class SmurfRunner {

public static void main(String[] args) {
	


Smurf han = new Smurf("Handy");
han.eat();
System.out.println(han.getName());

Smurf pap = new Smurf("Papa");
System.out.println(pap.getName());
System.out.println(pap.getHatColor()); 
System.out.println(pap.isGirlOrBoy());

Smurf smu = new Smurf("Smurfette");
System.out.println(smu.getName());
System.out.println(smu.getHatColor());
System.out.println(smu.isGirlOrBoy());










}


}
