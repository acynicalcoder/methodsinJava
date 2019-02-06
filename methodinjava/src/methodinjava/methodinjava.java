package methodinjava;

public class methodinjava {
	
	public static void main(String[] args)
	{
		//create a new runner instance(object), default constructor instantiate it and
		//set it's(instance variable r) private variables/fields with setter/mutators methods inside runner class
		Runner r = new Runner();
		r.setRaceID(146720);
		
		//create a new swimmer instance variable(object) s 
		//(instantiate it with default constructor)
		//set s with setter/mutator using methods of swimmer class
		Swimmer s = new Swimmer();
		s.setRaceID(726198);
		
		
		
		//create a new swimmer (explicit constructor)
		
		Swimmer s2 = new Swimmer(235971);
		
		System.out.println(r);
		System.out.println(s);
		System.out.println(s2);
		
		//NSE
		System.out.println("X equals Y? " + Utilities.nullSafeEquals("X", "Y"));
	
		
	}
}
