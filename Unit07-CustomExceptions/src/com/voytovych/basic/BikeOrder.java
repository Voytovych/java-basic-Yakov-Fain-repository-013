package com.voytovych.basic;

public class BikeOrder {

	private String order = "";
	
	public String getOrder()
	{
		return order;
	}
	
	public void validateOrder(String bikeModel, int quantity)
			throws TooManyBikesException {

		if((bikeModel != "Aist") && (quantity < 10) )
		{
			order = "Your order is valid: Model - " + bikeModel + " Quantity - " + quantity;
		}
		else
		{
			throw new TooManyBikesException("Can not ship " + quantity + " bikes of the model "
					+ bikeModel);
		}
		
	}
}
