package App;


import DAO.ClubeDao;
import entidades.Clube;

public class App {
    public static void main(String[] args){
        
        ClubeDao dao = ClubeDao.getInstance();
        Clube clube = new Clube();
        clube.setNome("Vasco");
        clube.setCidade("RJ");
        clube.setEstadio("São Januario");
        clube.setDivisao(1);
        
        //dao.persist(clube);
        clube = dao.find(5);
        clube.setNome("Icasa");
        clube = dao.update(clube);
        System.out.println("nome do clube: "+clube.getNome());
        dao.remove(clube);
        
    }
}
