package com.crackify.builderdesignpattern;

public class BuilderDesignPattern {
	
	private String name;
	private String email;
	private String gender;
	private String phoneNumber;
	
	public BuilderDesignPattern(Builder bd) throws Exception {
		
		this.name = bd.name;
		this.email = bd.email;
		this.gender = bd.gender;
		this.phoneNumber=bd.phoneNumber;
	if(!this.phoneNumber.matches("\\d{10}")) {
				throw new Exception("Phone Number should have 10 digits");
		}
	}
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	public static class Builder{
		
		private String name;
		private String email;
		private String gender;
		private String phoneNumber;
		
		public Builder setName(String name) {	
			this.name=name;
			return this;			
		}
		
		public Builder setEmail(String email) {
			this.email=email;
			return this;			
		}
		
		public Builder setGender(String gender) {
			this.gender=gender;
			return this;			
		}
		
		public Builder setPhoneNumber(String phoneNumber) {
			this.phoneNumber=phoneNumber;
			return this;
		}
		
		
		public BuilderDesignPattern build() throws Exception {
			return new BuilderDesignPattern(this);
		}
	}

}
