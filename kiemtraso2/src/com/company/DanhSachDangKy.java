package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachDangKy {
    String username;

    private DangKy nhapDS() {
        DangKy dangKy = new DangKy();
        Scanner sc = new Scanner(System.in);
        System.out.println("username: ");
        username = sc.nextLine();
        dangKy.setUsername(username);
        System.out.println("password: ");
        String password = sc.nextLine();
        dangKy.setPassword(password);
        System.out.println("email: ");
        String email = sc.nextLine();
        dangKy.setEmail(email);

        return dangKy;
    }

    public void Ds() {
        ArrayList<DangKy> listDK = new ArrayList<>();
        listDK.add(new DangKy("admin", "admin", "admin@gmail.com"));
        listDK.add(new DangKy("anh tien", "admin2", "admin2@gmail.com"));
        boolean check =true;
        DangKy dangKyds = nhapDS();
        for (int i = 0; i < listDK.size(); i++){
            if (listDK.get(i).getUsername().equals(dangKyds.getUsername())) {
                check=false;
            }
        }
        if(check){
            listDK.add(dangKyds);
        }

        System.out.println(listDK.toString());

//  public void nhapDS(){
//
////      listDK.add(new DangKy("admin","admin","admin@gmail.com"));
////      listDK.add(new DangKy("anh tien","admin2","admin2@gmail.com"));
////      DangKy dangKy = new DangKy();
////      System.out.println(listDK.toString());
////        dangKy.nhap();
////        for (DangKy d : listDK)
////        {
////            if(!d.getUsername().equalsIgnoreCase(dangKy.getUsername())){
////                listDK.add(dangKy);
////                System.out.println(listDK.toString());
////            }
////        }
//
//  }

    }
}
