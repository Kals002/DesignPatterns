package com.test.prototype;

public class App
{
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        DataBase db1 = new DataBase();
        db1.setId(23);
        System.out.println("Waiting for first DB object..");
        db1.loadData();


        System.out.println(db1);


        //DataBase db2 = new DataBase();
        DataBase db2 = (DataBase) db1.clone();

        db2.setId(45);
        System.out.println("Waiting for second DB object..");
       // db2.loadData();


        System.out.println(db2);
    }
}
