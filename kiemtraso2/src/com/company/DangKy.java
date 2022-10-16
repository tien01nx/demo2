package com.company;

import java.util.Scanner;

public class DangKy extends  Person{
    private String email;

    public DangKy() {
    }

    public DangKy(String username, String password, String email) {
        super(username, password);
        this.email = email;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("email: ");
        email = sc.nextLine();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("email: "+email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DangKy{" + super.toString()+
                "email='" + email + '\'' +
                '}'+"\n";
    }
}
