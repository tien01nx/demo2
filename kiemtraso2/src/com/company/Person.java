package com.company;

import java.util.Scanner;

public class Person {
    private  String username;
    private  String password;

    public Person() {
    }

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("username: ");
        username = sc.nextLine();
        System.out.println("password: ");
        password = sc.nextLine();
    }
    public void show(){
        System.out.println("username: "+username);
        System.out.println("password: "+password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "" +
                "username='" + username + '\'' +
                ", password='" + password + '\''
                ;
    }
}
