package oo.abstraction;

public class VolleyballTester {

	public static void main(String[] args) {
     VolleyballPalyer p1 = new VolleyballPalyer("WILLIAM",7,"Setter",186,300,295);
     VolleyballPalyer p2 = new VolleyballPalyer("EVANDRO",8,"Opposite",207,359,332);
     VolleyballPalyer p3 = new VolleyballPalyer("Simón",10," Middle blocker",208,358,326);
     

     VolleyballPalyer[] person = new  VolleyballPalyer[3];
		System.out.println(person[0]);
		person[0] = new  VolleyballPalyer("WILLIAM",7,"Setter",186,300,295);
		person[1] = new  VolleyballPalyer("EVANDRO",8,"Opposite",207,359,332);
		person[2] = new  VolleyballPalyer("Simón",10," Middle blocker",208,358,326);
		
		System.out.println(person[0].name);
		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println(person[i].name);
	}
	}
}
