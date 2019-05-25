package _07_tea_party;

public class teaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isWoman == true && isKnighted == true) {
			return "Welcome To The Party Lady " + name;
		} else if (isWoman == true && isKnighted == false) {
			return "Welcome To The Party Ms." + name;
		}
		if (isWoman == false && isKnighted == true) {
			return "Welcome To The Party Sir " + name;
		} else if (isWoman == false && isKnighted == false) {
			return "Welcome To The Party Mr." + name;
		}
		return "error 404";

	}
}