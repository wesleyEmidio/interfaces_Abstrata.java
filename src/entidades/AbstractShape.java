package entidades;

import enumeradores.Color;

public class AbstractShape implements Shape{

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public double area() {
		return 0;
	}
}
