
public class Oops {
	
	public static void main(String args[]) {
		pen p1=new pen();                  // creating a pen object!!
		p1.setcolor("Blue");              //function calling in OOPS!!
		System.out.println(p1.color);	 //output value from function.
		p1.setTip(5);
		System.out.println(p1.tip);
	}
}
//class 
class pen{
String color;				//class object
int tip;					//class object
void setcolor(String NewColor) {
	color=NewColor;
	}
void setTip(int NewTip) {
	tip=NewTip;
	}
}
