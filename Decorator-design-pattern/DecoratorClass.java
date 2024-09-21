

public class DecoratorClass {
	public interface BasePizza {
	    int cost();
	    String getDescription();
	}

	public static class HandTossed implements BasePizza {
	    @Override
	    public int cost() {
	        return 15;
	    }
	    @Override
	    public String getDescription() {
	        return "HandTossed";
	    }
	}
	public static class ThickCrust implements BasePizza {
	    @Override
	    public int cost() {
	        return 18;
	    }
	    @Override
	    public String getDescription() {
	        return "ThickCrust";
	    }
	}
	
	public static class SizeFactory {
		protected BasePizza basePizza;

	    public SizeFactory(BasePizza basePizza) {
	        this.basePizza = basePizza;
	    }
		public static Size getSize(String size,BasePizza basePizza) {
			switch (size) {
				case "Small":
					return new small(basePizza);
				case "Large":
					return new large(basePizza);
				case "Medium":
					return new medium(basePizza);
				default :
					return new medium(basePizza);
			}
		}
	}
	// Size
	public interface Size {
	    public int cost();
	    public String getDescription();
	}
	public static class small implements Size {
		BasePizza basePizza;
		public small(BasePizza _basepizza) {
			basePizza = _basepizza;
		}
		public int cost() {
			return basePizza.cost() + 1;
		}
		public String getDescription() {;
    		return basePizza.getDescription() + ", Small";
		}
	}
	public static class medium implements Size {
		BasePizza basePizza;
		public medium(BasePizza _basepizza) {
			basePizza = _basepizza;
		}
		public int cost() {
			return basePizza.cost() + 1;
		}
		public String getDescription() {;
    		return basePizza.getDescription() + ", Medium";
		}
	}
	public static class large implements Size {
		BasePizza basePizza;
		public large(BasePizza _basepizza) {
			basePizza = _basepizza;
		}
		public int cost() {
			return basePizza.cost() + 1;
		}
		public String getDescription() {;
    		return basePizza.getDescription() + ", Large";
		}
	}
	
	// Cheese Decorator
	public static abstract class CheeseDecorator implements BasePizza {
	    protected BasePizza basePizza;

	    public CheeseDecorator(BasePizza basePizza) {
	        this.basePizza = basePizza;
	    }

	    public abstract int cost();
	    public abstract String getDescription();
	}
	public static class ExtraCheese extends CheeseDecorator {

	    public ExtraCheese(BasePizza basePizza) {
	        super(basePizza);
	    } 

	    public int cost() {
	        return basePizza.cost() + 2;
	    }
	    public String getDescription() {
	        return basePizza.getDescription() + ", Extra Cheese";
	    }
	}
	
	// VegesDecorator
	public static  abstract class VegesDecorator implements BasePizza {
	    protected BasePizza basePizza;

	    public VegesDecorator(BasePizza basePizza) {
	        this.basePizza = basePizza;
	    }

	    public abstract int cost();
	    public abstract String getDescription();
	}
	public static class Tomato extends VegesDecorator {
		
	    public Tomato(BasePizza basePizza) {
	        super(basePizza);
	    }

	    public int cost() {
	        return basePizza.cost() + 1;
	    }
	    public String getDescription() {
	        return basePizza.getDescription() + ", Tomato";
	    }
	}
	public static class Capsicum extends VegesDecorator {

	    public Capsicum(BasePizza basePizza) {
	        super(basePizza);
	    }

	    @Override
	    public int cost() {
	        return basePizza.cost() + 2;
	    }
	    @Override
	    public String getDescription() {
	        return basePizza.getDescription() + ", Capsicum";
	    }
	}
	public static class Onion extends VegesDecorator {

	    public Onion(BasePizza basePizza) {
	        super(basePizza);
	    }

	    @Override
	    public int cost() {
	        return basePizza.cost() + 1;
	    }
	    @Override
	    public String getDescription() {
	        return basePizza.getDescription() + ", Onion";
	    }
	}

	// Meat Decorator
	public static  abstract class MeatDecorator implements BasePizza {
	    protected BasePizza basePizza;

	    public MeatDecorator(BasePizza basePizza) {
	        this.basePizza = basePizza;
	    }

	    @Override
	    public abstract int cost();
	    public abstract String getDescription();
	}
	public static class Chicken extends MeatDecorator {

	    public Chicken(BasePizza basePizza) {
	        super(basePizza);
	    }

	    @Override
	    public int cost() {
	        return basePizza.cost() + 4;
	    }
	    @Override
	    public String getDescription() {
	        return basePizza.getDescription() + ", Chicken";
	    }
	}
	public static class Pepperoni extends MeatDecorator {

	    public Pepperoni(BasePizza basePizza) {
	        super(basePizza);
	    }

	    @Override
	    public int cost() {
	        return basePizza.cost() + 5;
	    }
	    @Override
	    public String getDescription() {
	        return basePizza.getDescription() + ", Pepperoni";
	    }
	}	
	public static void main(String[] args) {
	    //Decorator Pattern
	    BasePizza pizza = new HandTossed();
	    
	    pizza = new ExtraCheese(pizza); 
	    pizza = new Tomato(pizza);
	    pizza = new Onion(pizza);
	    pizza = new Chicken(pizza);
	    
	    //Factory Pattern
	    String size = "Large";
	    Size size_pizza = SizeFactory.getSize(size, pizza);
	    
	    System.out.println("Description: " + size_pizza.getDescription());
	    System.out.println("Total Cost: " + size_pizza.cost());

	}
}
