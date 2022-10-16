package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DangNhap extends Person {
    ArrayList<DangKy> list = register.listDK;
    Scanner sc = new Scanner(System.in);

    public DangNhap() {
    }

    public DangNhap(String username, String password) {
        super(username, password);
    }

    @Override
    public void nhap() {
        super.nhap();
    }

    @Override
    public void show() {
        super.show();
    }


    public void dangNhap() {


        boolean check = true;

        do {

            nhap();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getUsername().equalsIgnoreCase(getUsername())) {
                    check = true;
//                    System.out.println("Mat khau dung");
                } else {
//                    System.out.println("username sai");
                    check = false;
                }
                if (list.get(i).getPassword().equalsIgnoreCase(getPassword()) && check) {
                    check = true;
                    menuLogin();
//                    System.out.println("Login success!!!");
//                    System.out.println(list.toString());
                    break;
                } else {

                    passFail();
                    check = false;
                    break;
                }
            }

        } while (check);

    }

    public void menuLogin() {

        System.out.println("Chào mừng " + getUsername() + " bạn có thể thực hiên các công việc sau: ");
        System.out.println("1. thay doi username");
        System.out.println("2. thay doi email");
        System.out.println("3. thay doi mat khau");
        System.out.println("4. dang xuat");
        System.out.println("0. thoat chuong trinh");
        System.out.println(list.toString());
        int n = sc.nextInt();

        switch (n) {
            case 1: {

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getUsername().equals(getUsername())) {
                        System.out.println("thay  username moi");
                        sc.nextLine();
                        String user = sc.nextLine();
                        for (int j = 0; j < list.size(); j++) {
                            if (!list.get(j).getUsername().equals(user)) {
                                list.get(i).setUsername(user);
                            } else
                                System.out.println(list.toString());
                        }
                    }

                }
                break;
            }
            case 2: {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getUsername().equals(getUsername())) {
                        System.out.println("thay  email moi");
                        sc.nextLine();
                        String email = sc.nextLine();
                        for (int j = 0; j < list.size(); j++) {
                            if (!list.get(j).getEmail().equals(email)) {
                                list.get(i).setEmail(email);
                            } else
                                System.out.println(list.toString());
                        }
                    }

                }
                break;
            }

            case 3: {
                for (DangKy dk : list) {
                    if (dk.getUsername().equals(getUsername())) {
                        System.out.println("thay doi mat khau moi:");
                        sc.nextLine();
                        String password = sc.nextLine();
                        dk.setPassword(password);
                    }
                }
                break;
            }
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("ban nhap khong dung");

        }

    }

    public void passFail() {
        System.out.println("1. Đăng nhập lại:");
        System.out.println("2. Quên mật khẩu");
        System.out.println("3. Thoát chương trình");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                dangNhap();
                break;
            case 2:
                quenMatKhau();
                break;
            case 3:
                System.out.println(list.toString());
        }


    }

    public void quenMatKhau() {
        System.out.println("Nhập email mà bạn đã đăng ký:");
        sc.nextLine();
        String email = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmail().equals(email)) {
                System.out.println("Nhập mật khẩu mới: ");
                String password = sc.nextLine();
                list.get(i).setPassword(password);
            }
        }
    }
}
