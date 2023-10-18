package GLAB;

public class GMultipleDatatype <Datatype1,Datatype2> {
	
	Datatype1 Value1;
	Datatype2 Value2;
	
	public GMultipleDatatype(Datatype1 v1, Datatype2 v2)
	{
	this.Value1 = v1;
	this.Value2 = v2;
	}
	public Datatype1 getValue1() {
		return Value1;
	}
	public void setValue1(Datatype1 value1) {
		Value1 = value1;
	}
	public Datatype2 getValue2() {
		return Value2;
	}
	public void setValue2(Datatype2 value2) {
		Value2 = value2;
	}
	
	
	

}
