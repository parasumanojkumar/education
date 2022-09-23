package org.edu;

public class Medicine extends Engineering {

	private void physiyo() {
		System.out.println("physiyo is Nandhini");
	}
    private void dental() {
		System.out.println("dental is amma");

	}
    private void mbbs() {
		System.out.println("mbbs is manoj");

	}
    public static void main(String[] args) {
		Medicine me=new Medicine();
		me.ug();
		me.pg();
		me.bsc();
		me.bA();
		me.bBA();
		me.bE();
		me.bTech();
		me.bA();
		me.physiyo();
		me.dental();
		me.mbbs();
	}
}
