package controller;

import dao.AlunoDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Aluno;
import view.Cadastro;
import view.Login;
import view.Update;
import view.Delete;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Controller {
        
        private Cadastro cad_janela;
        private Login log_janela;
        private Update upd_janela;
        private Delete del_janela;
        
        public Controller(Cadastro janela){ // Create
            this.cad_janela = janela;
        }
        
        public Controller(Login janela){ // Read
            this.log_janela = janela;
        }
        
        public Controller(Update janela){ // Update
            this.upd_janela = janela;
        }
        
        public Controller(Delete janela){
            this.del_janela = janela;
        }
        
        public void salvarAluno(){
            String nome = cad_janela.getNome_txtfield().getText();
            String usuario = cad_janela.getUsuario_txtfield().getText();
            String senha = cad_janela.getSenha_txtfield().getText();
            Aluno aluno = new Aluno(nome, usuario, senha);
            Conexao conn = new Conexao();
            try{
                Connection connection = conn.getConnection();
                AlunoDAO dao = new AlunoDAO(connection);
                dao.inserir(aluno);
                JOptionPane.showMessageDialog(
                        cad_janela, "Usuario cadastrado com sucesso",
                        "Cadastrado!", JOptionPane.INFORMATION_MESSAGE);
            } catch(SQLException e){
                JOptionPane.showMessageDialog(
                        cad_janela, "Falha no cadastro",
                        "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        public void consultarAluno(){
            String usuario = log_janela.getUsuario_txtfield().getText();
            String senha = log_janela.getSenha_txtfield().getText();
            Aluno aluno = new Aluno(usuario, senha);
            Conexao conn = new Conexao();
            try{
                Connection connection = conn.getConnection();
                AlunoDAO dao = new AlunoDAO(connection);
                ResultSet resultSet = dao.consultar(aluno);
                
                ResultSetMetaData rsmd = resultSet.getMetaData();
                int columnsNumber = rsmd.getColumnCount();
                boolean verify = false;
                String[] data = new String[4];
                while (resultSet.next()) {
                    verify = true;
                    for (int i = 1; i <= columnsNumber; i++) {
                        String columnValue = resultSet.getString(i);
                        System.out.println(rsmd.getColumnName(i)+": "+columnValue+" ");
                        data[i-1] = columnValue;
                    }
                    System.out.println("");
                    }
                if(verify == true){
                    JOptionPane.showMessageDialog(
                        cad_janela, 
                        "Usuario logado com sucesso!\n\nnome: "+data[0]+" usuario: "+data[1]+" senha: "+data[2],
                        "Cadastrado!", JOptionPane.INFORMATION_MESSAGE);
                }
                if(verify == false){
                    JOptionPane.showMessageDialog(
                        log_janela, "Usuario não encontrado",
                        "Erro!", JOptionPane.ERROR_MESSAGE);
                }
            } catch(SQLException e){
                JOptionPane.showMessageDialog(
                        log_janela, "Falha no login",
                        "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        public void UpdateAluno(String column){
            String usuarioantigo = upd_janela.getUsuarioantigo_txtfield().getText();
            String usuario = upd_janela.getUsuario_txtfield().getText();
            String senha = upd_janela.getSenha_txtfield().getText();
            String nome = upd_janela.getNome_txtfield().getText();
            Aluno aluno = new Aluno(nome, usuarioantigo, usuario, senha);
            Conexao conn = new Conexao();
            try{
                Connection connection = conn.getConnection();
                AlunoDAO dao = new AlunoDAO(connection);
                dao.update(aluno, column);
                if(column.equals("usuario")){
                     JOptionPane.showMessageDialog(
                        cad_janela, "Atualizado com sucesso!",
                        "Atualizado!", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch(SQLException e){
                JOptionPane.showMessageDialog(
                        cad_janela, "Falha na atualização",
                        "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        public void DeleteAluno(){
            String usuario  = del_janela.getUsuario_txtfield().getText();
            Aluno aluno = new Aluno(usuario);
            Conexao conn = new Conexao();
            try{
                 Connection connection = conn.getConnection();
                 AlunoDAO dao = new AlunoDAO(connection);
                 dao.delete(aluno);
                 JOptionPane.showMessageDialog(
                        cad_janela, "Aluno deletado!",
                        "Deletado!", JOptionPane.INFORMATION_MESSAGE);
            } catch(SQLException e){
                JOptionPane.showMessageDialog(
                        cad_janela, "Falha na deletação",
                        "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
}
