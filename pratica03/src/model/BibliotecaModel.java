package model;

import java.sql.*;

import controller.Livros;
import controller.MaterialBiblioteca;
import controller.Revistas;

public class BibliotecaModel {

	public static void InserirLivro(Livros L) throws Exception {
		try {
			Connection conexao = DbConnection.getInstance();
			
			String sql = "insert into Biblioteca(titulo, ano, autor) values (?,?,?)";
						
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, L.getTitulo());
			stmt.setInt(2, L.getAno());
			stmt.setString(3, L.getAutor());
			
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void InserirRevista(Revistas R) throws Exception {
		try {
			Connection conexao = DbConnection.getInstance();
			
			String sql = "insert into Biblioteca(titulo, ano, organizacao, volume, numero) values (?,?,?,?,?)";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, R.getTitulo());
			stmt.setInt(2, R.getAno());
			stmt.setString(3, R.getOrganizacao());
			stmt.setInt(4, R.getVolume());
			stmt.setInt(5, R.getNumero());
			
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void getRegistros() throws Exception{
		try {
			Connection conexao = DbConnection.getInstance();
			
			String sql = "select * from Biblioteca";
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet resultadovet = stmt.executeQuery(); 
			
			while (resultadovet.next()) { 
				String autor = resultadovet.getString("autor");
				if(autor != null) { //eh livro
					Livros L = new Livros(resultadovet.getString("titulo"), resultadovet.getString("autor"), resultadovet.getInt("ano"));	
					Livros.livrosList.add(L);
					Integer[] array = {1, MaterialBiblioteca.livrosList.size()-1};
					Livros.indiceMap.put(MaterialBiblioteca.getID(), array);					
				}else { //eh revista
					Revistas R = new Revistas(resultadovet.getString("titulo"), resultadovet.getInt("ano"), resultadovet.getString("organizacao"), resultadovet.getInt("volume"), resultadovet.getInt("numero"));	
					Revistas.revistasList.add(R);
					Integer[] array = {2, MaterialBiblioteca.revistasList.size()-1};
					Revistas.indiceMap.put(MaterialBiblioteca.getID(), array);
				}
			}
			resultadovet.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
