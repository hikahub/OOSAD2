
#include <iostream>
#include <string>
#include "firstlib.h"
using namespace std;
void printGreeting()
{
cout << "Welcome to C++ Library Programming" << endl;
}

void weatherForecast(int ndays)
{
	cout << ndays << " Weather Forecast in Dublin" << endl;
	if(ndays >= 0  && ndays <=3)
	{
		cout << "Day: " << ndays << endl;
		cout << "High : 5deg C" << endl;
		cout << "Low : -5deg C" << endl;
		cout << "Predicted Rainfall : 5000ml" << endl;
		cout << "Windspeed : 68Mph" << endl;
		cout << "Wind-direction: North" << endl;
	}else{
		cout <<  "Outside the 0-3 days range" << endl;
	}
}


void getMyLocation(std::string& location){

	cout << "My Location: " << location << endl;
}

