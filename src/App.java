import java.sql.Connection;
import java.util.List;

import bd.Conector;
import dao.UserDAO;
import model.User;

public class App {
    public static void main(String[] args) throws Exception {
        Connection connection = Conector.getConnection();

         if(connection == null){
             System.out.println("Erro de conexão.");
             return;
         }
         System.out.println("Conectado...");

         connection.close();

        //  User usuario = new User("Diego", "diego@gmail.com", "12345");
        //  UserDAO dao = new UserDAO();
        //  if(dao.insertUser(usuario)){
        //      System.out.println("usuário cadastrado");
        //  }else{
        //      System.out.println("Erro ao cadastrar");
        //  }
          
        //   dao.close();

        // User usuario = new User(2,"Fernanda", "fernanda2@gmail.com", "45678");

        // UserDAO dao = new UserDAO();

        // if(dao.updateUser(usuario)){
        //     System.out.println("Dados atualizados");
        // }else{
        //     System.out.println("Erro ao atualizar");
        // }
        

        // dao.close();

        //  UserDAO dao = new UserDAO();

        // if(dao.deleteUser(2)){
        //     System.out.println("Usuário apagado");
        // }else{
        //     System.out.println("Erro ao remover o usuário");
        // }
        

        // dao.close();

        // UserDAO dao = new UserDAO();
        // User user = dao.findUser(1);    

        // if(user != null){
        //     System.out.println(user);
        // }else{
        //     System.out.println("Usuário não encontrado");
        // }
        

        // dao.close();

        UserDAO dao = new UserDAO();
        List<User> users = dao.listUser();

        for (User user: users){
            System.out.println(user);
        }
        dao.close();

    }
}