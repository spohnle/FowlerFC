public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    Price price;
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        setPriceCode(newpriceCode);
    }
    public int getPriceCode() {
        return price.getPriceCode();
    }
    public void setPriceCode(int arg) {
    	switch (arg) {
    	case REGULAR:
    	price = new RegularPrice();
    	break;
    	case CHILDRENS:
    	price = new ChildrensPrice();
    	break;
    	case NEW_RELEASE:
    	price = new NewReleasePrice();
    	break;
    	default:
    	throw new IllegalArgumentException("Incorrect Price Code");
    	}
    }
    public String getTitle (){
        return title;
    }
    
	public Movie getMovie() {
	    return this;
	};
}