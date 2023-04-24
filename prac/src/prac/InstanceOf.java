package prac;

//upcasting 
//downcasting


class Box {
	public void Wrap( ) {System.out.println("simple wrap");}
}

class PaperBox extends Box {
	public void Wrap() {System.out.println("paper wrap");}
}

class GoldPaperBox extends PaperBox {
	public void Wrap() {System.out.println("gold wrap");}
}


class InstanceOf {
	public static void wrapBox(Box box) {
		box.Wrap();
	}
	
	public static void main(String[] args) {
		Box box1=new Box();
		PaperBox box2=new PaperBox();
		GoldPaperBox box3=new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
}
