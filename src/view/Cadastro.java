package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controller.Controller;
public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
        control = new Controller(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        cadastrar_btn = new javax.swing.JButton();
        nome_label = new javax.swing.JLabel();
        usuario_label = new javax.swing.JLabel();
        senha_label = new javax.swing.JLabel();
        nome_txtfield = new javax.swing.JTextField();
        usuario_txtfield = new javax.swing.JTextField();
        senha_txtfield = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        login_menu = new javax.swing.JMenu();
        login_menuitem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        update_menuitem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        delete_menuitem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");

        cadastrar_btn.setText("Cadastrar");
        cadastrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_btnActionPerformed(evt);
            }
        });

        nome_label.setText("Nome:");

        usuario_label.setText("Usuario:");

        senha_label.setText("Senha:");

        login_menu.setText("Login");

        login_menuitem.setText("Logar");
        login_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_menuitemActionPerformed(evt);
            }
        });
        login_menu.add(login_menuitem);

        jMenuBar1.add(login_menu);

        jMenu1.setText("Update");

        update_menuitem.setText("Atualizar");
        update_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_menuitemActionPerformed(evt);
            }
        });
        jMenu1.add(update_menuitem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Delete");

        delete_menuitem.setText("Deletar");
        delete_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_menuitemActionPerformed(evt);
            }
        });
        jMenu2.add(delete_menuitem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(nome_label)
                        .addGap(18, 18, 18)
                        .addComponent(nome_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(senha_label)
                                .addGap(18, 18, 18)
                                .addComponent(senha_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usuario_label)
                                .addGap(18, 18, 18)
                                .addComponent(usuario_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cadastrar_btn)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_label)
                    .addComponent(nome_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario_label)
                    .addComponent(usuario_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha_label)
                    .addComponent(senha_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cadastrar_btn)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_btnActionPerformed
        control.salvarAluno();
    }//GEN-LAST:event_cadastrar_btnActionPerformed

    private void login_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_menuitemActionPerformed
       Login l = new Login();
       l.setVisible(true);
    }//GEN-LAST:event_login_menuitemActionPerformed

    private void update_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_menuitemActionPerformed
        Update u = new Update();
        u.setVisible(true);
    }//GEN-LAST:event_update_menuitemActionPerformed

    private void delete_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_menuitemActionPerformed
        Delete d = new Delete();
        d.setVisible(true);
    }//GEN-LAST:event_delete_menuitemActionPerformed

    public JButton getCadastrar_btn() {
        return cadastrar_btn;
    }

    public void setCadastrar_btn(JButton cadastrar_btn) {
        this.cadastrar_btn = cadastrar_btn;
    }

    public JLabel getNome_label() {
        return nome_label;
    }

    public void setNome_label(JLabel nome_label) {
        this.nome_label = nome_label;
    }

    public JTextField getNome_txtfield() {
        return nome_txtfield;
    }

    public void setNome_txtfield(JTextField nome_txtfield) {
        this.nome_txtfield = nome_txtfield;
    }

    public JLabel getSenha_label() {
        return senha_label;
    }

    public void setSenha_label(JLabel senha_label) {
        this.senha_label = senha_label;
    }

    public JTextField getSenha_txtfield() {
        return senha_txtfield;
    }

    public void setSenha_txtfield(JTextField senha_txtfield) {
        this.senha_txtfield = senha_txtfield;
    }

    public JLabel getUsuario_label() {
        return usuario_label;
    }

    public void setUsuario_label(JLabel usuario_label) {
        this.usuario_label = usuario_label;
    }

    public JTextField getUsuario_txtfield() {
        return usuario_txtfield;
    }

    public void setUsuario_txtfield(JTextField usuario_txtfield) {
        this.usuario_txtfield = usuario_txtfield;
    }

    private Controller control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar_btn;
    private javax.swing.JMenuItem delete_menuitem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu login_menu;
    private javax.swing.JMenuItem login_menuitem;
    private javax.swing.JLabel nome_label;
    private javax.swing.JTextField nome_txtfield;
    private javax.swing.JLabel senha_label;
    private javax.swing.JTextField senha_txtfield;
    private javax.swing.JMenuItem update_menuitem;
    private javax.swing.JLabel usuario_label;
    private javax.swing.JTextField usuario_txtfield;
    // End of variables declaration//GEN-END:variables
}
