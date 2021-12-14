/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baikiemtragiuaky;

import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class Book {
    String ID;
    String name;
    float price;

    public Book() {
    }

    public Book(String ID, String name, float price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void nhapTT(){
        Scanner Input=new Scanner(System.in);
        System.out.println("Nhap ID cho sach");
        this.ID=Input.nextLine();
        System.out.println("Nhap ten cho sach");
        this.name=Input.nextLine();
        System.out.println("Nhap gia tien cho sach");
        this.price=Input.nextFloat();
        Input.nextLine();
    }

    @Override
    public String toString() {
        return "Book{" + "ID=" + ID + ", name=" + name + ", price=" + price + '}';
    }
    
}
