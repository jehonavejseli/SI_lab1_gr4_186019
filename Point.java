class Point {
	String id;
	double x,y;
	

	//TODO add new variable
	String boja;

	//TODO constructor
	public Point(String id, double x, double y, String boja) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.boja = boja;
	}

	//TODO setters and getters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	public void move (char xDirection, char yDirection) {
		//TODO
		char x=xDirection;
	    char y=yDirection;
	    String final =x+''+y;
	}

	public void draw () {
		//TODO
		String directions =move();
        system.out.println(directions);
	}


}