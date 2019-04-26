package webStore;
import java.util.LinkedList;
import java.util.*;
public class wishList {

	public wishList() {
	}

	static LinkedList<Integer> wishLister = new LinkedList<>();
    public static String addToWishList(int id) {
        if(wishLister.contains(id)) {
            return ("This item is already in the wish list");
        }
        else {
            wishLister.add(id);
            return("Added to wish list!");
        }
    }
    
    public static String viewWishList() {
		return wishLister.toString();
	}
}
