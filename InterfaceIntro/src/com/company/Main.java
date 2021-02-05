package com.company;

public class Main {

    public static void main(String[] args) {
	    ITelephone myPhone;
	    //ITelephone myPhone = new ITelephone(); is not valid.

	    myPhone = new DeskPhone(123456789);
	    myPhone.powerOn();
	    myPhone.callPhone(123456789);
	    myPhone.answer();

    }
}
