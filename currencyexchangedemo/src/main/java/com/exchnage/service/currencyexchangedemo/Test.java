package com.exchnage.service.currencyexchangedemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test1 =new Test();
		test1.test(2);

	}
	
	public void test(int daysago)
	{
		int [] BALANCE_HISTORY = {107, 201, 201, 225, 216};
				//def inc_or_dec(days_ago):

				  int difference=0;
				    System.out.println("value of");

					  for (int i=daysago;i>-1;i--)
					  {
						    System.out.println("value of"+i);
					        int []balance_slice=new int[2];
					        balance_slice[0]=BALANCE_HISTORY[i];
					        balance_slice[1]=BALANCE_HISTORY[i+1];
					        difference = balance_slice[1] - balance_slice[0];
								    if (difference > 0)
								      System.out.println("Balance from "+i+" days ago INCREASED!'");
								    else
								    	System.out.println("Balance from "+i+" days ago DECREASED!");



					  }
	}

}
