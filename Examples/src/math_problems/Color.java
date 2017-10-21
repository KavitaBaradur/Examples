package math_problems;

import java.util.ArrayList;
import java.util.List;

public class Color {
	private String name;
	
	public void setName(String name) {
		this.name= name;
		
	}
	public String getName() {
		return name;
	}

	public List<Color> removeBlues(List<Color> inputColors){
		List<Color> notBlues =null;
		
		if(inputColors != null && inputColors.size()>0) {
			notBlues =new ArrayList<Color>();
			for( Color color: inputColors) {
				if(!color.getName().equalsIgnoreCase("blue")) {
					notBlues.add(color);
				}
			}
		}
		return notBlues;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Color color1 = new Color();
		color1.setName("blue");
		
		Color color2 = new Color();
		color2.setName("red");
		
		Color color3 = new Color();
		color3.setName("green");
		
		Color color4 = new Color();
		color4.setName("white");
		
		ArrayList<Color> newList = new ArrayList<Color>();
		newList.add(color1);
		newList.add(color2);
		newList.add(color3);
		newList.add(color4);
		
		List<Color> newList1 = color4.removeBlues(newList);
		
		for(Color color: newList1) {
			System.out.println(color.getName());
		}
		
	}

}
