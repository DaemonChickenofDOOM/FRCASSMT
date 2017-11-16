/***************************************
 * FIFTH EXERCISE
 * RAYMOND YANG
 **************************************/
/* RETURN FUNCTIONS*/
public class exercise {
    public static void main(String[]args){
	int var=1;
	double x1 = 1;
	double y1 = 1;
	double x2 = 5;
	double y2 = 1;
	double d1 = x1 - x2;
	double d2 = y1 - y2;

	    if(var == 1){
		System.out.println(calcDist(d1, d2);)
	    }
	    else if(var==2) {
		System.out.println(calcSlope(d1, d2);)
	    }
	    else{
		System.out.println("PEBKAC ERROR: CONTACT YOUR SERVICE REPRESENTATIVE FOR INSTRUCTIONS.");
	    }
	   
    }
    static void calcDist(d1, d2);{
	double distance;
	distance = Math.sqrt( d1^2 + d2^2 );
	return distance;
    }

    static void calcSlope(d1, d2);{
	return d2/d1;
    }
}

/* VOID FUNCTIONS */

public class exercise2 {
    public static void main(String[]args){
	int var =1;
	double x1 = 1;
	double y1 = 1;
	dobule x2 = 5;
	double y2 = 1;
	/***************************************
	 * DETERMINING FUNCTION TO USE
	 * IF VAR = 1 : CALCULATE DISTANCE
	 * IF VAR = 2 : CALCULATE SLOPE
	 * OTHERWISE  : SHOULDN'T HAPPEN. ERROR
	 **************************************/
	if(var == 1){ 
	    System.out.println("CALCULATING DISTANCE");
	    calcDist(x1, x2, y1, y2);
	}
	else if(var == 2){
	    System.out.println("CALCULATING SLOPE");
	    calcSlope(x1, x2, y1, y2);
	}
	else{
	    System.out.println("AN ERROR HAS OCCURRED");
	    System.out.println("PLEASE CONTACT A SERVICE REPRESENTATIVE");
	}
    }

    static void calcdist(x1, x2, y1, y2){
	dx = Math.abs(x1 - x2);
	dy = Math.abs(y1 - y2);

	out = Math.sqrt(dx^2 + dy^2);

	System.out.println(out);
    }

    static void calcSlope(x1, x2, y1, y2){
	dx = Math.abs(x1 - x2);
	dy = Math.abs(y1 - y2);

	out = dy / dx;

	System.out.println(out);
    }
}
