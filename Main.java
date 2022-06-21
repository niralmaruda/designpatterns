package com.designpatterns;

import com.designpatterns.template.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {
	// write your code here
       var task = new TransferMoneyTask();
       task.execute();
    }
}
