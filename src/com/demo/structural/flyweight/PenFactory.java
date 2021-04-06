package com.demo.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

//Fly weight factory class
public class PenFactory {

	//It maintains a Hash map of all the pens that are created.
	//It will return an already created pen, if the Extrinsic state matches
	//Else create a new object and store it in cache.
	private Map<String, Pen> penMap = new HashMap<>();

	public Pen getPen(PenType type, String color) {

		Pen pen = penMap.get(getKey(type, color));
		if (pen == null) {
			switch (type) {
			case Thick_Pen:
				pen = new ThickPen();
				break;
			case Medium_Pen:
				pen = new MediumPen();
				break;
			case Thin_Pen:
				pen = new ThinPen();
				break;
			}
			pen.setColor(color);
			penMap.put(getKey(type, color), pen);
		}
		return pen;
	}

	private String getKey(PenType type, String color) {
		return type.name() + color;
	}
}
