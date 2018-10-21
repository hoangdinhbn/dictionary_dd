
package dictionary;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

import javax.swing.JOptionPane;

/**
 *dinh 17020684
 * don 17020685
 * @author
 */
public  class Giaodien extends javax.swing.JFrame {
    
    private DefaultListModel list;
    final static DictionaryManagement rf = new DictionaryManagement();
    private final boolean busy = false, select = true;
    Add dla = new Add(rf.tm);
    Edit dle = new Edit();
    Write_ToFile dm;


    public SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy zzz");

    ;
    
    
    public Giaodien() throws IOException {
        setTitle("Từ điển Dictionary_dd");
 
        rf.Read();
        initComponents();
        status.setText("Sẵn Sàng");

        this.Init();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        WordTarget = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        List_WordTarget = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        Find = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        WordExplain = new javax.swing.JTextPane();
        Exit = new javax.swing.JButton();
        Refrest = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        dateTime = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        WordTarget.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        WordTarget.setForeground(new java.awt.Color(51, 0, 51));
        WordTarget.setText("...");
        WordTarget.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        WordTarget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WordTargetMouseClicked(evt);
            }
        });
        WordTarget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                WordTargetKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                WordTargetKeyReleased(evt);
            }
        });

        List_WordTarget.setForeground(new java.awt.Color(102, 0, 204));
        List_WordTarget.setModel(list = new DefaultListModel());
        List_WordTarget.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        List_WordTarget.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List_WordTargetValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List_WordTarget);

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        Find.setForeground(new java.awt.Color(51, 102, 255));
        Find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/icon/if_Search_27877.png"))); // NOI18N
        Find.setText("Tìm Kiếm");
        Find.setAlignmentY(0.8F);
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });

        Add.setForeground(new java.awt.Color(51, 102, 255));
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/icon/if_Add_27831.png"))); // NOI18N
        Add.setText("Thêm Từ");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Edit.setForeground(new java.awt.Color(51, 102, 255));
        Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/icon/if_Edit_27845.png"))); // NOI18N
        Edit.setText("Sửa Từ");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setForeground(new java.awt.Color(51, 102, 255));
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/icon/delete.gif"))); // NOI18N
        Delete.setText("Xóa Từ");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        WordExplain.setBackground(new java.awt.Color(204, 255, 204));
        WordExplain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        WordExplain.setForeground(new java.awt.Color(51, 0, 51));
        WordExplain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WordExplainMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(WordExplain);

        Exit.setForeground(new java.awt.Color(255, 51, 51));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/icon/if_Remove_27874.png"))); // NOI18N
        Exit.setText("Thoát");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Refrest.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Refrest.setForeground(new java.awt.Color(51, 102, 255));
        Refrest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/icon/if_Refresh_27873.png"))); // NOI18N
        Refrest.setText("Làm mới");
        Refrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefrestActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/icon/if_Play_27865.png"))); // NOI18N
        jButton1.setText("Phát âm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Refrest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Find, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(Refrest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(WordTarget, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(WordTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        dateTime.setText("date");

        status.setText("Sẵn sàng");

        jLabel1.setText("Trạng Thái :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTime)
                    .addComponent(status)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WordTargetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WordTargetKeyPressed
        // TODO add your handling code here:
        status.setText("Tìm kiếm");
        String a = WordTarget.getText();

        if (evt.getKeyCode() == 10) {
            WordExplain.setText(getFind(a));
        }

    }//GEN-LAST:event_WordTargetKeyPressed

    private void WordTargetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WordTargetKeyReleased
        // TODO add your handling code here:
        status.setText("Tìm kiếm");
        if (WordTarget.getText().compareTo("") != 0) {
            if (evt.getKeyCode() != 8) {
                for (int i = 0; i < list.size(); i++) {
                    String str = list.getElementAt(i).toString();
                    str = str.toLowerCase();
                    String word = WordTarget.getText();
                    word = word.toLowerCase();
                    if (str.indexOf(word) == 0) {
                        List_WordTarget.setSelectedIndex(i);
                        List_WordTarget.ensureIndexIsVisible(i);
                        WordTarget.setText(list.getElementAt(i).toString());
                        int s = word.length();
                        int e = str.length();
                        WordTarget.select(s, e);
                        WordExplain.setText(getFind(List_WordTarget.getSelectedValue().toString()));
                        break;
                    }
                }
            } else {

                for (int i = 0; i < list.size(); i++) {
                    String str = list.getElementAt(i).toString();
                    String word = WordTarget.getText();
                    if (str.indexOf(word) == 0) {
                        List_WordTarget.setSelectedIndex(i);
                        List_WordTarget.ensureIndexIsVisible(i);
                        WordExplain.setText(getFind(List_WordTarget.getSelectedValue().toString()));
                        break;
                    }
                }

            }
        }


    }//GEN-LAST:event_WordTargetKeyReleased

    private void List_WordTargetValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List_WordTargetValueChanged
        // TODO add your handling code here:
        status.setText("Tìm kiếm");
        Object obj = evt.getSource();

        if (obj.equals(List_WordTarget) && !busy && select) {

            if (List_WordTarget.isSelectionEmpty()) {
                WordTarget.setText("");
                WordExplain.setText("");

            } else {
                String s;
                s = List_WordTarget.getSelectedValue().toString();
                WordTarget.setText(s);
                WordTarget.selectAll();
                WordExplain.setText(getFind(s));

            }
        }
    }//GEN-LAST:event_List_WordTargetValueChanged

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
        // TODO add your handling code here:
        status.setText("tìm kiếm");
        WordExplain.setText(getFind(WordTarget.getText()));
    }//GEN-LAST:event_FindActionPerformed

    private void WordTargetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WordTargetMouseClicked
        // TODO add your handling code here:
        WordTarget.selectAll();
    }//GEN-LAST:event_WordTargetMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        status.setText("Thêm từ");
        dla.setVisible(true);
        dla.setLocation(300, 200);
        dla.NewWordExplain.setText("");
        dla.NewWordTarget.setText("");
        
        

    }//GEN-LAST:event_AddActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        status.setText("Sửa từ");
        
        if (!List_WordTarget.isSelectionEmpty()) {
            dle.setVisible(true);
            dle.jLabel1.setText("Bạn đang sửa từ :");
            dle.jLabel4.setText(List_WordTarget.getSelectedValue().toString());
            dle.jTextField1.setText(List_WordTarget.getSelectedValue().toString());
            dle.jTextField2.setText("");
            
            
        } else {
              dle.setVisible(false);
            JOptionPane.showMessageDialog(null, "Không có từ được chọn");
          
        }
        
        


    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        status.setText("Xóa Từ");
       
        if(List_WordTarget.getSelectedIndex()!=-1)
        {
               rf.deleteWord(List_WordTarget.getSelectedValue().toString().toLowerCase());
                JOptionPane.showMessageDialog(null, "Xóa từ thành công");
            try {
                dm= new Write_ToFile("Dictionaries");
                dm.Write(rf.tm.values());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Giaodien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Giaodien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else 
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn từ");
        
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        status.setText("Sẵn sàng");
        List_WordTarget.clearSelection();

    }//GEN-LAST:event_jPanel2MouseClicked

    private void WordExplainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WordExplainMouseClicked
        // TODO add your handling code here:
        status.setText("Sẵn sàng");
        List_WordTarget.clearSelection();
    }//GEN-LAST:event_WordExplainMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        status.setText("Sẵn sàng");
        List_WordTarget.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void RefrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefrestActionPerformed
        // TODO add your handling code here:
        list.clear();
        Init();
    }//GEN-LAST:event_RefrestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        speak(WordTarget.getText());
    }//GEN-LAST:event_jButton1ActionPerformed
    private void speak(String word){
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("kevin16");
        voice.setRate((float)190.0);
        voice.allocate();
        try{
            voice.speak(word);
        }catch (Exception e){}
    }
    private String getFind(String word) {
        word = word.toLowerCase();
        if (rf.tm.containsKey(word)) {
            Word mw = (Word) rf.tm.get(word);
            return "\n *Từ:\t" + mw.getWord_target() + "\n\n *nghĩa:\n\t" + mw.getWord_explain();
        } else if (word.compareTo("") == 0) {
            WordExplain.setText("");
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập từ");
            return "";
        } else {
            return "không có từ trong từ điển";
        }

    }

    private void Init() {

        Collection<Word> col2 = rf.tm.values();
        col2.stream().forEach((mw) -> {
            list.addElement(mw.getWord_target());
        });

    }

    public void showTime() {
        Date time = new Date();
        dateTime.setText(sdf.format(time));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Find;
    public static javax.swing.JList List_WordTarget;
    private javax.swing.JButton Refrest;
    private javax.swing.JTextPane WordExplain;
    private javax.swing.JTextField WordTarget;
    private javax.swing.JLabel dateTime;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
