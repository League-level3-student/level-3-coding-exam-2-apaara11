package test;

import java.util.ArrayList;

public class ContestCalculator {
	
	public Object calculateWinner(ArrayList<Double> wyateErpsNuggets, ArrayList<Double> butchCassidaysNuggets) {
		// TODO Auto-generated method stub
		double sumW = 0.0;
		double sumB = 0.0;

		for (int i = 0; i < wyateErpsNuggets.size(); i++) {
			sumW += wyateErpsNuggets.get(i); 
		}
		for (int i = 0; i < butchCassidaysNuggets.size(); i++) {
			sumB += butchCassidaysNuggets.get(i) ;
		}
	
		if (sumW > sumB) {
			return wyateErpsNuggets;
		}
		if (sumB > sumW) {
			return butchCassidaysNuggets;
		}
		
		
		return 0;

	}	

}
