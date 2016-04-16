package ifpb.edu.br.finalconvite.entidades;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Administrador implements Serializable{

    public Administrador (){}

    public Administrador (int id, String nome, String senha, String email){

        this.email = email;
        this.nome = nome;
        this.id = id;
        this.senha = senha;

    }

    @SerializedName("id")
    private int id;

    @SerializedName("nome")
    private String nome;

    @SerializedName("senha")
    private String senha;

    @SerializedName("email")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {

        return "[id: " + id + "; nome: " + nome + "; email: " + email + "]";

    }
}
