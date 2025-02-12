package store;

public class store {
	    private int storeId;
	    private String storeName;
	    private String location;
	    private String category;

	    public Store(int storeId, String storeName, String location, String category) {
	        this.storeId = storeId;
	        this.storeName = storeName;
	        this.location = location;
	        this.category = category;
	    }

	    // Getters and Setters
	    public int getStoreId() {
	        return storeId;
	    }

	    public void setStoreId(int storeId) {
	        this.storeId = storeId;
	    }

	    public String getStoreName() {
	        return storeName;
	    }

	    public void setStoreName(String storeName) {
	        this.storeName = storeName;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }
	}