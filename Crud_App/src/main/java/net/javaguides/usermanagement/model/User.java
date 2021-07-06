package net.javaguides.usermanagement.model;


public class User {
    protected int id;
    protected String name;
    protected String dob;
    protected String doj;

    public User() {}

    public User(String name, String dob, String doj) {
        super();
        this.name = name;
        this.dob = dob;
        this.doj = doj;
    }

    public User(int id, String name, String dob, String doj) {
        super();
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

}

    