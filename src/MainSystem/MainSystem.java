/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainSystem;

import LoginAndSignUp.ConnectDB;
import LoginAndSignUp.Login;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JPanel;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import java.text.DecimalFormat;

public class MainSystem extends javax.swing.JFrame {
    //header Sản phảm
    final String header[] = {"Tên sản phẩm", "Mã sản phẩm", "Giá bán", "Số lượng"};
    final DefaultTableModel tbSanPham = new DefaultTableModel(header,0);
    //header thống 
    final String headerThongke[] = {"Tên sản phẩm", "Mã sản phẩm", "Số lượng bán ra", "Doanh thu","Ngày bán"};
    final DefaultTableModel tbThongke = new DefaultTableModel(headerThongke,0);
    //header nhân vien
    final String headerNhanvien[] = {"Mã nv", "Họ tên", "Số điẹn thoại", "Tuổi","Quê quán"};
    final DefaultTableModel tbNhanvien = new DefaultTableModel(headerNhanvien,0);
    
    
    /**
     * Creates new form MainSystem
     */
    ConnectDB cn = new ConnectDB();
    public MainSystem() {
        initComponents();
        tableSanPham();
        tableThongKe();
        tableNhanvien();
    }
    //table Sản phẩm
    public void tableSanPham()
    {  
        try {
            Connection conn = cn.getConnection();
            int number;
            Vector row;
            String sql = "SELECT * FROM laptop";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            tbSanPham.setRowCount(0);
            DecimalFormat df = new DecimalFormat("#,###");
            while(rs.next())
            {
                row = new Vector();
                for(int i=1; i<=number;i++)
                {
                    if( i==3 )
                    {
                        double value = rs.getDouble(i);
                        row.addElement(df.format(value));
                    }
                    else{
                        row.addElement(rs.getString(i));
                    }          
                }       
                tbSanPham.addRow(row);
            }
            tableSanPham.setModel(tbSanPham);
            st.close();
            rs.close();
                
        } catch (Exception e) {
        }
    }
    
    //Table thống kê
    public void tableThongKe() {
        try {
            Connection conn = cn.getConnection();
            int number;
            Vector row;
            String sql = "SELECT * FROM thongke";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            tbThongke.setRowCount(0);
            DecimalFormat df = new DecimalFormat("#,###");
            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    if(i == 4)
                    {
                        double value = rs.getDouble(i);
                        row.addElement(df.format(value));
                    }
                    else{
                        row.addElement(rs.getString(i));
                    }
                    
                }
                tbThongke.addRow(row);
            }
            tableThongKe.setModel(tbThongke);
            st.close();
            rs.close();

        } catch (Exception e) {
        }
    }
    //table nhanvien
       public void tableNhanvien() {
        try {
            Connection conn = cn.getConnection();
            int number;
            Vector row;
            String sql = "SELECT * FROM Nhanvien";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            tbNhanvien.setRowCount(0);
            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    row.addElement(rs.getString(i));
                }
                tbNhanvien.addRow(row);
            }
            tableNhanvien.setModel(tbNhanvien);
            st.close();
            rs.close();

        } catch (Exception e) {
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftLayout = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnHangHoa = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Rightlayout = new javax.swing.JPanel();
        HangHoa = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        txtTenSP = new javax.swing.JTextField();
        txtMaSp = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        txtSoLuong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();
        btnTimKiem = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnHoanTacSp = new javax.swing.JButton();
        Thongke = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtTimKiemNgayBan = new javax.swing.JTextField();
        btnTimKiemThongKe = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableThongKe = new javax.swing.JTable();
        txtHienThiTongDoanhThu = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHienThiDoanhThuTheoNgay = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnHoanTacThongKe = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Nhanvien = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnThemNv = new javax.swing.JButton();
        txtHoTenNV = new javax.swing.JTextField();
        txtsdtnv = new javax.swing.JTextField();
        txtTuoiNV = new javax.swing.JTextField();
        txtQuequanNV = new javax.swing.JTextField();
        txtManv = new javax.swing.JTextField();
        btnXoaNv = new javax.swing.JButton();
        btnSuaNv = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNhanvien = new javax.swing.JTable();
        HoanTac = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        btnTimKiemNv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LeftLayout.setBackground(new java.awt.Color(51, 0, 0));

        btnTrangChu.setBackground(new java.awt.Color(218, 138, 21));
        btnTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        btnTrangChu.setText("Trang chủ");
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(218, 138, 21));
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnHangHoa.setBackground(new java.awt.Color(218, 138, 21));
        btnHangHoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHangHoa.setForeground(new java.awt.Color(255, 255, 255));
        btnHangHoa.setText("Hàng hóa");
        btnHangHoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHangHoaMouseClicked(evt);
            }
        });
        btnHangHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHangHoaActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(218, 138, 21));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(218, 138, 21));
        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/Shop1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Shop");

        javax.swing.GroupLayout LeftLayoutLayout = new javax.swing.GroupLayout(LeftLayout);
        LeftLayout.setLayout(LeftLayoutLayout);
        LeftLayoutLayout.setHorizontalGroup(
            LeftLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHangHoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LeftLayoutLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        LeftLayoutLayout.setVerticalGroup(
            LeftLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayoutLayout.createSequentialGroup()
                .addGroup(LeftLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayoutLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayoutLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rightlayout.setLayout(new java.awt.CardLayout());

        HangHoa.setBackground(new java.awt.Color(102, 102, 102));
        HangHoa.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(218, 138, 21));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(204, 204, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quản lý sản phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        btnThem.setBackground(new java.awt.Color(218, 138, 21));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        txtTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSPActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(218, 138, 21));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(218, 138, 21));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Số lượng:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tên sản phẩm:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mã sản phẩm:");

        txtGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaBanActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Giá bán:");

        tableSanPham.setBackground(new java.awt.Color(255, 255, 255));
        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSanPham);

        btnTimKiem.setBackground(new java.awt.Color(218, 138, 21));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        txtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimkiemActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nhập mã sản phẩm:");

        btnHoanTacSp.setBackground(new java.awt.Color(218, 138, 21));
        btnHoanTacSp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHoanTacSp.setForeground(new java.awt.Color(255, 255, 255));
        btnHoanTacSp.setText("Hoàn Tác");
        btnHoanTacSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoanTacSpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HangHoaLayout = new javax.swing.GroupLayout(HangHoa);
        HangHoa.setLayout(HangHoaLayout);
        HangHoaLayout.setHorizontalGroup(
            HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(HangHoaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HangHoaLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(HangHoaLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HangHoaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(HangHoaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTimkiem)
                        .addGroup(HangHoaLayout.createSequentialGroup()
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnHoanTacSp, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addGap(27, 27, 27))
        );
        HangHoaLayout.setVerticalGroup(
            HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HangHoaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HangHoaLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HangHoaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HangHoaLayout.createSequentialGroup()
                        .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HangHoaLayout.createSequentialGroup()
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHoanTacSp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        Rightlayout.add(HangHoa, "card3");

        Thongke.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tìm kiếm theo ngày");

        btnTimKiemThongKe.setBackground(new java.awt.Color(218, 138, 21));
        btnTimKiemThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimKiemThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiemThongKe.setText("Tìm kiếm");
        btnTimKiemThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemThongKeActionPerformed(evt);
            }
        });

        tableThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tableThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableThongKeMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableThongKe);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Thống kê doanh thu theo ngày");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Thống kê doanh thu tất cả các ngày");

        btnHoanTacThongKe.setBackground(new java.awt.Color(218, 138, 21));
        btnHoanTacThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHoanTacThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnHoanTacThongKe.setText("Hoàn Tác");
        btnHoanTacThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoanTacThongKeActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(218, 138, 21));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Thống kê doanh thu");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ThongkeLayout = new javax.swing.GroupLayout(Thongke);
        Thongke.setLayout(ThongkeLayout);
        ThongkeLayout.setHorizontalGroup(
            ThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongkeLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(ThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHienThiTongDoanhThu)
                    .addComponent(txtTimKiemNgayBan)
                    .addComponent(txtHienThiDoanhThuTheoNgay, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ThongkeLayout.createSequentialGroup()
                        .addComponent(btnTimKiemThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHoanTacThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ThongkeLayout.setVerticalGroup(
            ThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongkeLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(ThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ThongkeLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtTimKiemNgayBan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTimKiemThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHoanTacThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHienThiDoanhThuTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHienThiTongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );

        Rightlayout.add(Thongke, "card4");

        Nhanvien.setBackground(new java.awt.Color(153, 153, 153));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Họ Tên:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Số điện thoại:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tuổi:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Quê quán:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mã nhân viên:");

        btnThemNv.setBackground(new java.awt.Color(218, 138, 21));
        btnThemNv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThemNv.setForeground(new java.awt.Color(255, 255, 255));
        btnThemNv.setText("Thêm ");
        btnThemNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNvActionPerformed(evt);
            }
        });

        txtHoTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenNVActionPerformed(evt);
            }
        });

        txtManv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManvActionPerformed(evt);
            }
        });

        btnXoaNv.setBackground(new java.awt.Color(218, 138, 21));
        btnXoaNv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaNv.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaNv.setText("Xóa");
        btnXoaNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNvActionPerformed(evt);
            }
        });

        btnSuaNv.setBackground(new java.awt.Color(218, 138, 21));
        btnSuaNv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuaNv.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaNv.setText("Sửa ");
        btnSuaNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNvActionPerformed(evt);
            }
        });

        tableNhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tableNhanvien);

        HoanTac.setBackground(new java.awt.Color(218, 138, 21));
        HoanTac.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HoanTac.setForeground(new java.awt.Color(255, 255, 255));
        HoanTac.setText("Làm mới");
        HoanTac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoanTacActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(218, 138, 21));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Quản lý nhân viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nhập mã nv ");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        btnTimKiemNv.setBackground(new java.awt.Color(218, 138, 21));
        btnTimKiemNv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimKiemNv.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiemNv.setText("Tìm kiếm");
        btnTimKiemNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemNvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NhanvienLayout = new javax.swing.GroupLayout(Nhanvien);
        Nhanvien.setLayout(NhanvienLayout);
        NhanvienLayout.setHorizontalGroup(
            NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanvienLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuequanNV, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NhanvienLayout.createSequentialGroup()
                        .addGroup(NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsdtnv, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTuoiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSuaNv, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HoanTac, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaNv, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemNv, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiemNv, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
            .addGroup(NhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NhanvienLayout.setVerticalGroup(
            NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanvienLayout.createSequentialGroup()
                .addGroup(NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NhanvienLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addGroup(NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(btnThemNv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuaNv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtsdtnv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaNv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtTuoiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HoanTac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuequanNV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(NhanvienLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimKiemNv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rightlayout.add(Nhanvien, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(LeftLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Rightlayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LeftLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Rightlayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        Rightlayout.removeAll();
        Rightlayout.add(Nhanvien);
        Rightlayout.repaint();
        Rightlayout.revalidate();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnHangHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHangHoaActionPerformed
        Rightlayout.removeAll();
        Rightlayout.add(HangHoa);
        Rightlayout.repaint();
        Rightlayout.revalidate();
    }//GEN-LAST:event_btnHangHoaActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
 
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnHangHoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHangHoaMouseClicked
  

        
    }//GEN-LAST:event_btnHangHoaMouseClicked

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed

    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void txtGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaBanActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void txtTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        Connection conn = cn.getConnection();
        try {
            if (txtTenSP.getText().equals("") || txtMaSp.getText().equals("") || txtGiaBan.getText().equals("") || txtSoLuong.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ dữ liệu.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                StringBuffer sb = new StringBuffer();
                String sql_check = "SELECT ma_san_pham FROM laptop WHERE ma_san_pham = ?";
                PreparedStatement pst_check = conn.prepareStatement(sql_check);
                pst_check.setString(1, txtMaSp.getText());
                ResultSet rs = pst_check.executeQuery();

                if (rs.next()) {
                    sb.append("Sản phẩm này đã tồn tại.");
                }

                if (sb.length() > 0) {
                    JOptionPane.showMessageDialog(this, sb.toString());
                } else {

                    String sql = "INSERT INTO laptop (ten_san_pham, ma_san_pham, gia_ban, so_luong) VALUES (?, ?, ?, ?)";
                    PreparedStatement pst_insert = conn.prepareStatement(sql);
                    pst_insert.setString(1, txtTenSP.getText());
                    pst_insert.setString(2, txtMaSp.getText());
                    pst_insert.setString(3, txtGiaBan.getText());
                    pst_insert.setString(4, txtSoLuong.getText());

                    int result = pst_insert.executeUpdate();

                    if (result > 0) {
                        JOptionPane.showMessageDialog(this, "Sản phẩm đã được thêm thành công!");
                        tableThongKe(); 
                    }
                }
            }
            txtTenSP.setText("");
            txtMaSp.setText("");
            txtGiaBan.setText("");
            txtSoLuong.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemActionPerformed
    //Xử lý dữ kiện khi nhập vô table sản phẩm
    private void tableSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSanPhamMouseClicked
        int x = tableSanPham.getSelectedRow();
        if(x>=0)
        {
            txtTenSP.setText(tableSanPham.getValueAt(x, 0)+ "");
            txtMaSp.setText(tableSanPham.getValueAt(x, 1)+ "");
            txtGiaBan.setText(tableSanPham.getValueAt(x, 2)+ "");
            txtSoLuong.setText(tableSanPham.getValueAt(x, 3)+ "");
            txtMaSp.setEnabled(false);
            tableThongKe(); 
        }
    }//GEN-LAST:event_tableSanPhamMouseClicked

    
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        Connection conn = cn.getConnection();
        try {
            if (txtTenSP.getText().equals("") || txtMaSp.getText().equals("") || txtGiaBan.getText().equals("") || txtSoLuong.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ dữ liệu.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
 
                String sql_update = "UPDATE laptop SET ten_san_pham = ?, gia_ban = ?, so_luong = ? WHERE ma_san_pham = ?";
                PreparedStatement pst_update = conn.prepareStatement(sql_update);
                pst_update.setString(1, txtTenSP.getText()); 
                pst_update.setString(2, txtGiaBan.getText()); 
                pst_update.setString(3, txtSoLuong.getText()); 
                pst_update.setString(4, txtMaSp.getText());  
       
                int rs = pst_update.executeUpdate();
                if (rs > 0) {
                    JOptionPane.showMessageDialog(this, "Sản phẩm đã được cập nhật thành công!");
                    tableThongKe();  
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm để cập nhật.");
                }
            }
            txtTenSP.setText("");
            txtMaSp.setText("");
            txtGiaBan.setText("");
            txtSoLuong.setText("");
            txtMaSp.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        Connection conn = cn.getConnection();
        try {
            String sql_delete = "Delete from laptop where ma_san_pham = ?";
            PreparedStatement pst_delete = conn.prepareStatement(sql_delete);
            pst_delete.setString(1,txtMaSp.getText());
            int check = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn với lựa chọn hiện tại","Thông báo",JOptionPane.YES_NO_OPTION);
            if(check == JOptionPane.YES_OPTION)
            {
                pst_delete.executeUpdate();
                txtTenSP.setText("");
                txtMaSp.setText("");
                txtGiaBan.setText("");
                txtSoLuong.setText("");
                JOptionPane.showMessageDialog(this, "Sản phẩm đã được xóa thành công!");
                tableThongKe();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    
    
    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed

        if (txtTimkiem.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sản phẩm!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Connection conn = cn.getConnection();
        try {
            String query = "SELECT * FROM laptop WHERE ma_san_pham = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, txtTimkiem.getText());
            ResultSet rs = stmt.executeQuery();


            tbSanPham.setRowCount(0);

            if (rs.next()) {
                String tensp = rs.getString("ten_san_pham");
                double giaban = rs.getDouble("gia_ban");
                int soluong = rs.getInt("so_luong");

                tbSanPham.addRow(new Object[]{tensp,txtTimkiem.getText(), giaban, soluong});
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm với mã: " + txtTimkiem.getText(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            txtTimkiem.setText("");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi truy vấn cơ sở dữ liệu!", "Error", JOptionPane.ERROR_MESSAGE);
        }           
    }//GEN-LAST:event_btnTimKiemActionPerformed

    
    
    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed

        Rightlayout.removeAll();
        Rightlayout.add(Thongke);
        Rightlayout.repaint();
        Rightlayout.revalidate();
    }//GEN-LAST:event_btnThongKeActionPerformed

    
    
    private void tableThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableThongKeMouseClicked
        int selectedRow = tableThongKe.getSelectedRow();
        String ngayBan = tableThongKe.getValueAt(selectedRow, 4).toString();
        Connection conn = cn.getConnection();
        try {
            //Doanh thu theo ngày
            String sql = "SELECT SUM(gia * soluong) AS doanhthu FROM thongke WHERE ngay_ban = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ngayBan); 
            ResultSet rsNgay = stmt.executeQuery();

            if (rsNgay.next()) {
                double doanhThu = rsNgay.getDouble("doanhthu");
                DecimalFormat df = new DecimalFormat("#,###");
                String formattedDoanhThu = df.format(doanhThu);
                txtHienThiDoanhThuTheoNgay.setText(String.valueOf(formattedDoanhThu)); 
            } else {
                txtHienThiDoanhThuTheoNgay.setText("0");
                JOptionPane.showMessageDialog(this, "Không có dữ liệu thống kê cho ngày này!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
            //Tổng tất cả các ngày 
            String query = "SELECT SUM(gia * soluong) AS doanhthu FROM thongke ";
            PreparedStatement stmtTong = conn.prepareStatement(query);
            ResultSet rsTong = stmtTong.executeQuery();

            if (rsTong.next()) {
                double TongdoanhThu = rsTong.getDouble("doanhthu");
                DecimalFormat dfTong = new DecimalFormat("#,###");
                String formattedTongDoanhThu = dfTong.format(TongdoanhThu);
                txtHienThiTongDoanhThu.setText(String.valueOf(formattedTongDoanhThu)); 
            } else {
                txtHienThiTongDoanhThu.setText("0");
            }
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tableThongKeMouseClicked
    
    



    //Tìm kiếm ngày bán để thống kê doanh thu
    private void btnTimKiemThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemThongKeActionPerformed
        // TODO add your handling code here:
        if (txtTimKiemNgayBan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày bán!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (!txtTimKiemNgayBan.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
        JOptionPane.showMessageDialog(this, "Ngày bán không hợp lệ! Định dạng đúng là YYYY-MM-DD.", "Thông báo", JOptionPane.ERROR_MESSAGE);
        return;
    }
        Connection conn = cn.getConnection();
        try {
            String query = "SELECT * FROM thongke WHERE ngay_ban = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, txtTimKiemNgayBan.getText());
            ResultSet rs = stmt.executeQuery();

            tbThongke.setRowCount(0);

            if (rs.next()) {
              
                String tensp = rs.getString("tensp");
                String masp = rs.getString("masp");
                int soluong = rs.getInt("soluong");
                double giaban = rs.getDouble("gia");

                tbThongke.addRow(new Object[]{tensp,masp, giaban, soluong, txtTimKiemNgayBan.getText()});
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm với ngày: " + txtTimKiemNgayBan.getText(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            txtTimkiem.setText("");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi truy vấn cơ sở dữ liệu!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimKiemThongKeActionPerformed

    private void btnHoanTacThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoanTacThongKeActionPerformed
        tableThongKe();
    }//GEN-LAST:event_btnHoanTacThongKeActionPerformed

    private void btnHoanTacSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoanTacSpActionPerformed
       tableSanPham();
    }//GEN-LAST:event_btnHoanTacSpActionPerformed

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemActionPerformed

    private void txtManvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManvActionPerformed

    private void txtHoTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenNVActionPerformed

    private void btnThemNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNvActionPerformed

        Connection conn = cn.getConnection();
        try {
            if (txtManv.getText().equals("") || txtHoTenNV.getText().equals("") || txtsdtnv.getText().equals("") || txtTuoiNV.getText().equals("") || txtQuequanNV.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ dữ liệu.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                StringBuffer sb = new StringBuffer();
                String sql_check = "SELECT manv FROM Nhanvien WHERE manv = ?";
                PreparedStatement pst_check = conn.prepareStatement(sql_check);
                pst_check.setString(1, txtManv.getText());
                ResultSet rs = pst_check.executeQuery();

                if (rs.next()) {
                    sb.append("Nhân viên này đã tồn tại.");
                }

                if (sb.length() > 0) {
                    JOptionPane.showMessageDialog(this, sb.toString());
                } else {

                    String sql = "INSERT INTO Nhanvien (manv, hoten, sdt, tuoi, quequan) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement pst_insert = conn.prepareStatement(sql);
                    pst_insert.setString(1, txtManv.getText());
                    pst_insert.setString(2, txtHoTenNV.getText());
                    pst_insert.setString(3, txtsdtnv.getText());
                    pst_insert.setString(4, txtTuoiNV.getText());
                    pst_insert.setString(5, txtQuequanNV.getText());

                    int result = pst_insert.executeUpdate();

                    if (result > 0) {
                        JOptionPane.showMessageDialog(this, "Nhân viên đã được thêm thành công!");
                        tableNhanvien();
                    }
                }
            }
            txtManv.setText("");
            txtHoTenNV.setText("");
            txtsdtnv.setText("");
            txtTuoiNV.setText("");
            txtQuequanNV.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemNvActionPerformed

    private void btnXoaNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaNvActionPerformed

    private void btnSuaNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaNvActionPerformed

    private void HoanTacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoanTacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoanTacActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void btnTimKiemNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemNvActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HangHoa;
    private javax.swing.JButton HoanTac;
    private javax.swing.JPanel LeftLayout;
    private javax.swing.JPanel Nhanvien;
    private javax.swing.JPanel Rightlayout;
    private javax.swing.JPanel Thongke;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHangHoa;
    private javax.swing.JButton btnHoanTacSp;
    private javax.swing.JButton btnHoanTacThongKe;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaNv;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemNv;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTimKiemNv;
    private javax.swing.JButton btnTimKiemThongKe;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaNv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tableNhanvien;
    private javax.swing.JTable tableSanPham;
    private javax.swing.JTable tableThongKe;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtHienThiDoanhThuTheoNgay;
    private javax.swing.JTextField txtHienThiTongDoanhThu;
    private javax.swing.JTextField txtHoTenNV;
    private javax.swing.JTextField txtMaSp;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtQuequanNV;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimKiemNgayBan;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextField txtTuoiNV;
    private javax.swing.JTextField txtsdtnv;
    // End of variables declaration//GEN-END:variables

    private String getValueAt(int x, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
