/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baikiemtragiuaky;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author boyqb2212
 */
public class Store {
    static int totalltems=0;
    int MAX_ITEMS=100;
    ArrayList <Book> listItems;

    public Store() {
    }

    public void qlListItems(){
        Scanner Input=new Scanner(System.in);
        this.listItems=new ArrayList<>();
        while(true){
        System.out.println("1.add");
        System.out.println("2.edit");
        System.out.println("3.delete");
        System.out.println("4.find");
        System.out.println("5.list");
        System.out.println("0.exit");
        int luachon=Input.nextInt();
        switch(luachon){
            case 1:{
                Book s=new Book();
                s.nhapTT();
                this.listItems.add(s);
                Store.totalltems ++;
            }break;
            case 2:{
                System.out.println("Nhap ID sach can sua");
                Input.nextLine();
                String str2 =Input.nextLine();
                for (Book x :this.listItems){
                    if(str2.equalsIgnoreCase(x.ID)){
                        System.out.println("nhap ten moi");
                        String str3=Input.nextLine();
                        x.setName(str3);
                        System.out.println("nhap gia tien moi");
                        float a=Input.nextFloat();
                        x.setPrice(a);
                        }
                }
            }break;
            case 3:{
                System.out.println("Nhap ID sach can xoa");
                Input.nextLine();
                String str =Input.nextLine();
                for (Book x :this.listItems){
                    if(str.equalsIgnoreCase(x.ID)){
                        this.listItems.remove(x);
                        break;
                    }
                    
                }
                
            }break;
            case 4:{
                System.out.println("Nhap ten sach  can tim");
                Input.nextLine();
                String str1 =Input.nextLine();
                for (Book x :this.listItems){
                    if(str1.equalsIgnoreCase(x.name)){
                        System.out.println(x.toString());
                    }
                    
                }
            }break;
            case 5:{
                System.out.println("Tong so sach hien co la");
                System.out.println(Store.totalltems);
                for(Book x: this.listItems){
                    System.out.println(x.toString());
                }
            }break;
            case 0:{
                exit(0);
            }break;
            default:
                System.out.println("Vui long chon tu 0-5!");
        }
    }
}
}
