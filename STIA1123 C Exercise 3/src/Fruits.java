
import java.util.Scanner;

public class Fruits {
	Scanner scan =  new Scanner(System.in);
	String name, color, numberseed, taste;
	double weight, price,totalweight, totalprice;
	int nooffruits;
	
	void setName() {
		System.out.print("Please enter fruit's name: ");
		this.name = scan.nextLine();
	}
	
	void setColor() {
		System.out.print("Please enter fruit's color: ");
		this.color = scan.nextLine();
	}
	
	void setNoSeed() {
		System.out.print("Please enter the number of seeds (one / many): ");
		this.numberseed = scan.nextLine();
	}
	
	void setTaste () {
		System.out.print("Please enter the taste of fruit: ");
		this.taste = scan.nextLine();
	}
	
	void setWeight() {
		System.out.print("Please enter the weight of each fruit (in kg): ");
		this.weight = scan.nextDouble();
	}
	
	void setPrice() {
		System.out.print("Please enter the price per kg of fruits: ");
		this.price = scan.nextDouble();
	}
	
	void setNoOfFruits() {
		System.out.print("Please enter the number of fruits: ");
		this.nooffruits = scan.nextInt();
	}
	
	String getName() {
		return this.name;
	}
	
	String getColor() {
		return this.color;
	}
	
	String getNoSeed() {
		return this.numberseed;
	}
	
	String getTaste() {
		return this.taste;
	}
	
	double getWeight() {
		return this.weight;
	}
	
	double getPrice() {
		return this.price;
	}
	
	int getNoOfFruits() {
		return this.nooffruits;
	}
	
	double getTotalWeight() {
		this.totalweight = this.nooffruits * this.weight;
		return this.totalweight;
	}
	
	double getTotalPrice() {
		this.totalprice = this.totalweight * this.price;
		return this.totalprice;
	}
}
