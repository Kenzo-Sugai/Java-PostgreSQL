package model;

public class Aluno {
    
    private String nome, usuario, senha, usuarioantigo;
    
    public Aluno(String nome, String usuario, String senha){ // create
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Aluno(String usuario, String senha){ // read
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Aluno(String nome, String usuarioantigo, String usuario, String senha){ // update
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.usuarioantigo = usuarioantigo;
    }
    
    public Aluno(String usuario){ // delete
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuarioantigo() {
        return usuarioantigo;
    }

    public void setUsuarioantigo(String usuarioantigo) {
        this.usuarioantigo = usuarioantigo;
    }
    
    
}
