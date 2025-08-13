package com.designPatterns.Builder;

public class Computer {
	private String CPU;
	private int RAM;
	private String storage;
	private String GPU;
	
	private Computer(ComputerBuilder builder) {
		this.CPU = builder.CPU;
		this.RAM = builder.RAM;
		this.storage = builder.storage;
		this.GPU = builder.GPU;
	}

	@Override
	public String toString() {
		return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + ", GPU=" + GPU + "]";
	}
	
	
	public static class ComputerBuilder {
		private String CPU;
		private int RAM;
		private String storage;
		private String GPU;
		
		public ComputerBuilder setCPU(String CPU) {
			this.CPU = CPU;
			return this; // return the builder for method chaining
		}
		
		public ComputerBuilder setRAM(int RAM) {
			this.RAM = RAM;
			return this;
		}
		
		public ComputerBuilder setStorage(String storage) {
			this.storage = storage;
			return this;
		}
		
		public ComputerBuilder setGPU(String GPU) {
			this.GPU = GPU;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}


	}
	

}
