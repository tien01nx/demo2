package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class reigg {
    private String username;
    private String email;
    static ArrayList<DangKy> listDK = new ArrayList<>();
    public  static reigg instance;
    public reigg() {
        instance = this ;
    }

    public void nhapDS() {

        listDK.add(new DangKy("admin", "admin", "admin@gmail.com"));
        listDK.add(new DangKy("anh tien", "admin2", "admin2@gmail.com"));
        DangKy dangKy = new DangKy();
        Scanner sc = new Scanner(System.in);
        boolean check;
        do {
            check = true;
            System.out.println("username: ");
            username = sc.nextLine();
            for (int i = 0; i <listDK.size() ; i++) {
                if(listDK.get(i).getUsername().equals(username)){
                    check=false;
                    break;
                }
            }

        } while (!check);
        dangKy.setUsername(username);
        System.out.println("password: ");
        String password = sc.nextLine();
        dangKy.setPassword(password);

        dangKy.setEmail(email);
        listDK.add(new DangKy(username, password, email));
        System.out.println(listDK.toString());

    }

}



