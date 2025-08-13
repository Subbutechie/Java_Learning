package com.designPatterns.Builder;

public class UsingBulider {
	public static void main(String[] args) {
		Computer myComputer = new Computer.ComputerBuilder()
											.setCPU("INtel")
											.setRAM(4).setStorage("1TB").setGPU("NVIDIA RTX100").build();
		System.out.println(myComputer);
	}

}
