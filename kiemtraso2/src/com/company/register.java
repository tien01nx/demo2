package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class register {
    private String username;
    private String email;
    private String password;
    static   ArrayList<DangKy> listDK = new ArrayList<>();
    public void nhapDS() {
        listDK.add(new DangKy("anh tien", "admin2", "admin2@gmail.com"));
        listDK.add(new DangKy("admin", "admin", "admin@gmail.com"));
        DangKy dangKy = new DangKy();
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("username: ");
            username = sc.nextLine();
            for (int i = 0; i < listDK.size(); i++) {
                if (listDK.get(i).getUsername().equalsIgnoreCase(username)) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }

        } while (!check);
        dangKy.setUsername(username);
        do {
            String Password = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{7,15}$";
            System.out.println("Password: ");
            password = sc.nextLine();
            for (int i = 0; i < listDK.size(); i++) {
                if (!Pattern.matches(Password, password)) {
                    System.out.println("dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;)");
                    check = false;
                    break;
                } else {

                    check = true;
                }
            }

        } while (!check);
        dangKy.setPassword(password);

//
//        do {
//            String EMAIL = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
//            System.out.println("email: ");
//            email = sc.nextLine();
//            for (int i = 0; i < listDK.size(); i++) {
//                if (!Pattern.matches(EMAIL, email)) {
//                    System.out.println("Không đúng định dạng email ");
//                    check = false;
//                    break;
//                } else {
//
//                    check = true;
//                }
//            }
//
//        } while (!check);
//
//        dangKy.setEmail(email);
//        listDK.add(new DangKy(username, password, email));
//        System.out.println(listDK.toString());

    }


}

