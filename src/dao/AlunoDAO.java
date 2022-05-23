package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Aluno;

public class AlunoDAO {
    
    private Connection conn;
    
    public AlunoDAO(Connection conn){
        this.conn = conn;
    }
    
    public void inserir(Aluno aluno) throws SQLException{
        String sql =
                "INSERT INTO estudante(nome, usuario, senha) " +
                "VALUES('"+aluno.getNome()+"', '"+aluno.getUsuario()+"', '"+aluno.getSenha()+"')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public ResultSet consultar(Aluno aluno) throws SQLException{
        String sql =
                "SELECT * FROM estudante WHERE usuario = ? and senha = ?";
        PreparedStatement statement = this.conn.prepareStatement(sql);
        statement.setString(1, aluno.getUsuario());
        statement.setString(2, aluno.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        this.conn.close();
        return resultado;
    }
    
    public void update(Aluno aluno, String column) throws SQLException{
        String sql;
        PreparedStatement statement;
        sql =
                "UPDATE estudante SET "+column+" = ? WHERE usuario = ?";
        statement = this.conn.prepareStatement(sql);
        switch(column){
            case "nome" -> statement.setString(1, aluno.getNome());
            case "senha" -> statement.setString(1, aluno.getSenha());
            case "usuario" -> statement.setString(1, aluno.getUsuario());
        }
        statement.setString(2, aluno.getUsuarioantigo());
        statement.execute();
        this.conn.close();
    }
    
    public void delete(Aluno aluno) throws SQLException{
        String sql =
                "DELETE FROM estudante WHERE usuario = ?";
        PreparedStatement statement = this.conn.prepareStatement(sql);
        statement.setString(1, aluno.getUsuario());
        statement.execute();
        this.conn.close();
    }
}
