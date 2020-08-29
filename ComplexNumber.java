import java.lang.Math; 

public class ComplexNumber {

	private double real;
	private double img;
	
	public ComplexNumber(double real, double img) {
		this.real = real;
		this.img = img;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImg() {
		return img;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public void setImg(double img) {
		this.img = img;
	}
	
	public ComplexNumber addComp(ComplexNumber num) {
		ComplexNumber myCompNum = new ComplexNumber(num.getReal()+this.real, num.getImg()+this.img);
		return myCompNum;
	}
	
	public ComplexNumber substractComp(ComplexNumber num) {
		ComplexNumber myCompNum = new ComplexNumber(this.real-num.getReal(), this.img-num.getImg());
		return myCompNum;
	}
	
	public ComplexNumber multiplyComp(ComplexNumber num) {
		ComplexNumber myCompNum = new ComplexNumber((num.getReal()*this.real)-(num.getImg()*this.img), (num.getReal()*this.img)+(num.getImg()*this.real));
		return myCompNum;
	}
	
	public String toString() {
		String s;
		if (this.img > 0) {
			if (this.real != 0) {
				s = this.real + " + " + Math.abs(this.img) + "i";
			}else {
				s = " + " + Math.abs(this.img) + "i";
			}
		}else if (this.img < 0){
			if (this.real != 0) {
				s = this.real + " - " + Math.abs(this.img) + "i";
			}else {
				s = " - " + Math.abs(this.img) + "i";
			}
		}else {
			if (this.real != 0) {
				s = this.real + "";
			}else {
				s = "0";
			}
		}
		return s;
	}
	
	public boolean equals(ComplexNumber num) {
		if (num.getReal() == this.real && num.getImg() == this.img) {
			return true;
		}else {
			return false;
		}
	}
	
}
