/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo;

import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class Sach {
    public static int ID = 1000;
    private String maSach;
    private String tenSach;
    private String loai;
    private String tacGia;
    private String nhaXuatBan;
    private float gia;
    private int soLuong;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String loai, String tacGia, String nhaXuatBan, float gia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.loai = loai;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.gia = gia;
        this.soLuong = soLuong;
    }
    public Sach(String bookId, String name) 
    {
        this.maSach = bookId;
        this.tenSach = name;
    }
    

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Sach.ID = ID;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.maSach);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sach other = (Sach) obj;
        return Objects.equals(this.maSach, other.maSach);
    }
    
}
