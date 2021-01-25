/*
 * Comment.java
 *
 * Created on __DATE__, __TIME__
 */

package com.liao.ui.comment;

import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.liao.entity.Comment;
import com.liao.entity.User;
import com.liao.factory.ObjectFactory;
import com.liao.service.CommentService;
import com.liao.ui.user.Personalcenter;
import com.liao.util.ResJson;

@SuppressWarnings("all")
/**
 *
 * @author __USER__
 */
/**
 * 评论
 */
public class CommentData extends javax.swing.JFrame {
    CommentService commService = (CommentService) ObjectFactory.getBean("CommentService");

    /**
     * Creates new form Comment
     */
    private User u;

    public CommentData() {
        initComponents();
    }

    public CommentData(User u) {
        this.u = u;
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    //GEN-BEGIN:initComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommentTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        AllNum = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pageSizeComBox = new javax.swing.JComboBox();
        onButt = new javax.swing.JButton();
        totalPageLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        currentPage = new javax.swing.JLabel();
        underButt = new javax.swing.JButton();
        JumpButt = new javax.swing.JButton();
        JumpText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        goodsText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        moodText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        FellText = new javax.swing.JTextField();
        SelectButt = new javax.swing.JButton();
        EscButt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 18));
        jLabel1.setText("\u8bc4\u8bba");

        CommentTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{

        }, new String[]{"商品名称", "满意度", "评论", "时间"}));
        jScrollPane1.setViewportView(CommentTable);

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 15));
        jLabel2.setText("\u603b\u6761\u6570");

        AllNum.setText("0");

        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 15));
        jLabel4.setText("\u6bcf\u9875\u663e\u793a");

        pageSizeComBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"5", "10", "15", "20"}));

        onButt.setFont(new java.awt.Font("微软雅黑", 0, 15));
        onButt.setText("\u4e0a\u4e00\u9875");
        onButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onButtMouseClicked(evt);
            }
        });

        totalPageLabel.setText("1");

        jLabel6.setText("/");

        currentPage.setText("1");

        underButt.setFont(new java.awt.Font("微软雅黑", 0, 15));
        underButt.setText("\u4e0b\u4e00\u9875");
        underButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                underButtMouseClicked(evt);
            }
        });

        JumpButt.setFont(new java.awt.Font("微软雅黑", 0, 15));
        JumpButt.setText("\u8df3\u8f6c");
        JumpButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JumpButtMouseClicked(evt);
            }
        });

        JumpText.setText("0");

        jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 15));
        jLabel8.setText("\u5546\u54c1\u540d\u79f0");

        goodsText.setFont(new java.awt.Font("微软雅黑", 0, 15));

        jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 15));
        jLabel9.setText("\u6ee1\u610f\u5ea6");

        moodText.setFont(new java.awt.Font("微软雅黑", 0, 15));

        jLabel10.setFont(new java.awt.Font("微软雅黑", 0, 15));
        jLabel10.setText("\u8bc4\u8bba");

        FellText.setFont(new java.awt.Font("微软雅黑", 0, 15));

        SelectButt.setFont(new java.awt.Font("微软雅黑", 0, 15));
        SelectButt.setText("\u67e5\u8be2");
        SelectButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectButtMouseClicked(evt);
            }
        });

        EscButt.setFont(new java.awt.Font("微软雅黑", 0, 15));
        EscButt.setText("\u8fd4\u56de");
        EscButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EscButtMouseClicked(evt);
            }
        });
        EscButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                layout.createSequentialGroup().addGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                layout.createSequentialGroup().addGap(22, 22, 22).addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(AllNum,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66,
                                        Short.MAX_VALUE).addComponent(jLabel4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(pageSizeComBox,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(41, 41, 41).addComponent(onButt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(totalPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17,
                                        javax.swing.GroupLayout.PREFERRED_SIZE).addGap(1, 1, 1).addComponent(jLabel6).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(currentPage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(underButt).addGap(65, 65, 65).addComponent(JumpButt).addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(JumpText, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(
                                layout.createSequentialGroup().addGap(42, 42, 42).addGroup(
                                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676,
                                                javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(
                                                layout.createSequentialGroup().addComponent(jLabel8).addGap(4, 4, 4).addComponent(goodsText, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE).addGap(66, 66, 66).addComponent(jLabel9).addGap(4, 4, 4).addComponent(moodText,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(46, 46, 46).addComponent(jLabel10).addGap(4, 4, 4)
                                                        .addComponent(FellText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(SelectButt)))))
                        .addContainerGap()).addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addContainerGap(349, Short.MAX_VALUE).addComponent(jLabel1).addGap(345, 345, 345)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addContainerGap(654, Short.MAX_VALUE).addComponent(EscButt).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(19, 19, 19).addGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(goodsText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(moodText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(SelectButt).addComponent(FellText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel10).addComponent(jLabel9)).addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(EscButt).addGap(15, 15, 15).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330,
                        javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(AllNum).addComponent(JumpText,
                                javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(JumpButt).addComponent(onButt)
                                .addComponent(jLabel6).addComponent(totalPageLabel).addComponent(currentPage).addComponent(underButt).addComponent(jLabel4).addComponent(pageSizeComBox,
                                javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        wick();
        pack();
    }// </editor-fold>
    //GEN-END:initComponents

    /**
     * 加载界面
     */
    private void wick() {
        //		初始化表格
        CommentTable(1, 5, null);
        //		加载条数
        initUsersGrid(null);
    }

    /**
     * 返回按钮
     */
    private void EscButtMouseClicked(java.awt.event.MouseEvent evt) {
        new Personalcenter(u).setVisible(true);
        this.dispose();
    }

    private void EscButtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * 查询
     */
    private void SelectButtMouseClicked(java.awt.event.MouseEvent evt) {
        //		获取查询的数据
        Comment comment = getCommentInfo();
        // 		获取当前每页展示多少条
        int pageSize = Integer.parseInt(((String) this.pageSizeComBox.getSelectedItem()));
        //		初始化表格
        CommentTable(1, pageSize, comment);
        //		加载条数
        initUsersGrid(comment);
        //		加载起始页码
        this.totalPageLabel.setText("1");
    }

    /**
     * 跳转
     */
    private void JumpButtMouseClicked(java.awt.event.MouseEvent evt) {
        //		获取跳转的页码
        String str = this.JumpText.getText();
        //		判断页码是否合法
        if (!str.matches("^[1-9][0-9]*$")) {
            //			不合法弹出错误信息
            JOptionPane.showMessageDialog(null, "跳转页数不合法");
            return;
        }
        //		将合法的值强转为int
        int jump = Integer.parseInt(str);
        // 		获取当前每页展示条数
        int pageSize = Integer.parseInt((String) this.pageSizeComBox.getSelectedItem());
        // 		获取输入框的信息
        Comment comment = getCommentInfo();
        //		获取总页数
        int curren = Integer.parseInt(currentPage.getText());
        //		判断跳转的页数是否大于总页数
        if (jump > curren) {
            //			大于，弹出错误信息
            JOptionPane.showMessageDialog(null, "当前页数不存在");
        } else {
            //			否则跳转
            this.totalPageLabel.setText(jump + "");
            // 			刷新表格
            CommentTable(jump, pageSize, comment);
        }
    }

    /**
     * 下一页
     */
    private void underButtMouseClicked(java.awt.event.MouseEvent evt) {
        //		获取当前页数数值
        int pageNum = Integer.parseInt(this.totalPageLabel.getText());
        //		获取总页数数值
        int totalNum = Integer.parseInt(this.currentPage.getText());
        //		判断当前页数是否大于等于总页数
        if (pageNum >= totalNum) {
            //			弹出错误信息
            JOptionPane.showMessageDialog(null, "当前已经是最后一页 ");
        } else {
            //			否则当前页数加一
            pageNum = pageNum + 1;
            // 			赋值给当前页数
            this.totalPageLabel.setText(pageNum + "");
            // 			获取获取当前页展示条数
            int pageSize = Integer.parseInt((String) this.pageSizeComBox.getSelectedItem());
            // 			获取输入框的信息
            Comment comment = getCommentInfo();
            //			刷新表格
            CommentTable(pageNum, pageSize, comment);
            //			刷新条数
            initUsersGrid(comment);

        }
    }

    /**
     * 上一页
     */
    private void onButtMouseClicked(java.awt.event.MouseEvent evt) {
        //		获取第一个数值
        int pageNum = Integer.parseInt(this.totalPageLabel.getText());
        //		获取第二个数值
        int totalNum = Integer.parseInt(this.currentPage.getText());
        if (pageNum <= 1) {
            JOptionPane.showMessageDialog(null, "当前已经是第一页 ");
        } else {
            pageNum = pageNum - 1;
            // 			设置当前页数
            this.totalPageLabel.setText(pageNum + "");
            // 			获取pageSize
            int pageSize = Integer.parseInt((String) this.pageSizeComBox.getSelectedItem());
            // 			获取输入框的信息
            Comment comment = getCommentInfo();
            //			刷新表格
            CommentTable(pageNum, pageSize, comment);
            //			刷新条数
            initUsersGrid(comment);
        }
    }

    /**
     * 清空输入框
     */
    private void clearInput() {
        //		商品名称
        this.goodsText.setText("");
        //		满意度
        this.moodText.setText("");
        //		评论
        this.FellText.setText("");
    }

    /**
     * 加载条数
     */
    public void initUsersGrid(Comment comment) {
        //		调用方法，查询符合条件的数据数量
        //		如果goods等于空，则查询全部
        double count = commService.selectCommentouny(comment, u);
        //		获取当前每页展示多少条数据
        double pageSize = Integer.parseInt((String) this.pageSizeComBox.getSelectedItem());
        //		用总条数计算页数
        int totalCount = (int) (Math.ceil(count / pageSize));
        //		总条数赋值
        this.AllNum.setText((int) count + "");
        //		总页数赋值
        this.currentPage.setText(totalCount + "");
    }

    /**
     * 初始化表格
     */
    public void CommentTable(int pageNum, int pageSize, Comment comment) {
        ResJson jesc = new ResJson();
        //		调用查询方法
        jesc = commService.selectCommentByLimit(pageNum, pageSize, comment, u);
        //		判断是否有数据
        if (jesc.getSub()) {
            //			获取数据
            List<Comment> commentList = jesc.getList();
            //			获取表格对象
            DefaultTableModel tableModel = (DefaultTableModel) this.CommentTable.getModel();
            tableModel.setRowCount(0);
            //			遍历数据存入表格
            for (Comment comment2 : commentList) {
                Vector rowData = new Vector();
                //				所属用户ID
                rowData.add(comment2.getGoodsName());
                //				用户名称
                rowData.add(comment2.getMood());
                //				地址
                rowData.add(comment2.getFell());
                //				电话
                rowData.add(comment2.getTimes());
                tableModel.addRow(rowData);
            }
        }

    }

    /**
     * 获取输入框文本
     *
     * @return
     */
    public Comment getCommentInfo() {
        com.liao.entity.Comment comment = new com.liao.entity.Comment();
        //		获取用户id
        comment.setUserid(u.getId());
        //		商品名称
        String goodsText = this.goodsText.getText();
        comment.setGoodsName(goodsText);
        //		满意度
        String moodText = this.moodText.getText();
        comment.setMood(moodText);
        //		评论
        String FellText = this.FellText.getText();
        comment.setFell(FellText);

        return comment;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommentData().setVisible(true);
            }
        });
    }

    //GEN-BEGIN:variables
    // Variables declaration - do not modify
    private javax.swing.JLabel AllNum;
    private javax.swing.JTable CommentTable;
    private javax.swing.JButton EscButt;
    private javax.swing.JTextField FellText;
    private javax.swing.JButton JumpButt;
    private javax.swing.JTextField JumpText;
    private javax.swing.JButton SelectButt;
    private javax.swing.JLabel currentPage;
    private javax.swing.JTextField goodsText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField moodText;
    private javax.swing.JButton onButt;
    private javax.swing.JComboBox pageSizeComBox;
    private javax.swing.JLabel totalPageLabel;
    private javax.swing.JButton underButt;
    // End of variables declaration//GEN-END:variables

}