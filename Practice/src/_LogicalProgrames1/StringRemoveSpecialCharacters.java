package _LogicalProgrames1;

public class StringRemoveSpecialCharacters {

	public static void main(String[] args) {
	//Aim-->to remove or replace unwanted Special characters numbers.
		
		String s="Velocity@";
		String s1 = s.replace("@", "");//If one character want to replace then use
		//replace method replace old character by new character.
		System.out.println(s1);
		
		//We want only character not special symbol and no.
		String s2="Vel@oc#ity$123";
		String s3 = s2.replaceAll("[^a-zA-z]", "");
		//syntax is very important^shows not in Range of a-z and A-Z replace them.
		System.out.println(s3);
		
		//We want character and no. not special symbol.
		String s4="Vel@oc#ity$123";
		String s5 = s4.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(s5);
		

	}

}
